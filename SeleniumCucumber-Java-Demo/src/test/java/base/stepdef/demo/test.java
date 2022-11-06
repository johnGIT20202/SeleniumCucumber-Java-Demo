package base.stepdef.demo;

import base.testbase.TestBase;
import io.cucumber.java.en.Then;

public class test {

    private final TestBase actions;

    public test(TestBase actions) {
        this.actions = actions;
    }

    //Disable @After in GlobalStepDef to run this scenario


    @Then("run scenario test_1")
    public void test1() throws Exception{
        System.out.println(actions.scenario + " " + actions.getCurrentTime());
    }

    @Then("run scenario test_2")
    public void test2() throws Exception{
        System.out.println(actions.scenario + " " + actions.getCurrentTime());
    }

    @Then("run scenario test_3")
    public void test3() throws Exception{
        System.out.println(actions.scenario + " " + actions.getCurrentTime());
    }

    @Then("run scenario test_4")
    public void test4() throws Exception{
        System.out.println(actions.scenario + " " + actions.getCurrentTime());
    }
}
