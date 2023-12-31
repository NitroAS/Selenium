package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){
       var dropDownPage = homePage.clickDropDown();
       String option = "Option 1";
       dropDownPage.selectFromDropDown(option);
       var selectedOptions = dropDownPage.getSelectOption();

        assertEquals(String.valueOf(selectedOptions.size()), 1 , "Incorrect number of selections");

        assertTrue(selectedOptions.contains(option), "Option is not selected" );

    }
}
