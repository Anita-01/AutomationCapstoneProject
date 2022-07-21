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

for (int i = 1; i <= 15; i++) {
    WebUI.callTestCase(findTestCase('USER/Dashboard/Account/TC009_ViewBiodata'), [:], FailureHandling.STOP_ON_FAILURE)

    WebUI.setText(findTestObject('Website/ObjectInformasiAkun/namalengkapField'), findTestData('DataInformationAccount').getValue(
            1, i))

    WebUI.setText(findTestObject('Website/ObjectInformasiAkun/addressField'), findTestData('DataInformationAccount').getValue(
            2, i))

    WebUI.setText(findTestObject('Website/ObjectInformasiAkun/phoneField'), findTestData('DataInformationAccount').getValue(
            3, i))

    WebUI.click(findTestObject('Website/ObjectInformasiAkun/buttonSave'))

    if (i == 1) {
        WebUI.verifyElementPresent(findTestObject('Website/ObjectInformasiAkun/verifyChangeData'), 0)

        WebUI.click(findTestObject('Website/ObjectInformasiAkun/buttonOK'))
    } else {
        WebUI.waitForAlert(3)
    }
}

