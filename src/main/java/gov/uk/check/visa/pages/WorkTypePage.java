package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkTypePage extends Utility {

    private static final Logger log = LogManager.getLogger(WorkTypePage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//label[@class='gem-c-label govuk-label govuk-radios__label']")
    List<WebElement> workType;

    public void selectWorkType(String text){
       List<WebElement> typeOfWork = workType;
       for (WebElement e : typeOfWork){
           if (e.getText().equalsIgnoreCase(text)){
               e.click();
               break;
           }
       }
    }
}
