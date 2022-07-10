package HandlingXLfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Main_writeONxlFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook w= WorkbookFactory.create(fis);
		w.getSheet("Sheet1").getRow(1).getCell(1).setCellValue("nabin");
		FileOutputStream f=new FileOutputStream("./data/Book1.xlsx");
		w.write(f);
		String value = w.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		
		System.out.println(value);
		w.close();
	}
}
