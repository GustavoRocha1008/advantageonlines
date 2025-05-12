package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.By;

public class TelaCadastroPage {
    public By InputUsernameCadastro = By.xpath("//div[@id='registerCover']//input[@name='usernameRegisterPage']");
    public By EmailCadastro = By.xpath("//div[@id='formCover']//input[@name='emailRegisterPage']");
    public By PasswordCadastro = By.xpath("//div[@class='spliter']//input[@name='passwordRegisterPage']");
    public By ConfirmPasswordCadastro = By.xpath("//sec-view[@class='ng-isolate-scope sec-view']//input[@name='confirm_passwordRegisterPage']");
    public By CheckboxIagree = By.xpath("//sec-view[@class='ng-isolate-scope sec-view' and @sec-name='registrationAgreement']");
    public By BtoRegister = By.id("register_btn");
    public By EmailCadastro = By.xpath("//div[@id='formCover']//input[@name='emailRegisterPage']");
    public By PasswordCadastro = By.xpath("//div[@class='spliter']//input[@name='passwordRegisterPage']");
    public By ConfirmPasswordCadastro = By.xpath("//sec-view[@class='ng-isolate-scope sec-view']//input[@name='confirm_passwordRegisterPage']");
}
