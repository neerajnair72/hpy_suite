package frameworkUtils;

import frameworkBase.TestBotBase;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mortbay.log.Log;

import java.io.IOException;
import java.io.InputStream;
import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class ExcelUtils.
 */
public class ExcelUtils {

	/** The Constant currentDir. */
	// Main Directory of the project
	public static final String currentDir = System.getProperty("user.dir");

	// private static final String TESTDATA_SHEET_PATH =
	// "/Users/vikramvasanthkumar/git/HappayProductsWebAutomation/HPAWeb/src/test/resources/TestData.xlsx";

	/** The test data excel file. */
	private static InputStream testData_ExcelFile;

	// Location of Test data excel file
	// public static String testDataExcelPath = null;

	/** The excel W book. */
	// Excel WorkBook
	private static XSSFWorkbook excelWBook;

	/** The excel W sheet. */
	// Excel Sheet
	private static XSSFSheet excelWSheet;

	/** The cell. */
	// Excel cell
	private static XSSFCell cell;

	/** The row. */
	// Excel row
	private static XSSFRow row;

	/** The row number. */
	// Row Number
	private static int rowNumber;

	/** The column number. */
	// Column Number
	private static int columnNumber;

	/** The instance. */
	/*
	 * Declare singleton instance;
	 */
	private static ExcelUtils instance =null;

	/**
	 * Instantiates a new web event listeners.
	 */
	private ExcelUtils() {

	}

	/**
	 * Gets the single instance of WebEventListeners.
	 *
	 * @return single instance of WebEventListeners
	 */

	/*
	 * Singleton Method
	 */
	public static synchronized ExcelUtils getInstance() throws IOException {

		return instance == null?(instance = new ExcelUtils()):instance;
	}


