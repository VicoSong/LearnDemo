/**
 * 
 */
package com.swk.servicedemo.activity;

import android.util.Log;

import org.apache.http.entity.InputStreamEntity;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/**
 * @author Administrator
 *
 */
public class ExampleServie extends Service{
	
	private static final String TAG="ExampleServie";
	
	public void onCreate()
	{
		Log.i(TAG,"ExampleServie--->>>onCreate");
		super.onCreate();
	}
	
	public void  onStart(Intent intent,int startId	)
	{
		Log.i(TAG,"ExampleServie--->>>onStartCommand");
		 super.onStart(intent,startId);
	}
	
	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void onDestroy()
	{
		Log.i(TAG,"ExampleServie--->>>onDestroy");
		super.onDestroy();
	}
	
}
