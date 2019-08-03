package Pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\Murali\\Desktop\\Test.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Excel file is:" +data0);
		
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from Excel file is:" +data1);
		wb.close();
	}

}
