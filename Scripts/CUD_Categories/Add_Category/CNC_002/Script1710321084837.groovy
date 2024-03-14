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

WebUI.openBrowser("")

WebUI.navigateToUrl('http://localhost:3000/login')

WebUI.setText(findTestObject('Login/input_Login_email'), 'bttthuy08@gmail.com')

WebUI.setEncryptedText(findTestObject('Login/input_Email is required_password'), 'x7Lc2hblLkOVznV9Fh/SyA==')

WebUI.click(findTestObject('Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Category/AddProduct/a_Logout_side-menu side-menu--open'))

WebUI.click(findTestObject('Object Repository/Category/AddProduct/button_Create'))

WebUI.setText(findTestObject('Object Repository/Category/AddProduct/input__name'), 'Computer')

WebUI.click(findTestObject('Object Repository/Category/AddProduct/button_Add'))

WebUI.click(findTestObject('Object Repository/Category/AddProduct/svg__lucide text-black'))

