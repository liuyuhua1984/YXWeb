package com.gamecenter.common;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 日常工具方法
 */
public class Tools {
	private Calendar calendar = null;
	private int minus = 0;
	
	public Tools() {
		
	}
	
	public Tools(int t) {
		this.minus = t;
		this.calendar = new GregorianCalendar();
	}
	
	/**
	 * 时间的加减运算
	 * 
	 * @param time 起始时间
	 * @param type 类型
	 * @param num 数量
	 * @return
	 */
	public static String getDate(String time, int type, int num) {
		String resTime = "";
		try {
			// 字符串时间转Date
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			java.util.Date d = sdf.parse(time);
			
			Calendar c = Calendar.getInstance();
			
			// Date 转Calendar
			c.setTime(d);
			
			// 使用Calendar 进行时间的加减运算
			if (type == 2) {
				c.add(Calendar.MONTH, num);
			} else if (type == 1) {
				c.add(Calendar.DATE, num);
			} else if (type == 3) {
				c.add(Calendar.YEAR, num);
			} else if (type == 4) {
				c.add(Calendar.MINUTE, num);
			}
			
			// 最终把Calendar 转Date 再转 String 输出
			// System.out.println(sdf.format(c.getTime()));
			resTime = sdf.format(c.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resTime;
	}
	
	public static String getDate(String time, int type, int num, String fmt) {
		String resTime = "";
		try {
			// 字符串时间转Date
			SimpleDateFormat sdf = new SimpleDateFormat(fmt);
			java.util.Date d = sdf.parse(time);
			
			Calendar c = Calendar.getInstance();
			
			// Date 转Calendar
			c.setTime(d);
			
			// 使用Calendar 进行时间的加减运算
			if (type == 2) {
				c.add(Calendar.MONTH, num);
			} else if (type == 1) {
				c.add(Calendar.DATE, num);
			} else if (type == 3) {
				c.add(Calendar.YEAR, num);
			} else if (type == 4) {
				c.add(Calendar.MINUTE, num);
			}
			
			// 最终把Calendar 转Date 再转 String 输出
			// System.out.println(sdf.format(c.getTime()));
			resTime = sdf.format(c.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return resTime;
	}
	
	/**
	 * 获得指定之前时间的时间戳(秒级别)
	 * 
	 * @return
	 */
	public long getBeforeTimeStamp() {
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR));
		buf.append(this.addZero(calendar.get(Calendar.MONTH) + 1, 2));
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		calendar.add(Calendar.MINUTE, this.minus);
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
		// buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		
		return Long.parseLong(buf.toString());
	}
	
	/**
	 * 获得系统的时间戳 (毫秒级)
	 * 
	 * @return
	 */
	public long getTimeStamp() {
		StringBuffer buf = new StringBuffer();
		buf.append(calendar.get(Calendar.YEAR));
		buf.append(this.addZero(calendar.get(Calendar.MONTH) + 1, 2));
		buf.append(this.addZero(calendar.get(Calendar.DAY_OF_MONTH), 2));
		buf.append(this.addZero(calendar.get(Calendar.HOUR_OF_DAY), 2));
		calendar.add(Calendar.MINUTE, this.minus);
		buf.append(this.addZero(calendar.get(Calendar.MINUTE), 2));
		buf.append(this.addZero(calendar.get(Calendar.SECOND), 2));
		buf.append(this.addZero(calendar.get(Calendar.MILLISECOND), 3));
		
		return Long.parseLong(buf.toString());
	}
	
	private String addZero(int num, int len) {
		StringBuffer s = new StringBuffer();
		s.append(num);
		while (s.length() < len) {
			s.insert(0, "0");
		}
		return s.toString();
	}
	
	/**
	 * 返回普通sql日期
	 * 
	 * @param dates
	 * @return
	 */
	@SuppressWarnings("UNCHECKED")
	public static Date getSqlDate(String dates) {
		Date sqlDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			java.util.Date date = sdf.parse(dates);
			sqlDate = new Date(date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sqlDate;
	}
	
	/**
	 * 字符串时间 转换为Date
	 * 
	 * @param dates
	 * @return
	 */
	public static Date getDateByStr(String dates) {
		Date sqlDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			java.util.Date date = sdf.parse(dates);
			sqlDate = new Date(date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sqlDate;
	}
	
	/**
	 * 字符串时间 转换为Date
	 * 
	 * @param dates
	 * @return
	 */
	public static Date getDateByStr2(String dates) {
		Date sqlDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		try {
			java.util.Date date = sdf.parse(dates);
			sqlDate = new Date(date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sqlDate;
	}
	
	/**
	 * 返回当前精确sql日期
	 * 
	 * @return
	 */
	public static Timestamp getSqlTime() {
		Timestamp sqlDate = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		try {
			java.util.Date date = sdf.parse(getNowDate("yyyy-MM-dd HH:mm:ss"));
			sqlDate = new Timestamp(date.getTime());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return sqlDate;
	}
	
	public static String getChnMoney(String bigdMoneyNumber) {
		return getChnMoney(new BigDecimal(bigdMoneyNumber));
	}
	
	public static String getChnMoney(BigDecimal bigdMoneyNumber) {
		String[] straChineseUnit = new String[] { "分", "角", "圆", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟" };
		String[] straChineseNumber = new String[] { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };// 中文数字字符数组
		String strChineseCurrency = "";
		boolean bZero = true;// 零数位标记
		int ChineseUnitIndex = 0;// 中文金额单位下标
		try {
			if (bigdMoneyNumber.intValue() == 0)
				return "零圆整";
			double doubMoneyNumber = Math.round(bigdMoneyNumber.doubleValue() * 100);// 处理小数部分，四舍五入
			boolean bNegative = doubMoneyNumber < 0;// 是否负数
			doubMoneyNumber = Math.abs(doubMoneyNumber);// 取绝对值
			while (doubMoneyNumber > 0)// 循环处理转换操作
			{
				if (ChineseUnitIndex == 2 && strChineseCurrency.length() == 0)
					strChineseCurrency = strChineseCurrency + "整";// 整的处理(无小数位)
				if (doubMoneyNumber % 10 > 0)// 非零数位的处理
				{
					strChineseCurrency = straChineseNumber[(int) doubMoneyNumber % 10] + straChineseUnit[ChineseUnitIndex] + strChineseCurrency;
					bZero = false;
				} else {// 零数位的处理
					if (ChineseUnitIndex == 2)// 元的处理(个位)
					{
						if (doubMoneyNumber > 0)// 段中有数字
						{
							strChineseCurrency = straChineseUnit[ChineseUnitIndex] + strChineseCurrency;
							bZero = true;
						}
					} else if (ChineseUnitIndex == 6 || ChineseUnitIndex == 10)// 万、亿数位的处理
					{
						if (doubMoneyNumber % 1000 > 0)
							strChineseCurrency = straChineseUnit[ChineseUnitIndex] + strChineseCurrency;// 段中有数字
					}
					if (!bZero)
						strChineseCurrency = straChineseNumber[0] + strChineseCurrency; // 前一数位非零的处理
					bZero = true;
				}
				doubMoneyNumber = Math.floor(doubMoneyNumber / 10);
				ChineseUnitIndex++;
			}
			if (bNegative)
				strChineseCurrency = "负" + strChineseCurrency;// 负数的处理
		} catch (Exception e) {
			return "";
		}
		return strChineseCurrency;
	}
	
	public static String getChinese(String s) {
		if (s == null)
			return "";
		try {
			String convert = new String(s.getBytes("ISO8859_1"), "GB2312");
			return convert;
		} catch (Exception e) {
		}
		return s;
	}
	
	public static String getCharset(String s, String fromCharset1, String toCharset2) {
		if (s == null)
			return "";
		try {
			String convert = new String(s.getBytes(fromCharset1), toCharset2);
			return convert;
		} catch (Exception e) {
		}
		return s;
	}
	
	public static String getSQLLike(String SQL) {
		if (!SQL.equals("")) {
			SQL = SQL.replace("Like '~!", "Like '%");
			SQL = SQL.replace("~!')", "%')");
		}
		return SQL;
	}
	
	// 返回给定的字符长度
	// s:要截取的字符串
	// LimitStrlen:长度
	// IsReturnSpace:当s为null时是否返回" ";为true:要返回；false：不返回
	// IsDouHao:返回值中是否将字符串中的上逗号'去掉 为true:要去掉；false：不去掉
	// public static String getSaveStr(String s){boolean m;if(DBConnect.Ver==0)m=false;else m=true;return getLimitLenStr(s,0,m,true);}
	// public static String getSaveStr(String s,int LimitStrlen){boolean m;if(DBConnect.Ver==0)m=false;else m=true;return getLimitLenStr(s,LimitStrlen,m,true);}
	public static String getLimitLenStr(String s, int LimitStrlen) {
		return getLimitLenStr(s, LimitStrlen, false);
	}
	
	public static String getLimitLenStr(String s, int LimitStrlen, boolean IsReturnSpace) {
		return getLimitLenStr(s, LimitStrlen, IsReturnSpace, false);
	}
	
	public static String getLimitLenStr(String s, int LimitStrlen, boolean IsReturnSpace, boolean IsDouHao) {
		if (s == null)
			if (IsReturnSpace == true)
				return " ";
			else
				return "";
		s = s.replace("'", "");
		if (LimitStrlen != 0) {
			char[] cc = s.toCharArray();
			int intLen = 0;
			int i;
			// if("中国".length()==4){return s.substring(Maxlen/2);}
			for (i = 0; i < cc.length; i++) {
				if ((int) cc[i] > 255) {
					intLen = intLen + 2;
				} else {
					intLen++;
				}
				if (intLen >= LimitStrlen) {
					break;
				}
			}
			if (intLen == LimitStrlen)
				i++;
			s = s.substring(0, i);
		}
		if (s.equals(""))
			if (IsReturnSpace == true)
				return s = " ";
		if (IsDouHao == true)
			s = s.replace("'", "");
		return s;
	}
	
	public static String getLimitChinese(String s, int MaxLen) {
		if (s == null)
			return "";
		try {
			String convert = new String(s.getBytes("ISO8859_1"), "GB2312");
			convert = getLimitLenStr(convert, MaxLen);
			// String convert=getLimitLenStr(s,MaxLen);
			return convert;
		} catch (Exception e) {
		}
		return "";
	}
	
	public static String getNumber(String m) {
		if (m == null)
			return "0";
		m = m.trim();
		if (m.equals(""))
			return "0";
		return m;
	}
	
	public static String getNowDate() {
		SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar now = Calendar.getInstance();
		return s.format(now.getTime()).toString();
	}
	
	public static String getNowDate(String format) {
		SimpleDateFormat s = new SimpleDateFormat(format);
		Calendar now = Calendar.getInstance();
		return s.format(now.getTime()).toString();
	}
	
	public static String getDate(String m) {
		if (m == null)
			return getNowDate();
		m = m.trim();
		if (m.equals(""))
			return getNowDate();
		try {
			SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
			m = s.format(s.parse(m)).toString();
		} catch (Exception e) {
			m = getNowDate();
		}
		return m;
	}
	
	/**
	 * date 转换为时间串
	 * 
	 * @param date
	 * @return
	 */
	public static String getDateString(java.util.Date date) {
		String str = "";
		try {
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			str = format.format(date);
		} catch (Exception e) {
		}
		return str;
	}
	
	/**
	 * 提供判断并返回值。
	 * 
	 * @param w 源固定值
	 * @param m 变量值
	 */
	public static String getSwitch(String Rstr, String w, String m) {
		if (w.equals(m))
			return Rstr;
		else
			return "";
	}
	
	/**
	 * 提供精确的加法运算。
	 * 
	 * @param v1 被加数
	 * @param v2 加数
	 * @return 两个参数的和
	 */
	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.add(b2).doubleValue();
	}
	
	/**
	 * 提供精确的减法运算。
	 * 
	 * @param v1 被减数
	 * @param v2 减数
	 * @return 两个参数的差
	 */
	public static double sub(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.subtract(b2).doubleValue();
	}
	
	/**
	 * 提供精确的乘法运算。
	 * 
	 * @param v1 被乘数
	 * @param v2 乘数
	 * @return 两个参数的积
	 */
	public static double mul(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.multiply(b2).doubleValue();
	}
	
	/**
	 * 提供（相对）精确的除法运算，当发生除不尽的情况时，精确到 小数点以后10位，以后的数字四舍五入。
	 * 
	 * @param v1 被除数
	 * @param v2 除数
	 * @return 两个参数的商
	 */
	public static double div(double v1, double v2) {
		return div(v1, v2, 10);
	}
	
	/**
	 * 提供（相对）精确的除法运算。当发生除不尽的情况时，由scale参数指 定精度，以后的数字四舍五入。
	 * 
	 * @param v1 被除数
	 * @param v2 除数
	 * @param scale 表示表示需要精确到小数点以后几位。
	 * @return 两个参数的商
	 */
	public static double div(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(Double.toString(v1));
		BigDecimal b2 = new BigDecimal(Double.toString(v2));
		return b1.divide(b2, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * 提供精确的小数位四舍五入处理。
	 * 
	 * @param v 需要四舍五入的数字
	 * @param scale 小数点后保留几位
	 * @return 四舍五入后的结果
	 */
	public static double round(double v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		return b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	
	/**
	 * 提供精确的格式化小数位四舍五入处理。
	 * 
	 * @param v 需要四舍五入的数字
	 * @param scale 小数点后保留几位
	 * @param Format 输出的格式 如保留小数点后2位"#.00"
	 * @return 四舍五入后的格式化结果
	 */
	public static String round(double v, int scale, String Format) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(Double.toString(v));
		BigDecimal one = new BigDecimal("1");
		DecimalFormat df1 = new DecimalFormat(Format);
		return df1.format(b.divide(one, scale, BigDecimal.ROUND_HALF_UP).doubleValue());
	}
	
	/**
	 * 提供精确的格式化小数位处理。
	 * 
	 * @param v 需要四舍五入的数字
	 * @param Format 输出的格式 如保留小数点后2位"#.00"
	 * @return 四舍五入后的格式化结果
	 */
	public static String round(double v, String Format) {
		DecimalFormat df1 = new DecimalFormat(Format);
		return df1.format(v);
	}
	
	public static String getName(Connection con, String sql) {
		String name = "";
		Statement stmt = null;
		try {
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs != null) {
				if (rs.next()) {
					name = rs.getString(1);
				}
				rs.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			stmt.close();
		} catch (Exception ww) {
		}
		return name;
	}
	
	public static File[] getAllUpFiles(HttpSession session) {
		File f = new File(session.getServletContext().getRealPath("/") + "Editor\\UploadFile\\" + session.getId());
		if (!f.exists())
			return new File[0];
		else
			return f.listFiles();
	}
	
	public static void deleteDirectory(File dir) throws IOException {
		if ((dir == null) || !dir.isDirectory()) {
			return;
		}
		File[] entries = dir.listFiles();
		int sz = entries.length;
		for (int i = 0; i < sz; i++) {
			if (entries[i].isDirectory()) {
				deleteDirectory(entries[i]);
			} else {
				entries[i].delete();
			}
		}
		dir.delete();
	}
	
	public static String getAsstring(String str, int n) {
		if (str.length() > n)
			return str.substring(0, n);
		else
			return str;
	}
	
	public static String getIpAddr(HttpServletRequest request) {
		String ip = "";
		try {
			ip = request.getHeader("x-forwarded-for");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
			}
			String a[] = ip.split("\\.");
			for (int i = 0; i < 4; i++) {
				if (a[i].trim().length() == 2)
					a[i] = "0" + a[i].trim();
				if (a[i].trim().length() == 1)
					a[i] = "00" + a[i].trim();
			}
			ip = a[0] + "." + a[1] + "." + a[2] + "." + a[3];
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ip;
	}
	
	public static String getIpAddrass(HttpServletRequest request) {
		String ip = "";
		try {
			ip = request.getHeader("x-forwarded-for");
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getHeader("WL-Proxy-Client-IP");
			}
			if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
				ip = request.getRemoteAddr();
			}
			// String a[]=ip.split("\\.");
			// for(int i=0;i<4;i++){
			// if(a[i].trim().length()==2) a[i]="0"+a[i].trim();
			// if(a[i].trim().length()==1) a[i]="00"+a[i].trim();
			// }
			// ip= a[0]+"."+a[1]+"."+a[2]+"."+a[3];
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ip;
	}
	
	/*public static String getIpProvince(String ip){ String province=""; Statement stmt=null; ResultSet rs=null; DBConnect db = new DBConnect(); try{ stmt=db.con.createStatement();
	 * rs=stmt.executeQuery("select IP_PROVINCE from T_PROVINCEIP where '"+ip+"'>IP_FROM and '"+ip+"'<IP_END"); if(rs!=null){ if(rs.next()){ province=rs.getString("IP_PROVINCE"); } rs.close();
	 * }else{ province="未知地区"; } }catch(Exception e){} try{stmt.close();}catch(Exception e1){} db.CloseDataBase(); return province; } public static String[] getIpCity(String ip){ String
	 * city[]={"",""}; Statement stmt=null; ResultSet rs=null; DBConnect db = new DBConnect(); try{ stmt=db.con.createStatement();
	 * rs=stmt.executeQuery("select IP_CITY,IP_PROVINCE from T_CITYIP where '"+ip+"'>IP_FROM and '"+ip+"'<IP_END"); if(rs!=null){ if(rs.next()){ city[0]=rs.getString("IP_CITY");
	 * city[1]=rs.getString("IP_PROVINCE"); } rs.close(); }else{ city[0]="未知地区";city[1]="未知地区"; } }catch(Exception e){} try{stmt.close();}catch(Exception e1){} db.CloseDataBase(); return city; } */
	// public static String getIpArea(String ip){
	// String area="";
	// Statement stmt=null;
	// ResultSet rs=null;
	// DBConnect db = new DBConnect();
	// try{
	// stmt=db.con.createStatement();
	// rs=stmt.executeQuery("select IP_AREA from T_IPAREA where type='3' AND IP_STATUS='1' AND '"+ip+"'>=IP_FROM and '"+ip+"'<=IP_END");
	// if(rs!=null){
	// if(rs.next()){
	// area=rs.getString("IP_AREA");
	// }else{area="unkown";}
	// rs.close();
	// }else{area="unkown";}
	//
	// if(area.equals("unkown")){
	// rs=stmt.executeQuery("select IP_AREA from T_IPAREA where type='2' AND IP_STATUS='1' and '"+ip+"'>=IP_FROM and '"+ip+"'<=IP_END");
	// if(rs!=null){
	// if(rs.next()){
	// area=rs.getString("IP_AREA");
	// }else{area="unkown";}
	// rs.close();
	// }else{area="unkown";}
	// }
	//
	// if(area.equals("unkown")){
	// rs=stmt.executeQuery("select IP_AREA from T_IPAREA where type='1' AND IP_STATUS='1' and '"+ip+"'>=IP_FROM and '"+ip+"'<=IP_END");
	// if(rs!=null){
	// if(rs.next()){
	// area=rs.getString("IP_AREA");
	// }else{area="unkown";}
	// rs.close();
	// }else{area="unkown";}
	// }
	//
	// }catch(Exception e){e.printStackTrace();}
	// try{stmt.close();}catch(Exception e1){}
	// db.CloseDataBase();
	// if (area.equals(""))area=" ";
	// return area;
	// }
	//
	// public static int isUpSFZ(String PassportID){
	// int i=-1;
	// Statement stmt=null;
	// ResultSet rs=null;
	// DBConnect db=new DBConnect();
	// try{
	// stmt=db.con.createStatement();
	// rs=stmt.executeQuery("select SFZ_STATUS from T_SFZ where PASSPORT_ID='"+PassportID+"'");
	// if(rs!=null){if(rs.next()){
	// i=rs.getInt(1);
	// }rs.close();}
	// }catch(Exception e1){e1.printStackTrace();};
	// try{stmt.close();}catch(Exception ee){}
	// db.CloseDataBase();
	// return i;
	// }
	
	// new add
	public static String escape(String src) {
		int i;
		char j;
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length() * 6);
		for (i = 0; i < src.length(); i++) {
			j = src.charAt(i);
			if (Character.isDigit(j) || Character.isLowerCase(j) || Character.isUpperCase(j))
				tmp.append(j);
			else if (j < 256) {
				tmp.append("%");
				if (j < 16)
					tmp.append("0");
				tmp.append(Integer.toString(j, 16));
			} else {
				tmp.append("%u");
				tmp.append(Integer.toString(j, 16));
			}
		}
		return tmp.toString();
	}
	
	public static String unescape(String src) {
		StringBuffer tmp = new StringBuffer();
		tmp.ensureCapacity(src.length());
		int lastPos = 0, pos = 0;
		char ch;
		while (lastPos < src.length()) {
			pos = src.indexOf("%", lastPos);
			if (pos == lastPos) {
				if (src.charAt(pos + 1) == 'u') {
					ch = (char) Integer.parseInt(src.substring(pos + 2, pos + 6), 16);
					tmp.append(ch);
					lastPos = pos + 6;
				} else {
					ch = (char) Integer.parseInt(src.substring(pos + 1, pos + 3), 16);
					tmp.append(ch);
					lastPos = pos + 3;
				}
			} else {
				if (pos == -1) {
					tmp.append(src.substring(lastPos));
					lastPos = src.length();
				} else {
					tmp.append(src.substring(lastPos, pos));
					lastPos = pos;
				}
			}
		}
		return tmp.toString();
	}
	
	/**
	 * 隐藏字符串的字符
	 * 
	 * @param str
	 * @param begin
	 * @param end
	 * @return
	 */
	public static String getHiddenStr(String str, int begin, int end) {
		String newStr = "";
		String temp = str.substring(end);
		StringBuffer stringBuffer = new StringBuffer();
		for (int i = 0; i < end; i++) {
			stringBuffer.append("*");
		}
		stringBuffer.append(temp);
		newStr = stringBuffer.toString();
		return newStr;
	}
	
	/**
	 * 计算时间差
	 * 
	 * @param begin
	 * @param end
	 * @return
	 */
	public static long timecha(String begin, String end) {
		long xx = 0;
		if (begin == null || end == null)
			return 0;
		
		SimpleDateFormat sdf = null;
		if (end.length() == 10) {
			sdf = new SimpleDateFormat("yyyy-MM-dd");
		} else {
			sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		try {
			java.util.Date datebegin = sdf.parse(begin);
			java.util.Date daterend = sdf.parse(end);
			xx = daterend.getTime() - datebegin.getTime();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return xx;
	}
	
	public static int timechaDay(String begin, String end) {
		long xx = 0;
		if (begin == null || end == null)
			return 0;
		
		SimpleDateFormat sdf = null;
		if (end.length() == 10) {
			sdf = new SimpleDateFormat("yyyy-MM-dd");
		} else {
			sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		}
		try {
			java.util.Date datebegin = sdf.parse(begin);
			java.util.Date daterend = sdf.parse(end);
			xx = daterend.getTime() - datebegin.getTime();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return (int) (xx / (24 * 60 * 60 * 1000));
	}
	
	/**
	 * 字符串转换成日期
	 * 
	 * @param str
	 * @return date
	 */
	public static Date StrToDate(String str) {
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static void main(String[] args) {
		
		System.out.println("110".substring(2));
		
	}
}
