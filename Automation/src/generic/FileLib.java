package generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib

{
	/**
	 * 
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getPropertyData(String key) throws IOException
	{
		FileInputStream fis=new FileInputStream("./data/common.property");
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
		
	}
	/**
	 * 
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getExelData(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook w= WorkbookFactory.create(fis);
		String data = w.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
	/**
	 * 
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void stExelData(String sheetname,int row,int cell,String value) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./data/Book1.xlsx");
		Workbook w= WorkbookFactory.create(fis);
		w.getSheet(sheetname).getRow(row).getCell(cell).setCellValue(value);
		FileOutputStream f=new FileOutputStream("./data/Book1.xlsx");
		w.write(f);
		w.close();
	}
}
