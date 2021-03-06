package com.google.zxing;


public class PushLinkSetup extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		PushLink.start(this, R.drawable.icon, "yourApiKey", "yourDeviceID");
	}
}
 
//Don't forget the AndroidManifest.xml <application android:name=".PushLinkSetup" ... >
//Parameters:
//	1 - Android context
//	2 - Notification icon
//	3 - User apiKey available after sign up
//	4 - Unique device ID. Very important. See http://push-link.com/idguide.xhtml
 
//OBS1: PushLink only will stop when the application process goes down!
//OBS2: You must call PushLink.start in the UI Thread. Don't call it inside a BroadcastReceiver. 
//OBS3: Extends android.app.Application, becouse certainly it will be called when your process start/restart.
//OBS4: If PushLink.start was called twice the second call will be ignored! 
