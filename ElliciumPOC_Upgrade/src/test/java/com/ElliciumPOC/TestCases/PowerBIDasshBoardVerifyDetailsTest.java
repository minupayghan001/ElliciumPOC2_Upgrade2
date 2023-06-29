package com.ElliciumPOC.TestCases;

import java.sql.SQLException;

import org.testng.annotations.Test;

import com.ElliciumPOC.PageObject.PowerBIDashBoard;
import com.ElliciumPOC.TestBase.TestBase;

public class PowerBIDasshBoardVerifyDetailsTest  extends TestBase{
	@Test

    public void verifyDetails() throws InterruptedException, ClassNotFoundException, SQLException {

        Thread.sleep(10000);

      PowerBIDashBoard powerBi=new PowerBIDashBoard(driver);

       powerBi.showMonthlyPerformanceDetails();
       

    }
}
