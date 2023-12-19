package gov.uk.check.visa.steps;

import gov.uk.check.visa.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConfirmationTestSteps {
    @And("I Select intendent to stay for {string}")
    public void iSelectIntendentToStayForLongerThanMonths(String length) {
        new DurationOfStayPage().selectDurationOfStay(length);

    }

    @And("I Select state My partner of family member have uk immigration status {string}")
    public void iSelectStateMyPartnerOfFamilyMemberHaveUkImmigrationStatusYes(String status) {
        new FamilyImmigrationStatusPage().selectStatus(status);

    }

    @And("I Select a Nationality {string}")
    public void iSelectANationalityAustralia(String country) {
        new SelectNationalityPage().selectNationality(country);
    }

    @And("I Click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("I Select reason {string}")
    public void iSelectReasonTourism(String reason) {
        new ReasonForTravelPage().selectTourism(reason);


    }

    @Then("I verify result {string}")
    public void iVerifyResultYouWillNotNeedAVisaToComeToTheUK(String result) {
        Assert.assertEquals(new ResultPage().getTextOfVisaResult(),result,"Message didnt match");
    }

    @Given("I am on Start page")
    public void iAmOnStartPage() {

    }

    @When("I click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickOnStartNowButton();
    }

    @And("I Select have planning to work for {string}")
    public void iSelectHavePlanningToWorkForHealthAndCareProfessional(String text) {
        new WorkTypePage().selectWorkType(text);
    }
}
