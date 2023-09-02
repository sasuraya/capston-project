package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup{
	
	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}
	@FindBy(id = "search")
	public WebElement allDepartmentDropdown;      
	
	@FindBy(id = "searchInput")
    public WebElement searchInputField;
	
	@FindBy(id ="searchBtn")
	public WebElement searchBtn;
	
	@FindBy(xpath="//img[@alt='Kasa Outdoor Smart Plug']")
	public WebElement itemkasaoutdoorsmartplug;
	
	@FindBy(xpath = "//select[starts-with(@class,'product')]")  
	public WebElement qtyDropdown;
	
	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBttn;
	
	
	@FindBy(xpath = "//span[@id='cartQuantity']")  
	public WebElement cartItemQty;
	
	@FindBy(id ="cartBtn")
	public WebElement cartBtn;
	
	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBttn;
	
	@FindBy(id = "placeOrderBtn")
	public WebElement placeOrderBttn;

	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	public WebElement orderPlacedSuccessfullyMssg;
	
	@FindBy(xpath = "//img[starts-with(@alt,'Apex Legends')]")
	public WebElement apexLegendsItem;
	
	@FindBy(xpath = "//div[text()='Order Placed Successfully']")
	WebElement orderPlacedSuccessfully;
		
	// cancil the orders
		@FindBy(id = "orderLink")
	    public WebElement OrderLink;

	    @FindBy(xpath = "(//p[@class='order__item-name'])[1]")
	    public List<WebElement> listOfOrders;
	
	    @FindBy(xpath = "//button[text()='Cancel The Order']")
	    public List<WebElement> cancelOrderBttn;

	    @FindBy(id = "reasonInput")
	    public WebElement reasonForCancelation;

	    @FindBy(id = "orderSubmitBtn")
	    public WebElement cancelationSubmitBttn;

	    @FindBy(xpath = "//p[text()='Your Order Has Been Cancelled']")
	    public WebElement orderCancelledSuccessMssg;
	    
	   // return order 
	   
	    @FindBy(xpath = "//button[text()='Return Items']")
	    public WebElement returnBttn;
	    
	    @FindBy(id = "dropOffInput")
	    public WebElement dropOffInput;
	    
	    @FindBy(xpath = "//button[@id='xpath = ']")
	    public WebElement returnSubmitBtn;
	    
	    @FindBy(xpath = "//p[text()='Return was successfull']")
	    public WebElement orderreturndSuccessMssg;
	    
	    //review order
	    
	    @FindBy(id = "reviewBtn")
	    public WebElement reviewBtn;
	    
	    @FindBy(id = "headlineInput")
	    public List<WebElement> headlineInput;
	    
	    @FindBy(id = "descriptionInput")
	    public List<WebElement> descriptionInput;
	    
	    @FindBy(id = "reviewSubmitBtn")
	    public WebElement reviewSubmitBtn;
	    
	    @FindBy(xpath = "//div[text()='Your review was added successfully']")
		public WebElement reviewAddedSuccessfully;
	}




