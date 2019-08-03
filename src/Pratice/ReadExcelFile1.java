package Pratice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\Murali\\Desktop\\Test.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		System.out.println("Total Number of Rows:"+rowcount);
		
		for(int i=0;i<rowcount+1;i++)
		{
			String data0=sheet1.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Test data from excel is: "+data0);
			System.out.println("data from row "+i+" is  "+data0);
		}
		wb.close();
	}

}
