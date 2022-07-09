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

WebUI.openBrowser('https://alpha.vpay.africa/')

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Personal Details Page/button_Create free account to Sign up'))

WebUI.setText(findTestObject('Account Management Page/VPay Onboarding/Personal Details Page/input_First Name'), 
    'Franklin')

WebUI.setText(findTestObject('Account Management Page/VPay Onboarding/Personal Details Page/input_Last Name'), 
    'Emeka')

WebUI.setText(findTestObject('Account Management Page/VPay Onboarding/Personal Details Page/input_Phone Number'), 
    '01102090987')

WebUI.setText(findTestObject('Account Management Page/VPay Onboarding/Personal Details Page/input_Email Address'), 
    'tehi@givmail.com')

WebUI.setEncryptedText(findTestObject('Account Management Page/VPay Onboarding/Personal Details Page/input_Password'), 
    'I8u4Wc67C3w82E5uRGQvyQ==')

WebUI.setEncryptedText(findTestObject('Account Management Page/VPay Onboarding/Personal Details Page/input_Confirm Password'), 
    'I8u4Wc67C3w82E5uRGQvyQ==')

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Personal Details Page/button_Create My Account'))

WebUI.setText(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/input_Legal Business Name'), 
    'Ekens Ventures')

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/Input_Click to display Buisness industry list'))

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/div_ Select Business Industry Automobile Auto Part Retailers'))

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/input_Click to display State list'))

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/div_Select State Anambra'))

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/input_Click to display LGA'))

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/div_Select LGA Anambra West'))

WebUI.setText(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/input_Street Address'), 
    'Ekems street off 123 road')

WebUI.click(findTestObject('Account Management Page/VPay Onboarding/Business Account Details Page/button_Continue'))

