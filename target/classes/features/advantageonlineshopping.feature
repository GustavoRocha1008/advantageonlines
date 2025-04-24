 Feature: advantageonlineshopping

  @CT0001
    Scenario: Criando conta (CREATE NEW ACCOUNT)
      Given  que estou na tela princpal
      When   Clico no menu usuario
      And    clico em CREATE NEW ACCOUNT
      Then   Preencho os campos Username Email Password Confirm Password Clico em i agree to the
      And    e clico em register o sistema retorna para a home com o usário logado

  @CT0002
    Scenario: Login do usuário
      Given que estou na tela principal do Advantage
      When  clico no icone de login
      Then  preencho os campos de login e senha clico em Sign in o sistema carrega a tela com o usuário logado

  @CT0003

  Scenario: Altera Cadastro (Account details)
    Given estou na logado e clico no nome do usuário
    When  clico em my account e clico account details em edit
    And   Prencho o campo First Name lastname phone number
    Then  escolho o pais em country e preencho os campos city adress postal code Region
    And   clico em SAVE o sistema retorna para a tela MY ACCOUNT

  @CT0004

  Scenario: Altera cadastrado (Preferred payment method)
    Given que estou na logado e clico no nome do usuário E clico em my account
    When  clico Preferred payment method edit
    And   altero os campos card number CVV Number Expiration date e clico em Set MasterCredit as your preferred payment
    Then  clico em save o sistema retorna para a tela MY ACCOUNT

  @CT0005
    Scenario: Realizar compra do produto
      Given que estou na pagina principal logado
      When  clico em popular items clico em view detais clico na cor na preta clico em ADD TO CART
      And   clico em checkout em seguinda clico em next em PAY NOW
      Then o sistema apresenta a seguinte mensagem Thank you for buying with Advantage

  @CT0006
    Scenario: Realize a busca de um produto
      Given que estou na tela principal do Advantage home
      When  digito na lupa de busca o produto Tablets
      Then  O sistema mostra os tablets buscando

  @CT0007
    Scenario: Incluir produto no carrinho
      Given que realizo a busca de um tablet
      When  clico no produto desejado escolho a cor e clico add to card
      Then  o produto e adicionado ao carrinho

  @CT0008
    Scenario: Validar os produtos incluídos no carrinho na tela de pagamento
      Given que estou logado no advantage
      When clico no carrinho
      Then temos os produtos selecionados

  @CT0009
    Scenario: Delatar conta (Delete Account)
      Given que estou na logado e clico no nome do usuário
      When  clico em my account e rolo a tela até o final
      Then  clico em delete account o sistema apresenta o pop-up com Are sure you want to delete account
      And   clico em sim o sistema apresenta mensagem de sucesso