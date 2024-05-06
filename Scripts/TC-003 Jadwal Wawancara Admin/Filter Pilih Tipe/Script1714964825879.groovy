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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.openBrowser('')
WebUI.navigateToUrl('https://dev.admin-pickme.metrodataacademy.id/login')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_Login/input_Username_username'))
WebUI.setText(findTestObject('Object Repository/Page_Login/input_Username_username'), 'superadmin')

WebUI.click(findTestObject('Object Repository/Page_Login/input_Password_password'))
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_password'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Home/a_LinkText'))

TestObject selectElement = findTestObject('Object Repository/Page_Home/select_OnlineOffline')
WebUI.click(selectElement)
WebUI.selectOptionByValue(selectElement, 'Online', true)
