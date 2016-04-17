import ohtu.*
import ohtu.services.*
import ohtu.data_access.*
import ohtu.domain.*
import ohtu.io.*
import org.openqa.selenium.*
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

description """A new user account can be created 
              if a proper unused username 
              and a proper password are given"""

scenario "creation succesfull with correct username and password", {
    given 'command new user is selected', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));       
        element.click();   
    }
 
    when 'a valid username and password are entered', {
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdfzxcv");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf1234");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("asdf1234");
        element.submit();
    }

    then 'new user is registered to system', {
      driver.getPageSource().contains("Welcome to Ohtu App!").shouldBe true
    }
}

scenario "can login with succesfully generated account", {
    given 'command new user is selected', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));       
        element.click();   
    }
 
    when 'a valid username and password are entered', {
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdfqwerty");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf1234");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("asdf1234");
        element.submit();
    }

    then  'new credentials allow logging in to system', {
        element = driver.findElement(By.linkText("continue to application mainpage"));       
        element.click();
        element = driver.findElement(By.linkText("logout"));       
        element.click();

        element = driver.findElement(By.linkText("login"));       
        element.click();
        
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdfqwerty");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf1234");

        element.submit();
        driver.getPageSource().contains("Welcome to Ohtu Application!").shouldBe true
    }
}

scenario "creation fails with correct username and too short password", {
    given 'command new user is selected', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));       
        element.click();   
    }
    when 'a valid username and too short password are entered', {
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdf2");
        element = driver.findElement(By.name("password"));
        element.sendKeys("a1");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("a1");
        element.submit();
    }
    then 'new user is not be registered to system', {
       driver.getPageSource().contains("Welcome to Ohtu App!").shouldBe false
    }
}

scenario "creation fails with correct username and pasword consisting of letters", {
    given 'command new user is selected', {
       driver = new HtmlUnitDriver();
        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));       
        element.click();   
    }
    when 'a valid username and password consisting of letters are entered', {
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdfqwerty2");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdfghjkl");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("asdfghjkl");
        element.submit();
    }
    then 'new user is not be registered to system', {
       driver.getPageSource().contains("Welcome to Ohtu App!").shouldBe false
    }
}

scenario "creation fails with too short username and valid pasword", {
    given 'command new user is selected', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));       
        element.click();   
    }
    when 'a too sort username and valid password are entered', {
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdf");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf1234");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("asdf1234");
        element.submit();
    }
    then 'new user is not be registered to system', {
       driver.getPageSource().contains("Welcome to Ohtu App!").shouldBe false
    }
}

scenario "creation fails with already taken username and valid pasword", {
    given 'command new user is selected', {
        driver = new HtmlUnitDriver();
        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));       
        element.click();   
    }
    when 'a already taken username and valid password are entered', {
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdf3");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf1234");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("asdf1234");
        element.submit();
        element = driver.findElement(By.linkText("continue to application mainpage"));       
        element.click();
        element = driver.findElement(By.linkText("logout"));       
        element.click();
        element = driver.findElement(By.linkText("register new user"));       
        element.click();  
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdf3");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf1234");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("asdf1234");
        element.submit();
    }
    then 'new user is not be registered to system', {
       driver.getPageSource().contains("Welcome to Ohtu App!").shouldBe false
    }
}

scenario "can not login with account that is not succesfully created", {
    given 'command new user is selected', {
       driver = new HtmlUnitDriver();
        driver.get("http://localhost:8090");
        element = driver.findElement(By.linkText("register new user"));       
        element.click();  
    }
    when 'a invalid username/password are entered', {
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdf");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf1234");
        element = driver.findElement(By.name("passwordConfirmation"));
        element.sendKeys("asdf1234");
        element.submit();
        element = driver.findElement(By.linkText("back to home"));
        element.click();
    }
    then  'new credentials do not allow logging in to system', {
        element = driver.findElement(By.linkText("login"));
        element.click();
        element = driver.findElement(By.name("username"));
        element.sendKeys("Asdf");
        element = driver.findElement(By.name("password"));
        element.sendKeys("asdf1234");
        element = driver.findElement(By.name("login"));
        element.submit();
        driver.getPageSource().contains("Welcome to Ohtu Application!").shouldBe false
    }
}