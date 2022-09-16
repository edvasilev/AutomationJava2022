package POM;

import org.junit.jupiter.api.*;

public class TestScripts extends BaseTestClass {
    @Test
    public void Test1() {
        BankPage page = new BankPage(driver, wait);
        page.NavigateToUrl();
        page.ClickOnLogin();
        page.SelectFromDropdown();
        page.ClickLoginButton();
        page.ClickOnDeposit();
        page.EnterAmount();
        page.SubmitAmount();
        page.EnterSecondAmount();
        page.SubmitSecondAmount();
        page.VerifyDeposit();

    }
}
