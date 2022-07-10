package HandlingXLfile;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Main_makeGenericRowAndCell {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook w= WorkbookFactory.create(fis);
		int count=w.getSheet("Sheet1").getLastRowNum();
		int c=w.getSheet("Sheet1").getRow(0).getLastCellNum();
		for(int i=1;i<=count;i++)
		{
			for(int j=0;j<c;j++)
			{
				String un = w.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
				System.out.print(un+" ");
			}
			System.out.println();
		}
	}
}
