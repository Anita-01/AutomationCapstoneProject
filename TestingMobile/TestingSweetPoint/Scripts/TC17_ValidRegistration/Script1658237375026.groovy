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

Mobile.tap(findTestObject('Object Repository/Registration/android.view.View (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (3)'), 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - Name'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - Name (1)'), 'anita', 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - Username'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - Username (1)'), 'Anita12', 0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - Email (1)'), 'anitasiagian6@gmail.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - PasswordPassword'), 'anitasiagian123', 
    0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - Address'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - Address (1)'), 'NarumondaIII', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.EditText - Phone'), 0)

Mobile.setText(findTestObject('Object Repository/Registration/android.widget.EditText - Phone (1)'), '082234567892', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Registration/android.widget.Button (4)'), 5)

