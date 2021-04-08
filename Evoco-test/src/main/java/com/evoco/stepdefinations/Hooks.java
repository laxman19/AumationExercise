package com.evoco.stepdefinations;

import com.evoco.managers.FileReaderManager;
import com.evoco.utils.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    public TestContext testContext;
    public FileReaderManager fileReaderManager;

    public Hooks(TestContext context, FileReaderManager fileReaderManager) {
        this.testContext = context;
        this.fileReaderManager = fileReaderManager;
    }

    @Before
    public void beforeTest() {
        testContext.getWebDriverManager().getDriver().manage().window().maximize();
        testContext.getWebDriverManager().getDriver()
                .get(fileReaderManager.getConfigFileReader().getApplicationUrl());
    }

    @After
    public void afterTest() {
        testContext.getWebDriverManager().getDriver().quit();
    }

}
