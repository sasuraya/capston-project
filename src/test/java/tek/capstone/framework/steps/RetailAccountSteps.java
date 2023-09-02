package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;


public class RetailAccountSteps extends CommonUtility {

	POMFactory pomFactory = new POMFactory();

// @updatePI
	
	@When("User click on Account option")
	public void userClickOnAccountOption() {
		click(pomFactory.retailAccountPage().accountOption);
		logger.info(" user click on account option");
	}

	@When("User update Name {string} and Phone {string}")
	public void userUpdateNameAndPhone(String name, String phoneNumber) {
	        clearTextUsingSendKeys(pomFactory.signInPage().nameInputField);
	        sendText(pomFactory.signInPage().nameInputField, name);
	        logger.info("Name was entered successfully");
	        clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneField);
	        sendText(pomFactory.retailAccountPage().phoneField, phoneNumber);
	        logger.info("PhoneNumber was entered successfully");	
	
	}

	@When("User click on Update button")
	public void userClickOnUpdateButton() {
		click(pomFactory.retailAccountPage().pesonalUpdateBtn);
		logger.info(">> user click on update  button");
	}

	@Then("user profile information should be updated")
	public void userProfileInformationShouldBeUpdated() {
		waitTillPresence(pomFactory.retailAccountPage().sucessMasgCard);
		Assert.assertTrue(pomFactory.retailAccountPage().personalInfoUpdateMsg.isDisplayed());
		logger.info(">> user profile option shuld be updated");
	}
// add Payment Method

	@When("User click on Add a payment method link")
	public void userClickOnAddAPaymentMethodLink() {
		click(pomFactory.retailAccountPage().addPaymentLink);
		logger.info(">> user click on addpayment link");
	}

	@When("User fill Debit or credit card information")
	public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
		List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < cardInfo.size(); i++) {
            sendText(pomFactory.retailAccountPage().cardNumberField, cardInfo.get(0).get("cardNumber"));
            sendText(pomFactory.retailAccountPage().nameOnCardField, cardInfo.get(0).get("nameOnCard"));
            sendText(pomFactory.retailAccountPage().expMonthInput, cardInfo.get(0).get("expirationMonth"));
            sendText(pomFactory.retailAccountPage().expYearInput, cardInfo.get(0).get("expirationYear"));
            sendText(pomFactory.retailAccountPage().securityCodeInput, cardInfo.get(0).get("securityCode"));      
        }
        logger.info("User shuld fill Debit or credit card information");
        
        // i need to know what i did wrong here 
        // for this stem i created atumiv thing in steps plz take look
//		System.out.println(">>user is fillig debit or criet card information");
//		List<Map<String, String>> accountData = dataTable.asMaps(String.class, String.class);
//		String cardNumber = accountData.get(0).get("cardNumber");
//		String nameOnTheCard = accountData.get(0).get("nameOnTheCard");
//		String expirationDateMonth = accountData.get(0).get("expirationDateMonth");
//		String expirationDateYear = accountData.get(0).get("expirationDateYear");
//		String securityCode = accountData.get(0).get("securityCode");
//		System.out.println("Card Number: " + cardNumber + ", Name on the card: " + nameOnTheCard + ", Expiration Date: "
//				+ expirationDateMonth + "/" + expirationDateYear + ", Security Code: " + securityCode);

	}

	@When("User click on Add your card button")
	public void userClickOnAddYourCardButton() {
		click(pomFactory.retailAccountPage().paymentSubmitBtn);
		logger.info("user click on submithBtn");
	}

	@Then("a message should be displayed ‘Payment Method added successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodAddedSuccessfully() {
		waitTillPresence(pomFactory.retailAccountPage().sucessMasgCard);
		Assert.assertTrue(pomFactory.retailAccountPage().sucessMasgCard.isDisplayed());
		logger.info("Payment Method added successfully");
	}
