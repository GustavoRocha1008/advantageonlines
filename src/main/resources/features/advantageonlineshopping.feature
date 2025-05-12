 Feature: advantageonlineshopping

  @CT0001
      Scenario: Criando conta (CREATE NEW ACCOUNT)
        Given  que estou na tela principal
        When   prencho o formulario de cadastro
        Then   o usuário e criado com sucesso

  @CT0002
      Scenario: Login do usuário
        Given Acessei o site
        When  Realizo o login
        Then  usuário e logado com sucesso

  @CT0003
    Scenario: Altera Cadastro (Account details)
      Given estou logado
      When  faço alteração dos dados de cadastro Account details
      Then  Account details esta alterado conforme solicitado

  @CT0004
    Scenario: Altera cadastrado (Preferred payment method)
      Given estou na logado
      When  faço alteração dos dados de cadastro Preferred payment method
      Then  Preferred payment method e alterado conforme solicitado

  @CT0005
    Scenario: Compra do produto
      Given que estou na pagina principal logado
      When  faço checkout do produto
      Then  o produto e comprado com sucesso

  @CT0006
    Scenario: busca de produtos
      Given que estou na tela princapal
      When  realizo a busca
      Then  o produto e encontrado

  @CT0007
    Scenario: adicionar itens ao carrinho de compra
      Given que realizo a busca de um tablet
      When  seleciono o produto
      Then  o produto e adicionado ao carrinho

  @CT0008
    Scenario: Validar produtos incluídos no carrinho
      Given que estou logado no advantage
      When  acesso o carrinho de compra
      Then  temos os produtos selecionados

  @CT0009
    Scenario: Delatar conta (Delete Account)
      Given  que  acessa o menu do usuário
      When   solicito a a exclusão da minha conta
      Then   a solicitação de exclusão efetuada com sucesso