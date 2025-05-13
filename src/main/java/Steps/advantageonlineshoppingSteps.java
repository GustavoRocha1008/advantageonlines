package Steps;

import Logic.AdvantageonlineshoppingLogic;
import Support.GerenciadorNavegador;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class advantageonlineshoppingSteps {
    private WebDriver driver = GerenciadorNavegador.getDriver();
    private AdvantageonlineshoppingLogic advantageonlineshoppinglogic = new AdvantageonlineshoppingLogic();

    @Given("que estou na tela principal")
    public void que_estou_na_tela_princpal() {
        advantageonlineshoppinglogic.Homepage();
    }

    @When("prencho o formulario de cadastro")
    public void prencho_o_formulario_de_cadastro() {
        advantageonlineshoppinglogic.MenuUsuario();
    }

    @Then("o usuário e criado com sucesso")
    public void o_usuário_e_criado_com_sucesso() {
        advantageonlineshoppinglogic.CreatAccount();
    }

    @Given("Acessei o site")
    public void que_estou_na_tela_principal_do_Advantage() {
        advantageonlineshoppinglogic.Homepage();
    }

    @When("Realizo o login")
    public void clico_no_icone_de_login() {
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @Then("usuario e logado com sucesso")
    public void usuario_e_logado_com_sucesso() {
        advantageonlineshoppinglogic.MenuUsuario();
    }

    @Given("estou logado")
    public void estou_na_logado_e_clico_no_nome_do_usuário() {
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();

    }

    @When("faco alteracao dos dados de cadastro Account details")
    public void clico_em_my_account_e_clico_account_details_em_edit() {
        advantageonlineshoppinglogic.AcessoMyaccounnt();
        advantageonlineshoppinglogic.LinkEditAccount();
    }

    @Then("Account details esta alterado conforme solicitado")
    public void escolho_o_pais_em_country_e_preencho_os_campos_city_adress_postal_code_Region() {
        advantageonlineshoppinglogic.AlteraCadastroAccountDetails2();
    }

    @Given("estou na logado")
    public void que_estou_na_logado_e_clico_no_nome_do_usuário_E_clico_em_my_account() {
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
        advantageonlineshoppinglogic.AcessoMyaccounnt();
    }

    @When("faco alteracao dos dados de cadastro Preferred payment method")
    public void faco_alteracao_dos_dados_de_cadastro_Preferred_payment_method() {
        advantageonlineshoppinglogic.AlteraCadastradoPreferredPaymentMethod1();
    }

    @Then("Preferred payment method e alterado conforme solicitado")
    public void Preferred_payment_method_e_alterado_conforme_solicitado() {
        advantageonlineshoppinglogic.BtoSavePreferredPaymentMethod();

    }

    @Given("que estou na pagina principal logado")
    public void que_estou_na_pagina_principal_logado() {
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @When("faço checkout do produto")
    public void clico_em_popular_items_clico_em_view_detais_clico_na_cor_na_preta_clico_em_ADD_TO_CART() {
        advantageonlineshoppinglogic.PopularItems();
    }

    @Then("o produto e comprado com sucesso")
    public void o_produto_e_comprado_com_sucesso() {
        advantageonlineshoppinglogic.fluxoCompra();
    }

    @Given("que estou na tela principal")
    public void que_estou_na_tela_principal() {
        advantageonlineshoppinglogic.Homepage();
    }

    @When("realizo a busca")
    public void realizo_a_busca() {
        advantageonlineshoppinglogic.BuscaTablet();
    }

    @Then("o produto e encontrado")
    public void o_produto_e_encontrado() {
        advantageonlineshoppinglogic.ValidacaoProduto();

    }

    @Given("que realizo a busca de um tablet")
    public void que_realizo_a_busca_de_um_tablet() {
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @When("seleciono o produto")
    public void seleciono_o_produto() {
        advantageonlineshoppinglogic.SelecionaTablet1();
    }

    @Then("o produto e adicionado ao carrinho")
    public void o_produto_e_adicionado_ao_carrinho() {
        advantageonlineshoppinglogic.CarrinhoVirtual();
    }

    @Given("que estou logado no advantage")
    public void que_estou_logado_no_advantage() {
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @When("que acessa o menu do usuário")
    public void que_acessa_o_menu_do_usuárioa() {
        advantageonlineshoppinglogic.ShoopingCart();
    }

    @Then("temos os produtos selecionados")
    public void temos_os_produtos_selecionados() {
        advantageonlineshoppinglogic.validarCarrinho();
    }


    @Given("que acesso o menu do usuário")
    public void que_acesso_o_menu_do_usuário() {
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @When("solicito a a exclusão da minha conta")
    public void solicito_a_exclusão_da_minha_conta() {
        advantageonlineshoppinglogic.AcessoMyaccounnt();
    }

    @Then("a solicitacao de exclusao efetuada com sucesso")
    public voida solicitacao_de_exclusao_efetuada_com_sucesso() {
        advantageonlineshoppinglogic.BtnDelete();
    }

}