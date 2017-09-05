package com.gamecenter.common.csv;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opencsv.CSVReader;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.HeaderColumnNameTranslateMappingStrategy;

//@Component
public class StudentConfig {
	/**
	 * 使用 Spring 的 PostConstruct机制,项目启动时,将CSV配置文件读取到内存 map 中 库version:opencsv-2.3.jar
	 */
	public static Map<Integer, Studentconfigbean> studentMap = null;
	
	// @PostConstruct
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
	
}