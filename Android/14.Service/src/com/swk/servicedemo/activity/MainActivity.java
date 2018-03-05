package com.swk.servicedemo.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
public class MainActivity extends Activity {
	private Button startButton=null;
	private Button StopButton=null;
    /** Called when the activity is first created. */
    @Override//
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        startButton=(Button)findViewById(R.id.startButton);
        StopButton=(Button)findViewById(R.id.StopButton);
        startButton.setOnClickListener(listener);
        StopButton.setOnClickListener(listener);
    }
    
    private OnClickListener listener=new OnClickListener()
	{
		public void onClick(View v)
		{
			Intent intent=new Intent(MainActivity.this, ExampleServie.class);
			switch (v.getId())
			{
			case R.id.startButton:
				startService(intent);
				break;
			case R.id.StopButton:
				stopService(intent);
				break;
			default:
				break;
			}
			
		}
	};
}