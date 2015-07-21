package com.testjob;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends Activity {

	ListView lv_rows;
	ListAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		getcontrols();
		setadapter();
	}

	public void getcontrols()
	{
		lv_rows = (ListView)findViewById(R.id.lv_testlist);
	}

	public void setadapter()
	{
		adapter = new ListAdapter(getApplicationContext());
		lv_rows.setAdapter(adapter);

	}


}
