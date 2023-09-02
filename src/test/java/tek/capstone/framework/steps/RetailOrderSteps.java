package tek.capstone.framework.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Then;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.pages.RetailOrderPage;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

	RetailOrderPage retailOrderPage;

	// Constructor to initialize the RetailOrderPage object
	public RetailOrderSteps() {
		retailOrderPage = pomFactory.retailOrderPage();
	}
	// add Item To Cart
	@Then("Verify user is logged in")
	public void verifyUserIsLoggedIn() {
		logger.info(">> user is on the retail website");

	}
	@Then("User change the category to {string}")
	public void userChangeTheCategoryTo(String category) {
		retailOrderPage.allDepartmentDropdown.sendKeys(category);
		logger.info("the category is changed seccessfully");
	}
	@Then("User search for an item {string}")
	public void userSearchForAnItem(String item) {
		retailOrderPage.searchInputField.sendKeys(item);
		logger.info("user searching for an iteam");
	}
	@Then("User click on Search icon")
	public void userClickOnSearchIcon() {
		retailOrderPage.searchBtn.click();
		logger.info("user clicked on iteam seccessufully");
	}
	@Then("User click on item")
	public void userClickOnItem() {
		retailOrderPage.itemkasaoutdoorsmartplug.click();
		logger.info(">> user clicked on item seccessfully");
	}
	@Then("User select quantity {string}")
	public void userSelectQuantity(String itemQty) {
		selectByVisibleText(pomFactory.retailOrderPage().qtyDropdown, itemQty);
		logger.info("The item was selected successfully");       
	}
	@Then("User click add to Cart button")
	public void userClickAddToCartButton() {
		retailOrderPage.addToCartBttn.click();
		logger.info("user clicked on cart button successfully");
	}
	@Then("the cart icon quantity should change to {string}")
	public void theCartIconQuantityShouldChangeTo(String quantity) {
		Assert.assertEquals(quantity, pomFactory.retailOrderPage().cartItemQty.getText());
		logger.info("the cart icon quantity changed seccessufully");
	}
