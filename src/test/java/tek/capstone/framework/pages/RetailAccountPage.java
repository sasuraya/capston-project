package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup{

	public RetailAccountPage () {
		PageFactory.initElements(getDriver(), this);
	}
	// here we are creating our webElement and we use anotation @FindBy to locate
	@FindBy(xpath = "//a[@id='accountLink']")
	public WebElement accountOption;
	
	@FindBy(xpath = "//input[@id='nameInput']")
	public WebElement nameInput;
	

	@FindBy(xpath = "//input[@id='personalPhoneInput']")
    public WebElement phoneField;
	
	@FindBy(xpath = "//button[@id='personalUpdateBtn']")
	public WebElement pesonalUpdateBtn;
	
	@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
	public WebElement personalInfoUpdateMsg;
	
	@FindBy(xpath = "//p[contains(text(),'payment')]")
	public WebElement addPaymentLink;
	
	@FindBy(id = "cardNumberInput")
    public WebElement cardNumberField;

    @FindBy(id = "nameOnCardInput")
    public WebElement nameOnCardField;

    @FindBy(id = "expirationMonthInput")
    public WebElement expMonthInput;

    @FindBy(id = "expirationYearInput")
    public WebElement expYearInput;

    @FindBy(id = "securityCodeInput")
    public WebElement securityCodeInput;
	
	// here we are creating atomic method to click on input fields
//	public void carNumber(String cardNumber) {
//		accountOption.sendKeys(cardNumber);
//	}
//	public void nameOnTheCard(String nameOnTheCard) {
//		accountOption.sendKeys(nameOnTheCard);
//	}
//	public void expirationDateMonth (String expirationDateMonth) {
//		accountOption.sendKeys(expirationDateMonth);
//	}
//	public void expirationDateYear (String expirationDateYear) {
//		accountOption.sendKeys(expirationDateYear);
//	}
//	public void securityCode (String securityCode) {
//		accountOption.sendKeys(securityCode);
		
	
	
	@FindBy(xpath = "//button[@id='paymentSubmitBtn']")
	public WebElement paymentSubmitBtn;
	
	@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
	public WebElement sucessMasgCard;
	
	// edit crad info
//	@FindBy(xpath = "//button[normalize-space()='Edit']")
//	public WebElement editBtn;
	
	@FindBy(xpath="//div[@class='false account__payment-item']")
	public WebElement firstPaymentCard;
	
	@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
	public WebElement sucessMasgCardUpdate;
	
	// remove card
	@FindBy(xpath = "(//button[normalize-space()='Edit'])[1]")
    public WebElement editOptionCard;
	
	@FindBy(xpath = " //button[normalize-space()='remove']")
	public WebElement removeCard;
	
	@FindBy(xpath="//h1[@class='account__payment-new-title']")
	public WebElement addCardHeader;
	//add Address
	
	@FindBy(xpath = "//p[normalize-space()='Add Address']")
	public WebElement addAdress;
	
	//address
	@FindBy(id="countryDropdown") 
	public WebElement countryDropdown;

	@FindBy(id="fullNameInput") 
	public WebElement fullNameInput;

	@FindBy(id="phoneNumberInput") 
	public WebElement phoneNumberInput;

	@FindBy(id="streetInput") 
	public WebElement streetInput;

	@FindBy(id="apartmentInput") 
	public WebElement apartmentInput;

	@FindBy(id="cityInput") 
	public WebElement cityInput;

	@FindBy(xpath ="//select[@name='state']") 
	public WebElement stateField;

	@FindBy(id="zipCodeInput") 
	public WebElement zipCodeInput;
	
//	public void country (String country) {
//		accountOption.sendKeys(country);
//	}
//	public void fullName (String fullName) {
//		accountOption.sendKeys(fullName);
//	}
//	public void phoneNumber (String phoneNumber) {
//		accountOption.sendKeys(phoneNumber);
//	}
//	public void streetAddress (String streetAddress) {
//		accountOption.sendKeys(streetAddress);
//	}
//	public void apt (String apt) {
//		accountOption.sendKeys(apt);
//	}
//	public void city (String city) {
//		accountOption.sendKeys(city);
//	}
//	public void state (String state) {
//		accountOption.sendKeys(state);
//	}
//	public void zipCode (String zipCode) {
//		accountOption.sendKeys(zipCode);
//	}

	@FindBy(xpath = "//button[@id='addressBtn']") 
	public WebElement addYourAddress;

	@FindBy(xpath = "//div[text()='Address Added Successfully']")
	public WebElement addressSuccessMssg;
	
	//edit Address
	@FindBy(xpath = "//button[normalize-space()='Edit']")
	public WebElement editAdr;
	
	@FindBy(id="addressBtn") 
	public WebElement updateAddressBtn;
	
	@FindBy(xpath="//div[text()='Address Updated Successfully']")
	public WebElement addressUpdateSuccessMsg;
	// removing address
	@FindBy(xpath = "//button[text()='Remove']")
	public WebElement removeaddressBtn;
	
	@FindBy(xpath = "//div[@class='account__address-single']")
    public WebElement addressBar;
	
}

