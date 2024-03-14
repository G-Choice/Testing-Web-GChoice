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

WebUI.click(findTestObject('Object Repository/Category/AddProduct/a_Logout_side-menu side-menu--open'))

WebUI.click(findTestObject('Object Repository/Category/Update_Category/svg_Bowl_lucide w-4 h-4 mr-1'))

//WebUI.setText(findTestObject('Object Repository/Category/Update_Category/input__name'), ' hihi')
// Lưu giá trị tên cũ và tên mới
// Lấy giá trị tên cũ từ đối tượng trên trang web
String oldName = WebUI.getAttribute(findTestObject('Object Repository/Category/Update_Category/input__name'), 'value')

// Tên mới
String newName = 'hihi'

// Kết hợp tên cũ và tên mới
String combinedName = oldName + ' ' + newName

// Cập nhật giá trị tên mới
WebUI.setText(findTestObject('Object Repository/Category/Update_Category/input__name'), combinedName)

WebUI.click(findTestObject('Object Repository/Category/Update_Category/button_Update'))

WebUI.click(findTestObject('Object Repository/Category/AddProduct/svg__lucide text-black'))

