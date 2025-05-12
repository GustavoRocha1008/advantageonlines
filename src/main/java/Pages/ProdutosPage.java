package Pages;

import org.openqa.selenium.By;

public class ProdutosPage {
    public By TabletHDG1 = By.xpath("//nav//li[4]//a[4]//img");
    public By TabletEliteX2 = By.xpath("//a[@class='product ng-scope']//img[@data-ng-src='/catalog/fetchImage?image_id=3300']");
    public By ItemProTablet = By.xpath("//div[@id='shoppingCart']//*[contains(text(),'HP PRO TABLET 608 G1')]");
    public By ItemHPElite = By.xpath("//*[@id='shoppingCart']/table/tbody/tr[2]/td[1]/img");
}

