package com.gamecenter.common.csv;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVParser;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

/**
 * CVS 数据导入/导出测试
 */
public class CsvSample {
	String filePath = "e:/mysample.csv";
	
	public static void main(String[] args) throws Exception {
		CsvSample sample = new CsvSample();
		sample.doSample();
		// sample.init();
	}
	
	public CsvSample() {
	}
	
	public void doSample() throws Exception {
		// First write
		
		String[] fields = new String[5];
		fields[0] = "测试";
		fields[1] = "3.0";
		fields[2] = "3,147.25";
		fields[3] = "$3,147.26";
		// failing string
		fields[4] = "Joe said, \"This is a test of a \nlong broken string,\" and Sally said, \"I bet it won't work.\" ";
		// working string
		// fields[4] = "Joe said, \"This is a test of a \nlong broken string,\" and Sally said, \"I bet it won't work.\"";
		
		List<String[]> allElements = new ArrayList<String[]>();
		allElements.add(new String[] { "张三", "地址1", "邮箱1" });
		allElements.add(new String[] { "李四", "地址2", "邮箱2" });
		allElements.add(new String[] { "张三", "地址1", "邮箱1" });
		allElements.add(new String[] { "李四", "地址2", "邮箱2" });
		allElements.add(new String[] { "张三", "地址1", "邮箱1" });
		allElements.add(new String[] { "李四", "地址2", "邮箱2" });
		allElements.add(new String[] { "张三", "地址1", "邮箱1" });
		
		OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(filePath), Charset.forName("GBK"));
		// CSVWriter writer = new CSVWriter(new FileWriter(filePath));
		CSVWriter writer = new CSVWriter(out);
		// writer.writeNext(fields); // let's make 3 rows so we can see it cleanly in Excel.
		// writer.writeNext(fields);
		// writer.writeNext(fields);
		writer.writeAll(allElements);
		writer.close();
		
		// testRawCsvRead(fields[4]);
		// testMappingStrategyRead(fields[4]);
		
