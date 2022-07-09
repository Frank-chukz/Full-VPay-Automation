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

WebUI.click(findTestObject('Set up Payout Account Page/span_Settings link on dashboard'))

WebUI.click(findTestObject('Set up Payout Account Page/input_select Account Provider'))

WebUI.setText(findTestObject('Set up Payout Account Page/input_select Account Provider'), 'vfd')

WebUI.click(findTestObject('Set up Payout Account Page/div_VFD MICROFINANCE BANK'))

WebUI.setText(findTestObject('Set up Payout Account Page/input_Account Number'), '1000482169')

WebUI.click(findTestObject('Set up Payout Account Page/div_toggle keep funds in wallet'))

WebUI.click(findTestObject('Set up Payout Account Page/div_toggle keep funds in wallet'))

WebUI.click(findTestObject('Set up Payout Account Page/button_Save'))

WebUI.click(findTestObject('Set up Payout Account Page/span_Back to Dashboard 2'))

WebUI.closeBrowser()

