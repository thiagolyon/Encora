$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/carreira.feature");
formatter.feature({
  "name": "Cadastrando para vaga de emprego",
  "description": "    Eu como candidato para vaga de Test Automation\n    Quero acessar o site da Encora para me candidatar\n    Para fazer parte da equipe Encora",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cadastrando para a vaga Test Automation",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@carreira"
    }
  ]
});
formatter.step({
  "name": "que estou no site da Encora",
  "keyword": "Dado "
});
formatter.match({
  "location": "CarreiraSteps.que_estou_no_site_da_Encora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em careers",
  "keyword": "Quando "
});
formatter.match({
  "location": "CarreiraSteps.clico_em_careers()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo Job title",
  "keyword": "E "
});
formatter.match({
  "location": "CarreiraSteps.preencho_o_campo_Job_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão Search",
  "keyword": "E "
});
formatter.match({
  "location": "CarreiraSteps.clico_no_botão_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no botão READ MORE",
  "keyword": "E "
});
formatter.match({
  "location": "CarreiraSteps.clico_no_botão_READ_MORE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho os campos obrigatórios",
  "keyword": "E "
});
formatter.match({
  "location": "CarreiraSteps.preencho_os_campos_obrigatórios()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "adiciono o arquivo",
  "keyword": "E "
});
formatter.match({
  "location": "CarreiraSteps.adiciono_o_arquivo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "marco os checklist legal",
  "keyword": "E "
});
formatter.match({
  "location": "CarreiraSteps.marco_os_checklist_legal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "marco o checklist termo",
  "keyword": "E "
});
formatter.match({
  "location": "CarreiraSteps.marco_o_checklist_termo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em no botão Submit",
  "keyword": "E "
});
formatter.match({
  "location": "CarreiraSteps.clico_em_no_botão_Submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a aplicação deve exibir a mensagem Thanks for your application!",
  "keyword": "Então "
});
formatter.match({
  "location": "CarreiraSteps.a_aplicação_deve_exibir_a_mensagem_Thanks_for_your_application()"
});
formatter.result({
  "status": "passed"
});
});