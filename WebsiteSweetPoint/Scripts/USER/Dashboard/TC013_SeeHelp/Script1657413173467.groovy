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

WebUI.callTestCase(findTestCase('USER/Authentication/TC001_ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Website/ObjectLogin/iconProfile'))

WebUI.navigateToUrl('https://sweetpoint.netlify.app/bantuan')

WebUI.verifyElementText(findTestObject('Website/Help/verifyPageBantuan'), 'Hai ada yang bisa kami bantu ?')

WebUI.click(findTestObject('Website/Help/Help1'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Website/Help/Help2'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Website/Help/Help3'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Website/Help/Help4'))

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Website/Help/Help5'))

WebUI.waitForPageLoad(2)

