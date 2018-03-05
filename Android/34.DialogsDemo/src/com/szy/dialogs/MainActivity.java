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
		// �򵥾���Ի���
		simpleAlertDialog = (Button) findViewById(R.id.simpleAlertDialog);
		simpleAlertDialog.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				showDialog(SIMPLEALERTDIALOG);
			}
		});

		// �б�Ի���
		listAlertDialog = (Button) findViewById(R.id.listAlertDialog);
		listAlertDialog.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v)
			{

				showDialog(LISTALERTDIALOG);
			}
		});

		// ��ѡ�Ի���
		singleChoiceAlertDialog = (Button) findViewById(R.id.singleChoiceAlertDialog);
		singleChoiceAlertDialog.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				showDialog(SINGLECHOICEALERTDIALOG);
			}
		});

		// ������
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

		// �Զ���Ի���
		customAlertDialog = (Button) findViewById(R.id.customAlertDialog);
		customAlertDialog.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				showDialog(CUSTOMALERTDIALOG);
			}
		});

		// ������Handler
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
		{ "��ɫ", "��ɫ", "��ɫ" };
		AlertDialog.Builder builder = null;
		builder = new AlertDialog.Builder(this);
		switch (id)
		{
		case SIMPLEALERTDIALOG:
			builder.setMessage("��ȷ��Ҫ�˳��������?");
			builder.setCancelable(false);// ���ؼ��Ƿ���ԹرնԻ���
			builder.setPositiveButton("��", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int id)
				{
					MainActivity.this.finish();
				}
			});
			builder.setNegativeButton("��", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int id)
				{
					dialog.cancel();
				}
			});
			return builder.create();
		case LISTALERTDIALOG:
			builder.setTitle("��ѡ��һ����ɫ");
			builder.setItems(items, new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int item)
				{
					Toast.makeText(getApplicationContext(), items[item], Toast.LENGTH_SHORT).show();
				}
			});
			return builder.create();
		case SINGLECHOICEALERTDIALOG:
			
			builder.setTitle("��ѡ��һ����ɫ");
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
			progressDialog.setTitle("������");
			progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
			progressDialog.setMax(MAX_PROGRESS);
			progressDialog.setButton(DialogInterface.BUTTON_POSITIVE, "ȷ��", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int whichButton)
				{

				}
			});
			progressDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "ȡ��", new DialogInterface.OnClickListener()
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
			builder.setTitle("�Զ���Ի���");
			builder.setView(textView);
			builder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener()
			{
				public void onClick(DialogInterface dialog, int whichButton)
				{

				}
			});
			builder.setNegativeButton("ȡ��", new DialogInterface.OnClickListener()
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