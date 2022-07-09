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

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Electricity billing Page/p_pay bills'))

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/button_Cable'))

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_Service_rc_select_0'))

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/div_GOTV'))

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_Plan_rc_select_1'))

WebUI.setText(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_Plan_rc_select_1'), 'supa')

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/div_GOtv Supa'))

WebUI.setText(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_Smart Card Number_smartCard'), '7032410743')

WebUI.delay(3)

WebUI.setText(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_Phone Number_phoneNumber'), '08807970777')

WebUI.click(findTestObject('Dashboard/Transfer Page/Dashboard Page/button_Continue 1'))

WebUI.click(findTestObject('Dashboard/Transfer Page/Dashboard Page/Button_continue for transaction summary'))

WebUI.setEncryptedText(findTestObject('Dashboard/Transfer Page/Dashboard Page/input_pin 1'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Dashboard/Transfer Page/Dashboard Page/input_pin 2'), 'EZJce3R/zYw=')

WebUI.setEncryptedText(findTestObject('Dashboard/Transfer Page/Dashboard Page/input_pin 3'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Dashboard/Transfer Page/Dashboard Page/input_pin 4'), 'abkeNdhXnEA=')

WebUI.click(findTestObject('Dashboard/Transfer Page/Dashboard Page/Button_Continue for pin'))

WebUI.closeBrowser()

