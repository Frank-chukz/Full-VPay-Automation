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

WebUI.openBrowser('alpha.vpay.africa')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Account Management Page/VPay Merchant Login/Landing Page/a_Login Link'))

WebUI.setText(findTestObject('Account Management Page/VPay Merchant Login/Landing Page/input_Email Address'), 'qa101_t120lm@givmail.com')

WebUI.setEncryptedText(findTestObject('Account Management Page/VPay Merchant Login/Landing Page/input_Password'), 'I8u4Wc67C3w82E5uRGQvyQ==')

WebUI.click(findTestObject('Account Management Page/VPay Merchant Login/Landing Page/button_Login to my account'))

WebUI.click(findTestObject('Dashboard/Transfer Page/Dashboard Page/img_close tour'))

WebUI.click(findTestObject('Upload ID card/span_Compliance'))

WebUI.click(findTestObject('Upload ID card/p_Clik Personal Information Documents'))

WebUI.click(findTestObject('Upload ID card/p_Upload Drivers License, Voters Card, NIN card, or National ID Card'))

WebUI.verifyTextPresent('Upload the Front of your Identity Card', false)

WebUI.uploadFile(findTestObject('Compliance 2/Page_VPay  Compliance/input_Select File_custom-file-input p-absolute'), 'C:\\\\Users\\\\user\\\\Pictures\\\\diamond 3.jpg')

WebUI.click(findTestObject('Compliance 2/Page_VPay  Compliance/button_Upload'))

WebUI.verifyTextPresent('Upload the Back of your Identity Card', false)

WebUI.uploadFile(findTestObject('Upload ID card/input_Select File'), 'C:\\\\Users\\\\user\\\\Desktop\\\\Before now\\\\my sansung\\\\Snapchat\\\\20210305_172559.jpg')

WebUI.click(findTestObject('Compliance 2/Page_VPay  Compliance/button_Upload'))

WebUI.verifyTextPresent('Take A Clear Selfie Of Yourself Holding Your ID Card', false)

WebUI.click(findTestObject('Upload ID card/Page_VPay  Compliance/button_Capture yourseld holding id card'))

WebUI.click(findTestObject('Upload ID card/button_Retake Photo of yourseld holding Id card'))

WebUI.click(findTestObject('Upload ID card/Page_VPay  Compliance/button_Capture yourseld holding id card'))

WebUI.click(findTestObject('Compliance 2/Page_VPay  Compliance/button_Upload'))

WebUI.click(findTestObject('Upload ID card/button_Close Document list page'))

WebUI.delay(3)

WebUI.closeBrowser()

