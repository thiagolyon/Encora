# language: pt

  Funcionalidade: Cadastrando para vaga de emprego
    Eu como candidato para vaga de Test Automation
    Quero acessar o site da Encora para me candidatar
    Para fazer parte da equipe Encora

  @carreira
  Cenário: Cadastrando para a vaga Test Automation
    Dado que estou no site da Encora
    Quando clico em careers
    E preencho o campo Job title
    E clico no botão Search
    E clico no botão READ MORE
    E preencho os campos obrigatórios
    E adiciono o arquivo
    E marco os checklist legal
    E marco o checklist termo
    E clico em no botão Submit
    Então a aplicação deve exibir a mensagem Thanks for your application!
