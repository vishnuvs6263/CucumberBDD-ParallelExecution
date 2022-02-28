package cucumber.steps;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import screens.LoginScreen;


public class BaseSteps {
    public static LoginScreen        loginscreen;


    public void setupScreens(AndroidDriver<MobileElement> driver) {
    	loginscreen = new LoginScreen(driver);

    }
}