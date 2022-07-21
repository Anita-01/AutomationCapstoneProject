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

WebUI.click(findTestObject('Website/DashboardAdmin/Customer/editdata/editName'))

WebUI.click(findTestObject('Website/DashboardAdmin/Customer/editdata/buttonEditData'))

int data = 4;
for (i=0; i<data;i++) {
	if (i == 1) {
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editData'), 'Jung Hae In')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editAddress'), 'Balige')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editPhone'), '08723456272')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editEmail'), 'junghaeiin@gmail.com')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editPassword'), 'anita123')
		
		WebUI.click(findTestObject('Website/DashboardAdmin/Customer/editdata/buttonSave'))
		
		WebUI.verifyElementPresent(findTestObject('Website/DashboardAdmin/Customer/editdata/alertSuccess'), 0)
		
		WebUI.click(findTestObject('Website/DashboardAdmin/Customer/editdata/buttonOK'))
		
		WebUI.refresh()
	} else if (i == 2) {
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editData'), 'Jung Hae In')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editAddress'), 'Balige')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editPhone'), '08723456272')
		
		WebUI.click(findTestObject('Website/DashboardAdmin/Customer/editdata/buttonSave'))
		
		WebUI.refresh()
	} else if (i == 3){
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editData'), 'Jung Hae In')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editAddress'), 'Balige')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editPhone'), ' ')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editEmail'), ' ')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editPassword'), 'anita123')
		
		WebUI.click(findTestObject('Website/DashboardAdmin/Customer/editdata/buttonSave'))
		
		
		
		WebUI.refresh()
		
	} else {
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editData'), 'Jung Hae In')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editAddress'), 'Balige')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editPhone'), '08723456272')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editEmail'), 'junghaeiin@gmail.com')
		
		WebUI.setText(findTestObject('Website/DashboardAdmin/Customer/editdata/editPassword'), 'anita123')
		
		WebUI.click(findTestObject('Website/DashboardAdmin/Customer/editdata/buttonSave'))
		
		WebUI.verifyElementPresent(findTestObject('Website/DashboardAdmin/Customer/editdata/alertSuccess'), 0)
		
		WebUI.refresh()
	
	}
	
	
	
}