// edit card method

	@When("User click on Edit option of card section")
	public void userClickOnEditOptionOfCardSection() {
		click(pomFactory.retailAccountPage().firstPaymentCard);
		click(pomFactory.retailAccountPage().editOptionCard);
		logger.info("User click on Edit option of card section");
	}

	@When("user edit information with below data")
	public void userEditInformationWithBelowData(DataTable dataTable) {
		List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
        for (int i = 0; i < cardInfo.size(); i++) {
            sendText(pomFactory.retailAccountPage().cardNumberField, cardInfo.get(0).get("cardNumber"));
            sendText(pomFactory.retailAccountPage().nameOnCardField, cardInfo.get(0).get("nameOnCard"));
            sendText(pomFactory.retailAccountPage().expMonthInput, cardInfo.get(0).get("expirationMonth"));
            sendText(pomFactory.retailAccountPage().expYearInput, cardInfo.get(0).get("expirationYear"));
            sendText(pomFactory.retailAccountPage().securityCodeInput, cardInfo.get(0).get("securityCode"));      
        }
        logger.info("User shuld edit Debit or credit card information");
	}

	@When("user click on Update Your Card button")
	public void userClickOnUpdateYourCardButton() {
		click(pomFactory.retailAccountPage().paymentSubmitBtn);
		logger.info(">> user click on Update Your Card button");
	}

	@Then("a message should be displayed ‘Payment Method updated Successfully’")
	public void aMessageShouldBeDisplayedPaymentMethodUpdatedSuccessfully() {
		waitTillPresence(pomFactory.retailAccountPage().sucessMasgCardUpdate);
		Assert.assertTrue(pomFactory.retailAccountPage().sucessMasgCardUpdate.isDisplayed());
		logger.info(">> Payment Method is updated Successfully");
	}
	
// @removeDibitOrCredit
	
	@When("User click on remove option of card section")
	public void userClickOnRemoveOptionOfCardSection() {
		click(pomFactory.retailAccountPage().firstPaymentCard);
		click(pomFactory.retailAccountPage().removeCard);
		logger.info(">> user click on remove Your Card button");
	}

	@Then("payment details should be removed")
	public void paymentDetailsShouldBeRemoved() {	
		Assert.assertTrue(pomFactory.retailAccountPage().addCardHeader.isDisplayed());
		logger.info(">> payment datail is removerd");
	}
//@addAddress

	@When("User click on Add address option")
	public void userClickOnAddAddressOption() {
		click(pomFactory.retailAccountPage().addAdress);
		logger.info(">> user click on add addressBtn");
	}
//	@When("user fill new address form with below information")
//	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
//	    List<Map<String, String>> addressInfos = dataTable.asMaps(String.class, String.class);
//	    RetailAccountPage retailPage = pomFactory.retailAccountPage();
//	    Map<String, String> addressInfo = addressInfos.get(0);
//	    sendText(retailPage.countryDropdown, DataGenerator.addressGenerator(addressInfo.get("country")));
//	    sendText(retailPage.fullNameInput, DataGenerator.addressGenerator(addressInfo.get("fullName")));
//	    sendText(retailPage.phoneNumberInput, DataGenerator.addressGenerator(addressInfo.get("phoneNumber")));
//	    sendText(retailPage.streetInput, DataGenerator.addressGenerator(addressInfo.get("streetAddress")));
//	    sendText(retailPage.apartmentInput, DataGenerator.addressGenerator(addressInfo.get("apt")));
//	    sendText(retailPage.cityInput, DataGenerator.addressGenerator(addressInfo.get("city")));
//	    click(retailPage.stateField);
//	    selectByVisibleText(retailPage.stateField, DataGenerator.addressGenerator(addressInfo.get("state")));
//	    sendText(retailPage.zipCodeInput, DataGenerator.addressGenerator(addressInfo.get("zipCode")));
//
//	    logger.info("Address information added");
//	}

	//kobe note
	//this is also working but this is a bit longer
	
	@When("user fill new address form with below information")
	public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addressInfos = dataTable.asMaps(String.class, String.class);
		for (int i = 0; i < addressInfos.size(); i++) {
		  sendText(pomFactory.retailAccountPage().countryDropdown, addressInfos.get(0).get("country"));
        sendText(pomFactory.retailAccountPage().fullNameInput, addressInfos.get(0).get("fullName"));
        sendText(pomFactory.retailAccountPage().phoneNumberInput, addressInfos.get(0).get("phoneNumber"));
        sendText(pomFactory.retailAccountPage().streetInput, addressInfos.get(0).get("streetAddress"));
        sendText(pomFactory.retailAccountPage().apartmentInput, addressInfos.get(0).get("apt"));
        sendText(pomFactory.retailAccountPage().cityInput, addressInfos.get(0).get("city"));
        click(pomFactory.retailAccountPage().stateField);
//        sendText(pomFactory.retailAccountPage().stateField, addressInfos.get(0).get("state"));
        selectByVisibleText(pomFactory.retailAccountPage().stateField, addressInfos.get(0).get("state"));
        sendText(pomFactory.retailAccountPage().zipCodeInput, addressInfos.get(0).get("zipCode"));
        }
        logger.info("adress information added");
	}
	
	// this one i did with atumic locaters 
	
