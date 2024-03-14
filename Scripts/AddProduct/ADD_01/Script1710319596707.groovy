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

WebUI.navigateToUrl('http://localhost:3000/login')

WebUI.setText(findTestObject('Object Repository/ADD_01/input_Login_email'), 'ykimtra22062003@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ADD_01/input_Email_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/ADD_01/button_Login'))

WebUI.click(findTestObject('Object Repository/ADD_01/button_Create'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ADD_01/select_Please select the categorybinh hoabt_36cbd2'), 
    '2', true)

WebUI.setText(findTestObject('Object Repository/ADD_01/input__name'), 'bát sư tràng an mẫu mã CHIKJOPL')

WebUI.setText(findTestObject('Object Repository/ADD_01/input__price'), '30000')

WebUI.setText(findTestObject('Object Repository/ADD_01/textarea__description'), 'dễ dàng lau chùi')

WebUI.setText(findTestObject('Object Repository/ADD_01/input__brand'), 'trang an')

WebUI.setText(findTestObject('Object Repository/ADD_01/input__amount'), '2')

WebUI.click(findTestObject('ADD_01/div_Image Choose images'))

def uploadButton = findTestObject(findTestObject('Object Repository/ADD_01/div_Image Choose images'))

def filePath = 'D:\\Pictures\\meeting\\canhdong.jpg'

WebUI.uploadFile(uploadButton, filePath)

WebUI.click(findTestObject('ADD_01/button_Add'))

