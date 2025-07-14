package Logic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.LoginPage;
import Pages.ProdutosPage;
import Pages.TelaPrincpalPage;

public class AdicionarItensAoCarrinhoDeCompraLogic {    
    private WebDriver driver;
    LoginPage loginPage = new LoginPage();
    TelaPrincpalPage telaPrincpalPage = new TelaPrincpalPage();
    ProdutosPage produtosPage = new ProdutosPage();


    public void Telaprincipal (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));    
    }

    public void BuscarProduto (){
        WebElement LupaDeBusca = wait.until(ExpectedConditions.visibilityOfElementLocated(telaPrincpalPage.LupaDeBusca));
        InputCampodeBusca.clear();
        InputCampodeBusca.sendKeys("HP ELITEPAD 1000 G2 TABLET");
    }

    public void SelecionarProduto(){
        WebElement LupaDeBusca = wait.until(ExpectedConditions.visibilityOfElementLocated(telaPrincpalPage.TabletHDG1));
        TabletHDG1.click();
    }

    public void ProdutoAdcionadoAocarrinho() {
        WebElement CarrinhoItemAnexado = wait.until(ExpectedConditions.visibilityOfElementLocated(telaPrincpalPage.CarrinhoItemAnexado));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        CarrinhoItemAnexado.click();
    }

}
