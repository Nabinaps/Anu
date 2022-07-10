package HandlingXLfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Main_multipleDataFromxl {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook w= WorkbookFactory.create(fis);
		int count=w.getSheet("Sheet1").getLastRowNum();
		for(int i=1;i<=count;i++)
		{
			String un = w.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			String pwd = w.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
			System.out.println(un+" "+pwd);
		}
	}
}
