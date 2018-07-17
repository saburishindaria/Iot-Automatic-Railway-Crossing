package com.example.projectcode;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.os.Handler;
import android.widget.ProgressBar;

public class MainActivity extends Activity {
private Button b1;
private static int progress;
private ProgressBar progressBar;
private int progressStatus = 0;
private Handler handler = new Handler();

@Override

public void onCreate(final Bundle savedInstanceState) {
super.onCreate(savedInstanceState);
setContentView(R.layout.activity_main);
progress = 0;
progressBar = (ProgressBar) findViewById(R.id.progressbar);

new Thread(new Runnable()
{
public void run()
{
while (progressStatus &lt; 10)
{ progressStatus = doSomeWork(); }
handler.post(new Runnable()
{
public void run()
{ progressBar.setVisibility(8); }
});
}
private int doSomeWork()
{
try { Thread.sleep(500); }

catch (InterruptedException e)
{ e.printStackTrace(); }

return ++progress;
}
}).start();

b1=(Button)findViewById(R.id.b1);
b1.setOnClickListener(new View.OnClickListener() {

@Override
public void onClick(View view)
{
Intent i=new Intent(MainActivity.this,SecondActivity.class);
startActivity(i);
}
});

}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is present.
getMenuInflater().inflate(R.menu.activity_main, menu);
return true;
}
}