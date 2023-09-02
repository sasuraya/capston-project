package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetup;

public class POMFactory extends BaseSetup { 
	
	private RetailHomePage retailHomePage;
	private RetailSignInPage signInPage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	
	// we create just one constractor
	public POMFactory() {
		this.retailHomePage = new RetailHomePage();
		this.signInPage = new RetailSignInPage();
		this.retailAccountPage = new RetailAccountPage();
	    this.retailOrderPage = new RetailOrderPage();
	}
	// then we ceate get methed
	public RetailHomePage retailHomePage() {
		return this.retailHomePage;
	}
	public RetailSignInPage signInPage() {
	return this.signInPage;	
	}
	public RetailAccountPage retailAccountPage() {
	return this.retailAccountPage;
    }
	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}
}



	
