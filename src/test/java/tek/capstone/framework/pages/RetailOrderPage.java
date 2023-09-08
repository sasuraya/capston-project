package tek.capstone.framework.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup {

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//p[@class='cart__select-all-text']")
	public WebElement deSeletBtn;

	@FindBy(id = "search")
	public WebElement allDepartmentDropdown;

	@FindBy(id = "searchInput")
	public WebElement searchInputField;

	@FindBy(id = "searchBtn")
	public WebElement searchBtn;

	@FindBy(xpath = "//p[contains(text(),'Kasa Outdoor Smart Plug')]") // img[@alt='Kasa Outdoor Smart Plug']
	public WebElement itemkasaoutdoorsmartplug;
	
	// select[starts-with(@class,'product')]
	@FindBy(xpath = "//select[@class='product__select']")
	public WebElement qtyDropdown;

	@FindBy(id = "addToCartBtn")
	public WebElement addToCartBttn;
	
	@FindBy(xpath = "//a[normalize-space()='Kasa Outdoor Smart Plug']")
	public WebElement cartProduct;

	////
	@FindBy(xpath = "//span[@id='cartQuantity']")
	public WebElement cartItemQty;

	@FindBy(id = "cartBtn")
	public WebElement cartBtn;
	

	@FindBy(id = "proceedBtn")
	public WebElement proceedToCheckoutBttn;

	@FindBy(xpath = "//button[@id='addAddressBtn']")
	public WebElement addAdressBtn;

	// address
	@FindBy(id = "countryDropdown")
	public WebElement countryDropdown;

	@FindBy(id = "fullNameInput")
	public WebElement fullNameInput;

	@FindBy(id = "phoneNumberInput")
	public WebElement phoneNumberInput;

	@FindBy(id = "streetInput")
	public WebElement streetInput;

	@FindBy(id = "apartmentInput")
	public WebElement apartmentInput;

	@FindBy(id = "cityInput")
	public WebElement cityInput;

	@FindBy(xpath = "//select[@name='state']")
	public WebElement stateField;

	@FindBy(id = "zipCodeInput")
	public WebElement zipCodeInput;


	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressSuccessMssg;

	@FindBy(xpath = "//button[@id='placeOrderBtn']") // id = "placeOrderBtn
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
	
	@FindBy(id = "//a[@id='orderLink']")
	public WebElement ordersLink;
	//div[@class='orders__container']//descendant::p[text()='Show Details'][1]
	//p[@class='order__header-btn']
	@FindBy(xpath = "//div[@class='orders__container']//descendant::p[text()='Show Details'][1]")
	public List<WebElement> ordersList;
	
	@FindBy(xpath = "//input[@type='checkbox'])[1]")
	public WebElement chechBoxOption;

	@FindBy(id = "returnBtn")
	public WebElement returnBttn;
	
	@FindBy(id = "reasonInput")
	public WebElement returnReason;

	@FindBy(id = "dropOffInput")
	public WebElement dropOffInput;

	@FindBy(id = "orderSubmitBtn")
	public WebElement orderReturnBtn;

	@FindBy(xpath = "//p[text()='Return was successfull']")
	public WebElement returndSuccessMssg;

	// review order

	@FindBy(id = "reviewBtn")
	public WebElement reviewBtn;

	@FindBy(id = "headlineInput")
	public WebElement headlineInput;

	@FindBy(id = "descriptionInput")
	public WebElement descriptionInput;

	@FindBy(id = "reviewSubmitBtn")
	public WebElement reviewSubmitBtn;

	@FindBy(xpath = "//div[text()='Your review was added successfully']")
	public WebElement reviewAddedSuccessfully;
	
	@FindBy(xpath ="(//*[@type='checkbox'])[1]")
	public WebElement firstItemOnlistForReturn;
}


