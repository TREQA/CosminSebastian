package com.hashMap.config;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public interface DriverSetup {

    RemoteWebDriver getWebDriverObject(MutableCapabilities desiredCapabilities);

    MutableCapabilities getDesiredCapabilities(org.openqa.selenium.Proxy proxySettings);
}
