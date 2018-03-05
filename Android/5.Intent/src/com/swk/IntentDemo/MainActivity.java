package com.swk.IntentDemo;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.location.GpsStatus.Listener;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	private Button button1=null;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(listener);
    }
    private OnClickListener listener=new OnClickListener() {
		public void onClick(View v) 
		{
			Intent intent=new Intent();
			//打电话
			/*
			intent.setAction(Intent.ACTION_CALL);
			intent.setData(Uri.parse("tel:110"));
			*/
			//发短信
			/*
			intent.setAction(Intent.ACTION_SENDTO);
			intent.setData(Uri.parse("smsto:5554"));
			intent.putExtra("sms_body","Hello Android");
			startActivity(intent);
			*/
			intent.setClass(MainActivity.this,SecondActivity.class);
			startActivity(intent);
		}
	};
}