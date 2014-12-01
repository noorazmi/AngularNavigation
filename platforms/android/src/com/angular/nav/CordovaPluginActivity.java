package com.angular.nav;

import org.apache.cordova.Config;
import org.apache.cordova.CordovaActivity;

import android.os.Bundle;

public class CordovaPluginActivity  extends CordovaActivity 
{
	private String currentURL = "/pageBee";
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        super.init();
        // Set by <content src="index.html" /> in config.xml
        super.loadUrl(Config.getStartUrl());
        //super.loadUrl("file:///android_asset/www/index.html");
    }
    
    
    public String getCurrentURL(){
    	return currentURL;
    }
}
