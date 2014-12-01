package com.angular.nav.hybrid;

import org.json.JSONArray;

import com.angular.nav.CordovaPluginActivity;


public class NativeHybridCommPlugin extends BaseCordovaPlugin {
    private static final String TAG = NativeHybridCommPlugin.class.getSimpleName();


    private static final String ACTION_SCREEN_URL = "SCREEN_URL";

    @Override
    public boolean performAction(String action, JSONArray args){
      if (ACTION_SCREEN_URL.equals(action)) {
            try {
                String screenUrl = getScreenUrl();
                sendSuccess(screenUrl);
            } catch (Exception e) {
            	e.printStackTrace();
            }
            return true;
        } 
        return false;
    }


    private String getScreenUrl() throws Exception {
        final CordovaPluginActivity activity = (CordovaPluginActivity) this.cordova.getActivity();
        return activity.getCurrentURL();
    }

}