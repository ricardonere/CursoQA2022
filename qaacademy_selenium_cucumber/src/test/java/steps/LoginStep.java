package steps;

import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.CadastroPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginStep {
WebDriver driver;
CadastroPage cadastroPage;
LoginPage loginPage;
    @Before
    public void before(){
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.SECONDS);
    cadastroPage = new CadastroPage(driver);
    loginPage = new LoginPage(driver);
    }
    @Dado("que esteja na pagina inicial: {string}")
    public void queEstejaNaPaginaInicial(String url) {
        driver.get(url);
    }

    @Quando("preencher email: {string} e senha: {string}")
    public void preencherEmailESenha(String email, String senha) {
        loginPage.preencherEmail(email);
        loginPage.preencherSenha(senha);
    }

    @E("clicar em fazer login")
    public void clicarEmFazerLogin() {
        loginPage.clicarAcessar();
    }

    @Entao("valido que a pagina de login foi carregada com sucesso")
    public void validoQueAPaginaDeLoginFoiCarregada() {
        Assert.assertTrue(driver.getCurrentUrl().contains("/homepage"));

    }

    @Dado("possuo cadastro")
    public void possuoCadastro() {
        cadastroPage.clicarRegistrar();
        cadastroPage.preencherEmail("teste@teste.com.br");
        cadastroPage.preencherNome("QA Academy");
        cadastroPage.preencherSenha("teste");
        cadastroPage.preencherConfirmacaoSenha("teste");
        cadastroPage.clicarEmCriarComSaldo();
        cadastroPage.clicarCadastrar();
        cadastroPage.clicarFechar();
    }
}
