package Steps;

import Logic.AdicionarItensAoCarrinhoDeCompraLogic;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class AdicionaritensAoCarrinhoDeCompraStep{

    private Webdriver driver = webRunner.getDriver();
    private AdicionarItensAoCarrinhoDeCompraLogic adicionarItensAoCarrinhoDecompraLogic = new AdicionarItensAoCarrinhoDeCompraLogic();

    @Given ("que realizo a busca de um tablet")
    public void que_realizo_a_busca_de_um_tablet(){
        AdicionarItensAoCarrinhoDeCompraLogic.Telaprincipal();
        AdicionarItensAoCarrinhoDeCompraLogic.BuscarProduto();
    }

    @When  ("seleciono o produto")
    public void seleciono_O_produto(){
        AdicionarItensAoCarrinhoDeCompraLogic.SelecionarProduto();
    }

    @Then  ("o produto e adicionado ao carrinho")
    public void o_produto_e_adicionado_ao_carrinho(){
        AdicionarItensAoCarrinhoDeCompraLogic.ProdutoAdcionadoAocarrinho();
    }
    
}
