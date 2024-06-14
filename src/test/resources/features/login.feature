#language: pt
#Author: e2e@e2etreinamentos.com.br

@login @regressivo
Funcionalidade: Login de usuario
  Como usuario da aplicacao saucedemo
  Quero enviar os dados de login
  Para realizar compras
  
  Contexto: Cliente na tela de login
     Dado que esteja na tela de login

  @positivo
  Cenario: Login valido
    Quando enviar os dados de acesso
    Entao usuario acessa pagina logado
    
    
   