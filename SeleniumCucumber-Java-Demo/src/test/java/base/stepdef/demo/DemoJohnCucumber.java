package base.stepdef.demo;

import base.pageobjects.Google_HomePage;
import base.testbase.TestBase;
import io.cucumber.java.en.Then;

public class DemoJohnCucumber {

    private final TestBase actions;
    private final Google_HomePage google_homePage;

    public DemoJohnCucumber(TestBase actions, Google_HomePage google_homePage) {
        this.actions = actions;
        this.google_homePage = google_homePage;
    }

    @Then("run scenario Chrome_Test_1")
    public void scenario_chrometest1() throws Exception{
        actions.navigate(actions.browserType);
        actions.enter(google_homePage.google_HomePage_txtbox_searchbar, "cucumber");
        actions.click(google_homePage.google_HomePage_btn_GoogleSearch);
        actions.verifyVisibility("//h2/span[text()='Cucumber']", true);
    }

    @Then("run scenario Chrome_Test_2")
    public void scenario_chrometest2() throws Exception{
        actions.navigate(actions.browserType);
        actions.enter(google_homePage.google_HomePage_txtbox_searchbar, "apple");
        actions.click(google_homePage.google_HomePage_btn_GoogleSearch);
        actions.verifyVisibility("//h2/span[text()='Apple']", true);
    }

    @Then("run scenario Edge_Test_1")
    public void scenario_edgetest1() throws Exception{
        actions.navigate(actions.browserType);
        actions.enter(google_homePage.google_HomePage_txtbox_searchbar, "selenium");
        actions.click(google_homePage.google_HomePage_btn_GoogleSearch);
        actions.verifyVisibility("//h2/span[text()='Selenium']", true);
    }

    @Then("run scenario Edge_Test_2")
    public void scenario_edgetest2() throws Exception{
        actions.navigate(actions.browserType);
        actions.enter(google_homePage.google_HomePage_txtbox_searchbar, "java");
        actions.click(google_homePage.google_HomePage_btn_GoogleSearch);
        actions.verifyVisibility("//h2/span[text()='Java']", true);
    }
}
