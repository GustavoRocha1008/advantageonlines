package Pages;

import org.openqa.selenium.By;

public class LoginPage {
    public By LinkCreateAccount = By.xpath("//a[contains(@class, 'create-new-account')]");
    public By InputUsernameCadastro = By.xpath("//div[@id='registerCover']//input[@name='usernameRegisterPage']");
    public By InputUsername = By.xpath("//input[@name='username' and @type='text']");
    public By InputPassword = By.xpath("//div[@class='login ng-scope']//input[@name='password']");
    public By BtnSignIn = By.xpath("//login-modal//div//div//sec-form//sec-sender//button[@id='sign_in_btn']");


}