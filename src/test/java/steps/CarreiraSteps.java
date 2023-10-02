package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CarreiraPages;

public class CarreiraSteps {

    CarreiraPages carreiraPages = new CarreiraPages();

    @Dado("^que estou no site da Encora$")
    public void que_estou_no_site_da_Encora() {
        carreiraPages.acessarSiteEncora();
    }

    @Quando("^clico em careers$")
    public void clico_em_careers() {
        carreiraPages.clicarBtnCareers();
    }

    @Quando("^preencho o campo Job title$")
    public void preencho_o_campo_Job_title() {
        carreiraPages.preencherJob();
    }

    @Quando("^clico no botão Search$")
    public void clico_no_botão_Search() {
        carreiraPages.clicarBtnSearch();
    }

    @Quando("^clico no botão READ MORE$")
    public void clico_no_botão_READ_MORE() {
        carreiraPages.clicarBtnReadMore();
    }

    @Quando("^preencho os campos obrigatórios$")
    public void preencho_os_campos_obrigatórios() {
        carreiraPages.preencherNome();
        carreiraPages.preencheSobrenome();
        carreiraPages.preencheEmail();
        carreiraPages.preencheLinkedin();
        carreiraPages.dropdownPais();
        carreiraPages.dropdownInicio();
    }

    @Quando("^adiciono o arquivo$")
    public void adiciono_o_arquivo() {
        carreiraPages.uploadCV("C:\\Users\\thiag\\OneDrive\\Documentos\\Lyon\\00. Cursos\\99. Treinando automação\\Encora\\Encora\\Thiago Lyon CV.docx");
    }

    @Quando("^marco os checklist legal$")
    public void marco_os_checklist_legal() {
        carreiraPages.clicarBtnLegal();
    }

    @Quando("^marco o checklist termo$")
    public void marco_o_checklist_termo() {
        carreiraPages.clicarBtnTerms();
    }

    @Quando("^clico em no botão Submit$")
    public void clico_em_no_botão_Submit() {
        carreiraPages.clicarBtnSubmit();
    }

    @Então("^a aplicação deve exibir a mensagem Thanks for your application!$")
    public void a_aplicação_deve_exibir_a_mensagem_Thanks_for_your_application()  {
//        A proteção do CAPTCHA bloqueia a automação
    }
}
