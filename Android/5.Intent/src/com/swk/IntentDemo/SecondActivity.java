package com.swk.IntentDemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends Activity{
	private Button button2=null;
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		button2=(Button)findViewById(R.id.button2);
	}
	
}
