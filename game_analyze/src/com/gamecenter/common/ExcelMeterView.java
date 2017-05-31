package com.gamecenter.common;

import com.gamecenter.parBean.Par_meter;
import org.apache.poi.hssf.usermodel.*;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA. User: Administrator Date: 12-3-1 Time: 下午9:41 To change this template use File | Settings | File Templates.
 */
public class ExcelMeterView extends AbstractExcelView {
	
	protected void buildExcelDocument(Map model, HSSFWorkbook workbook, HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String sheetName = "";
		int type = ((Integer) model.get("type")).intValue();
		if (type == 1) {
			sheetName = "工作计量器具";
		} else if (type == 2) {
			sheetName = "标准计量器具";
		} else {
			sheetName = "二次仪表";
		}
		
		HSSFSheet sheet = workbook.createSheet(sheetName); // 页名称
		sheet.setDefaultColumnWidth((short) 16); // 列的宽度
		
		int sheetRowNum = 0; // 行控制
		List<Par_meter> list = (List<Par_meter>) model.get("records");
		
		if (list != null && list.size() > 0) {
			// //创建标题
			// HSSFRow titleRow = sheet.createRow((short) sheetRowNum++);
			// HSSFCell titleCell = titleRow.createCell((short) 0);
			// titleCell.setCellValue(new HSSFRichTextString("卡账户查询"));
			//
			// //创建一个空行
			// sheet.createRow(sheetRowNum++);
			
			// 创建数据表头
			String[] titles = { "计量器具名称", "生产厂名", "规格型号", "器号", "测量范围", "精度", "检定周期", "管理级别", "使用单位", "使用班组", "使用部位", "用途", "检定日期", "有效期", "检定单位", "备注" };
			HSSFRow dataTitleRow = sheet.createRow((short) sheetRowNum++);
			for (int i = 0; i < titles.length; i++) {
				HSSFCell cell = dataTitleRow.createCell((short) i);
				cell.setCellValue(new HSSFRichTextString(titles[i]));
			}
			
			// String[] methodArray = {"getAccountId", "getCardId", "getMemberId", "getMerchantsId", "getBranchId", "getBalance", "getTimes", "getIntegral", "getGmtCreate"};
			
			// 数据模型转换:创建表格数据
			Iterator<Par_meter> iter = list.iterator();
			for (int i = sheetRowNum; i < list.size() + sheetRowNum; i++) {
				if (iter.hasNext()) {
					Par_meter item = iter.next();
					HSSFRow dataRow = sheet.createRow((short) (i));
					// writeRowData(item, dataRow, methodArray); //写入行
					
					HSSFCell cell = dataRow.createCell((short) 0);
					cell.setCellValue(new HSSFRichTextString(item.getMname()));
					cell = dataRow.createCell((short) 1);
					cell.setCellValue(new HSSFRichTextString(item.getFname()));
					cell = dataRow.createCell((short) 2);
					cell.setCellValue(new HSSFRichTextString(item.getModel()));
					cell = dataRow.createCell((short) 3);
					cell.setCellValue(new HSSFRichTextString(item.getNumber()));
					cell = dataRow.createCell((short) 4);
					cell.setCellValue(new HSSFRichTextString(item.getMeterscope()));
					
					cell = dataRow.createCell((short) 5);
					cell.setCellValue(new HSSFRichTextString(item.getPrecisionx()));
					cell = dataRow.createCell((short) 6);
					// 检定周期年限的转换
					String checkPeriod = item.getCheckperiod().trim();
					if (checkPeriod.equals("-1")) {
						cell.setCellValue(new HSSFRichTextString("维修期"));
					} else if (checkPeriod.equals("6")) {
						cell.setCellValue(new HSSFRichTextString("半年"));
					} else if (checkPeriod.equals("12")) {
						cell.setCellValue(new HSSFRichTextString("一年"));
					} else if (checkPeriod.equals("18")) {
						cell.setCellValue(new HSSFRichTextString("一年半"));
					} else if (checkPeriod.equals("24")) {
						cell.setCellValue(new HSSFRichTextString("两年"));
					} else if (checkPeriod.equals("36")) {
						cell.setCellValue(new HSSFRichTextString("三年"));
					} else if (checkPeriod.equals("48")) {
						cell.setCellValue(new HSSFRichTextString("四年"));
					}
					
					cell = dataRow.createCell((short) 7);
					cell.setCellValue(new HSSFRichTextString(item.getMlevel()));
					cell = dataRow.createCell((short) 8);
					cell.setCellValue(new HSSFRichTextString(item.getOname()));
					cell = dataRow.createCell((short) 9);
					cell.setCellValue(new HSSFRichTextString(item.getTname()));
					cell = dataRow.createCell((short) 10);
					cell.setCellValue(new HSSFRichTextString(item.getUsepart()));
					cell = dataRow.createCell((short) 11);
					cell.setCellValue(new HSSFRichTextString(item.getApplication()));
					cell = dataRow.createCell((short) 12);
					cell.setCellValue(new HSSFRichTextString(item.getChecktime()));
					cell = dataRow.createCell((short) 13);
					cell.setCellValue(new HSSFRichTextString(item.getValidity()));
					cell = dataRow.createCell((short) 14);
					cell.setCellValue(new HSSFRichTextString(item.getCheckunit()));
					cell = dataRow.createCell((short) 15);
					cell.setCellValue(new HSSFRichTextString(item.getInfo()));
					
					// //其他的数据转换
					// HSSFCell cell_0 = dataRow.createCell((short) methodArray.length);
					// if (item.getStatus() == 1) {
					// cell_0.setCellValue(new HSSFRichTextString("正常"));
					// } else {
					// cell_0.setCellValue(new HSSFRichTextString("异常"));
					// }
				}
			}
		} else {// 没数据
			// 创建提示
			HSSFRow titleRow = sheet.createRow((short) sheetRowNum++);
			HSSFCell titleCell = titleRow.createCell((short) 0);
			titleCell.setCellValue(new HSSFRichTextString("没有数据"));
		}
		
		// // Write a text at A1.
		// HSSFCell cell = getCell(sheet, 0, 0);
		// setText(cell, "Spring POI test");
		//
		// // Write the current date at A2.
		// HSSFCellStyle dateStyle = workbook.createCellStyle();
		// dateStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy"));
		// cell = getCell(sheet, 1, 0);
		// cell.setCellValue(new java.util.Date());
		// cell.setCellStyle(dateStyle);
		//
		// // Write a number at A3
		// getCell(sheet, 2, 0).setCellValue(458);
		//
		// // Write a range of numbers.
		// HSSFRow sheetRow = sheet.createRow(3);
		// for (short i = 0; i < 10; i++) {
		// sheetRow.createCell(i).setCellValue(i * 10);
		// }
	}
	
