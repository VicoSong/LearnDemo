package com.szy.dialogs;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity
{
	private static final int MAX_PROGRESS = 100;
	private final static int SIMPLEALERTDIALOG = 1;
	private final static int LISTALERTDIALOG = 2;
	private final static int SINGLECHOICEALERTDIALOG = 3;
	private final static int PROGRESSTDIALOG = 4;
	private final static int CUSTOMALERTDIALOG = 5;

	private ProgressDialog progressDialog;
	private Handler progressHandler;
	private int progress;
	private AlertDialog alert;

	private Button simpleAlertDialog;
	private Button listAlertDialog;
	private Button singleChoiceAlertDialog;
	private Button progressAlertDialog;
	private Button customAlertDialog;

	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		// 简单警告对话框
		simpleAlertDialog = (Button) findViewById(R.id.simpleAlertDialog);
		simpleAlertDialog.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				showDialog(SIMPLEALERTDIALOG);
			}
		});

		// 列表对话框
		listAlertDialog = (Button) findViewById(R.id.listAlertDialog);
		listAlertDialog.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{

				showDialog(LISTALERTDIALOG);
			}
		});

		// 单选对话框
		singleChoiceAlertDialog = (Button) findViewById(R.id.singleChoiceAlertDialog);
		singleChoiceAlertDialog.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				showDialog(SINGLECHOICEALERTDIALOG);
			}
		});

		// 进度条
		progressAlertDialog = (Button) findViewById(R.id.progressAlertDialog);
		progressAlertDialog.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				showDialog(PROGRESSTDIALOG);
				progress = 0;
				progressDialog.setProgress(0);
				progressHandler.sendEmptyMessage(0);
			}
		});

		// 自定义对话框
		customAlertDialog = (Button) findViewById(R.id.customAlertDialog);
		customAlertDialog.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				showDialog(CUSTOMALERTDIALOG);
			}
		});

		// 进度条Handler
		progressHandler = new Handler()
		{
			@Override
			public void handleMessage(Message msg)
			{
				super.handleMessage(msg);
				if (progress >= MAX_PROGRESS)
				{
					progressDialog.dismiss();
				}
				else
				{
					progress++;
					progressDialog.setProgress(progress);
					progressHandler.sendEmptyMessageDelayed(0, 100);
				}
			}
		};
	}

	@Override
	protected Dialog onCreateDialog(int id)
	{
		Log.i("MainActivity","@@@@@@@@@@@@@");
		final CharSequence[] items =
		{ "红色", "黄色", "蓝色" };
		AlertDialog.Builder builder = null;
		builder = new AlertDialog.Builder(this);
		switch (id)
		{
		case SIMPLEALERTDIALOG:
			builder.setMessage("你确定要退出本软件吗?");
			builder.setCancelable(false);// 返回键是否可以关闭对话框
			builder.setPositiveButton("是", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int id)
				{
					MainActivity.this.finish();
				}
			});
			builder.setNegativeButton("否", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int id)
				{
					dialog.cancel();
				}
			});
			return builder.create();
		case LISTALERTDIALOG:
			builder.setTitle("请选中一种颜色");
			builder.setItems(items, new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int item)
				{
					Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
				}
			});
			return builder.create();
		case SINGLECHOICEALERTDIALOG:
			
			builder.setTitle("请选中一种颜色");
			builder.setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int item)
				{
					Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
					 if (null!=alert)
					 {
						 alert.dismiss();
					 }
				}
			});
			alert = builder.create();
			return alert;
		case PROGRESSTDIALOG:
			progressDialog = new ProgressDialog(this);
			// progressDialog.setIconAttribute(android.R.attr.alertDialogIcon);
			progressDialog.setTitle("进度条");
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setMax(MAX_PROGRESS);
			progressDialog.setButton(DialogInterface.BUTTON_POSITIVE, "确定", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int whichButton)
				{

				}
			});
			progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "取消", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int whichButton)
				{

				}
			});
			return progressDialog;
		case CUSTOMALERTDIALOG:
			LayoutInflater factory = LayoutInflater.from(this);
			final View textView = factory.inflate(R.layout.custom, null);
			builder.setIcon(R.drawable.qq);
			builder.setTitle("自定义对话框");
			builder.setView(textView);
			builder.setPositiveButton("确定", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int whichButton)
				{

				}
			});
			builder.setNegativeButton("取消", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int whichButton)
				{

				}
			});
			return builder.create();
		default:
			break;
		}
		return null;
	}
}