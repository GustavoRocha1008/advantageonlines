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

    @Given("que estou na tela princpal")
    public void que_estou_na_tela_princpal (){
        advantageonlineshoppinglogic.Homepage();
    }

    @When("Clico no menu usuario")
    public void Clico_no_menu_usuario(){
        advantageonlineshoppinglogic.MenuUsuario();
    }

    @And("clico em CREATE NEW ACCOUNT")
    public void clico_em_CREATE_NEW_ACCOUNT(){
        advantageonlineshoppinglogic.CreatNewAccount();
    }

    @Then("Preencho os campos Username Email Password Confirm Password Clico em i agree to the")
    public void Preencho_os_campos_Username_Email_Password_Confirm_Password_Clico_em_i_agree_to_the(){
        advantageonlineshoppinglogic.CreatAccount();
    }

    @And("e clico em register o sistema retorna para a home com o usário logado")
    public void e_clico_em_register_o_sistema_retorna_para_a_home_com_o_usário_logado (){
        advantageonlineshoppinglogic.UltimoPasso();
    }

    @Given("que estou na tela principal do Advantage")
    public void que_estou_na_tela_principal_do_Advantage() {
        advantageonlineshoppinglogic.Homepage();
    }

    @When("clico no icone de login")
    public void clico_no_icone_de_login() {
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @Then("preencho os campos de login e senha clico em Sign in o sistema carrega a tela com o usuário logado")
    public void preencho_os_campos_de_login_e_senha_clico_em_Sign_in_o_sistema_carrega_a_tela_com_o_usuário_logado() {
        advantageonlineshoppinglogic.MenuUsuario();
    }

    @Given("estou na logado e clico no nome do usuário")
    public void estou_na_logado_e_clico_no_nome_do_usuário(){
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();

    }

    @When("clico em my account e clico account details em edit")
    public void clico_em_my_account_e_clico_account_details_em_edit(){
        advantageonlineshoppinglogic.AcessoMyaccounnt();
        advantageonlineshoppinglogic.LinkEditAccount();
    }

    @And("Prencho o campo First Name lastname phone number")
    public void Prencho_o_campo_First_Name_lastname_phone_number(){
        advantageonlineshoppinglogic.AlteraCadastroAccountDetails1();
    }

    @Then("escolho o pais em country e preencho os campos city adress postal code Region")
    public void escolho_o_pais_em_country_e_preencho_os_campos_city_adress_postal_code_Region(){
        advantageonlineshoppinglogic.AlteraCadastroAccountDetails2();
    }

    @And("clico em SAVE o sistema retorna para a tela MY ACCOUNT")
    public void clico_em_SAVE_o_sistema_retorna_para_a_tela_MY_ACCOUNT(){
        advantageonlineshoppinglogic.BtoSaveAccountDetails();
    }

    @Given("que estou na logado e clico no nome do usuário E clico em my account")
    public void que_estou_na_logado_e_clico_no_nome_do_usuário_E_clico_em_my_account(){
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
        advantageonlineshoppinglogic.AcessoMyaccounnt();
    }

    @When("clico Preferred payment method edit")
    public void clico_em_my_account_e_clico_Preferred_payment_method_edit(){
        advantageonlineshoppinglogic.AlteraCadastradoPreferredPaymentMethod1();
    }

    @And("altero os campos card number CVV Number Expiration date e clico em Set MasterCredit as your preferred payment")
    public void altero_os_campos_card_number_CVV_Number_Expiration_date_e_clico_em_Set_MasterCredit_as_your_preferred_payment(){
        advantageonlineshoppinglogic.AlteraCadastradoPreferredPaymentMethod2();
        advantageonlineshoppinglogic.AlteraCadastradoPreferredPaymentMethod3();
    }

    @Then("clico em save o sistema retorna para a tela MY ACCOUNT")
    public void clico_em_save_o_sistema_retorna_para_a_tela_MY_ACCOUNT(){
        advantageonlineshoppinglogic.BtoSavePreferredPaymentMethod();

    }

    @Given("que estou na pagina principal logado")
    public void que_estou_na_pagina_principal_logado(){
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @When("clico em popular items clico em view detais clico na cor na preta clico em ADD TO CART")
    public void clico_em_popular_items_clico_em_view_detais_clico_na_cor_na_preta_clico_em_ADD_TO_CART(){
        advantageonlineshoppinglogic.PopularItems();
    }

    @And("clico em checkout em seguinda clico em next em PAY NOW")
    public void clico_em_checkout_em_seguinda_clico_em_next_em_PAY_NOW(){
        advantageonlineshoppinglogic.Checkout();
    }

    @Then("o sistema apresenta a seguinte mensagem Thank you for buying with Advantage")
    public void o_sistema_apresenta_a_seguinte_mensagem_Thank_you_buying_wit_Advantage(){
        advantageonlineshoppinglogic.fluxoCompra();
   }

    @Given("que estou na tela principal do Advantage home")
    public void que_estou_na_tela_principal_do_Advantage_home(){
        advantageonlineshoppinglogic.Homepage();
    }

    @When("digito na lupa de busca o produto Tablets")
    public void digito_na_lupa_de_busca_o_produto_Tablets(){
        advantageonlineshoppinglogic.BuscaTablet();
    }

    @Then("O sistema mostra os tablets buscando")
    public void O_sistema_mostra_os_tablets_buscando(){
       advantageonlineshoppinglogic.ValidacaoProduto();

    }

    @Given("que realizo a busca de um tablet")
    public void  que_realizo_a_busca_de_um_tablet(){
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
   }

    @When("clico no produto desejado escolho a cor e clico add to card")
    public void clico_no_produto_desejado(){
       advantageonlineshoppinglogic.SelecionaTablet1();
   }

    @Then("o produto e adicionado ao carrinho")
    public void o_produto_e_adicionado_ao_carrinho(){
        advantageonlineshoppinglogic.CarrinhoVirtual();
   }

    @Given("que estou logado no advantage")
    public void que_estou_logado_no_advantage() {
       advantageonlineshoppinglogic.MenuUsuario();
       advantageonlineshoppinglogic.RealizarLogin();
    }

    @When("clico no carrinho")
    public void clico_no_carrinho(){
        advantageonlineshoppinglogic.ShoopingCart();
    }

    @Then("temos os produtos selecionados")
    public void temos_os_produtos_selecionados(){
       advantageonlineshoppinglogic.validarCarrinho();
    }


    @Given("que estou na logado e clico no nome do usuário")
    public void que_estou_na_logado_e_clico_no_nome_do_usuário(){
        advantageonlineshoppinglogic.Homepage();
        advantageonlineshoppinglogic.MenuUsuario();
        advantageonlineshoppinglogic.RealizarLogin();
    }

    @When("clico em my account e rolo a tela até o final")
    public void clico_em_my_account_e_rolo_a_tela_o_final(){
        advantageonlineshoppinglogic.AcessoMyaccounnt();
    }

    @Then("clico em delete account o sistema apresenta o pop-up com Are sure you want to delete account")
    public void clico_em_delete_accounto_sistema_apresenta_o_pop_up_com_Are_sure_you_want_to_delete_account(){
        advantageonlineshoppinglogic.BtnDelete();
    }

    @And("clico em sim o sistema apresenta mensagem de sucesso")
    public void clico_em_sim_o_sistema_apresenta_mensagem_de_sucesso(){
        advantageonlineshoppinglogic.PopUp();
    }
}