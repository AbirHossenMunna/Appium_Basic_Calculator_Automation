package TestRunner;

import Screens.CalScreen;
import base.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CalTestRunner extends Setup {
    @Test(priority = 1, description = "Sum of 2 Number")
    public void doSum() {
        CalScreen calScreen = new CalScreen(driver);
        String sum = calScreen.doSum();
        System.out.println(sum);
        Assert.assertEquals(sum, "15");
    }

    @AfterMethod
    public void clearScreen() {
        CalScreen calScreen = new CalScreen(driver);
        calScreen.btnClear.click();
    }

    @Test(priority = 2, description = "Sum of 2 Number")
    public void doSub() {
        CalScreen calScreen = new CalScreen(driver);
        String sub = calScreen.doSub();
        System.out.println(sub);
        Assert.assertEquals(sub, "1");
    }

    @Test(priority = 3, description = "Multiply of 2 Number")
    public void doMul() {
        CalScreen calScreen = new CalScreen(driver);
        String mul = calScreen.doMul();
        System.out.println(mul);
        Assert.assertEquals(mul, "36");
    }

    @Test(priority = 4, description = "Div of 2 Number")
    public void doDiv() {
        CalScreen calScreen = new CalScreen(driver);
        String div = calScreen.doDiv();
        System.out.println(div);
        Assert.assertEquals(div, "18");
    }
}
