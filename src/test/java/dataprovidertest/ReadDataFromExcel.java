package dataprovidertest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ReadDataFromExcel {

	@DataProvider
	public String[][] getData() throws Exception {

		File file = new File("C:\\Users\\bhara\\eclipse-workspace\\TestNGProject\\Resources\\TestData.xlsx");
		// System.out.println(file.exists());
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet1");
		int numofRows = sheet.getPhysicalNumberOfRows();
		short numofColumons = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[numofRows][numofColumons];
		for (int i = 0; i < numofRows - 1; i++) {
			for (int j = 0; j < numofColumons; j++) {

				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(sheet.getRow(i + 1).getCell(j));
				// System.out.println(data[i][j]);
				// sheet.getRow(i+1).getCell(j).getStringCellValue();

			}

		}
		fis.close();
		wb.close();
		
		/*
		 * for(String[] arraydata :data) {
		 * 
		 * System.out.println(Arrays.toString(arraydata)); }
		 */
		return data;
		
	}

}
