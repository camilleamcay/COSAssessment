package io.cucumber.glue;

import io.cucumber.java.en.Given;
import io.cucumber.core.Context;
import io.cucumber.core.Manager;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class Home extends Context {

  public Home(Manager manager) {
    super(manager);
  }

  @Given("^the page under test is '(.+)'$")
  public void user_lands(String url) {
    //get driver to get URL
    manager.getDriver().get(url);
    System.out.print("You are at "+ url);
  }


}