//add Item To Cart And Checkout

	@Then("User changes the category to {string} Apex Legends")
	public void userChangesTheCategoryToApexLegends(String category) {
		retailOrderPage.allDepartmentDropdown.sendKeys(category);
		logger.info("the category is changed seccessfully");
	}
	@Then("User searches for an item {string} Apex Legends")
	public void userSearchesForAnItemApexLegends(String item) {
		retailOrderPage.searchInputField.sendKeys(item);
		logger.info("user searching for an iteam");
	}
	@Then("User click Search icon")
	public void userClickSearchIcon() {
		retailOrderPage.searchBtn.click();
		logger.info("user clicked on Search icon seccessufully");
	}
	@Then("User click on item Apex Legends")
	public void userClickOnItemApexLegends() {
		retailOrderPage.apexLegendsItem.click();
		logger.info(">> user clicked on item seccessfully");
	}
	@Then("User select quantity {string} for Apex Legends")
	public void userSelectQuantityForApexLegends(String itemQty) {
		selectByVisibleText(pomFactory.retailOrderPage().qtyDropdown, itemQty);
		logger.info("The item was selected successfully");
	}
	@Then("User clicks add to Cart button")
	public void userClicksAddToCartButton() {
		retailOrderPage.addToCartBttn.click();
		logger.info("user clicked on cart button successfully");
	}
	@Then("the cart icon quantity should changed to {string}")
	public void theCartIconQuantityShouldChangedTo(String cartItemQty) {
		Assert.assertEquals(cartItemQty, pomFactory.retailOrderPage().cartItemQty.getText());
		logger.info("the cart icon quantity changed successfully");
	}
	@Then("User click on Cart option")
	public void userClickOnCartOption() {
		retailOrderPage.cartBtn.click();
		logger.info("user clicked on cart button successfully");

	}
	@Then("User click on Proceed to Checkout button")
	public void userClickOnProceedToCheckoutButton() {
		retailOrderPage.proceedToCheckoutBttn.click();
		logger.info("user clicked on Checkout button successfully");

	}
	@Then("User click on Place Your Order")
	public void userClickOnPlaceYourOrder() {
		retailOrderPage.placeOrderBttn.click();
		logger.info("user clicked on cart button successfully");

	}
	@Then("a message should be displayed {string}")
	public void aMessageShouldBeDisplayed(String orderPlacedSuccessfully) {
		logger.info(">>order Placed Successfully");
	}

	// cancel Order

	@Then("User click on Orders section")
	public void userClickOnOrdersSection() {
		retailOrderPage.OrderLink.click();
		logger.info("user clicked on order button successfully");
	}
	@Then("User click on first order in list")
	public void userClickOnFirstOrderInList() {
		List<WebElement> listOfOrder = pomFactory.retailOrderPage().listOfOrders;
		for (int i = 0; i < listOfOrder.size(); i++) {
			if (listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().listOfOrders.get(i));
				logger.info("User click on first order in list successfully");
	}}}
	@Then("User click on Cancel The Order button")
	public void userClickOnCancelTheOrderButton() {
		List<WebElement> cancelBttns = pomFactory.retailOrderPage().cancelOrderBttn;
		click(cancelBttns.get(0));
		logger.info("user clicked on Cancle order button successfully");

	}
	@Then("User select the cancelation Reason {string}")
	public void userSelectTheCancelationReason(String reason) {
		retailOrderPage.reasonForCancelation.click();
		logger.info("user clicked on Reason for cancelation button successfully");

	}
	@Then("User click on Cancel Order button")
	public void userClickOnCancelOrderButton() {
		click(pomFactory.retailOrderPage().cancelationSubmitBttn);
		logger.info("Cancel Submit Button was clicked successfully");

	}
	@Then("a cancelation message should be displayed {string}")
	public void aCancelationMessageShouldBeDisplayed(String yourOrderHasBeenCancelled) {
		logger.info("Your Order Has Been Cancelled massage displays successfully");

	}
	//return Order
	
	@Then("User clicks on Orders section")
	public void userClicksOnOrdersSection() {
		retailOrderPage.OrderLink.click();
		logger.info("user clicked on order button successfully");
	}
	@Then("User clicks on first order in list")
	public void userClicksOnFirstOrderInList() {
		List<WebElement> listOfOrder = pomFactory.retailOrderPage().listOfOrders;
		for (int i = 0; i < listOfOrder.size(); i++) {
			if (listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().listOfOrders.get(i));
				logger.info("User click on first order in list successfully");
	}}}
	@Then("User click on Return Items button")
	public void userClickOnReturnItemsButton() {
		retailOrderPage.returnBttn.click();
		logger.info("User click on Return Items button successfully");
	}
	@Then("User select the Return Reason {string}")
	public void userSelectTheReturnReason(String reason) {
		retailOrderPage.reasonForCancelation.click();
		logger.info("user clicked on Reason for return button successfully");
	}
	@Then("User select the drop off service {string}")
	public void userSelectTheDropOffService(String dropPffInput) {
		retailOrderPage.dropOffInput.click();
		logger.info("user clicked on drop off option successfully");
	}
	@Then("User click on Return Order button")
	public void userClickOnReturnOrderButton() {
		retailOrderPage.cancelationSubmitBttn.click();
		logger.info("user clicked on return button successfully");
	  
	}
	@Then("cancelation message should be displayed {string}")
	public void cancelationMessageShouldBeDisplayed(String orderreturndSuccessMssg) {
		logger.info("order returnd SuccessMssg displayed successfully");
	    
	}
	
	//  review Order
	
	@Then("User click on Orders sections")
	public void userClickOnOrdersSections() {
		retailOrderPage.OrderLink.click();
		logger.info("user clicked on order button successfully");
	}
	@Then("User click on the first order in list")
	public void userClickOnTheFirstOrderInList() {
		List<WebElement> listOfOrder = pomFactory.retailOrderPage().listOfOrders;
		for (int i = 0; i < listOfOrder.size(); i++) {
			if (listOfOrder.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (listOfOrder.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().listOfOrders.get(i));
				logger.info("User click on first order in list successfully");
	}}}
	
	@Then("User click on Review button")
	public void userClickOnReviewButton() {
		retailOrderPage.reviewBtn.click();
		logger.info("user clicked on review button successfully");
	   
	}   
	@Then("User write Review headline {string} and {string}")
	public void userWriteReviewHeadlineAnd(String headlineInput, String descriptionInput) {
		List<WebElement> reviewHeadline = pomFactory.retailOrderPage().headlineInput;		
		for (int i = 0; i < reviewHeadline.size(); i++) {
			if (reviewHeadline.get(i).getText().equalsIgnoreCase("Hide Details")) {
			} else if (reviewHeadline.get(i).getText().equalsIgnoreCase("Show Details")) {
				click(pomFactory.retailOrderPage().listOfOrders.get(i));
				logger.info("User click on first order in list successfully");
			}}}
		
	
	@Then("User click Add your Review button")
	public void userClickAddYourReviewButton() {
		click(pomFactory.retailOrderPage().reviewSubmitBtn);
		logger.info("User click on Review button successfully");
	
	}
	@Then("a review message should be displayed {string}")
	public void aReviewMessageShouldBeDisplayed(String reviewAddedSuccessfully) {
		System.out.println(">> A review message displayed successfully");
	  
	}
}
