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

for (int i = 1; i <= 12; i++) {
	WebUI.openBrowser('')
	
	WebUI.maximizeWindow()
	
	WebUI.navigateToUrl('https://sweetpoint.netlify.app/')
	
	WebUI.verifyElementText(findTestObject('Website/ObjectRegister/verifylaman'), 'Sweet Point')
	
	WebUI.click(findTestObject('Website/ObjectRegister/btn_signup'))
	
	WebUI.setText(findTestObject('Website/ObjectRegister/fieldNamaLengkap'), findTestData('DataRegistration').getValue(1, i))
	
	WebUI.setText(findTestObject('Website/ObjectRegister/fieldUsername'), findTestData('DataRegistration').getValue(2, i))
	
	WebUI.setText(findTestObject('Website/ObjectRegister/fieldAlamat'), findTestData('DataRegistration').getValue(3, i))
	
	WebUI.setText(findTestObject('Website/ObjectRegister/fieldNomorTelepon'), findTestData('DataRegistration').getValue(4, i))
	
	WebUI.setText(findTestObject('Website/ObjectRegister/fieldEmail'), findTestData('DataRegistration').getValue(5, i))
	
	WebUI.setText(findTestObject('Website/ObjectRegister/fieldPassword'), findTestData('DataRegistration').getValue(6, i))
	
	WebUI.click(findTestObject('Website/ObjectRegister/btn_BuatAkun'))
	
	if (i == 1) {
	
	WebUI.waitForAlert(3)
	
	WebUI.verifyTextPresent('User berhasil dibuat!', true)
} else {
	WebUI.waitForAlert(3)
}

}