		System.out.println("\nComplete.  File written out to " + filePath);
		
	}
	
	// 读取配置
	public static Map<Integer, Studentconfigbean> studentMap = null;
	
	public void init() {
		HeaderColumnNameTranslateMappingStrategy<Studentconfigbean> strategy = new HeaderColumnNameTranslateMappingStrategy<Studentconfigbean>();
		strategy.setType(Studentconfigbean.class);
		
		Map<String, String> columnMapping = new HashMap<String, String>();
		columnMapping.put("ID", "id"); // csv头和 java类成员变量映射
		columnMapping.put("NAME", "name");
		columnMapping.put("SCORE", "score");
		
		strategy.setColumnMapping(columnMapping);
		
		List<Studentconfigbean> list = null;
		String csvFilename = "e:/studentConfig.csv"; // TODO 放到项目路径下
		CSVReader csvReader = null;
		
		DataInputStream in = null;
		try {
			in = new DataInputStream(new FileInputStream(new File(csvFilename)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			csvReader = new CSVReader(new InputStreamReader(in, "utf-8")); // 解决中文乱码,另注意csv文件的编码格式.
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		CsvToBean<Studentconfigbean> csvToBean = new CsvToBean<Studentconfigbean>();
		list = csvToBean.parse(strategy, csvReader);
		
		studentMap = new HashMap<Integer, Studentconfigbean>();
		for (Object object : list) {
			Studentconfigbean studentCfgBean = (Studentconfigbean) object;
			studentMap.put(studentCfgBean.getId(), studentCfgBean); // 放到 map 里
			System.out.println("学生的配置文件读取");
			System.out.println("Id==>" + studentCfgBean.getId() + "  Name==>" + studentCfgBean.getName() + " Score==>" + studentCfgBean.getScore());
		}
	}
	
	/**
	 * This approach seems to work correctly, even with embedded newlines.
	 * 
	 * @param originalCommentText
	 * @throws java.io.FileNotFoundException
	 * @throws java.io.IOException
	 */
	protected void testRawCsvRead(String originalCommentText) throws FileNotFoundException, IOException {
		CSVReader reader = new CSVReader(new FileReader(filePath));
		String[] nextLine = null;
		int count = 0;
		while ((nextLine = reader.readNext()) != null) {
			if (!nextLine[0].equals("field1")) {
				System.out.println("RawCsvRead Assert Error: Name is wrong.");
			}
			if (!nextLine[1].equals("3.0")) {
				System.out.println("RawCsvRead Assert Error: Value is wrong.");
			}
			if (!nextLine[2].equals("3,147.25")) {
				System.out.println("RawCsvRead Assert Error: Amount1 is wrong.");
			}
			if (!nextLine[3].equals("$3,147.26")) {
				System.out.println("RawCsvRead Assert Error: Currency is wrong.");
			}
			System.out.println("Field 4 read: " + nextLine[4]);
			if (!nextLine[4].equals(originalCommentText)) {
				System.out.println("RawCsvRead Assert Error: Comment is wrong.");
			}
			count++;
		}
		if (count != 3) {
			System.out.println("RawCsvRead Assert Error: Count of lines is wrong.");
		}
		
	}
	
	/**
	 * This approach seems to fail with embedded newlines; that might be a weakness of the mapping strategy support classes.
	 * 
	 * @param originalCommentText
	 * @throws java.io.FileNotFoundException
	 */
	protected void testMappingStrategyRead(String originalCommentText) throws FileNotFoundException {
		
		ColumnPositionMappingStrategy mappingStrategy = new ColumnPositionMappingStrategy();
		mappingStrategy.setType(MyBean.class);
		String[] columns = new String[] { "name", "value", "amount1", "currency", "comments" }; // the fields to bind to in your JavaBean
		mappingStrategy.setColumnMapping(columns);
		
		InputStreamReader in = new InputStreamReader(new FileInputStream(filePath), Charset.forName("GBK"));
		
		CsvToBean csv = new CsvToBean();
		// CSVReader reader = new CSVReader(new FileReader(filePath), CSVParser.DEFAULT_SEPARATOR, CSVParser.DEFAULT_QUOTE_CHARACTER, CSVParser.DEFAULT_ESCAPE_CHARACTER, 0, false, false);
		CSVReader reader = new CSVReader(in, CSVParser.DEFAULT_SEPARATOR, CSVParser.DEFAULT_QUOTE_CHARACTER, CSVParser.DEFAULT_ESCAPE_CHARACTER, 0, false, false);
		List<MyBean> list = csv.parse(mappingStrategy, reader);
		
		if (list.size() != 3) {
			System.out.println("Error - list size is wrong.");
		}
		MyBean myBean = list.get(2);
		if (!myBean.getName().equals("field1")) {
			System.out.println("MappingStrategy Assert Error: Name is wrong.");
		}
		if (!myBean.getValue().equals("3.0")) {
			System.out.println("MappingStrategy Assert Error: Value is wrong.");
		}
		if (!myBean.getAmount1().equals("3,147.25")) {
			System.out.println("MappingStrategy Assert Error: Amount1 is wrong.");
		}
		if (!myBean.getCurrency().equals("$3,147.26")) {
			System.out.println("MappingStrategy Assert Error: Currency is wrong.");
		}
		printfield("MyBeanComments:         ", myBean.getComments());
		printfield("OriginalCommentText:    ", originalCommentText);
		if (!myBean.getComments().equals(originalCommentText)) {
			System.out.println("MappingStrategy Assert Error: Comment is wrong.");
		}
	}
	
	private void printfield(String header, String field) {
		System.out.println(header + field);
		System.out.println("fieldlen: " + field.length());
	}
	
	public static class MyBean {
		String name;
		String value;
		String amount1;
		String currency;
		String comments;
		
		public MyBean() {
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getValue() {
			return value;
		}
		
		public void setValue(String value) {
			this.value = value;
		}
		
		public String getAmount1() {
			return amount1;
		}
		
		public void setAmount1(String amount1) {
			this.amount1 = amount1;
		}
		
		public String getCurrency() {
			return currency;
		}
		
		public void setCurrency(String currency) {
			this.currency = currency;
		}
		
		public String getComments() {
			return comments;
		}
		
		public void setComments(String comments) {
			this.comments = comments;
		}
		
	}
	
}
