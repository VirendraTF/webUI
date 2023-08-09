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

WebUI.navigateToUrl('https://techforceglobal.com/')

WebUI.click(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/a_Accept'))

WebUI.click(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/input_next_submit'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/label_Please enter first name'))

println(WebUI.getText(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/label_Please enter first name')))

WebUI.verifyElementVisible(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/label_Please enter last name'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/label_Please enter a valid email'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/label_Please enter phone number'))

WebUI.verifyElementVisible(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/label_Please fill the required field'))

println(WebUI.getText(findTestObject('Object Repository/KF_TC3/Page_Techforce Global  Web, Software Develo_55f67c/label_Please fill the required field_1')))

WebUI.closeBrowser()

