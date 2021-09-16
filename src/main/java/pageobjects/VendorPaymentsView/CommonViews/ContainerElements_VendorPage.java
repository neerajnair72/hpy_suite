/*package pageobjects.VendorPaymentsView.CommonViews;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.testng.asserts.SoftAssert;

import frameworkBase.TestBotElementsWrapper;
import pageobjects.CommonViews.CommonContainerElementsPage;
import pageobjects.VendorPaymentsView.ContainerViews.DeliveryAddressViews.DeliveryAddressDetailsPage;
import pageobjects.VendorPaymentsView.ContainerViews.InvoiceViews.InvoiceInitialPage;
import pageobjects.VendorPaymentsView.ContainerViews.MaterialMasterViews.MaterialMasterDetailsPage;
import pageobjects.VendorPaymentsView.ContainerViews.VendorViews.VendorDetailsPage;
import pageobjects.VendorPaymentsView.ContainerViews.VendorViews.VendorInitialPage;

public class ContainerElements_VendorPage extends LoadableComponent<ContainerElements_VendorPage>{
	TestBotElementsWrapper pageWrapper;

	*//** The driver. *//*
	private WebDriver driver;
	
	public ContainerElements_VendorPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		pageWrapper = new TestBotElementsWrapper(driver);
	}

	@Override
	protected void load() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void isLoaded() throws Error {
		// TODO Auto-generated method stub
		
	}
    *//**DashBoard Title path*//*	
	@FindBy(how=How.XPATH,using="(//span[text()= 'Dashboard'])[2]")
	private WebElement DashBoardTitleName_Xpath;
	*//**Dashboard link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[1]/div/span[text()='Dashboard']")
	private WebElement dashboard_Link_Xpath;
	*//**Vendor link xpath*//*
	@FindBy(how=How.XPATH, using="//div/span[text()='Vendor']")
	private WebElement vendor_Link_Xpath;
	*//**Invoice link xpath*//*
	@FindBy(how=How.XPATH, using="//div/span[text()='Invoice']")
	private WebElement invoice_Link_Xpath;
	*//**Payment link xpath*//*
	@FindBy(how=How.XPATH, using="//div/span[text()='Payments']")
	private WebElement payment_Link_Xpath;
	*//**Material Master link xpath*//*
	@FindBy(how=How.XPATH, using="//div/span[text()='Material Master']")
	private WebElement materialMaster_Link_Xpath;
	*//**Delivery Address link xpath*//*
	@FindBy(how=How.XPATH, using="//div/span[text()='Delivery Address']")
	private WebElement deliveryAddress_Link_Xpath;
	*//**EnterPrise Bank Account link xpath*//*
	@FindBy(how=How.XPATH, using="//div/span[text()='Enterprise Bank Account']")
	private WebElement enterprisebankAccount_Link_Xpath;
	*//**My Draft vendor link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[4]/ul/li[1]")
	private WebElement myDraftVendor_Link_Xpath;
	*//**My Draft invoice link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[2]/ul/li[1]")
	private WebElement myDraftInvoice_Link_Xpath;
	*//**My Draft material master link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[5]/ul/li[1]")
	private WebElement myDraftMaterialMaster_Link_Xpath;
	*//**My Draft delivary address link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[6]/ul/li[1]")
	private WebElement myDraftDelivaryAddress_Link_Xpath;
	*//**My approval Vendor link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[4]/ul/li[1]")
	private WebElement myApprovalsVendor_Link_Xpath;
	*//**My approval vendor link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[2]/ul/li[1]")
	private WebElement myApprovalsInvoice_Link_Xpath;
	*//**My Submission Vendor link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[3]/ul/li[2]")
	private WebElement mySubmissionsVendor_Link_Xpath;
	*//**My Submission Vendor link xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='navigation-list']/ul/li[2]/ul/li[2]")
	private WebElement mySubmissionsInvoice_Link_Xpath;
	*//**All link xpath*//*
	@FindBy(how=How.XPATH, using="//ul[@class='ul-list-show']/li[div/span[contains(text(),'All')]]")
	private WebElement all_Link_Xpath;
	*//**My Approvals link xpath*//*
	@FindBy(how=How.XPATH, using="//ul[@class='ul-list-show']/li[div/span[text()='My Approvals']]")
	private WebElement myApprovals_Link_Xpath;
	*//**Create button xpath*//*
	@FindBy(how=How.XPATH, using="//button[@class='primaryCustomButton']")
	private WebElement create_Button_Xpath;
	*//**Action icon xpath*//*
	@FindBy(how=How.XPATH,using="//div[div[@class='action-column-btns']]")
	private List<WebElement> action_Icon_Xpath;
	*//**View action button xpath*//*
	@FindBy(how=How.XPATH, using="//span[text()='View']")
	private List<WebElement> view_Button_Xpath;
	*//**Export action button xpath*//*
	@FindBy(how=How.XPATH, using="//span[text()='Export']")
	private List<WebElement> export_Button_Xpath;
	*//**Edit action button xpath*//*
	@FindBy(how=How.XPATH, using="//span[text()='Edit']")
	private List<WebElement> edit_Button_Xpath;
	*//**Approved Button xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='container-filter-block float-left']/li[2]")
	private WebElement approved_Link_Xpath;
	*//**Pending for approval Button xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='container-filter-block float-left']/li[1]")
	private WebElement pendingFor_Approval_Link_Xpath;
	*//**Rejected Button xpath*//*
	@FindBy(how=How.XPATH,using="//ul[@class='container-filter-block float-left']/li[3]")
	private WebElement rejected_Link_Xpath;
	*//**Manage Column button xpath*//*
	@FindBy(how=How.XPATH, using="//div[@class='float-right']/div[2]/img")
	private WebElement manageColumns_Buttons_Xpath;
	*//**All filter button xpath*//*
	@FindBy(how=How.XPATH, using="//span[text()='All Filters']")
	private WebElement allFilters_Button_Xpath;
	*//**Bulk upload button xpath*//*
	@FindBy(how=How.XPATH,using="//button/div/span[text()='Bulk Upload']")
	private WebElement bulkUpload_Button_Xpath;
	@FindBy(how=How.XPATH, using="(//span[text()='My Draft'])[1]")
	private WebElement Invoice_MyDraft_XPATH;	
	*//** MySubmissions option under Invoice *//*
	@FindBy(how=How.XPATH, using="(//span[text()='My Submissions'])[1]")
	private WebElement Invoice_MySubmissions_XPATH;
	*//** MySubmissions option under Invoice *//*
	@FindBy(how=How.XPATH, using="(//span[text()='All Invoice'])[1]")
	private WebElement Invoice_AllInvoices_XPATH;
	
	
	*//** upcoming option under payments tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='Upcoming'])[1]")
	private WebElement Payment_Upcoming_XPATH;	
	*//** On-Hold option under payments tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='On-Hold'])[1]")
	private WebElement Payment_OnHold_XPATH;	
	*//** In-Progress option under payments tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='In-Progress'])[1]")
	private WebElement Payment_InProgress_XPATH;	
	*//** Failed option under payments tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='Failed'])[1]")
	private WebElement Payment_Failed_XPATH;	
	*//** Paid option under payments tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='Paid'])[1]")
	private WebElement Payment_Paid_XPATH;	
	*//** Cancelled option under payments tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='Cancelled'])[1]")
	private WebElement Payment_Cancelled_XPATH;	
	*//** All option under payments tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='All'])[1]")
	private WebElement Payment_All_XPATH;	
	*//** My Draft option under Vendor tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='My Draft'])[2]")
	private WebElement Vendor_MyDraft_XPATH;	
	*//** MySubmission option under Vendor tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='My Submissions'])[2]")
	private WebElement Vendor_MySubmission_XPATH;	
	*//** All Vendor option under Vendor tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='All Vendor'])[1]")
	private WebElement Vendor_AllVendor_XPATH;	
	*//** MyDraft option under Material MAster *//*
	@FindBy(how=How.XPATH, using="(//span[text()='My Draft'])[3]")
	private WebElement MaterialMaster_MyDraft_XPATH;	
	*//** AllMaterialMaster option under Material Master *//*
	@FindBy(how=How.XPATH, using="(//span[text()='All Material Master'])[1]")
	private WebElement MaterialMaster_AllMaterialMaster_XPATH;			  	
	*//** My Draft option under Delivery Address *//*
	@FindBy(how=How.XPATH, using="(//span[text()='My Draft'])[4]")
	private WebElement DeliveryAddress_MyDraft_XPATH;	
	*//** AllDelivery Address option under Delivery Address *//*
	@FindBy(how=How.XPATH, using="(//span[text()='All Delivery Address'])[1]")
	private WebElement DeliveryAddress_AllMaterialMaster_XPATH;									 							  
	*//** RegistrationPending under EntreprisebBankAccount tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='Registration Pending'])[1]")
	private WebElement RegistrationPending_XPATH;	
	*//** Registered under EntreprisebBankAccount tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='Registered'])[1]")
	private WebElement Registered_XPATH;
	*//** Failed under EntreprisebBankAccount tab *//*
	@FindBy(how=How.XPATH, using="(//span[text()='Failed'])[2]")
	private WebElement RegistrationFailed_XPATH;		
	@FindBy(how=How.XPATH, using="(//span[@class='breadcrumbText'])[2]")
	private WebElement BreadCrumPageName_XPATH;	
	public ContainerElements_VendorPage gotoDashboard(WebElement element) throws Exception {
		pageWrapper.customClickAction(element);
		return this;
	}
	public VendorInitialPage createVendor() {
		return new VendorInitialPage(driver);
	}
	public enum containerOptions {
		DASHBOARD,VENDOR,INVOICE,MATERIAL_MASTER,DELIVERY_ADDRESS;
	}
   public boolean clickContainer(containerOptions option ) throws Exception {
	   switch(option) {
	   case DASHBOARD:
		   gotoDashboard(dashboard_Link_Xpath);
		   break;
	   case VENDOR:
		   createVendor(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   createInvoice(invoice_Link_Xpath);
		   break;
	   case MATERIAL_MASTER:
		   createMaterialMaster(materialMaster_Link_Xpath);
		   break;
	   case DELIVERY_ADDRESS:
		   createDeliveryAddress(deliveryAddress_Link_Xpath);
		   break;
	   }
	return true;
	   
   }
   public boolean gotoSavedOfMyDraft(containerOptions option) throws Exception   {
	   switch(option) {
	   case VENDOR:
		   viewSavedVendor(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   viewSavedInvoice(invoice_Link_Xpath);
		   break;
	   }
	return true;
	   
   }
   public boolean gotoExportSavedOfMyDraft(containerOptions option) throws Exception   {
	   switch(option) {
	   case VENDOR:
		   exportSavedVendor(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   exportSavedInvoice(invoice_Link_Xpath);
		   break;
	   }
	return true;
	   
   }
   public boolean gotoEditSavedOfMyDraft(containerOptions option) throws Exception   {
	   switch(option) {
	   case VENDOR:
		   editSavedVendor(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   editSavedInvoice(invoice_Link_Xpath);
		   break;
	   case MATERIAL_MASTER:
		   editSavedMaterialMaster(materialMaster_Link_Xpath);
		   break;
	   case DELIVERY_ADDRESS:
		   editSavedDeliveryAddress(deliveryAddress_Link_Xpath);
		   break;
	   
	   }
	return true;
	   
   }
   public boolean goToPendingForApprovalContainer(containerOptions option ) throws Exception {
	   switch(option) {
	 
	   case VENDOR:
		   viewPendingVendor(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   viewPendingInvoice(invoice_Link_Xpath);
		   break;
	   }
	return true;
	   
   }
   public boolean gotoMySubmimmison_Approved(containerOptions option) throws Exception {
	   switch(option) {
		 
	   case VENDOR:
		   viewApprovedVendor(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   viewApprovedInvoice(invoice_Link_Xpath);
		   break;
	   }
	return true;
   }
   public boolean gotoMySubmimmison_PendingApproval(containerOptions option) throws Exception {
	   switch(option) {
		 
	   case VENDOR:
		   viewPendigForApprovalVendor(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   viewPendigForApprovalInvoice(invoice_Link_Xpath);
		   break;
		   
	   }
	return true;
   }
   public boolean gotoMySubmimmison_PendingApprovalForAudit(containerOptions option) throws Exception {
	   switch(option) {
		 
	   case VENDOR:
		   viewPendigForApprovalVendorForAudit();
		   break;
	   case INVOICE:
		   viewPendigForApprovalInvoiceForAudit();
		   break;
		   
	   }
	return true;
   }
   
   public boolean gotoMySubmimmison_Rejected(containerOptions option) throws Exception {
	 switch(option) {
		 
	   case VENDOR:
		   viewRejectedlVendor(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   viewRejectedInvoice(invoice_Link_Xpath);
		   break;
	   }  
	return true;
   }   
   public boolean gotoManageColumn(containerOptions option) throws Exception {
	   switch(option) {
		 
	   case VENDOR:
		   gotoVendorManageColumn(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   gotoInvoiceManageColumn(invoice_Link_Xpath);
		   break;
	   case MATERIAL_MASTER:
		   gotoMaterialMasterManageColumn(materialMaster_Link_Xpath);
		   break;
	   case DELIVERY_ADDRESS:
		   gotoDeliveryAddressManageColumn(deliveryAddress_Link_Xpath);
		   break;
	   }  
	return true;
   }
   public boolean gotoAllFilters(containerOptions option) throws Exception {
	   switch(option) {
		 
	   case VENDOR:
		   gotoVendorAllFilters(vendor_Link_Xpath);
		   break;
	   case INVOICE:
		   gotoInvoiceAllFilters(invoice_Link_Xpath);
		   break;
	   case MATERIAL_MASTER:
		   gotoMaterialMasterAllFilters(materialMaster_Link_Xpath);
		   break;
	   case DELIVERY_ADDRESS:
		   gotoDeliveryAddressAllFilters(deliveryAddress_Link_Xpath);
		   break;
	   }  
	return true;
   }
   public boolean goToBulkUpload(containerOptions option) throws Exception {
	   switch(option) {
	   case MATERIAL_MASTER:
		   bulkCreateMaterialMaster(materialMaster_Link_Xpath);
		   break;
	   case DELIVERY_ADDRESS:
		   bulkCreateDeliveryAddress(deliveryAddress_Link_Xpath);
		   break;
	   }  
	return true;
   }
   public PageElements_VendorPage goToSubContainer(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   return new PageElements_VendorPage(this.driver);
   }  
   public ContainerElements_VendorPage clickMyDraftVendor() throws Exception {
	   pageWrapper.waitAndClickWebElement(myDraftVendor_Link_Xpath);
		return this;
  }
   public ContainerElements_VendorPage clickMyDraftInvoice() throws Exception {
	    pageWrapper.waitAndClickWebElement(myDraftInvoice_Link_Xpath);
		return this;
 }
   public ContainerElements_VendorPage clickMyDraftMaterialMasterl() throws Exception {
	    pageWrapper.waitAndClickWebElement(myDraftMaterialMaster_Link_Xpath);
		return this;
 }
   public ContainerElements_VendorPage clickMyDraftDelivaryAddress() throws Exception {
	    pageWrapper.waitAndClickWebElement(myDraftDelivaryAddress_Link_Xpath);
		return this;
 }
   public ContainerElements_VendorPage clickCreateContainer() throws Exception {
	    pageWrapper.customClickAction(create_Button_Xpath);
		return this;
	}
   public ContainerElements_VendorPage clickMyapprovalVendor() throws Exception {
	    pageWrapper.shortWait();
		pageWrapper.waitAndClickWebElement(myApprovalsVendor_Link_Xpath);
		return this;
   }
   public ContainerElements_VendorPage clickMyapprovalInvoice() throws Exception {
	   pageWrapper.shortWait();
	    pageWrapper.waitAndClickWebElement(myApprovalsInvoice_Link_Xpath);
		return this;
  }
   public ContainerElements_VendorPage clickMySubmissionVendor() throws Exception {
	  pageWrapper.shortWait();
	  pageWrapper.waitAndClickWebElement(mySubmissionsVendor_Link_Xpath);
	    return this;
   }
   public ContainerElements_VendorPage clickMySubmissionInvoice() throws Exception {
		  pageWrapper.shortWait();
		  pageWrapper.waitAndClickWebElement(mySubmissionsInvoice_Link_Xpath);
		    return this;
	   }
   public ContainerElements_VendorPage clickApproved() throws Exception {
	   pageWrapper.customClickAction(approved_Link_Xpath);
	   return this;
   }
   public ContainerElements_VendorPage clickRejected() throws Exception {
	   pageWrapper.customClickAction(rejected_Link_Xpath);
	   return this;
   }
   public ContainerElements_VendorPage clickPendingApproval() throws Exception {
	   pageWrapper.customClickAction(pendingFor_Approval_Link_Xpath);
	   return this;
   }
   public ContainerElements_VendorPage clickView() {
	   pageWrapper.shortWait();
	   pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
	   pageWrapper.waitForElementToClickable(view_Button_Xpath.get(0));
	   pageWrapper.click_Actions(view_Button_Xpath.get(0));
	   return this;
   }
   public ContainerElements_VendorPage clickExport() {
	   pageWrapper.shortWait();
	   pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
	   pageWrapper.waitForElementToClickable(export_Button_Xpath.get(0));
	   pageWrapper.click_Actions(export_Button_Xpath.get(0));
	   return this;
   }
   public ContainerElements_VendorPage clickEdit() {
	   pageWrapper.shortWait();
	   pageWrapper.moveToElement_Actions(action_Icon_Xpath.get(0));
	   pageWrapper.waitForElementToClickable(edit_Button_Xpath.get(0));
	   pageWrapper.click_Actions(edit_Button_Xpath.get(0));
	   return this;
   }
   public ContainerElements_VendorPage clickManageColumn() throws Exception {
	   pageWrapper.customClickAction(manageColumns_Buttons_Xpath);
	   return this;
   }
   public ContainerElements_VendorPage clickAllFilters() throws Exception {
	   pageWrapper.customClickAction(allFilters_Button_Xpath);
	   return this;
   }
   public ContainerElements_VendorPage clickBulkUpload() throws Exception {
	   pageWrapper.customClickAction(bulkUpload_Button_Xpath);
	   return this;
   }
   public VendorInitialPage createVendor(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMyDraftVendor();
	   clickCreateContainer();
	   return new VendorInitialPage(driver);	   
   }
   public InvoiceInitialPage createInvoice(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMyDraftInvoice();
	   clickCreateContainer();
	   return new InvoiceInitialPage(driver);	   
   }
   public MaterialMasterDetailsPage createMaterialMaster(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMyDraftMaterialMasterl();
	   clickCreateContainer();
	   return new MaterialMasterDetailsPage(driver);	   
   }
   public DeliveryAddressDetailsPage createDeliveryAddress(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMyDraftDelivaryAddress();
	   clickCreateContainer();
	   return new DeliveryAddressDetailsPage(driver);	   
   }  
   public VendorDetailsPage viewPendingVendor(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMyapprovalVendor();
	   clickView();
	   return new VendorDetailsPage(driver);
   }
   public InvoiceInitialPage viewPendingInvoice(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMyapprovalInvoice();
	   clickView();
	   return new InvoiceInitialPage(driver);
   }
   public  VendorDetailsPage viewApprovedVendor(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMySubmissionVendor();
	   clickApproved();
	   clickView();
	   return new VendorDetailsPage(driver); 
   }
   public  InvoiceInitialPage viewApprovedInvoice(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMySubmissionInvoice();
	   clickApproved();
	   clickView();
	   return new InvoiceInitialPage(driver); 
   }
   public  VendorDetailsPage viewPendigForApprovalVendor(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMySubmissionVendor();
	   clickPendingApproval();
	   clickView();
	   return new VendorDetailsPage(driver); 
   }
   public  VendorDetailsPage viewPendigForApprovalVendorForAudit() throws Exception {
	   clickMySubmissionVendor();
	   clickPendingApproval();
	   clickView();
	   return new VendorDetailsPage(driver); 
   }
   public  InvoiceInitialPage viewPendigForApprovalInvoiceForAudit() throws Exception {
	   clickMySubmissionInvoice();
	   clickPendingApproval();
	   clickView();
	   return new InvoiceInitialPage(driver); 
   }
  public  InvoiceInitialPage viewPendigForApprovalInvoice(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMySubmissionInvoice();
	   clickPendingApproval();
	   clickView();
	   return new InvoiceInitialPage(driver); 
}
  public  VendorDetailsPage viewRejectedlVendor(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMySubmissionVendor();
	   clickRejected();
	   clickView();
	   return new VendorDetailsPage(driver); 
}
  public  InvoiceInitialPage viewRejectedInvoice(WebElement element) throws Exception {
	   pageWrapper.customClickAction(element);
	   clickMySubmissionInvoice();
	   clickRejected();
	   clickView();
	   return new InvoiceInitialPage(driver); 
}
  public ManageColumn_VendorPage gotoVendorManageColumn(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMySubmissionVendor();
	  clickManageColumn();
	  return new ManageColumn_VendorPage(driver);
	  
  }
  public ManageColumn_VendorPage gotoInvoiceManageColumn(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMySubmissionInvoice();
	  clickManageColumn();
	  return new ManageColumn_VendorPage(driver);
	  
  }
  public ManageColumn_VendorPage gotoMaterialMasterManageColumn(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftMaterialMasterl();
	  clickManageColumn();
	  return new ManageColumn_VendorPage(driver);
	  
  }
  public ManageColumn_VendorPage gotoDeliveryAddressManageColumn(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftDelivaryAddress();
	  clickManageColumn();
	  return new ManageColumn_VendorPage(driver);
	  
  }
  public Filter_VendorPage gotoVendorAllFilters(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftVendor();
	  //clickAllFilters();
	  return new Filter_VendorPage(driver);
  }
  public Filter_VendorPage gotoInvoiceAllFilters(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftInvoice();
	  //clickAllFilters();
	  return new Filter_VendorPage(driver);
  }
  public Filter_VendorPage gotoMaterialMasterAllFilters(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftMaterialMasterl();
	  //clickAllFilters();
	  return new Filter_VendorPage(driver);
  }
  public Filter_VendorPage gotoDeliveryAddressAllFilters(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftDelivaryAddress();
	 // clickAllFilters();
	  return new Filter_VendorPage(driver);
  }
  public VendorDetailsPage viewSavedVendor(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftVendor();
	  clickView();
	  return new VendorDetailsPage(driver); 
  }
  public InvoiceInitialPage viewSavedInvoice(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftInvoice();
	  clickView();
	  return new InvoiceInitialPage(driver);	  
  }
  public Export_VendorPage exportSavedVendor(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftVendor();
	  clickExport();
	  return new Export_VendorPage(driver); 
  }
  public Export_VendorPage exportSavedInvoice(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftInvoice();
	  clickExport();
	  return new Export_VendorPage(driver);	  
  }
  public MaterialMasterDetailsPage editSavedMaterialMaster(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftMaterialMasterl();
	  clickEdit();
	  return new MaterialMasterDetailsPage(driver);	  
  }
  public DeliveryAddressDetailsPage editSavedDeliveryAddress(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftDelivaryAddress();
	  clickEdit();
	  return new DeliveryAddressDetailsPage(driver);	  
  }
  public VendorDetailsPage editSavedVendor(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftVendor();
	  clickEdit();
	  return new VendorDetailsPage(driver); 
  }
  public InvoiceInitialPage editSavedInvoice(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	  clickMyDraftInvoice();
	  clickEdit();
	  return new InvoiceInitialPage(driver);	  
  }
  public BulkRCT_VendorPage bulkCreateMaterialMaster(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	//  clickBulkUpload();
	  return new BulkRCT_VendorPage(driver);
  }
  public BulkRCT_VendorPage bulkCreateDeliveryAddress(WebElement element) throws Exception {
	  pageWrapper.customClickAction(element);
	 // clickBulkUpload();
	  return new BulkRCT_VendorPage(driver);
  }
  public ContainerElements_VendorPage GetDashboardTitleName() throws Exception {
	  pageWrapper.customClickAction(DashBoardTitleName_Xpath);
	  return this;
  }
  
  public String DashboardTitle() throws Exception {
     String dashboard = DashBoardTitleName_Xpath.getText();
	  return dashboard;
  }
  
  public void InvoiceContainerName() throws Exception { 
	  pageWrapper.customClickAction(invoice_Link_Xpath);
  }
  
  public void PaymentContainerName() throws Exception { 
	  pageWrapper.customClickAction(payment_Link_Xpath);
  }
  
  public void VendorContainerNames() throws Exception { 
	  pageWrapper.customClickAction(vendor_Link_Xpath);
  }
  public void MaterialMasterContainerNames() throws Exception { 
	  pageWrapper.customClickAction(materialMaster_Link_Xpath);
  }
  public void DeliveryAddressContainerNames() throws Exception { 
	  pageWrapper.customClickAction(deliveryAddress_Link_Xpath);
  }
  
  public void EnterpriseBankAccountContainerName() throws Exception { 
	  pageWrapper.customClickAction(enterprisebankAccount_Link_Xpath);
  }
  

  
  public String BreadCrumPageName_XPATH() throws Exception{
	  String BreadCrumPageName = BreadCrumPageName_XPATH.getText();
	return BreadCrumPageName;
  }
  
  public String InvoiceContainersMyDraftSegment() throws Exception { 
	  pageWrapper.customClickAction(Invoice_MyDraft_XPATH);
	 String mydraft  = Invoice_MyDraft_XPATH.getText();
	  return mydraft;
	  
  }
  public String InvoiceContainersMySubmissionSegment() throws Exception { 
	  pageWrapper.customClickAction(Invoice_MySubmissions_XPATH);
	 String mysubmission  = Invoice_MySubmissions_XPATH.getText();
	  return mysubmission;
	  
  }
  public String InvoiceContainersAllInvoicesSegment() throws Exception { 
	  pageWrapper.customClickAction(Invoice_AllInvoices_XPATH);
	 String allinvoices  = Invoice_AllInvoices_XPATH.getText();
	  return allinvoices;
	  
  }
  
  public void AssertInvoiceContainerOptions(SoftAssert softAssert) throws Exception { 
	  pageWrapper.customClickAction(Invoice_MyDraft_XPATH);		  
	    softAssert.assertEquals(Invoice_MyDraft_XPATH.getText(), BreadCrumPageName_XPATH.getText());
	  pageWrapper.customClickAction(Invoice_MySubmissions_XPATH); 
	    softAssert.assertEquals(Invoice_MySubmissions_XPATH.getText().toString(), BreadCrumPageName_XPATH.getText());
	  pageWrapper.customClickAction(Invoice_AllInvoices_XPATH);
	    softAssert.assertEquals(Invoice_AllInvoices_XPATH.getText().toString(), BreadCrumPageName_XPATH.getText());
	  softAssert.assertAll();	  
  }
  
  public String PaymentsContainersUpcomingpayments() throws Exception { 
	  pageWrapper.customClickAction(Payment_Upcoming_XPATH);
	  String upcomingpayments  = Payment_Upcoming_XPATH.getText();
	  return upcomingpayments;
	  
  }
  
  public String PaymentsContainersOnHoldpayments() throws Exception { 
	  pageWrapper.customClickAction(Payment_OnHold_XPATH);
	  String onholdpayments  = Payment_OnHold_XPATH.getText();
	  return onholdpayments;
	  
  }
  
  public String PaymentsContainersInprogresspayments() throws Exception { 
	  pageWrapper.customClickAction(Payment_InProgress_XPATH);
	  String inprogresspayments  = Payment_InProgress_XPATH.getText();
	  return inprogresspayments;
	  
  }
  
  public String PaymentsContainersFailedpayments() throws Exception { 
	  pageWrapper.customClickAction(Payment_Failed_XPATH);
	  String failedpayments  = Payment_Failed_XPATH.getText();
	  return failedpayments;
	  
  }
  
  public String PaymentsContainersPaidpayments() throws Exception { 
	  pageWrapper.customClickAction(Payment_Paid_XPATH);
	  String paidpayments  = Payment_Paid_XPATH.getText();
	  return paidpayments;
	  
  }
  
  public String PaymentsContainersCancelledpayments() throws Exception { 
	  pageWrapper.customClickAction(Payment_Cancelled_XPATH);
	  String cancelledpayments  = Payment_Cancelled_XPATH.getText();
	  return cancelledpayments;
	  
  }
  
  public String PaymentsContainersAllpaymentsTab() throws Exception { 
	  pageWrapper.customClickAction(Payment_All_XPATH);
	  String allpayments  = Payment_All_XPATH.getText();
	  return allpayments;
	  
  }
  
  public void PaymentsContainerOptionsTab(SoftAssert softAssert) throws Exception { 
	
	  
	  pageWrapper.customClickAction(Payment_Upcoming_XPATH);		  
	    softAssert.assertEquals(Payment_Upcoming_XPATH.getText(), BreadCrumPageName_XPATH.getText());
	    
	  pageWrapper.customClickAction(Payment_OnHold_XPATH);		  
	    softAssert.assertEquals(Payment_OnHold_XPATH.getText(), BreadCrumPageName_XPATH.getText());
	    
	  pageWrapper.customClickAction(Payment_InProgress_XPATH);		  
	    softAssert.assertEquals(Payment_InProgress_XPATH.getText(), BreadCrumPageName_XPATH.getText());
	    
	    pageWrapper.customClickAction(Payment_Failed_XPATH);		  
	    softAssert.assertEquals(Payment_Failed_XPATH.getText(), BreadCrumPageName_XPATH.getText());
	  
	  pageWrapper.customClickAction(Payment_Paid_XPATH);		  
	    softAssert.assertEquals(Payment_Paid_XPATH.getText(), BreadCrumPageName_XPATH.getText());
	    	    
	  pageWrapper.customClickAction(Payment_Cancelled_XPATH); 
	    softAssert.assertEquals(Payment_Cancelled_XPATH.getText().toString(), BreadCrumPageName_XPATH.getText());
	  pageWrapper.customClickAction(Payment_All_XPATH);
	    softAssert.assertEquals(Payment_All_XPATH.getText().toString(), BreadCrumPageName_XPATH.getText());
	  softAssert.assertAll();	  
  }
  
  public String EnterpriseBankAccountContainerRagistrationPendingTab() throws Exception { 
	  pageWrapper.customClickAction(RegistrationPending_XPATH);
	  String registrationpending  = RegistrationPending_XPATH.getText();
	  return registrationpending;
	  
  }
  public String EnterpriseBankAccountContainerRegistedTab() throws Exception { 
	  pageWrapper.customClickAction(Registered_XPATH);
	  String Registered  = Registered_XPATH.getText();
	  return Registered;
	  
  }
  public String EnterpriseBankAccountContainerFailedTab() throws Exception { 
	  pageWrapper.customClickAction(RegistrationFailed_XPATH);
	  String registrationfailed  = RegistrationFailed_XPATH.getText();
	  return registrationfailed;
	  
  }
  
  
  public void AssertEnterpriseBankAccountContainerOptionsTab(SoftAssert softAssert) throws Exception { 
	  pageWrapper.customClickAction(Registered_XPATH);		  
	    softAssert.assertEquals(Registered_XPATH.getText(), BreadCrumPageName_XPATH.getText());
	  pageWrapper.customClickAction(RegistrationPending_XPATH); 
	    softAssert.assertEquals(RegistrationPending_XPATH.getText().toString(), BreadCrumPageName_XPATH.getText());
	  pageWrapper.customClickAction(RegistrationFailed_XPATH);
	    softAssert.assertEquals(RegistrationFailed_XPATH.getText().toString(), BreadCrumPageName_XPATH.getText());
	  softAssert.assertAll();	  
  }
  
  public void InvoiceAlloptionsavailabilityUnderInvoiceDropdown(SoftAssert softAssert) {
	  softAssert.assertEquals(Invoice_MyDraft_XPATH.getText().toString(), "My Draft");
	  softAssert.assertTrue(Invoice_MySubmissions_XPATH.getText().contains("My Submissions"));
	  softAssert.assertTrue(Invoice_AllInvoices_XPATH.getText().contains("All Invoice"));
	  softAssert.assertAll();
	  
  }
  
  public void PaymentAlloptionsavailabilityUnderPaymentDropdown(SoftAssert softAssert) {
	  softAssert.assertTrue(Payment_Upcoming_XPATH.getText().contains("Upcoming"));
	  softAssert.assertTrue(Payment_OnHold_XPATH.getText().contains("On-Hold"));
	  softAssert.assertTrue(Payment_InProgress_XPATH.getText().contains("In-Progress"));
	  softAssert.assertTrue(Payment_Failed_XPATH.getText().contains("Failed"));
	  softAssert.assertTrue(Payment_Paid_XPATH.getText().contains("Paid"));
	  softAssert.assertTrue(Payment_Cancelled_XPATH.getText().contains("Cancelled"));
	  softAssert.assertTrue(Payment_All_XPATH.getText().contains("All"));	  
	  softAssert.assertAll();
	  
  }
  
  public void MaterialMasterAlloptionsavailabilityUnderMaterialMasterDropdown(SoftAssert softAssert) {
	  softAssert.assertTrue(MaterialMaster_MyDraft_XPATH.getText().contains("My Draft"));	
	  softAssert.assertTrue(MaterialMaster_AllMaterialMaster_XPATH.getText().contains("All Material Master"));
	  softAssert.assertAll();	  
  }
  
  public void DeliveryAddressAlloptionsavailabilityUnderDeliveryAddressDropdown(SoftAssert softAssert) {
	  
	  softAssert.assertTrue(DeliveryAddress_MyDraft_XPATH.getText().contains("My Draft"));
	  softAssert.assertTrue(DeliveryAddress_AllMaterialMaster_XPATH.getText().contains("All Delivery Address"));
	  softAssert.assertAll();
	  
  }
  
  
  public void EnterprisebankAccountAlloptionsavailabilityUnderEnterprisebankAccountDropdown(SoftAssert softAssert) {
	  softAssert.assertTrue(RegistrationPending_XPATH.getText().contains("Registration Pending"));
	  softAssert.assertTrue(Registered_XPATH.getText().contains("Registered"));
	  softAssert.assertTrue(RegistrationFailed_XPATH.getText().contains("Failed"));
	  softAssert.assertAll();
	  
  }
  
  public void VendorAlloptionsavailabilityUnderVendorDropdown(SoftAssert softAssert) {
	  softAssert.assertTrue(Vendor_MyDraft_XPATH.getText().contains("My Draft"));
	  softAssert.assertTrue(Vendor_MySubmission_XPATH.getText().contains("My Submission"));
	  softAssert.assertTrue(Vendor_AllVendor_XPATH.getText().contains("All Vendor"));
	  softAssert.assertAll();
	  
  }
 
  
  
  
  public void AssertDashBoardVisibilityOnClickingAllContainerswithSubOptions(SoftAssert softAssert) throws Exception { 
	  pageWrapper.customClickAction(invoice_Link_Xpath);		  
	    softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	    
	    InvoiceAlloptionsavailabilityUnderInvoiceDropdown(softAssert);
	    System.out.println("till here all ok");
	    
	  pageWrapper.customClickAction(payment_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	  System.out.println("till here all ok");
	    PaymentAlloptionsavailabilityUnderPaymentDropdown(softAssert);
	    	    
	  pageWrapper.customClickAction(vendor_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	    VendorAlloptionsavailabilityUnderVendorDropdown(softAssert);
	    
	  pageWrapper.customClickAction(materialMaster_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	    MaterialMasterAlloptionsavailabilityUnderMaterialMasterDropdown(softAssert);
	    
	    
	  pageWrapper.customClickAction(deliveryAddress_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	    DeliveryAddressAlloptionsavailabilityUnderDeliveryAddressDropdown(softAssert);	    
	    		
	  pageWrapper.customClickAction(enterprisebankAccount_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
        EnterprisebankAccountAlloptionsavailabilityUnderEnterprisebankAccountDropdown(softAssert);
        
	  softAssert.assertAll();	  
  }
  
  public void AssertDashBoardVisibilityOnDoubleClickOnContainersName(SoftAssert softAssert) throws Exception { 
	  pageWrapper.customClickAction(invoice_Link_Xpath);		  
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	    pageWrapper.customClickAction(invoice_Link_Xpath);		  
	    softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	  pageWrapper.customClickAction(payment_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	    pageWrapper.customClickAction(payment_Link_Xpath);
	    softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));;
	  pageWrapper.customClickAction(vendor_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	    pageWrapper.customClickAction(vendor_Link_Xpath);
	    softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	  pageWrapper.customClickAction(materialMaster_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	    pageWrapper.customClickAction(materialMaster_Link_Xpath);
	    softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	  pageWrapper.customClickAction(deliveryAddress_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	  pageWrapper.customClickAction(deliveryAddress_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	  pageWrapper.customClickAction(enterprisebankAccount_Link_Xpath);
	  softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
      pageWrapper.customClickAction(enterprisebankAccount_Link_Xpath);
      softAssert.assertTrue(DashBoardTitleName_Xpath.getText().contains("Dashboard"));
	  softAssert.assertAll();	  
  }
  
}
*/