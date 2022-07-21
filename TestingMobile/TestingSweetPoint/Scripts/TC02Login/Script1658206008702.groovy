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

Mobile.startApplication('C:\\Users\\ACER\\Downloads\\app-release (1).apk', true)

Mobile.tap(findTestObject('Object Repository/NewLogin/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/NewLogin/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/NewLogin/android.widget.Button (1)'), 0)

Mobile.tap(findTestObject('Object Repository/NewLogin/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/NewLogin/android.widget.EditText - Username'), 0)

Mobile.setText(findTestObject('Object Repository/NewLogin/android.widget.EditText - Username'), 'ani18', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/NewLogin/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/NewLogin/android.widget.EditText - PasswordPassword'), 'Ani18', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/NewLogin/android.widget.Button (2)'), 0)
