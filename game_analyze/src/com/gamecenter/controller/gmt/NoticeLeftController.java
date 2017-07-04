package com.gamecenter.controller.gmt;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ModelAndView;

import com.gamecenter.common.Page;
import com.gamecenter.common.PageTool3;
import com.gamecenter.common.ToolUtils;
import com.gamecenter.common.Tools;
import com.gamecenter.controller.BaseController;
import com.gamecenter.model.OpFeedbackQuestion;
import com.gamecenter.model.OpGameapp;
import com.gamecenter.model.OpGameworld;
import com.gamecenter.model.OpGmtNoticeLeft;
import com.gamecenter.parBean.AgentUser;
import com.gamecenter.parBean.UserMsg;
import com.gamecenter.service.appServices.AppService;
import com.gamecenter.service.appServices.WorldService;
import com.gamecenter.service.gmt.GmtNoticeLeftService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * ClassName:NoticeLeftController <br/>
 * Function: TODO (公告栏). <br/>
 * Reason: TODO (). <br/>
 * Date: 2017年6月30日 下午2:43:48 <br/>
 * 
 * @author lyh
 * @version
 * @see
 */
@Controller
@RequestMapping("/gmt/notice/left")
public class NoticeLeftController extends BaseController {
	
	@Autowired
	private GmtNoticeLeftService noticeLeftService;
	@Resource
	WorldService worldService;
	@Resource
	AppService appService;
	
	// NoticeLeftList
	
	/**
	 * noticeLeftList:(). <br/>
	 * TODO().<br/>
	 * 公告列表
	 * 
	 * @author lyh
	 * @return
	 */
	@RequestMapping("/list")
	public ModelAndView noticeLeftList(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPag) {
		
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getUid();
		}
		
		String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/gmTools/NoticeLeftList");
		view.addObject("targetTime", targetTime);
		
		// List<OpGmtNoticeLeft> list = noticeLeftService.getNoticList();
		// view.addObject("lists", list);
		return view;
	}
	
	@RequestMapping("/add")
	public ModelAndView notiveLeftAdd(HttpSession session) {
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long agentId = 0;
		if (userMsg != null) {
			agentId = userMsg.getUid();
		}
		
		List<OpGameapp> appList = appService.getAppList();
		List<OpGameworld> worldList = null;
		if (appList != null && appList.size() > 0) {
			worldList = worldService.getWorldListByAppId(appList.get(0).getAppid());
		}
		
		ModelAndView view = new ModelAndView("/page/gmTools/NoticeLeftSave");
		view.addObject("appList", appList);
		view.addObject("worldList", worldList);
		return view;
	}
	
	/**
	 * playerFeedBackPage:(). <br/>
	 * TODO().<br/>
	 * 分页列表
	 * 
	 * @author lyh
	 * @param session
	 * @param curPage
	 * @return
	 */
	@RequestMapping("/page")
	public ModelAndView noticeLeftListPage(HttpSession session, @RequestParam(value = "page", defaultValue = "1") int curPage) {
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long userId = 0;
		if (userMsg != null) {
			userId = userMsg.getUid();
		}
		// String targetTime = Tools.getDate(Tools.getNowDate(), 1, -1).substring(0, 10);
		ModelAndView view = new ModelAndView("/page/gmTools/NoticeLeftListPage");
		PageHelper.startPage(curPage, Tools.PAGE_SIZE);
		List<OpGmtNoticeLeft> list = noticeLeftService.getNoticList();
		PageInfo<OpGmtNoticeLeft> pageInfo = new PageInfo<OpGmtNoticeLeft>(list);
		
		Page page = new Page(curPage, (int) pageInfo.getTotal(), pageInfo.getPageSize(), pageInfo.getList());
		
		PageTool3 pt = new PageTool3();
		String pageStr = pt.getPageStringForjs("", page);
		view.addObject("lists", list);
		// view.addObject("targetTime", targetTime);
		view.addObject("pageTools", pageStr);
		view.addObject("count", pageInfo.getTotal());
		return view;
		
	}
	
	/**
	 * delNoticeLeftList:(). <br/>
	 * TODO().<br/>
	 * 删除 公告
	 * 
	 * @author lyh
	 * @param session
	 * @param id
	 * @return
	 */
	@RequestMapping("/del")
	@ResponseBody
	public Object delNoticeLeftList(HttpSession session, @RequestParam(value = "id") long id) {
		String res = "-1";
		UserMsg userMsg = (UserMsg) session.getAttribute("UserMsg");
		long userId = 0;
		if (userMsg != null) {
			userId = userMsg.getUid();
		}
		Map<String, Object> map = new HashMap<String, Object>();
		
		OpGmtNoticeLeft agent = noticeLeftService.findById(id);
		if (agent != null) {
			noticeLeftService.delete(id);
			res = "1";
		}
		
		map.put("res", res);
		return res;
	}
	
	/**
	 * noticeLeftSave:(). <br/>
	 * TODO().<br/>
	 * 
	 * @author lyh
	 * @param session
	 * @return
	 */
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> noticeLeftSave(HttpSession session, @RequestParam(value="file") MultipartFile mFile, @RequestParam(value = "appid") String appid, @RequestParam(value = "wid") String wid, @RequestParam(value = "title") String title) {
		String res = "1";
		UserMsg user = (UserMsg) session.getAttribute("UserMsg");
		if (user == null) {
			res = "-1";
		}
		String path = session.getServletContext().getRealPath("upload/img/");
		long startTime = System.currentTimeMillis();
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		
		// 检查form中是否有enctype="multipart/form-data"
		boolean bEnter = false;
		String pathName = "";
		if (mFile != null && mFile.getSize() > 0) {
			File fileDir = new File(path);
			if (!fileDir.isDirectory()){
				fileDir.mkdirs();
			}
			pathName = path + mFile.getOriginalFilename();
			// 上传
			try {
				mFile.transferTo(new File(pathName));
				bEnter = true;
			} catch (IllegalStateException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		if (bEnter) {
			String content  = pathName.substring(pathName.indexOf("\\upload"));
			OpGmtNoticeLeft notice = new OpGmtNoticeLeft();
			notice.setAppId(appid);
			notice.setContent(content);
			notice.setCreateTime(new Date(System.currentTimeMillis()));
			notice.setTitle(title);
			notice.setWorldId(wid);
			
			res = noticeLeftService.sendNoticLeft(notice);
			
		}
		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("res", res);
		return map;
	}
}
