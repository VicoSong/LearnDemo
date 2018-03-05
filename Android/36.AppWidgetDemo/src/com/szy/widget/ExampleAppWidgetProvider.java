package com.szy.widget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * @author  coolszy
 * @blog    http://blog.csdn.net/coolszy
 */
public class ExampleAppWidgetProvider extends AppWidgetProvider
{

	private static final String TAG = "AppWidget";

	@Override
	public void onDeleted(Context context, int[] appWidgetIds)
	{
		Log.i(TAG, "Deleted");
		super.onDeleted(context, appWidgetIds);
	}

	@Override
	public void onDisabled(Context context)
	{
		Log.i(TAG, "Disabled");
		super.onDisabled(context);
	}

	@Override
	public void onEnabled(Context context)
	{
		Log.i(TAG, "Enabled");
		super.onEnabled(context);
	}

	@Override
	public void onReceive(Context context, Intent intent)
	{
		Log.i(TAG, "Receive");
		super.onReceive(context, intent);
	}

	@Override
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)
	{
		Log.i(TAG, "Update");
		super.onUpdate(context, appWidgetManager, appWidgetIds);
	}

}
