package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {
	
	public RetailSignInPage() {
		// Initialize elements using PageFactory
		PageFactory.initElements(getDriver(), this);
	}
	
//	login
	@FindBy(xpath = "//*[contains(text(),'TEKSCHOOL')]")	
	public WebElement tekschoolLogo;
	
	@FindBy(linkText = "Sign in")
	public WebElement signInLink;

	@FindBy(id= "email")
	public WebElement emailField;

	@FindBy(id = "password")
	public WebElement passwordField;

	@FindBy(id = "loginBtn")
	public WebElement loginBttn;
	
	@FindBy(id = "logoutBtn")
	public WebElement logoutBttn;

	//createaccount
	@FindBy(id = "newAccountBtn")
	public WebElement newAccountBttn;
	
	@FindBy(id = "nameInput")
	public WebElement nameInputField;
	
	@FindBy(id = "emailInput")
	public WebElement emailInputField;
	
	@FindBy(id = "passwordInput")
	public WebElement passwordInputField;
	
	@FindBy(id = "confirmPasswordInput")
	public WebElement confirmPassInputField;
	
	@FindBy(id = "signupBtn")
	public WebElement signupBttn;
	
	@FindBy(xpath = "//h1[text()='Your Profile']")
	public WebElement yourProfileText;


	}


