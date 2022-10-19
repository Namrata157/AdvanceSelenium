package Practice2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Test5 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/Exceldata.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		DataFormatter df=new DataFormatter();
		Sheet sheet = wb.getSheet("Sheet1");
		String a[][]=new String[sheet.getLastRowNum()+1][sheet.getRow(4).getLastCellNum()+1];
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<=sheet.getRow(i).getLastCellNum();j++)
			{
				a[i][j]=df.formatCellValue(sheet.getRow(i).getCell(j));
			}
		}
		for(int i=0;i<=sheet.getLastRowNum();i++)
		{
			for(int j=0;j<=sheet.getRow(i).getLastCellNum();j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		wb.close();
			
		
		

	}

}
