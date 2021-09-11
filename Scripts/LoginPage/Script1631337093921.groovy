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

"Open the link"
WebUI.openBrowser("https://www.nopcommerce.com/en/login?returnUrl=%2Fen%2Fdemo")

"maximize the browser"
WebUI.maximizeWindow()

"Input username"
WebUI.setText(findTestObject('Object Repository/Login/txtUserName'), 'thaotran')

"input password"
WebUI.setText(findTestObject('Object Repository/Login/txtPassWord'), '123456aA')

"click on Login btn"
WebUI.click(findTestObject('Object Repository/Login/btnLogin'))

"take a screenshot"
WebUI.takeScreenshot()

"set a delay"
WebUI.delay(5)
"close browser"
WebUI.closeBrowser()
