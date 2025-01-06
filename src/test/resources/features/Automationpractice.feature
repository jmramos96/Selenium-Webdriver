# language: pt

  @todos
  Funcionalidade: Cadastro de usuário
  Eu como usuário do automation practice
  quero criar uma nova conta
  quero loga na nova conta
  quero recuperar minha senha
  para acessar o painel de usuário (My account)

    @cadastro-sucesso
  Cenário: Verificar criação de conta - (Apenas obrigatórios)
    Dado que eu esteja na página de autenticação do automation practice
    E insiro meu e-mail cadastrado
    E clico em criar uma conta
    E informo meu primeiro nome
    E informo o meu último nome
    E insiro uma senha
    Quando eu clicar em Registrar
    Então devo ser logado na minha conta

      @Busca
    Cenário: Realizar uma busca
      Dado que eu esteja na página
      E busque por um produto
      Quando os resultados retornarem
      Então confirmo que a busca foi realizada

      @Checkout
    Cenário: Realiza Checkout
      Dado que eu acesso a página do produto
      Quando escolho a variedade do produto
      Então adiciono no carrinho
      E confirmo se o item foi para o carrinho

