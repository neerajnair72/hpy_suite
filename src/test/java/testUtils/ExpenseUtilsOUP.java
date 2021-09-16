package testUtils;

import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import java.util.TimeZone;

import org.apache.poi.xssf.usermodel.XSSFRow;

import frameworkBase.TestBotBase;
import io.qameta.allure.Step;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ExpenseUtilsOUP extends TestBotBase{
		
	
	@Step("{method}")
	public static void reportCreation_API(XSSFRow xssfRow) throws Exception {
		
		
		
	//	RestAssured.baseURI = "https://v2-prep-api.happay.in/";
		RestAssured.baseURI = "https://v2-uat-api.happay.in/";
		RestAssured.basePath = "report/v1/report/";
		HashMap<String, String> reportMap = new HashMap<>();
		HashMap<String, String> expenseMap = new HashMap<>();
		
		if(xssfRow.getSheet().equals("LoginPWC"))
		{
			/*reportMap = reportMAP();
			expenseMap = expenseMAP();*/
		}
		else
		{
			
			reportMap = RESTAPIUtils.reportMAPOUP();
			expenseMap = RESTAPIUtils.expenseMAPOUP();
		}
		Response response = given()
				.config(RestAssured.config().encoderConfig(
						encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
				.headers(RESTAPIUtils.loginMethod(xssfRow.getCell(1).toString(),
						xssfRow.getCell(2).toString(),xssfRow.getCell(3).toString())).formParams(reportMap).request().post();
		
		System.out.println(response.asString());
		String report = response.jsonPath().getString("res_data.report_id");
		
		
		expenseMap.put("report", report);
		expenseMap.put("resource_id", report);
		expenseMap.put("files-0", "(binary)");
		//RestAssured.baseURI = "https://v2-prep-api.happay.in/";
		RestAssured.baseURI = "https://v2-uat-api.happay.in/";
		RestAssured.basePath = "transaction/v1/transaction/";
		TestBotBase base = new TestBotBase();
		Response response1 = given()
				.config(RestAssured.config().encoderConfig(
						encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
				.headers(RESTAPIUtils.loginMethod(xssfRow.getCell(1).toString(),
xssfRow.getCell(2).toString(),xssfRow.getCell(3).toString()))
//				.header("content-type", "multipart/form-data")
//				.multiPart("files-0", new File("./src/test/resources/imgData/1.png"))
				.formParams(expenseMap).request().post();
		
		
		base.getThreadSafeDriver().navigate().refresh();
		System.out.println(response1.asString());
		
	}
	
	public static String getCurrentTimeAndDate() {

		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = formatter.format(date);
		formatter.setTimeZone(TimeZone.getTimeZone("UTC"));

		String current_date = formatter.format(date);
		return current_date;
		
		}
	

	@Step("{method}")
	public static void expenseCreationOUP_API(XSSFRow xssfRow) throws Exception {

	HashMap<String, String>expenseMap = RESTAPIUtils.expenseMAPOUP();
	expenseMap.put("txn_type", "3048");
	expenseMap.put("description", "Expense");
	expenseMap.put("txn_date", getCurrentTimeAndDate());
	expenseMap.put("wallet", "HPIMP2020827134413771246");
	
	RestAssured.baseURI = "https://v2-prep-api.happay.in/";
	RestAssured.basePath = "transaction/v1/transaction/";
	TestBotBase base = new TestBotBase();
	
	Response response1 = given()
						.config(RestAssured.config().encoderConfig(
						encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
						.headers(RESTAPIUtils.loginMethod(xssfRow.getCell(1).toString(),
						xssfRow.getCell(2).toString(),xssfRow.getCell(3).toString()))
						.formParams(expenseMap).request().post();
	
	base.getThreadSafeDriver().navigate().refresh();
	System.out.println(response1.asString());


	}

	@Step("{method}")
	public static void expenseCreationCopyOUP_API(XSSFRow xssfRow) throws Exception {

	HashMap<String, String>expenseMap = RESTAPIUtils.expenseMAPOUP();
	expenseMap.put("txn_type", "3163");
	expenseMap.put("description", "Copy Expense");
	expenseMap.put("txn_date", getCurrentTimeAndDate());
	expenseMap.put("wallet", "HPIMP20197213828470844");
	
	RestAssured.baseURI = "https://v2-prep-api.happay.in/";
	RestAssured.basePath = "transaction/v1/transaction/";
	TestBotBase base = new TestBotBase();
	
	Response response1 = given()
						.config(RestAssured.config().encoderConfig(
						encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
						.headers(RESTAPIUtils.loginMethod(xssfRow.getCell(1).toString(),
						xssfRow.getCell(2).toString(),xssfRow.getCell(3).toString()))
						.formParams(expenseMap).request().post();
	
	base.getThreadSafeDriver().navigate().refresh();
	System.out.println(response1.asString());


	}



	@Step("{method}")
	public static void expenseCreationMergeOUP_API(XSSFRow xssfRow,String amount) throws Exception {
        System.out.println("In the mergeexpense oup API");
		Random rand = new Random();
		HashMap<String, String>expenseMap = RESTAPIUtils.expenseMAPOUP();
		expenseMap.put("txn_type", "18903");//
		expenseMap.put("description", "MergeExpense Creation from API");
		expenseMap.put("txn_date", getCurrentTimeAndDate());
		expenseMap.put("currency", "356");
		expenseMap.put("currency_amount",amount);
		expenseMap.put("wallet", "HPIMP20214762454212950");//
		expenseMap.put("category", "");
		expenseMap.put("extra_information_dict", "{\"113483\":\"+123+\"}");
		//expenseMap.put("Invoice Number", "123");
		expenseMap.put("content_type_id", "69");
		expenseMap.put("content-type","multipart/form-data");
		String filepath ="/src/test/resources/imgData/2.png ";
		expenseMap.put("files-0",filepath);
		expenseMap.put("txn_attachments","files-0");

		RestAssured.baseURI = "https://v2-uat-api.happay.in/";//
		RestAssured.basePath = "transaction/v1/transaction/";
		TestBotBase base = new TestBotBase();

		Response response1 = given()
				.config(RestAssured.config().encoderConfig(
						encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
				.headers(RESTAPIUtils.loginMethod(xssfRow.getCell(1).toString(),xssfRow.getCell(2).toString(),xssfRow.getCell(3).toString()))
				.multiPart("files-0",new File("./src/test/resources/imgData/2.png"))
				 .formParams(expenseMap).request().post();
		System.out.println("Response of expense creation: "+response1.asString());
		base.getThreadSafeDriver().navigate().refresh();
		


	}
	
	@Step("{method}")
	public static void expenseCreationOUPSplit_API(XSSFRow xssfRow) throws Exception {

	HashMap<String, String>expenseMap = RESTAPIUtils.expenseMAPOUP();
	expenseMap.put("txn_type", "3167");
	expenseMap.put("description", "Split Expense");
	expenseMap.put("wallet", "HPIMP20197213828470844");
	expenseMap.put("txn_date", getCurrentTimeAndDate());
	
	RestAssured.baseURI = "https://v2-prep-api.happay.in/";
	RestAssured.basePath = "transaction/v1/transaction/";
	TestBotBase base = new TestBotBase();
	
	Response response1 = given()
						.config(RestAssured.config().encoderConfig(
						encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
						.headers(RESTAPIUtils.loginMethod(xssfRow.getCell(1).toString(),
						xssfRow.getCell(2).toString(),xssfRow.getCell(3).toString()))
						.formParams(expenseMap).request().post();
	
	base.getThreadSafeDriver().navigate().refresh();
	System.out.println(response1.asString());


	}

}
