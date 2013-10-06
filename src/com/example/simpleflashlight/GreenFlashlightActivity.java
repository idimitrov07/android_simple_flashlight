package com.example.simpleflashlight;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class GreenFlashlightActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//set full screen
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		
		setContentView(R.layout.green);
		Button buttonRed = (Button) findViewById(R.id.bRed);
		buttonRed.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//finish this activity, instead of creating a new one
				Intent intent = new Intent(GreenFlashlightActivity.this,
						MainActivity.class);
				startActivity(intent);
				//call finish() after the activity, so our ACTs don't stack on another!!!
				finish();
			}
		});
	}

}
