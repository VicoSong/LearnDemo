package com.szy.statusbar;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RemoteViews;

public class MainActivity extends Activity
{
	private Button btnBar;
	private Button btnCancel;
	private Button btnUpdate;
	private Button btnCustom;
	
	private static final int STATUS_BAR_ID = 1;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		btnBar=(Button)findViewById(R.id.btnBar);
		btnBar.setOnClickListener(listener);
		btnCancel=(Button)findViewById(R.id.btnCancel);
		btnCancel.setOnClickListener(listener);
		btnUpdate=(Button)findViewById(R.id.btnUpdate);
		btnUpdate.setOnClickListener(listener);
		btnCustom=(Button)findViewById(R.id.btnCustom);
		btnCustom.setOnClickListener(listener);
	}
	
	private OnClickListener listener = new OnClickListener()
	{
		@Override
		public void onClick(View v)
		{
			NotificationManager notificationManager=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
			Notification notification;
			Context context;
			CharSequence contentTitle;
			CharSequence contentText;
			Intent intent;
			PendingIntent contentIntent;
			
			switch (v.getId())
			{
			case R.id.btnBar:
				notification = new Notification();
				notification.icon=R.drawable.bar;
				notification.tickerText="Android开发从零开始";
				notification.when=System.currentTimeMillis();
				//notification.flags=Notification.FLAG_AUTO_CANCEL;

				context = getApplicationContext();
				contentTitle = "通知";
				contentText = "大家好，Android开发从零开始又开始录制了。";
				intent = new Intent(MainActivity.this, StatusBarActivity.class);
				contentIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

				notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);

				notificationManager.notify(STATUS_BAR_ID, notification);
				break;
			case R.id.btnCancel:
				notificationManager.cancel(STATUS_BAR_ID);
				break;
			case R.id.btnUpdate:
				notification = new Notification();
				notification.icon=R.drawable.bar;
				notification.tickerText="第二条消息";
				notification.when=System.currentTimeMillis();
				
				context = getApplicationContext();
				contentTitle = "通知";
				contentText = "两条消息未读。";
				intent = new Intent(MainActivity.this, StatusBarActivity.class);
				contentIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);

				notification.setLatestEventInfo(context, contentTitle, contentText, contentIntent);

				notificationManager.notify(STATUS_BAR_ID, notification);
				break;
			case R.id.btnCustom:
				notification = new Notification();
				notification.icon=R.drawable.bar;
				notification.tickerText="Android开发从零开始";
				notification.when=System.currentTimeMillis();
				notification.flags=Notification.FLAG_AUTO_CANCEL;
				
				RemoteViews contentView = new RemoteViews(getPackageName(), R.layout.custom_notification_layout);
				contentView.setImageViewResource(R.id.image, R.drawable.notification_image);
				contentView.setTextViewText(R.id.text, "自定义显示界面");
				notification.contentView = contentView;
				
				intent = new Intent(MainActivity.this, StatusBarActivity.class);
				contentIntent = PendingIntent.getActivity(MainActivity.this, 0, intent, 0);
				notification.contentIntent = contentIntent;
				
				notificationManager.notify(STATUS_BAR_ID, notification);
				break;
			default:
				break;
			}
			
		}
	};
}