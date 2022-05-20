#language:pt

  Funcionalidade: Teste login Bugbank
    Cenario: Login com sucesso
      Dado que esteja na pagina inicial: "http://localhost:3000"
      E possuo cadastro
      Quando preencher email: "teste@gmail.com" e senha: "teste"
      E clicar em fazer login
      Entao valido que a pagina de login foi carregada com sucesso