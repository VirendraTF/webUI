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

WebUI.click(findTestObject('Object Repository/Kat-Framework/Page_Techforce Global  Web, Software Develo_55f67c/a_Accept'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Kat-Framework/Page_Techforce Global  Web, Software Develo_55f67c/div_img srchttpstechforceglobal.comwp-conte_adca6f'))

'quick links\r\n'
WebUI.verifyElementVisible(findTestObject('Object Repository/Kat-Framework/Page_Techforce Global  Web, Software Develo_55f67c/div_Quick Links                            _20f640'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Kat-Framework/Page_Techforce Global  Web, Software Develo_55f67c/div_Have a Question                        _5b87a0'))

'contact now'
WebUI.verifyElementVisible(findTestObject('Object Repository/Kat-Framework/Page_Techforce Global  Web, Software Develo_55f67c/a_Contact Now'))

WebUI.closeBrowser()

