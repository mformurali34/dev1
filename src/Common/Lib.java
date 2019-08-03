package Common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Lib {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	public Lib(String ExcelPath) throws IOException{
		
	 try {
		File src=new File(ExcelPath);
		 FileInputStream fis=new FileInputStream(src);
		 wb= new XSSFWorkbook(fis);
		 
	     } catch (Exception e) 
	     {
		System.out.println(e.getMessage());
	     }
	

}


public String getData(int SheetNumber,int row,int column)
{
	sheet1=wb.getSheetAt(SheetNumber);
	String data=sheet1.getRow(row).getCell(column).getStringCellValue();
	
	return data;

}
}