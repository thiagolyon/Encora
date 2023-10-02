package pages;

import org.openqa.selenium.By;
import runner.RunCucumber;

import static support.Commands.*;

public class CarreiraPages extends RunCucumber {

    private String URL = "https://www.encora.com";
    private By btnCareers = By.id("careers");
    private By preencheJob = By.id("keyword");
    private By btnSearch = By.xpath("/html/body/div[4]/section/div[2]/form/div[4]/*");
    private By btnReadMore = By.xpath("//div[@class='text-center link-container']//a[@class='button button-purple font-size-small px-1 py-half text-center weight-bold' and contains(text(), 'Read more')]");
    private By nome = By.id("firstname-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By sobrenome = By.id("lastname-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By email = By.id ("email-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By linkedin = By.id("linkedin-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By dropdownPais = By.id("country_selector-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By dropdownInicio = By.id("availability_to_start_working-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By uploadCV = By.id("document-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By btnLegal = By.id("LEGAL_CONSENT.subscription_type_70802668-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By btnTerms = By.id("LEGAL_CONSENT.processing-d278aac2-6b59-4e39-8856-8fc90c066bc6");
    private By btnSubmit = By.cssSelector("input[type='submit'].hs-button.primary.large[value='Submit']");

    public void acessarSiteEncora() {
        getDriver(System.getProperty("browser")).get(URL);
    }

    public void clicarBtnCareers() {
        clickElement(btnCareers);
    }

    public void preencherJob() {
        scroll(2500);
        sleep(1000);
        fillField(preencheJob, "Test Automation");
    }

    public void clicarBtnSearch() {
        clickElement(btnSearch);
    }

    public void clicarBtnReadMore() {
        clickElement(btnReadMore);
    }

    public void preencherNome() {
        scroll(1050);
        fillField(nome, "Thiago Lyon");
    }

    public void preencheSobrenome() {
        fillField(sobrenome, "Nascimento");
    }

    public void preencheEmail() {
        fillField(email, "thiago.lyon.passos@gmail.com");
    }

    public void preencheLinkedin() {
        fillField(linkedin, "https://www.linkedin.com/in/thiagolyon");
    }

    public void dropdownPais() {
        clickElement(dropdownPais);
        fillField(dropdownPais, "Brazil");
        clickElement(nome);
    }

    public void dropdownInicio() {
        clickElement(dropdownInicio);
        fillField(dropdownInicio, "Immediately");
        clickElement(nome);
    }

    public void uploadCV(String file) {
        getDriver().findElement(uploadCV).sendKeys(file);
    }

    public void clicarBtnLegal() {
        clickElement(btnLegal);

    }

    public void clicarBtnTerms() {
        clickElement(btnTerms);
    }

    public void clicarBtnSubmit() {
        clickElement(btnSubmit);
    }

}
