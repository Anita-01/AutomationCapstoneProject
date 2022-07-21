import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

for (int i = 1; i <= 7; i++) {
    WebUI.openBrowser('')

    WebUI.maximizeWindow()

    WebUI.navigateToUrl(GlobalVariable.WebURLUser)

    WebUI.click(findTestObject('Website/ObjectLogin/btn_login'), FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Website/ObjectLogin/fieldUsername'), findTestData('DataLoginUser').getValue(1, i))

    WebUI.setText(findTestObject('Website/ObjectLogin/fieldPassword'), findTestData('DataLoginUser').getValue(1, i))

    WebUI.click(findTestObject('Website/ObjectLogin/btn_loginweb'))

    if (i == 1 || i == 2) {
        WebUI.verifyTextPresent('Username atau password salah!', true)

        WebUI.click(findTestObject('Website/DashboardAdmin/Login/buttonOK'))

        WebUI.waitForPageLoad(5)
    } else {
        WebUI.waitForPageLoad(5)
    }
}

