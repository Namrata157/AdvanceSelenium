package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test6 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row row = sheet.createRow(3);
		Cell cell1 = row.createCell(0);
		cell1.setCellValue("Namrata");
		Cell cell2 = row.createCell(1);
		sheet.getRow(3).createCell(1).setCellValue("Mahajan");
		FileOutputStream fos=new FileOutputStream("./src/test/resources/Exceldata.xlsx");
		wb.write(fos);
		wb.close();

	}

}
