package ru.omsu.imit;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class UITesting extends BaseTest {
    // Для решения проблем с драйвером:
    // https://stackoverflow.com/questions/60296873/sessionnotcreatedexception-message-session-not-created-this-version-of-chrome/62127806

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void pageTest() {
        PageObject pageObject = PageFactory.initElements(driver, PageObject.class);
        pageObject.open();

        assertTrue(pageObject.isShowAnswerButtonExist());
        assertTrue(pageObject.isLinkForAnswerExist());
        assertTrue(pageObject.isHideAnswerButtonExist());
    }


}
