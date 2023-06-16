package Screens;

import base.Setup;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalScreen {
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_7")
    AndroidElement btn7;
    @FindBy(id = Setup.PACKAGE_ID + ":id/op_add")
    AndroidElement btnPlus;
    @FindBy(id = Setup.PACKAGE_ID + ":id/op_sub")
    AndroidElement btnMinus;
    @FindBy(id = Setup.PACKAGE_ID + ":id/op_mul")
    AndroidElement btnMul;
    @FindBy(id = Setup.PACKAGE_ID + ":id/op_div")
    AndroidElement btnDiv;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_8")
    AndroidElement btn8;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_4")
    AndroidElement btn4;
    @FindBy(id = Setup.PACKAGE_ID + ":id/digit_9")
    AndroidElement btn9;
    @FindBy(id = Setup.PACKAGE_ID + ":id/eq")
    AndroidElement btnEqual;
    @FindBy(id = Setup.PACKAGE_ID + ":id/result_final")
    AndroidElement resultFinal;
    @FindBy(id = Setup.PACKAGE_ID + ":id/clr")
    public AndroidElement btnClear;

    public CalScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public String doSum() {
        btn7.click();
        btnPlus.click();
        btn8.click();
        btnEqual.click();
        return resultFinal.getText();
    }

    public String doSub() {
        btn8.click();
        btnMinus.click();
        btn7.click();
        btnEqual.click();
        return resultFinal.getText();
    }

    public String doMul() {
        btn4.click();
        btnMul.click();
        btn9.click();
        btnEqual.click();
        return resultFinal.getText();
    }

    public String doDiv() {
        btn8.click();
        btnMul.click();
        btn9.click();
        btnEqual.click();
        btnDiv.click();
        btn4.click();
        btnEqual.click();
        return resultFinal.getText();
    }
}
