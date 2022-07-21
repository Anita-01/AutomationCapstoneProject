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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://sweetpoint.netlify.app/')

WebUI.verifyElementText(findTestObject('Website/ObjectRegister/verifylaman'), 'Sweet Point')

WebUI.click(findTestObject('Website/ObjectRegister/btn_signup'))

WebUI.setText(findTestObject('Website/ObjectRegister/fieldNamaLengkap'), 'Haechan NCT')

WebUI.setText(findTestObject('Website/ObjectRegister/fieldUsername'), 'heechan123')

WebUI.setText(findTestObject('Website/ObjectRegister/fieldAlamat'), 'Jl Narumonda III')

WebUI.setText(findTestObject('Website/ObjectRegister/fieldNomorTelepon'), '082249352965')

WebUI.setText(findTestObject('Website/ObjectRegister/fieldEmail'), 'haechan13@gmail.com')

WebUI.setText(findTestObject('Website/ObjectRegister/fieldPassword'), 'jaehyun123')

WebUI.click(findTestObject('Website/ObjectRegister/btn_BuatAkun'))

WebUI.waitForAlert(3)

WebUI.verifyTextPresent('User berhasil dibuat!', true)

WebUI.waitForPageLoad(3)

