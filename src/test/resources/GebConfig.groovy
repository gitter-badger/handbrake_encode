/*
	This is the Geb configuration file.

	See: http://www.gebish.org/manual/current/#configuration
*/

import org.openqa.selenium.firefox.FirefoxDriver
import org.openqa.selenium.phantomjs.PhantomJSDriver
import geb.report.ScreenshotReporter

waiting {
	timeout = 5
}

environments {}

reporter = new ScreenshotReporter() {

	@Override
	protected escapeFileName(String name)
	{
		name.replaceAll('[\\\\/:\\*?\\"&lt;>\\|]', '_');
	}
}

// To run the tests with all browsers just run “./gradlew test”

baseUrl = "http://www.google.co.jp/"
