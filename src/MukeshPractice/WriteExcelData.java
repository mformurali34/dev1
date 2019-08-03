package MukeshPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src=new File("C:\\Users\\Murali\\Desktop\\Test.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		sheet1.getRow(0).createCell(2).setCellValue("Pass");
		sheet1.getRow(1).createCell(2).setCellValue("Fail");
		FileOutputStream fout=new FileOutputStream(src);
		wb.write(fout);
	wb.close();
	
	}

}
