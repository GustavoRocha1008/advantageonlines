package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvantageonlineshoppingPage {

        private WebDriver driver;

        public AdvantageonlineshoppingPage(WebDriver driver) {
                this.driver = driver;
                PageFactory.initElements(driver, this);
        }

        public By BtnAcesso = By.xpath("//nav//ul//li[3]//a//a[@id='hrefUserIcon']");
        public By LinkCreateAccount = By.xpath("//a[contains(@class, 'create-new-account')]");
        public By InputUsernameCadastro = By.xpath("//div[@id='registerCover']//input[@name='usernameRegisterPage']");
        public By EmailCadastro = By.xpath("//div[@id='formCover']//input[@name='emailRegisterPage']");
        public By PasswordCadastro = By.xpath("//div[@class='spliter']//input[@name='passwordRegisterPage']");
        public By ConfirmPasswordCadastro = By.xpath("//sec-view[@class='ng-isolate-scope sec-view']//input[@name='confirm_passwordRegisterPage']");
        public By CheckboxIagree = By.xpath("//sec-view[@class='ng-isolate-scope sec-view' and @sec-name='registrationAgreement']");
        public By BtoRegister = By.id("register_btn");
        public By NomeUsuario = By.xpath("//a[@id='menuUserLink']//span[@class='hi-user containMiniTitle ng-binding']");
        public By Myaccount = By.xpath("//a[@id='menuUserLink']//div[@id='loginMiniTitle']//label[@translate='My_account']");
        public By LinkEditAccount = By.linkText("Edit");
        public By FirstName = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='first_nameAccountDetails']");
        public By LastName = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='last_nameAccountDetails']");
        public By PhoneNumber = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='phone_numberAccountDetails']");
        public By City = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='cityAccountDetails']");
        public By Address = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='addressAccountDetails']");

        @FindBy(xpath = "//select[@name='countryListboxAccountDetails']")
        public WebElement Country;

        public By PostaCodel = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='postal_codeAccountDetails']");
        public By Region = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='state_/_province_/_regionAccountDetails']");
        public By BtoSave = By.id("save_btn");
        public By TelaMyaccount = By.xpath("//section[@class='ng-scope']//h3[@class='roboto-regular sticky fixedImportant ng-scope fixed']");
        public By LinkPreferred = By.xpath("//div[@class='cube']//h3[@class='blueLink ng-binding']//a[@class='floatRigth ng-scope' and @href='#/accountPaymentEdit']");
        public By OpcMasterCredit = By.xpath("//div[@class='imgRadioButton' and @data-ng-click='imgRadioButton = 2']");
        public By InputCardNumber = By.id("creditCard");
        public By InputCVVNumber = By.xpath("//input[@name='cvv_number']");
        public By ComboBoxMM = By.xpath("//*[@id='paymentMethod']/div/div[3]/sec-form/div[2]/div/sec-view[1]/div/select");
        public By ComboBoxYYY = By.xpath("//*[@id='paymentMethod']/div/div[3]/sec-form/div[2]/div/sec-view[2]/div/select");
        public By InputCardholdername = By.xpath("//div[@class='inputContainer ng-scope']//input[@name='cardholder_name']");
        public By BtoSaveMethod = By.xpath("//sec-form[@class='ng-isolate-scope secForm']//div[@class='blueLink']//button[@id='save_btn' and @class='sec-sender-a ng-scope']");
        public By InputUsername = By.xpath("//input[@name='username' and @type='text']");
        public By InputPassword = By.xpath("//div[@class='login ng-scope']//input[@name='password']");
        public By BtnSignIn = By.xpath("//login-modal//div//div//sec-form//sec-sender//button[@id='sign_in_btn']");
        public By PopularItems = By.xpath("//a[text()='POPULAR ITEMS']");
        public By LinkDetails = By.id("details_16");
        public By CorBlack = By.id("rabbit");
        public By BtnAddToCart = By.xpath("//div[@class='fixedBtn']//button[@name='save_to_cart']");
        public By BtnCheckOut = By.xpath("//header//ul[@class='roboto-light desktop-handler']//button[@id='checkOutPopUp']");
        public By BtnNext = By.xpath("//div[@class='uiview ng-scope']//section//div[@id='orderPayment']//button[@id='next_btn' and @class='a-button nextBtn marginTop75 ng-scope']");
        public By BtnPayNow = By.id("pay_now_btn_MasterCredit");
        public By BtnDelete = By.xpath("//div[@class='cube']//button[@class='deleteMainBtnContainer a-button ng-scope' and @data-ng-click='deleteAccountUi()']");
        public By BtnYes = By.xpath("//div[@class='deleteBtnContainer']//div[@class='deletePopupBtn deleteRed' and @data-ng-click='deleteAccountConfirmed()']");
        public By BtnNot = By.xpath("//div[@class='deleteBtnContainer']//div[@class='deletePopupBtn deleteGreen']");
        public By LupaDeBusca = By.xpath("//div[@id='search']//*[@id='menuSearch']");
        public By InputCampodeBusca = By.id("autoComplete");
        public By TabletHDG1 = By.xpath("//nav//li[4]//a[4]//img");
        public By CarrinhoItemAnexado = By.xpath("//*[@id='product']/td[2]/a/label[1]");
        public By TabletEliteX2 = By.xpath("//a[@class='product ng-scope']//img[@data-ng-src='/catalog/fetchImage?image_id=3300']");
        public By ShoopingCart = By.xpath("//*[@id='shoppingCartLink']");
        public By ItemProTablet = By.xpath("//div[@id='shoppingCart']//*[contains(text(),'HP PRO TABLET 608 G1')]");
        public By ItemHPElite = By.xpath("//*[@id='shoppingCart']/table/tbody/tr[2]/td[1]/img");
        public By CheckoutShoppingCart = By.xpath("//div[@id='shoppingCart']//table[@class='fixedTableEdgeCompatibility']//button[@class='roboto-medium tami uft-class ng-binding' and @id='checkOutButton']");
}





