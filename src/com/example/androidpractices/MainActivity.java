package com.example.androidpractices;

import com.example.androidpractices.R;

import android.animation.IntArrayEvaluator;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button button1,button2,button3,button4,button5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button1=(Button)findViewById(R.id.click_button1);
		button2=(Button)findViewById(R.id.click_button2);
		button3=(Button)findViewById(R.id.click_button3);
		button4=(Button)findViewById(R.id.click_button4);
		button5=(Button)findViewById(R.id.click_button5);
		button1.setOnClickListener(o);
		button2.setOnClickListener(o);
		button3.setOnClickListener(o);
		button4.setOnClickListener(o);
		button5.setOnClickListener(o);

	}
	OnClickListener o = new OnClickListener() {

		Intent intent=null , cooser=null;
		@Override
		public void onClick(View v) {
			if(v.getId()==R.id.click_button1){
				dosomthing(button1);
			}
			if(v.getId()==R.id.click_button2){
				intent=new Intent(android.content.Intent.ACTION_VIEW);
				cooser=Intent.createChooser(intent, "Lunch Map..");
				intent.setData(Uri.parse("geo:19,70"));
				startActivity(cooser);

			} 
			if (v.getId()==R.id.click_button3){
				intent=new Intent(android.content.Intent.ACTION_VIEW);
				intent.setData(Uri.parse("https://play.google.com/store/books/details/Google_Android_Quick_Start_Guide_Android_5_0_Lolli?id=yCRZBwAAQBAJ&hl=en"));
				cooser=Intent.createChooser(intent, "Market");
				startActivity(cooser);

			}
			if(v.getId()==R.id.click_button4){
				intent=new Intent(Intent.ACTION_SEND);
				intent.setData(Uri.parse("mailto:"));
				String[] to ={"vibhanshu.shukla.pspl@gmail.com","vibhanshushukla15061992@gmail.com"};
				intent.putExtra(Intent.EXTRA_EMAIL, to);
				intent.putExtra(Intent.EXTRA_SUBJECT, "Send My EMAIL from code ");
				intent.putExtra(Intent.EXTRA_TEXT, "Vibhanshu Shukla Android Email..");
				intent.setType("massage/rfc822");
				cooser = Intent.createChooser(intent,"SendEmail");
				startActivity(cooser);


			}
			if(v.getId()==R.id.click_button5){
				Uri imageUri =Uri.parse("android.resources://AndroidPractices./drawable/"+R.drawable.ic_launcher);
				intent = new Intent(Intent.ACTION_VIEW);
				intent.setType("image/*");
				intent.putExtra(intent.EXTRA_STREAM, imageUri);	
				intent.putExtra(intent.EXTRA_TEXT, "Vibhanshu Shukla..");
				cooser= Intent.createChooser(intent, "Send Image..");
				startActivity(cooser);
				
				
			}
		}
	};

	public void dosomthing(View v) {
		Intent i = new Intent(this, ActivityB.class);
		startActivity(i);
	}

}