//		System.out.println("user filling new address form with below information");
//		List<Map<String, String>> accountData = dataTable.asMaps(String.class, String.class);
//		String country = accountData.get(0).get("country");
//		String fullName = accountData.get(0).get("fullName");
//		String phoneNumber = accountData.get(0).get("phoneNumber");
//		String streetAddress = accountData.get(0).get("streetAddress");
//		String apt = accountData.get(0).get("apt");
//		String city = accountData.get(0).get("city");
//		String state = accountData.get(0).get("state");
//		String zipCode = accountData.get(0).get("zipCode");
//		System.out.println("country name: " + country + ",full Name:" + fullName + ",phone Number: " + phoneNumber
//				+ ",street Address: " + streetAddress + ",apt:" + "/" + apt + ",city:" + city + ",state:" + state
//				+ ",zip code: " + zipCode);
	

	@When("User click Add Your Address button")
	public void userClickAddYourAddressButton() {
		click(pomFactory.retailAccountPage().addYourAddress);
		logger.info(">>usre cicked on add your addressBtn");
	}

	@Then("a message should be displayed ‘Address Added Successfully’")
	public void aMessageShouldBeDisplayedAddressAddedSuccessfully() {
		waitTillPresence(pomFactory.retailAccountPage().addressSuccessMssg);
		Assert.assertTrue(pomFactory.retailAccountPage().addressSuccessMssg.isDisplayed());
		logger.info(">>Address Added Successfully");
	}

//@addressEdit

	@When("User click on edit address option")
	public void userClickOnEditAddressOption() {
		click(pomFactory.retailAccountPage().editAdr);
		logger.info(">>User click on edit address option");
	}	
	@When("user edit new address form with below information")
	public void userEditNewAddressFormWithBelowInformation(DataTable dataTable) {
		List<Map<String, String>> addressInfos = dataTable.asMaps(String.class, String.class);
		for (int i = 0; i < addressInfos.size(); i++) {
			clearTextUsingSendKeys(pomFactory.retailAccountPage().countryDropdown);
		sendText(pomFactory.retailAccountPage().countryDropdown, addressInfos.get(0).get("country"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().fullNameInput);
        sendText(pomFactory.retailAccountPage().fullNameInput, addressInfos.get(0).get("fullName"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneNumberInput);
        sendText(pomFactory.retailAccountPage().phoneNumberInput, addressInfos.get(0).get("phoneNumber"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().streetInput);
        sendText(pomFactory.retailAccountPage().streetInput, addressInfos.get(0).get("streetAddress"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().apartmentInput);
        sendText(pomFactory.retailAccountPage().apartmentInput, addressInfos.get(0).get("apt"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().cityInput);
        sendText(pomFactory.retailAccountPage().cityInput, addressInfos.get(0).get("city"));
		clearTextUsingSendKeys(pomFactory.retailAccountPage().stateField);
        click(pomFactory.retailAccountPage().stateField);
//        sendText(pomFactory.retailAccountPage().stateField, addressInfos.get(0).get("state"));
        selectByVisibleText(pomFactory.retailAccountPage().stateField, addressInfos.get(0).get("state"));
        clearTextUsingSendKeys(pomFactory.retailAccountPage().zipCodeInput);
        sendText(pomFactory.retailAccountPage().zipCodeInput, addressInfos.get(0).get("zipCode"));
        }

	    logger.info("address information updated");
	}


	@When("User click update Your Address button")
	public void userClickUpdateYourAddressButton() {
		scrollPageDownWithJS();
		click(pomFactory.retailAccountPage().updateAddressBtn);
		logger.info(">>User click on update addressBtn");

	}
	@Then("a message should be displayed ‘Address Updated Successfully’")
	public void aMessageShouldBeDisplayedAddressUpdatedSuccessfully() {
		waitTillPresence(pomFactory.retailAccountPage().addressUpdateSuccessMsg);
		Assert.assertTrue(pomFactory.retailAccountPage().addressUpdateSuccessMsg.isDisplayed());
		logger.info(">>Address Updated Successfully");
	}

// @removeaddress

	@When("User click on remove option of Address section")
	public void userClickOnRemoveOptionOfAddressSection() {
		scrollPageDownWithJS();
		click(pomFactory.retailAccountPage().removeaddressBtn);
		logger.info("User clicked on remove option of Address section");
	}

	@Then("Address details should be removed")
	public void addressDetailsShouldBeRemoved() {
		if (!isElementDisplayed(pomFactory.retailAccountPage().addressBar)) {
            logger.info("address details removed");

        }
		
	}

}
