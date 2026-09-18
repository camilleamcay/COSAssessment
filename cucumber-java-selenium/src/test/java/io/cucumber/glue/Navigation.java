package io.cucumber.glue;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.core.Context;
import io.cucumber.core.Manager;
import io.cucumber.pages.ReadLink;
import io.cucumber.pages.ReadLink.*;
import org.junit.Assert;

public class Navigation extends Context {

  public Navigation(Manager manager) {
    super(manager);
  }

  @Then("verify all links are correct")
  public void verifyLinks() {
    var content = new io.cucumber.pages.ReadLink(getDriver());
    Assert.assertEquals("content should ", true, content.checkList());
  }
}