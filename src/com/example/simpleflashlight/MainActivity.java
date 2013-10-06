package com.example.simpleflashlight;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//create full screen view
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.activity_main);
		Button buttonGreen = (Button) findViewById(R.id.bGreen);		
		buttonGreen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this, GreenFlashlightActivity.class );
				startActivity(intent);
				//call finish() after the activity, so our ACTs don't stack on another!!!
				finish();
			}
		});	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	/*
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch(arg0.getId()){
		case R.id.bGreen:
			setContentView(R.layout.green);
			Button buttonRed = (Button) findViewById(R.id.bRed);
			buttonRed.setOnClickListener(this);
			break;
		case R.id.bRed:
			setContentView(R.layout.activity_main);
			Button buttonGreen = (Button) findViewById(R.id.bGreen);		
			buttonGreen.setOnClickListener(this);
			break;
		}
	}
	*/

}
