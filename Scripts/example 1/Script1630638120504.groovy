import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.youtube.com/')

WebUI.setText(findTestObject('Object Repository/Page_YouTube/input_Skip navigation_search_query'), 'tieng anh')

WebUI.delay(10)

WebUI.closeBrowser()

