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

WebUI.click(findTestObject('Dashboard/Airtime Page/data/data button'))

WebUI.click(findTestObject('Dashboard/Airtime Page/data/input_Network_rc_select_8'))

WebUI.click(findTestObject('Dashboard/Airtime Page/Airtime/div_MTN'))

WebUI.setText(findTestObject('Dashboard/Airtime Page/Airtime/enter phpone number'), '09989898999')

WebUI.click(findTestObject('Dashboard/Airtime Page/data/input_Data Plans_rc_select_26'))

WebUI.click(findTestObject('Dashboard/Airtime Page/data/mtn data 6gb'))

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/button_Continue 1'))

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/Button_continue for transaction summary'))

WebUI.setEncryptedText(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_pin 1'), 'YC0926CP/9Y=')

WebUI.setEncryptedText(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_pin 2'), 'EZJce3R/zYw=')

WebUI.setEncryptedText(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_pin 3'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/input_pin 4'), 'abkeNdhXnEA=')

WebUI.click(findTestObject('Dashboard/Pay Bills Page/Cable Tv Page/Button_Continue for pin'))

WebUI.closeBrowser()

