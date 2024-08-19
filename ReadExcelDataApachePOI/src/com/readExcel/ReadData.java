package com.readExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\Administrator\\Documents\\Testing course\\data.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet s1=wb.getSheetAt(0);
		String data0=s1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel is ...."+data0);
		String data1=s1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is "+data1);
		wb.close();
			
		
		
		

	}

}
