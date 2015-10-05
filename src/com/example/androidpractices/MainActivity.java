package com.example.androidpractices;

import com.example.androidpractices.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button button1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button) findViewById(R.id.click_button);
		button1.setOnClickListener(o);
		
	}
	OnClickListener o = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Log.d("Vibs", "Button is clicked..");
			dosomthing(button1);
		}
	};
	
	public void dosomthing(View v) {
		Intent i = new Intent(this, ActivityB.class);
		startActivity(i);
	}
}
