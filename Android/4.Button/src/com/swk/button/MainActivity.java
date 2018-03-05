package com.swk.button;

import javax.security.auth.PrivateCredentialPermission;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
	  private Button button1=null;
	  private Button button2=null;
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button1.setOnClickListener(listener);
        button2.setOnClickListener(listener);
       // button1.setOnClickListener(new ButtonClick());
        
        //采用匿名内部类实现事件监听处理
        /*
        button1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "you have clicked the Button", Toast.LENGTH_LONG).show();
			}
		});
		*/
    }
	 private OnClickListener listener=new OnClickListener() {
			public void onClick(View v) {
				Button button=(Button)v;
				switch(button.getId())
				{
					case R.id.button1:
						Toast.makeText(MainActivity.this, "you have clicked the Button", Toast.LENGTH_LONG).show();
						break;
					case R.id.button2:
						System.out.println("you clincked the button2");
				}
				
				
				
			}
		};
   
}
/*
class ButtonClick implements OnClickListener{
	public void onClick(View v)
	{
		System.out.println("你点点击了按钮");
	}
}
*/