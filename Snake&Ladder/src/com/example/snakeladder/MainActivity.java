package com.example.snakeladder;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener {
	//Button playbtn,optionbtn,controlbtn,exitbtn;
	ImageButton  playbtn,optionbtn,controlbtn,exitbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playbtn=(ImageButton) findViewById(R.id.playbutton);
        optionbtn=(ImageButton) findViewById(R.id.optionbutton);
        controlbtn=(ImageButton) findViewById(R.id.controlbutton);
        exitbtn=(ImageButton) findViewById(R.id.exitbutton);
        
playbtn.setOnClickListener(this);
optionbtn.setOnClickListener(this);
controlbtn.setOnClickListener(this);
exitbtn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		switch(v.getId()){
		case R.id.playbutton:
		Intent intent1=new Intent(this,PlayActivity.class);
		startActivity(intent1);
			break;
		case R.id.controlbutton:
			Intent intent2=new Intent(this,ControlActivity.class);
			startActivity(intent2);
			break;
		case R.id.optionbutton:
			Intent intent3=new Intent(this,OptionActivity.class);
			startActivity(intent3);
			break;
		case R.id.exitbutton:
			
			break;
		
	}
	}   
}
