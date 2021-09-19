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

"Open browser"
WebUI.openBrowser("")

"maximize window"
WebUI.maximizeWindow()

"navigate to URL"
WebUI.navigateToUrl("http://the-internet.herokuapp.com/login")

"Input username"
WebUI.setText(findTestObject('Object Repository/Login/txtUserName'), 'tomsmith')

"Input password"
WebUI.setText(findTestObject('Object Repository/Login/txtPassWord'), 'SuperSecretPassword!')

"Click on Login button"
WebUI.click(findTestObject('Object Repository/Login/btnLogin'))

"set delay"
WebUI.delay(2)

"take a screenshot"
WebUI.takeScreenshot()

"getText and split text"
String[] textDisplayed = WebUI.getText(findTestObject('Object Repository/Login/verifyText')).split('\n')

"print expected text"
println textDisplayed[0]

"verify atual text and expected text"
boolean a = WebUI.verifyEqual(textDisplayed[0], 'You logged into a secure area!')

println a
"Close browser"
WebUI.closeBrowser()
