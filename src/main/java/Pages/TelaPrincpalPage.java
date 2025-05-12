package Pages;

import org.openqa.selenium.By;

public class TelaPrincpalPage {
    public By BtnAcesso = By.xpath("//nav//ul//li[3]//a//a[@id='hrefUserIcon']");
    public By NomeUsuario = By.xpath("//a[@id='menuUserLink']//span[@class='hi-user containMiniTitle ng-binding']");
    public By Myaccount = By.xpath("//a[@id='menuUserLink']//div[@id='loginMiniTitle']//label[@translate='My_account']");
    public By LupaDeBusca = By.xpath("//div[@id='search']//*[@id='menuSearch']");
    public By InputCampodeBusca = By.id("autoComplete");
    public By CarrinhoItemAnexado = By.xpath("//*[@id='product']/td[2]/a/label[1]");
    public By ShoopingCart = By.xpath("//*[@id='shoppingCartLink']");

}
