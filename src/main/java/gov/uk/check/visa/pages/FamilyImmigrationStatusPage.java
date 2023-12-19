package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FamilyImmigrationStatusPage extends Utility {

    private static final Logger log = LogManager.getLogger(FamilyImmigrationStatusPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//label[@class='gem-c-label govuk-label govuk-radios__label']")
    List<WebElement> status;

    public void selectStatus(String immiStatus){
        List<WebElement> immigrationStatus = status;
        for (WebElement e : immigrationStatus){
            if (e.getText().equalsIgnoreCase(immiStatus)){
                e.click();
                break;
            }
        }
    }
}
