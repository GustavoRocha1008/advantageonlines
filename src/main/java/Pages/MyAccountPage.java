package Pages;

import org.openqa.selenium.By;

public class MyAccountPage {
    public By TelaMyaccount = By.xpath("//section[@class='ng-scope']//h3[@class='roboto-regular sticky fixedImportant ng-scope fixed']");
    public By LinkEditAccount = By.linkText("Edit");
    public By LinkPreferred = By.xpath("//div[@class='cube']//h3[@class='blueLink ng-binding']//a[@class='floatRigth ng-scope' and @href='#/accountPaymentEdit']");
    public By BtnDelete = By.xpath("//div[@class='cube']//button[@class='deleteMainBtnContainer a-button ng-scope' and @data-ng-click='deleteAccountUi()']");
    public By BtnYes = By.xpath("//div[@class='deleteBtnContainer']//div[@class='deletePopupBtn deleteRed' and @data-ng-click='deleteAccountConfirmed()']");
    public By BtnNot = By.xpath("//div[@class='deleteBtnContainer']//div[@class='deletePopupBtn deleteGreen']");
}
