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

for (int i = 1; i <= 11; i++) {
WebUI.callTestCase(findTestCase('USER/Authentication/DataLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Website/ObjectLogin/iconProfile'))

WebUI.click(findTestObject('Website/DashboardAdmin/AccountSetting (1)/settingAccount'))

WebUI.verifyElementText(findTestObject('Website/DashboardAdmin/AccountSetting (1)/verifyAccountSetting'), 'Pengaturan Akun')

WebUI.setText(findTestObject('Website/DashboardAdmin/AccountSetting (1)/Username'), findTestData('DatasettingAccount').getValue(1, i))

WebUI.setText(findTestObject('Website/DashboardAdmin/AccountSetting (1)/Email'), findTestData('DatasettingAccount').getValue(2, i))

WebUI.setText(findTestObject('Website/DashboardAdmin/AccountSetting (1)/Password'), findTestData('DatasettingAccount').getValue(3, i))

WebUI.setText(findTestObject('Website/DashboardAdmin/AccountSetting (1)/confirmPassword'), findTestData('DatasettingAccount').getValue(4, i))

WebUI.click(findTestObject('Website/DashboardAdmin/AccountSetting (1)/buttonSave'))
}
