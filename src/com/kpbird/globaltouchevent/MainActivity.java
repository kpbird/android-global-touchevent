package com.kpbird.globaltouchevent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	Intent globalService;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		globalService = new Intent(this,GlobalTouchService.class);
	}


	public void buttonClicked(View v){
		
		if(v.getTag() == null){
			startService(globalService);
			v.setTag("on");
			((Button)v).setText("Stop Service");
			Toast.makeText(this, "Start Service", Toast.LENGTH_SHORT).show();
		}
		else{
			stopService(globalService);
			v.setTag(null);
			((Button)v).setText("Start Service");
			Toast.makeText(this, "Stop Service", Toast.LENGTH_SHORT).show();
		}
		
	}
}
