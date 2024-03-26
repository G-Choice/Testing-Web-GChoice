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

WebUI.setText(findTestObject('Object Repository/ADD/ADD_01/input_Login_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/ADD/ADD_01/input_Email_password'), password)

WebUI.click(findTestObject('Object Repository/ADD/ADD_01/button_Login'))

WebUI.click(findTestObject('Object Repository/ADD/ADD_01/a_Logout_side-menu side-menu--open (1)'))

WebUI.click(findTestObject('Object Repository/ADD/ADD_01/button_Create'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ADD/ADD_01/select_Please select the categoryChopstickR_0b38fe'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/ADD/ADD_01/input__name (1)'), 'CHOPSTICK CHOPSTICK CHOPSTICK')

WebUI.setText(findTestObject('Object Repository/ADD/ADD_01/input__price (1)'), '200')

WebUI.setText(findTestObject('Object Repository/ADD/ADD_01/textarea__description (1)'), 'Beautifull')

WebUI.setText(findTestObject('Object Repository/ADD/ADD_01/input__brand (1)'), 'China')

WebUI.setText(findTestObject('Object Repository/ADD/ADD_01/input__amount (1)'), '200')

WebUI.uploadFile(findTestObject('ADD/ADD_01/input_Choose images_images'), 'D:\\Documents\\spoon.jpg')

WebUI.uploadFile(findTestObject('ADD/ADD_01/input_Choose images_images'), 'D:\\Documents\\spoon.jpg')

WebUI.uploadFile(findTestObject('ADD/ADD_01/input_Choose images_images'), 'D:\\Documents\\spoon.jpg')

Thread.sleep(3000)

WebUI.click(findTestObject('Object Repository/ADD/ADD_01/button_Add (1)'))

WebUI.click(findTestObject('Object Repository/ADD/ADD_01/svg_Update_lucide text-black'))

WebUI.closeBrowser()

