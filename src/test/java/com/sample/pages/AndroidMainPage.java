package com.sample.pages;

import org.openqa.selenium.support.PageFactory;

import java.net.MalformedURLException;

public class AndroidMainPage extends AndroidDriverManeger {

    public AndroidMainPage() throws MalformedURLException {
        PageFactory.initElements( getAndroidDriver(), this);
    }

}
