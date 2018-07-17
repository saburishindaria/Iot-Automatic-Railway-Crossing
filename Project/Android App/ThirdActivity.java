package com.example.projectcode;

import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.os.*;

public class ThirdActivity extends Activity
{
	Button b1;
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity3);
	        
	        b1=(Button)findViewById(R.id.bmap);
	        b1.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View view) {
					Intent i3=new Intent(ThirdActivity.this,FourthActivity.class);
					startActivity(i3);
					
				}
			});
	 }
	 

}


