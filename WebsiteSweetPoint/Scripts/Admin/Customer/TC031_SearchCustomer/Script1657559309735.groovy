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

WebUI.callTestCase(findTestCase('Admin/Customer/TC028_ViewAllCustomer'), [:], FailureHandling.STOP_ON_FAILURE)

int a = 3 ;
for (data =0; data<a; data++) {
	if (data == 0) {	
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/searchCustomer'), 'Anita Siagian')
		WebUI.verifyTextPresent('Anita Siagian', true)
	} else if (data == 1) {
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/searchCustomer'), 'testing123')
		WebUI.verifyTextPresent('testing123', true)
	}else {
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/searchCustomer'), '__')
		WebUI.verifyTextPresent('0 ditemukan.', true)
	
}

}