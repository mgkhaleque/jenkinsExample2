package tabledata;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.awt.*;

// URL: https://www.w3schools.com/sql/sql_select.asp
//css selectors: https://www.w3schools.com/cssref/css_selectors.asp

public class TestTable extends CommonAPI {
    @Test
    public void readCell() {
        //String cell = getTextByCss(".w3-table-all.notranslate"); //print entire table
        //String cell = getTextByCss(".w3-table-all.notranslate tr");//print 1st row (header)
        //String cell = getTextByCss(".w3-table-all.notranslate tr:nth-child(4)"); //print row 4
        // String cell = getTextByCss(".w3-table-all.notranslate tr:nth-child(4)td:nth-child (2)"); //print row 4 table 2 data

        //List<WebElement> listOfWebElement = getListOfWebElementsByCss(".w3-table-all.notranslate tr");
       // List<String> cells = getListOfString(listOfWebElement);
       // for (String st : cells) {
        //    System.out.println(st);
      //  }

        //System.out.println(cells);


    }
}
//"nav-sprite nav-logo-base"