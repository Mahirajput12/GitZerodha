package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.microsoft.schemas.office.x2006.digsig.STSignatureComments;

public class Parametrization {
//public static void main(String[] args) throws EncryptedDocumentException, IOException {
	//FileInputStream file = new FileInputStream("C:\\MAHENDRA CLASS\\Testdata.xlsx");
	//String user = WorkbookFactory.create(file).getSheet("mahi").getRow(1).getCell(1).getStringCellValue();
//System.out.println(user);}
	
public static String getData(int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream("D:\\Automation\\KiteZerodha\\src\\test\\resources\\Testdata.xlsx");
		String value = WorkbookFactory.create(file).getSheet("mahi").getRow(row).getCell(cell).getStringCellValue();
		return value;
		
	
}
	
	}

