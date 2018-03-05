package com.szy.menudemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.Button;
import android.widget.Toast;

/**
 *@author coolszy
 *@date 2012-2-18
 *@blog http://blog.92coding.com
 * 
 */
public class MainActivity extends Activity
{
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Button btn = (Button) findViewById(R.id.btn);
		registerForContextMenu(btn);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
//		 menu.add(0, 1, 1, "��ʼ");
//		 menu.add(0, 2, 2, "����");
//		 menu.add(0, 3, 3, "�˳�");
//		
//		 SubMenu subMenu = menu.addSubMenu(0, 4, 4, "ʡ��");
//		 subMenu.add(0, 1, 1, "����ʡ");
//		 subMenu.add(0, 2, 2, "�Ϻ���");
//		 
//		 menu.add(0, 5, 5, "�˻�");
//		 menu.add(0, 6, 6, "����");
//		 menu.add(0, 7, 7, "����");

		// menu.setGroupVisible(0, false);

		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_item, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		if (item.getItemId() == 1)
		{
			Intent intent = new Intent(this, SecondActivity.class);
			startActivity(intent);
		}
		else
		{
			Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
		}
		return true;
	}

	@Override
	public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo)
	{
		menu.setHeaderTitle("");
		menu.add(0, 1, 1, "����");
		menu.add(0, 2, 2, "����");
		super.onCreateContextMenu(menu, v, menuInfo);
	}

	@Override
	public boolean onContextItemSelected(MenuItem item)
	{
		Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
		return true;
	}

}