	/**
	 * 将对象o按methodArray的顺序写入到dataRow的行中，在导出excel中用到
	 * 
	 * @param o 写入的对象
	 * @param dataRow 写人的行
	 * @param methodArray 拿取o对象的get方法列表 如 String[] paraArray = { "getAccountId", "getCardId"}; 效果是，将o的accountId和cardId值设置到dataRow中
	 */
	public static void writeRowData(Object o, HSSFRow dataRow, String[] methodArray) {
		Class<?> c = o.getClass();
		
		for (int i = 0; i < methodArray.length; i++) {
			HSSFCell cell = dataRow.createCell((short) i); // 创建一个行
			String methodName = methodArray[i];
			// 根据paraArray中的顺序，依次取出o对应方法的值，设置到dataRow中
			Method m = null;
			try {
				m = c.getMethod(methodName);
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (NoSuchMethodException e) {
				e.printStackTrace();
			}
			if (m != null) {
				try {
					String returnType = m.getReturnType().toString();
					if (returnType.contains("String")) {
						cell.setCellValue(new HSSFRichTextString((String) m.invoke(o)));
					} else if (returnType.contains("Integer") || returnType.contains("int")) {
						// cell.setCellValue(SimpleFilter.filterNull((Integer) m.invoke(o)));
					} else if (returnType.contains("Date")) {
						// cell.setCellValue(new HSSFRichTextString(SimpleDateUtils.getDateString((Date) m.invoke(o), null)));
					}
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					e.printStackTrace();
				}
			} else {
				cell.setCellValue(new HSSFRichTextString(""));
			}
		}
	}
	
}