	static {

		ClassLoader classloader = Thread.currentThread().getContextClassLoader();
		testData_ExcelFile = classloader.getResourceAsStream(TestBotBase.getProperty("TestDataExcelFileName"));
		Log.info("Test file name" + testData_ExcelFile);
		try {
			excelWBook = new XSSFWorkbook(testData_ExcelFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // "./src/test/resources/TestData.xlsx"
	}

	/**
	 * Sets the row number.
	 *
	 * @param pRowNumber
	 *            the new row number
	 */
	// Setter and Getters of row and columns
	public void setRowNumber(int pRowNumber) {
		rowNumber = pRowNumber;
	}

	/**
	 * Gets the row number.
	 *
	 * @return the row number
	 */
	public int getRowNumber() {
		return rowNumber;
	}

	/**
	 * Sets the column number.
	 *
	 * @param pColumnNumber
	 *            the new column number
	 */
	public void setColumnNumber(int pColumnNumber) {
		columnNumber = pColumnNumber;
	}

	/**
	 * Gets the column number.
	 *
	 * @return the column number
	 */
	public int getColumnNumber() {
		return columnNumber;
	}

	// This method has two parameters: "Test data excel file name" and "Excel sheet
	// name"
	/**
	 * Sets the excel file sheet.
	 *
	 * @param sheetName
	 *            the new excel file sheet
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	// It creates FileInputStream and set excel file and excel sheet to excelWBook
	// and excelWSheet variables.
	public void setExcelFileSheet(String sheetName) throws IOException {
		try {
			for (int sheetIndex = excelWBook.getNumberOfSheets() - 1; sheetIndex >= 0; sheetIndex--) {
				XSSFSheet sheetIndexInstance = excelWBook.getSheetAt(sheetIndex);
				if (sheetIndexInstance.getSheetName().equals(sheetName)) {
					excelWSheet = excelWBook.getSheet(sheetName);
				}
			}

		} catch (Exception e) {
			throw (e);
		}
	}

	// This method reads the test data from the Excel cell.
	/**
	 * Gets the cell data.
	 *
	 * @param RowNum
	 *            the row num
	 * @param ColNum
	 *            the col num
	 * @return the cell data
	 * @throws Exception
	 */
	// We are passing row number and column number as parameters.
	public String getCellDataWithSheetName(int RowNum, int ColNum, String sheetName) throws Exception {
		try {

			setExcelFileSheet(sheetName);

			cell = excelWSheet.getRow(RowNum).getCell(ColNum);
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		} catch (Exception e) {
			throw (e);
		}
	}
	// We are passing row number and column number as parameters.
		public String getCellDataWithRandomNumber(int RowNum, int ColNum, String sheetName) throws Exception {
			try {
				 Random rand = new Random(); 
				 double rand_dub = rand.nextDouble();
				setExcelFileSheet(sheetName);

				cell = excelWSheet.getRow(RowNum).getCell(ColNum);
				DataFormatter formatter = new DataFormatter();
				String cellData = formatter.formatCellValue(cell);
				return cellData+rand_dub;
			} catch (Exception e) {
				throw (e);
			}
		}
	public String getCellData(int RowNum, int ColNum) throws Exception {
		try {

			cell = excelWSheet.getRow(RowNum).getCell(ColNum);
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		} catch (Exception e) {
			throw (e);
		}
	}

	/**
	 * Gets the row data.
	 *
	 * @param RowNum
	 *            the row num
	 * @return the row data
	 */
	// This method takes row number as a parameter and returns the data of given row
	// number.
	public XSSFRow getRowData(int RowNum) {
		try {

			row = excelWSheet.getRow(RowNum);
			return row;
		} catch (Exception e) {
			throw (e);
		}
	}

	public XSSFRow getRowDataWithSheetName(int RowNum, String sheetName) throws Exception {
		try {
			setExcelFileSheet(sheetName);
			XSSFRow	row = excelWSheet.getRow(RowNum);
			return row;
		} catch (Exception e) {
			throw (e);
		}
	}
	public XSSFRow getDataOfAvailableRowWithSheetName(String sheetName) throws Exception {
		int RowCount=excelWSheet.getLastRowNum();
		try {for(int RowNum=1;RowNum<RowCount;RowNum++) {
		     String data=excelWSheet.getRow(RowNum).getCell(0).toString();	     
		     if(data!="")
		     {
		    	 
		     }
		     
		     RowNum++;
		}
			
		}catch (Exception e) {
			throw (e);
		}
		
		return row;
		
	}

	public int getLastRowNum(String sheetName) throws Exception{
		try {
			excelWSheet = excelWBook.getSheet(sheetName);
			int rowCount = excelWSheet.getLastRowNum()+1;
			return rowCount;
		}
		catch (Exception e) {
			throw (e);
		}}










	// This method gets excel file, row and column number and set a value to the
	// that cell.
	/*
	 * public static void setCellData(String value, int RowNum, int ColNum) { try {
	 * row = excelWSheet.getRow(RowNum); cell = row.getCell(ColNum); if (cell ==
	 * null) { cell = row.createCell(ColNum); cell.setCellValue(value); } else {
	 * cell.setCellValue(value); } // Constant variables Test Data path and Test
	 * Data file name FileOutputStream fileOut = new
	 * FileOutputStream(testData_ExcelFile); excelWBook.write(fileOut);
	 * fileOut.flush(); fileOut.close(); } catch (Exception e) { try { throw (e); }
	 * catch (IOException e1) { e1.printStackTrace(); } } }
	 */

	/*
	 * public static Workbook book; public static Sheet sheet; public static
	 * Object[][] getTestData(String sheetName) throws InvalidFormatException {
	 * 
	 * FileInputStream file = null;
	 * 
	 * try { file = new FileInputStream(TESTDATA_SHEET_PATH); } catch
	 * (FileNotFoundException e) { e.printStackTrace(); }
	 * 
	 * try { book = WorkbookFactory.create(file); } catch (IOException e) {
	 * e.printStackTrace(); }
	 * 
	 * sheet = book.getSheet(sheetName);
	 * 
	 * 
	 * Object data[][] = new
	 * Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	 * 
	 * for (int i = 0; i < sheet.getLastRowNum(); i++) { for (int k = 0; k <
	 * sheet.getRow(0).getLastCellNum(); k++) { data[i][k] = sheet.getRow(i +
	 * 1).getCell(k).toString(); } }
	 * 
	 * return data;
	 * 
	 * }
	 */

	/*
	 * public static Object[][] getTableArray(String FilePath, String SheetName)
	 * throws Exception {
	 * 
	 * String[][] tabArray = null;
	 * 
	 * try {
	 * 
	 * FileInputStream ExcelFile = new FileInputStream(FilePath);
	 * 
	 * // Access the required test data sheet
	 * 
	 * ExcelWBook = new XSSFWorkbook(ExcelFile);
	 * 
	 * ExcelWSheet = ExcelWBook.getSheet(SheetName);
	 * 
	 * int startRow = 1;
	 * 
	 * int startCol = 1;
	 * 
	 * int ci,cj;
	 * 
	 * int totalRows = ExcelWSheet.getLastRowNum();
	 * 
	 * // you can write a function as well to get Column count
	 * 
	 * int totalCols = 2;
	 * 
	 * tabArray=new String[totalRows][totalCols];
	 * 
	 * ci=0;
	 * 
	 * for (int i=startRow;i<=totalRows;i++, ci++) {
	 * 
	 * cj=0;
	 * 
	 * for (int j=startCol;j<=totalCols;j++, cj++){
	 * 
	 * tabArray[ci][cj]=getCellData(i,j);
	 * 
	 * System.out.println(tabArray[ci][cj]);
	 * 
	 * }
	 * 
	 * }
	 * 
	 * }
	 * 
	 * catch (FileNotFoundException e){
	 * 
	 * System.out.println("Could not read the Excel sheet");
	 * 
	 * e.printStackTrace();
	 * 
	 * }
	 * 
	 * catch (IOException e){
	 * 
	 * System.out.println("Could not read the Excel sheet");
	 * 
	 * e.printStackTrace();
	 * 
	 * }
	 * 
	 * return(tabArray);
	 * 
	 * }
	 * 
	 * public static String getSpecCellData(int RowNum, int ColNum) throws Exception
	 * {
	 * 
	 * try{
	 * 
	 * Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
	 * 
	 * int dataType = Cell.getCellType();
	 * 
	 * if (dataType == 3) {
	 * 
	 * return "";
	 * 
	 * }else{
	 * 
	 * String CellData = Cell.getStringCellValue();
	 * 
	 * return CellData;
	 * 
	 * }catch (Exception e){
	 * 
	 * System.out.println(e.getMessage());
	 * 
	 * throw (e);
	 * 
	 * }
	 * 
	 * }
	 */

}
