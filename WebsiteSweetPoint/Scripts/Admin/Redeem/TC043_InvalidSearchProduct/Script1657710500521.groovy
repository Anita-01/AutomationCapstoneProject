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

WebUI.callTestCase(findTestCase('Admin/Redeem/TC033_ViewDetailRedeem'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Website/DashboardAdmin/Redeem/E-Money/menuEMoney'))

WebUI.setText(findTestObject('Website/DashboardAdmin/Redeem/CashOut/searchProduk'), 'E-Money')

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('E-Money', true)

WebUI.refresh()

WebUI.click(findTestObject('Website/DashboardAdmin/Redeem/PageRedeem/redeemMenu'))

WebUI.click(findTestObject('Website/DashboardAdmin/Redeem/CashOut/menuCashOut'))

WebUI.setText(findTestObject('Website/DashboardAdmin/Redeem/CashOut/searchProduk'), 'Cash')

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('Cash', true)

WebUI.refresh()

WebUI.click(findTestObject('Website/DashboardAdmin/Redeem/PageRedeem/redeemMenu'))

WebUI.click(findTestObject('Website/DashboardAdmin/Redeem/Pulsa/menuPulsa'))

WebUI.setText(findTestObject('Website/DashboardAdmin/Redeem/CashOut/searchProduk'), 'Pulsa')

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('Pulsa', true)

WebUI.refresh()

WebUI.click(findTestObject('Website/DashboardAdmin/Redeem/PageRedeem/redeemMenu'))

WebUI.click(findTestObject('Website/DashboardAdmin/Redeem/PaketData/menuPaketData'))

WebUI.setText(findTestObject('Website/DashboardAdmin/Redeem/CashOut/searchProduk'), 'Paket Data')

WebUI.waitForPageLoad(3)

WebUI.verifyTextPresent('Paket Data', true)

WebUI.waitForPageLoad(5)
