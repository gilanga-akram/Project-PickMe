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

WebUI.openBrowser('https://admin-pickme.metrodataacademy.id/')

WebUI.maximizeWindow()

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//input[@id=\'username\']'))

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//input[@id=\'username\']'), 'superadmin')

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//input[@id=\'password\']'))

WebUI.setEncryptedText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//input[@id=\'password\']'), 'o+tS4OuGt32s9ezZj287yw==')

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '//button[@type=\'submit\']'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '(.//*[normalize-space(text()) and normalize-space(.)=\'Pick-ME\'])[1]/following::a[4]'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '(.//*[normalize-space(text()) and normalize-space(.)=\'Cari berdasarkan skill\'])[1]/following::span[5]'))

WebUI.click(new TestObject().addProperty('xpath', ConditionType.EQUALS, '(.//*[normalize-space(text()) and normalize-space(.)=\'Status:\'])[1]/following::span[5]'))

WebUI.setText(new TestObject().addProperty('xpath', ConditionType.EQUALS, '(//input[@type=\'search\'])[2]'), 'instansibaru')

WebUI.delay(5)

WebUI.takeFullPageScreenshot()