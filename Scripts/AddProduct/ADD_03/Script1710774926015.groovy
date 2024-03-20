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

WebUI.setText(findTestObject('Object Repository/ADD/ADD_03/input_Login_email'), 'ykimtra22062003@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/ADD/ADD_03/input_Email_password'), 'VJ6uNRAKvEsaM3HKuewOwQ==')

WebUI.click(findTestObject('Object Repository/ADD/ADD_03/button_Login'))

WebUI.click(findTestObject('Object Repository/ADD/ADD_03/button_Create'))

WebUI.setText(findTestObject('Object Repository/ADD/ADD_03/input__name'), 'TRUGHFGHDJJKUKHDJNHGJYGJHJH')

WebUI.setText(findTestObject('Object Repository/ADD/ADD_03/input__price'), '124')

WebUI.setText(findTestObject('Object Repository/ADD/ADD_03/textarea__description'), 'description')

WebUI.setText(findTestObject('Object Repository/ADD/ADD_03/input__brand'), 'taiwan')

WebUI.setText(findTestObject('Object Repository/ADD/ADD_03/input__amount'), '2')

def uploadButton = findTestObject(findTestObject('Object Repository/ADD/ADD_03/div_Image Choose images'))

String imagePath = "D:\\Pictures\\meeting\\" + File.separator + "canhdong.jpg"

WebUI.takeScreenshot(imagePath)


WebUI.click(findTestObject('Object Repository/ADD/ADD_03/button_Add'))

