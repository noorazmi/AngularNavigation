package com.angular.nav.hybrid;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public abstract class BaseCordovaPlugin extends CordovaPlugin {

	protected String TAG = this.getClass().getSimpleName();

	private CallbackContext callbackContext;

	private void sendPluginResult(PluginResult.Status status, String data) {
		PluginResult pluginResult = new PluginResult(status, data);
		callbackContext.sendPluginResult(pluginResult);
	}

	protected void sendSuccess(String data) {
		sendPluginResult(PluginResult.Status.OK, data);
	}

	protected void sendError(String data) {
		sendPluginResult(PluginResult.Status.ERROR, data);
	}

	protected void sendSuccess() {
		sendSuccess("{}");
	}

	protected void sendError() {
		sendError("");
	}

	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {
		this.callbackContext = callbackContext;
		return performAction(action, args);
	}

	/**
	 * Method to perform action. If action is not matching the actions served
	 * return false signifying no matching action
	 * 
	 * @param action
	 * @param args
	 * @param callbackContext
	 * @return
	 */
	public abstract boolean performAction(final String action,
			final JSONArray args) throws JSONException;

}
