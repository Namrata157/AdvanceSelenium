package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test4 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis =new FileInputStream("./src/test/resources/Exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.getRow(4);
		Cell cell1 = row.getCell(0);
		Cell cell2 = row.getCell(1);
		String un = cell1.getStringCellValue();
		String pwd=df.formatCellValue(cell2);
		System.out.println(un);
		System.out.println(pwd);
		wb.close();
		
		
		
		

	}

}
