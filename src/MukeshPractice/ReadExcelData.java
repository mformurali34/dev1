package MukeshPractice;

import java.io.IOException;

import Common.Lib;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Lib Excel=new Lib("C:\\\\Users\\\\Murali\\\\Desktop\\\\Test.xlsx");
		System.out.println(Excel.getData(1,0,0));
	}

}
