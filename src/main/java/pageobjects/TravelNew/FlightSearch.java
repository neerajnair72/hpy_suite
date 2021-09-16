package pageobjects.TravelNew;

import frameworkBase.TestBotElementsWrapper;
import io.qameta.allure.Step;

public class FlightSearch extends TestBotElementsWrapper {

	
	
	@Step("{method}")
	public void logout() throws Exception {
		GetInstance(CommonPageElementsTravelNew.class).logout();
		
	}
	
}
