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

public class SecondActivity extends Activity {
	EditText user1,pass1;
	Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
        
        user1=(EditText)findViewById(R.id.user1);
        pass1=(EditText)findViewById(R.id.pass1);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.b2);
        getIntent();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DBAdapter db = new DBAdapter(getApplication());
                db.open();
                if(user1.getText().toString().isEmpty() || pass1.getText().toString().isEmpty())
                { Toast.makeText(getApplicationContext(),"Above Fields are Required",Toast.LENGTH_SHORT).show(); }
                else {
                    long id1 = db.insert1(user1.getText().toString(), pass1.getText().toString());
                    Toast.makeText(getApplicationContext(),"Saved Successfully!",Toast.LENGTH_SHORT).show();
                }
                db.close();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View view) {
				Intent i2=new Intent(SecondActivity.this,ThirdActivity.class);
				startActivity(i2);
				
			}
		});
    }  
 }
