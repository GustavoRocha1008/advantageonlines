package Support;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Before
    public void setUp() {
        WebDriver driver = GerenciadorNavegador.getDriver();
        driver.get("https://www.advantageonlineshopping.com/");
    }

    @After
    public void tearDown() {
        GerenciadorNavegador.quitDriver();
    }
}

