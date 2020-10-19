package com.example.ioappium

import io.appium.java_client.android.AndroidDriver
import org.junit.BeforeClass
import org.openqa.selenium.By

import org.openqa.selenium.browserlaunchers.CapabilityType
import org.openqa.selenium.remote.DesiredCapabilities
import org.testng.annotations.AfterClass

import org.testng.annotations.Test

import java.net.URL
import java.util.concurrent.TimeUnit

class ExampleUnitTest {

    var capabilities: DesiredCapabilities = DesiredCapabilities()
    var driver: AndroidDriver = AndroidDriver(URL(""),null)

    @BeforeClass
    fun setCapabilities()
    {
        /*var driver: AndroidDriver
        var capabilities: DesiredCapabilities*/

        //capabilities = DesiredCapabilities()

        capabilities.setCapability("deviceName", "Pixel 2 XL API 27")
        capabilities.setCapability("platformVersion", "8.1")
        capabilities.setCapability("platformName", "Android")
        capabilities.setCapability("appPackage", "com.example.ioappium")
        capabilities.setCapability("appActivity", "com.example.ioappium.ui.SplashActivity")

        driver = AndroidDriver(URL("http://0.0.0.0:4723/wd/hub"), capabilities)
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS)
    }

    @Test
    fun testApp()
    {
        driver.findElementById("com.example.ioappium:id/tvName")

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[1]/android.widget.TextView")


        //driver.findElementByClassName("com.example.ioappium/edName").sendKeys("Vusi")
        //driver.findElementById("com.example.ioappium/edName").sendKeys("Vusi")
        driver.findElement(By.id("com.example.ioappium:id/edName")).sendKeys("Vusi")
        //driver.findElementById("com.example.ioappium/edName").clear()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout[1]/" +
                "android.widget.EditText").sendKeys("Vusi")


        driver.findElementById("com.example.ioappium/tvSurname")
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[2]/android.widget.TextView").sendKeys()


        //driver.findElementById("com.example.ioappium/EdSurname")
        driver.findElementByClassName("com.example.ioappium/edSurname").sendKeys("Ngwenya")
        //driver.findElementByClassName("com.example.ioappium/edSurname").clear()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LineaLayout[2]/android.widget.EditText").sendKeys("Ngwenya")

        driver.findElementById("com.example.ioappium/tvUsername")
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[3]/android.widget.TextView")

        //driver.findElementById("com.example.ioappium/edUsername")
        driver.findElementById("com.example.ioappium/edUsername").sendKeys("Vusimuzi")
        //driver.findElementById("com.example.ioappium/edUsername").clear()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[3]/android.widget.EditText").sendKeys("Vusimuzi")

        driver.findElementById("com.example.ioappium/tvPassword")
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[4]/android.widget.TextView")


        driver.findElementByClassName("com.example.ioappium/edPassword").sendKeys("Vusi@1")
        //driver.findElementByClassName("com.example.ioappium/edPassword").clear()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/"+
                "android.view.ViewGroup/android.widget.FrameLayout[2]"+
                "android.widget.RelativeLayout/android.widget.LinearLayout"+
                "android.widget.LinearLayout[4]/android.widget.EditText").sendKeys("Vusi@1")

        driver.findElementById("com.example.ioappium/btnRegister").click()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/"+
                "android.widget.LinearLayout/android.widget.FrameLayout"+
                "android.view.ViewGroup/android.view.FrameLayout[2]/"+
                "android.widget.RelativeLayout/android.widget.LinearLayout"+
                "android.widget.LinearLayout[5]/android.widget.Button").click()


       // driver.close()


        /*var driver: AndroidDriver
        var capabilities: DesiredCapabilities

        capabilities = DesiredCapabilities()

        capabilities.setCapability("deviceName", "Pixel 2 XL API 27")
        capabilities.setCapability("platformVersion", "8.1")
        capabilities.setCapability("platformName", "Android")
        capabilities.setCapability("appPackage", "com.example.ioappium")
        capabilities.setCapability("appActivity", "com.example.ioappium.ui.SplashActivity")

        driver = AndroidDriver(URL("http://0.0.0.0:4723/wd/hub"), capabilities)
        driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS)


        driver.findElementById("com.example.ioappium:id/tvName")
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[1]/android.widget.TextView")



        //driver.findElementById("com.example.ioappium/edName")
        driver.findElementByClassName("com.example.ioappium/edName").sendKeys("Vusi")
        driver.findElementById("com.example.ioappium/edName").clear()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout[1]/" +
                "android.widget.EditText")


        driver.findElementById("com.example.ioappium/tvSurname")
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[2]/android.widget.TextView")


        //driver.findElementById("com.example.ioappium/EdSurname")
        driver.findElementByClassName("com.example.ioappium/edSurname").sendKeys("Ngwenya")
        driver.findElementByClassName("com.example.ioappium/edSurname").clear()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LineaLayout[2]/android.widget.EditText")

        driver.findElementById("com.example.ioappium/tvUsername")
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[3]/android.widget.TextView")

        //driver.findElementById("com.example.ioappium/edUsername")
        driver.findElementById("com.example.ioappium/edUsername").sendKeys("Vusimuzi")
        driver.findElementById("com.example.ioappium/edUsername").clear()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/" +
                "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
                "android.widget.RelativeLayout/android.widget.LinearLayout/" +
                "android.widget.LinearLayout[3]/android.widget.EditText")

       driver.findElementById("com.example.ioappium/tvPassword")
       driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
               "android.widget.LinearLayout/android.widget.FrameLayout/" +
               "android.view.ViewGroup/android.widget.FrameLayout[2]/" +
               "android.widget.RelativeLayout/android.widget.LinearLayout/" +
               "android.widget.LinearLayout[4]/android.widget.TextView")


        driver.findElementByClassName("com.example.ioappium/edPassword").sendKeys("Vusi@1")
        driver.findElementByClassName("com.example.ioappium/edPassword").clear()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/" +
                "android.widget.LinearLayout/android.widget.FrameLayout/"+
                "android.view.ViewGroup/android.widget.FrameLayout[2]"+
                "android.widget.RelativeLayout/android.widget.LinearLayout"+
                "android.widget.LinearLayout[4]/android.widget.EditText")

        driver.findElementById("com.example.ioappium/btnRegister").click()

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/"+
                "android.widget.LinearLayout/android.widget.FrameLayout"+
                "android.view.ViewGroup/android.view.FrameLayout[2]/"+
                "android.widget.RelativeLayout/android.widget.LinearLayout"+
                "android.widget.LinearLayout[5]/android.widget.Button")


        driver.close()*/
    }

    @AfterClass
    fun tearDown()
    {
        driver.quit()
    }
}
