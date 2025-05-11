package Logic;

import Pages.AdvantageonlineshoppingPage;
import Support.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertTrue;


public class AdvantageonlineshoppingLogic {
    private WebDriver driver;
    private AdvantageonlineshoppingPage advantageonlineshoppingPage;

    public void MenuUsuario() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement btnAcesso = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.BtnAcesso));
        btnAcesso.click();
    }

    public void RealizarLogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Espera e preenche o campo de usuário
        WebElement inputUsername = wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.InputUsername));
        inputUsername.clear();
        inputUsername.sendKeys("Gustavo_Rocha");

        // Espera e preenche o campo de senha
        WebElement inputPassword = wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.InputPassword));
        inputPassword.clear();
        inputPassword.sendKeys("Abc@2020");

        // Espera o loader desaparecer
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loader")));

        // Espera o botão de Sign In ficar clicável e então clica
        WebElement btnSignIn = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.BtnSignIn));
        btnSignIn.click();
    }

    public void CreatNewAccount(){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
         WebElement element = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.LinkCreateAccount));
         try {
             element.click();
         } catch (ElementClickInterceptedException e) {
             ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
         }

     }

    public void CreatAccount() {
         driver.findElement(advantageonlineshoppingPage.InputUsernameCadastro).sendKeys("Gustavo_Rocha");
         driver.findElement(advantageonlineshoppingPage.EmailCadastro).sendKeys("gu44789@gmail.com");
         driver.findElement(advantageonlineshoppingPage.PasswordCadastro).sendKeys("Abc@2020");
         driver.findElement(advantageonlineshoppingPage.ConfirmPasswordCadastro).sendKeys("Abc@2020");
         ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,1000);");
         driver.findElement(advantageonlineshoppingPage.CheckboxIagree).click();
     }

    public void UltimoPasso(){
         driver.findElement(advantageonlineshoppingPage.BtoRegister).click();
         // Encontra o elemento e verifica se está visível
         assertTrue("Gustavo_Rocha", driver.findElement(advantageonlineshoppingPage.NomeUsuario).isDisplayed());
     }

    public void AcessoMyaccounnt(){
         driver.findElement(advantageonlineshoppingPage.NomeUsuario).click();
         driver.findElement(advantageonlineshoppingPage.Myaccount).click();
    }

    public void LinkEditAccount(){
         driver.findElement(advantageonlineshoppingPage.LinkEditAccount).click();
     }

    public void AlteraCadastroAccountDetails1() {
         driver.findElement(advantageonlineshoppingPage.FirstName).sendKeys("Gustavo");
         driver.findElement(advantageonlineshoppingPage.LastName).sendKeys("Rocha");
         driver.findElement(advantageonlineshoppingPage.PhoneNumber).sendKeys("11949224945");
         ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,100)");
     }

    public void AlteraCadastroAccountDetails2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement combobox = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.Country));

        // Interage com o combobox depois de garantir que ele está pronto
        Select select = new Select(combobox);
        select.selectByVisibleText("Tonga");
        driver.findElement(advantageonlineshoppingPage.City).click();
        driver.findElement(advantageonlineshoppingPage.Address).sendKeys("Rua alziro viera");
        driver.findElement(advantageonlineshoppingPage.PostaCodel).sendKeys("0665879");
        driver.findElement(advantageonlineshoppingPage.Region).sendKeys("Itapevi-SP");
     }

    public void BtoSaveAccountDetails(){
        driver.findElement(advantageonlineshoppingPage.BtoSave).click();
        assertTrue("MY ACCOUNT", driver.findElement(advantageonlineshoppingPage.TelaMyaccount).isDisplayed());
     }

    public void AlteraCadastradoPreferredPaymentMethod1(){
        ((JavascriptExecutor) driver).executeScript("window.scrollBy(0,180)");
         driver.findElement(advantageonlineshoppingPage.LinkPreferred).click();
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();", driver.findElement(advantageonlineshoppingPage.OpcMasterCredit));
     }

    public void AlteraCadastradoPreferredPaymentMethod2() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(55));

        // Preenche o número do cartão
        driver.findElement(advantageonlineshoppingPage.InputCardNumber).sendKeys("5148814728710027");
        // Aguarda o campo CVV se tornar visível e clicável
        WebElement cvvInput = wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.InputCVVNumber));
        // Espera breve para garantir que o campo esteja pronto (evita sumir valor)
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // boa prática
            System.out.println("Thread interrompida: " + e.getMessage());
        }
        // Clica no campo e insere o CVV
        cvvInput.click();
        cvvInput.clear(); // garante que o campo está limpo antes
        cvvInput.sendKeys("0716");
        // Verifica se o CVV foi inserido corretamente
        String cvvValue = cvvInput.getAttribute("value");
        System.out.println("CVV inserido: " + cvvValue); // Depuração
        // Seleciona o mês na combo box
        WebElement combobox = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.ComboBoxMM));
        combobox.click();
        Select comboMM = new Select(combobox);
        comboMM.selectByVisibleText("02");
    }

    public void AlteraCadastradoPreferredPaymentMethod3(){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement combobox = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.ComboBoxYYY));
         Select select = new Select(combobox);
         select.selectByVisibleText("2026");
         driver.findElement(advantageonlineshoppingPage.InputCardholdername).sendKeys("Gustav");
     }

    public void BtoSavePreferredPaymentMethod(){
        driver.findElement(advantageonlineshoppingPage.BtoSaveMethod).click();
        assertTrue("MY ACCOUNT", driver.findElement(advantageonlineshoppingPage.TelaMyaccount).isDisplayed());
    }

    public void PopularItems(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("PopUp")));
        driver.findElement(advantageonlineshoppingPage.PopularItems).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader-ou-popup")));
        driver.findElement(advantageonlineshoppingPage.LinkDetails).click();
        driver.findElement(advantageonlineshoppingPage.CorBlack).click();
        driver.findElement(advantageonlineshoppingPage.BtnAddToCart).click();
     }

    public void Checkout(){
        driver.findElement(advantageonlineshoppingPage.BtnCheckOut).click();
     }

    public void fluxoCompra(){
        driver.findElement(advantageonlineshoppingPage.BtnNext).click();
        driver.findElement(advantageonlineshoppingPage.BtnPayNow).click();
     }

    public void BuscaTablet() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // 1. Aguarda o desaparecimento do loader, se estiver visível
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));

            // 2. Aguarda o botão da lupa ficar clicável e clica
            WebElement lupa = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.LupaDeBusca));
            lupa.click();

            // 3. Aguarda o campo de busca ficar visível e interagível
            WebElement campoBusca = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.InputCampodeBusca));
            campoBusca.sendKeys("Tablet");

            // 4. Pressiona Enter para realizar a busca
            campoBusca.sendKeys(Keys.ENTER);

        } catch (TimeoutException e) {
            System.out.println("⏳ Elemento demorou muito para carregar: " + e.getMessage());
        } catch (ElementClickInterceptedException e) {
            System.out.println("🚫 Clique interceptado por outro elemento (possível loader): " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.out.println("⚠️ Elemento não interagível no momento: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Erro inesperado: " + e.getMessage());
        }
    }

    public void ValidacaoProduto() {
        // Inicializa o WebDriverWait com um tempo de espera de 20 segundos.
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Espera pela visibilidade do TabletHDG1 e TabbletEliteX2
        WebElement tabletHDG1 = wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.TabletHDG1));
        WebElement tabletEliteX2 = wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.TabletEliteX2));

        // Opcionalmente, você pode validar a visibilidade ou presença desses elementos de alguma maneira.
        if (tabletHDG1.isDisplayed()) {
            System.out.println("Tablet HDG1 está visível.");
        }

        if (tabletEliteX2.isDisplayed()) {
            System.out.println("Tablet Elite X2 está visível.");
        }

        // Lógica adicional para interagir com os elementos pode ser inserida aqui, por exemplo, adicionando-os ao carrinho ou realizando outras ações.
    }

    public void SelecionaTablet1() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));

        try {
            // 1. Aguarda desaparecimento de loaders genéricos e popups
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader")));

            // Novo: Aguarda desaparecimento do popup que pode bloquear a lupa
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".PopUp")));

            // 2. Aguarda a lupa de busca ficar clicável
            WebElement lupa = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.LupaDeBusca));

            try {
                // 3. Tenta clicar na lupa
                lupa.click();
            } catch (ElementClickInterceptedException e) {
                // Espera um pouco e tenta novamente se o clique for interceptado
                Thread.sleep(1000); // tempo leve, pode ajustar
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".PopUp")));
                lupa.click();
            }

            // 4. Aguarda o campo de busca e envia "Tablet"
            WebElement campoBusca = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.InputCampodeBusca));
            campoBusca.sendKeys("Tablet");
            campoBusca.sendKeys(Keys.ENTER);

            // 5. Aguarda o primeiro tablet e clica
            WebElement tabletHDG1 = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.TabletHDG1));
            tabletHDG1.click();

            // 6. Cor Black
            WebElement corBlack = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.CorBlack));
            corBlack.click();

            // 7. Botão de adicionar ao carrinho
            WebElement btnAddToCart = wait.until(ExpectedConditions.elementToBeClickable(advantageonlineshoppingPage.BtnAddToCart));
            btnAddToCart.click();

        } catch (TimeoutException e) {
            System.out.println("⏳ Elemento demorou muito para carregar: " + e.getMessage());
        } catch (ElementClickInterceptedException e) {
            System.out.println("🚫 Clique interceptado por outro elemento (possível loader): " + e.getMessage());
        } catch (ElementNotInteractableException e) {
            System.out.println("⚠️ Elemento não interagível no momento: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ Erro inesperado: " + e.getMessage());
        }
    }

    public void CarrinhoVirtual(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.CarrinhoItemAnexado));
     }

    public void SelecionarTablet02(){
        driver.findElement(advantageonlineshoppingPage.LupaDeBusca).sendKeys("Tablet");
        driver.findElement(advantageonlineshoppingPage.TabletEliteX2).click();
        driver.findElement(advantageonlineshoppingPage.BtnAddToCart).click();
    }

    public void ShoopingCart(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

// Espera o loader desaparecer (ajuste o seletor conforme o necessário)
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loader")));

// Ou, se for um popup
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("popup")));

// Depois de garantir que o elemento sumiu, clica no carrinho
        driver.findElement(advantageonlineshoppingPage.ShoopingCart).click();

    }

    public void validarCarrinho(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.ItemHPElite));
        ////WebElement ItemHPElite = wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.ItemHPElite));
    }

    public void BtnDelete(){
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,500);");
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         wait.until(ExpectedConditions.visibilityOfElementLocated(advantageonlineshoppingPage.BtnDelete));
         driver.findElement(advantageonlineshoppingPage.BtnDelete).click();
     }

    public void PopUp(){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
         driver.findElement(advantageonlineshoppingPage.BtnYes).click();
     }

}