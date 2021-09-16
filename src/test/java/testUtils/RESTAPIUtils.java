package testUtils;


import static io.restassured.RestAssured.given;
import static io.restassured.config.EncoderConfig.encoderConfig;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFRow;

import com.google.gson.JsonArray;

import frameworkBase.TestBotBase;
import frameworkBase.TestBotElementsWrapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import orgUtils_ExpenseProduct.OUP_ExpenseOrg;


public class RESTAPIUtils extends TestBotBase {

	
	public static String isMergeExpenseIDPresent(HashMap<String,String> header,String content_type,String offset,String limit, String need_user_extra_fields, String filter) {

        Response response = given()
                .headers(header)
                .queryParam("{\"6\":["+filter+"]}")
                .when()
                .get("https://v2-uat-api.happay.in/search/v1/search/?content_type=" + content_type + "&offset=" + offset + "&limit=" + limit + "&need_user_extra_fields=" + need_user_extra_fields).thenReturn();
         System.out.println("Response is: "+response.getBody().asString());
        String transaction_id = response.jsonPath().getString("res_data.result.find{it.mergeable== true && it.is_merged== false}.txn_id;");
        System.out.println("Printing transaction id from APIResponse inside Restutils" +transaction_id);
        return transaction_id;


    }


    public static Map loginMethod(String user, String pass, String userid) throws Exception {

        HashMap<String, String> loginForm = new HashMap<String, String>();

        loginForm.put("password", pass);
        loginForm.put("user", user);
        if (!userid.equals(null)) {
            loginForm.put("user_id", userid);
        }
        loginForm.put("mobile_extension", "+91");

        RestAssured.baseURI = "https://v2-uat-api.happay.in/";
        RestAssured.basePath = "access/v1/login/";
        Response loginResponse = given()
                .config(RestAssured.config().encoderConfig(
                        encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
                .formParams(loginForm).request().post();

        String CID = loginResponse.getHeader("HAPPAY-CID");
        String TOKEN = loginResponse.getHeader("HAPPAY-TOKEN");
        HashMap<String, String> headerMap = new HashMap<String, String>();
        headerMap.put("HAPPAY-CID", CID);
        headerMap.put("HAPPAY-TOKEN", TOKEN);

        return headerMap;
    }

    //HP201972138283129657660HP
    public static Response loginMethod(XSSFRow rowData) throws Exception {

        HashMap<String, String> loginForm = new HashMap<String, String>();

        loginForm.put("password", rowData.getCell(2).toString());
        loginForm.put("user", rowData.getCell(1).toString());
        loginForm.put("user_id", rowData.getCell(3).toString());
        loginForm.put("mobile_extension", "+91");

        RestAssured.baseURI = "https://v2-uat-api.happay.in/";
        RestAssured.basePath = "access/v1/login/";
        Response loginResponse = given()
                .config(RestAssured.config().encoderConfig(
                        encoderConfig().encodeContentTypeAs("appplication/x-www-form-urlencoded", ContentType.URLENC)))
                .formParams(loginForm).request().post();
        return loginResponse;
    }


    public static HashMap<String, String> reportMAPOUP() {

        HashMap<String, String> fillReportForm_Values = new HashMap<String, String>();

        fillReportForm_Values.put("name", OUP_ExpenseOrg.getTimestamp());
        fillReportForm_Values.put("description", "Expense Statement for Jun");

        fillReportForm_Values.put("wallet", "HPIMP2020827134413771246");
        fillReportForm_Values.put("request_from", "web");

        fillReportForm_Values.put("extra_information_dict",
                "{\"21867\":\"Domestic Travel Expenses\"}");

        fillReportForm_Values.put("content_type_id", "81");
        fillReportForm_Values.put("has_role", "false");
        fillReportForm_Values.put("file_delete", "{}");
        return fillReportForm_Values;
    }


    public static HashMap<String, String> expenseMAPOUP() {

        HashMap<String, String> fillExpenseForm_Values = new HashMap<String, String>();
        fillExpenseForm_Values.put("txn_date", "2020-07-22 04:17:57");
        fillExpenseForm_Values.put("txn_type", "3048");
        fillExpenseForm_Values.put("payee_merchant", "Exp");
        fillExpenseForm_Values.put("description", "test");
        fillExpenseForm_Values.put("currency_amount", "4.0");
        fillExpenseForm_Values.put("category", "51090");
        fillExpenseForm_Values.put("city", "");
        fillExpenseForm_Values.put("currency", "356");
        fillExpenseForm_Values.put("amount", "4.0");
        fillExpenseForm_Values.put("has_role", "false");
        fillExpenseForm_Values.put("Shared_expense", "[]");
        fillExpenseForm_Values.put("timezone", "Asia/Kolkata");
        fillExpenseForm_Values.put("timezone_offset", "+05:30");
        fillExpenseForm_Values.put("timezone_name", "IST");
        fillExpenseForm_Values.put("wallet", "HPIMP2020827134413771246");
        fillExpenseForm_Values.put("start_date", "");
        fillExpenseForm_Values.put("end_date", "");
        fillExpenseForm_Values.put("extra_information_dict",
                "{\"21820\":\"\",\"21828\":\"\",\"21831\":\"123\",\"21832\":\"\",\"21833\":\"2\",\"21834\":\"\",\"21835\":\"\",\"21836\":\"\",\"21838\":\"\",\"21839\":\"\",\"21840\":\"\",\"21841\":\"\",\"21842\":\"\",\"21843\":\"\",\"21844\":\"\",\"21845\":\"\",\"21847\":\"2\",\"21848\":\"\",\"21851\":\"\",\"21852\":\"\",\"21858\":\"\",\"21866\":\"\",\"28985\":\"16.0\"}");
        fillExpenseForm_Values.put("content_type_id", "69");
        fillExpenseForm_Values.put("file_delete", "{}");
        fillExpenseForm_Values.put("report", "");
        fillExpenseForm_Values.put("resource_id", "");
        fillExpenseForm_Values.put("container_type", "1");
        fillExpenseForm_Values.put("txn_attachments", "[]");
        return fillExpenseForm_Values;
    }
    
    public static String isAutoMergeExpenseIDPresent(HashMap<String,String> header,String content_type,String offset,String limit, String need_user_extra_fields, String filter) {

        Response response = given()
                .headers(header)
                .queryParam("{\"6\":["+filter+"]}")
                .when()
                .get("https://v2-uat-api.happay.in/search/v1/search/?content_type=" + content_type + "&offset=" + offset + "&limit=" + limit + "&need_user_extra_fields=" + need_user_extra_fields).thenReturn();

        String transaction_id = response.jsonPath().getString("res_data.result.find {it.is_merged == true && it.merged_txn ==true}.txn_id");
        return transaction_id;


    }

    public static boolean isIDPresent(HashMap<String,String> header,String content_type,String offset,String limit, String has_role) {

        Response response =  given()
                .headers(header)
                // When
                .when()
                .get("https://v2-uat-api.happay.in/search/v1/search/?content_type="+content_type+"&offset="+offset+"&limit="+limit+"&has_role="+has_role).thenReturn();

        TestBotElementsWrapper testBotElementsWrapper = new TestBotElementsWrapper();
        boolean isPresent = false;
        String savedID = testBotElementsWrapper.readFile("MRID.txt");

        List<JsonArray> list = response.getBody().jsonPath().getList("res_data.result");
        List<String> Mrids = response.jsonPath().getList("res_data.result.findAll{it.is_completed== false}.resource_id");
        for(int i=0;i<Mrids.size(); i++)
        	
        {
        	if((Mrids.get(i).trim()).equalsIgnoreCase(savedID.trim()))
        	{
        		isPresent=true;
                System.out.println("ID Present");
                break;
        	}
        	
        	
        }
        
 
        return isPresent;
    }
}
