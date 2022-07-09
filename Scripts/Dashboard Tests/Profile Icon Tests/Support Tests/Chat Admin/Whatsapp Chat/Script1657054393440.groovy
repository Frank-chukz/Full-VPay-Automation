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

WebUI.navigateToUrl('https://alpha.vpay.africa/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Account Management Page/VPay Merchant Login/Landing Page/a_Login Link'))

WebUI.setText(findTestObject('Account Management Page/VPay Merchant Login/Landing Page/input_Email Address'), 'tehi@givmail.com')

WebUI.setEncryptedText(findTestObject('Account Management Page/VPay Merchant Login/Landing Page/input_Password'), 'TqMLrzn8uxI8RIpxLtjiDA==')

WebUI.click(findTestObject('Account Management Page/VPay Merchant Login/Landing Page/button_Login to my account'))

WebUI.click(findTestObject('Dashboard/Transfer Page/Dashboard Page/img_close tour'))

WebUI.click(findTestObject('temp/Profile avatar'))

WebUI.click(findTestObject('temp/span_Support'))

WebUI.delay(3)

WebUI.click(findTestObject('Dashboard/Profile Page/Support Page/Chat Admin Page/Email chat/Get in touch drill down'))

WebUI.delay(4)

WebUI.click(findTestObject('Dashboard/Profile Page/Support Page/Chat Admin Page/Whatsapp chat/Send whatsapp message'))

WebUI.switchToWindowIndex(1)

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Dashboard/Profile Page/Support Page/Chat Admin Page/Whatsapp chat/Page_Share on WhatsApp/a_Continue to Chat'))

 if  (WebUI.waitForAlert(4)) {
	 
	 WebUI.delay(4)
 
	 WebUI.acceptAlert()

 }
 

WebUI.switchToWindowIndex(0)

WebUI.click(findTestObject('Dashboard/Profile Page/Log Out page/Dashboard - Logout/Profile avatar'))

WebUI.click(findTestObject('Dashboard/Profile Page/Log Out page/Dashboard - Logout/span_Click Log Out'))

WebUI.closeBrowser()

