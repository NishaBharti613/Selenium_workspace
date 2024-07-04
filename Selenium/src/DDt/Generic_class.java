package DDt;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_class 
{
 static	String ddt(String sheet,int row,int cell)
 {
	 String value=null;
	 String path="C:\\Users\\lenovo\\Desktop\\DDtfile.xlsx";
	 try {
		 
FileInputStream	fis=new FileInputStream(path);		
Workbook book=WorkbookFactory.create(fis);
value=book.getSheet(sheet).getRow(row).getCell(cell).toString();

	} catch (Exception e)
	 {
		System.out.println("file not found");
			}
	 return value;
 }


}