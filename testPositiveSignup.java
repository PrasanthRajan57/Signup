package signup;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class testPositiveSignup extends SignupTest{
	@Test
    public void PositiveSignup() throws IOException {
        driver.get("https://example.com/signup");

        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Prashu");

        WebElement lastName = driver.findElement(By.id("last_name"));
        lastName.sendKeys("Test");
        
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("Test57@yopmail.com");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("Test@123");

        WebElement confirmPassword = driver.findElement(By.id("confirm_password"));
        confirmPassword.sendKeys("Test@123");

        WebElement termsCheckbox = driver.findElement(By.id("terms_checkbox"));
        termsCheckbox.click();

        WebElement signupButton = driver.findElement(By.id("signup_button"));
        signupButton.click();

        WebElement successMessage = driver.findElement(By.id("success_message"));
        Assert.assertEquals("Signup Successful", successMessage.getText());

        captureScreenshot("PositiveSignup");
    }
}
