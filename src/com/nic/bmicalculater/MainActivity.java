package com.nic.bmicalculater;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
private EditText hei;
private EditText ma;
private EditText sol;
private Button btn1,btn2,btn3;
private TextView result;
private Double h,m,s;
private String b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		hei=(EditText)findViewById(R.id.edithei);
		ma=(EditText)findViewById(R.id.ma);
		sol=(EditText)findViewById(R.id.editsol);
		btn1=(Button)findViewById(R.id.button1);
		btn2=(Button)findViewById(R.id.btnmet);
		btn3=(Button)findViewById(R.id.btnimp);
		result=(TextView)findViewById(R.id.txtresult);
		btn2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(getBaseContext(), "Metric BMI", Toast.LENGTH_LONG).show();
			}
		});
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent imp=new Intent(MainActivity.this,Imperial.class);
				startActivity(imp);
				Toast.makeText(getBaseContext(), "Imperial BMI", Toast.LENGTH_LONG).show();
			}
		});
		btn1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
			  h=Double.parseDouble(hei.getText().toString());
			  m=Double.parseDouble(ma.getText().toString());
			    s=(h/(m*m));
			  sol.setText(s+"");
			  if (  s<=18.5)
			  {
				  b="under Weight kindly visit a Nutritionist";
				  result.setText(b +"");
					  }
			  else if(s>18.5 && s<=24.9)
			  {
				  b="Healthy weight";
				  result.setText(b +""); 
			  }
			  
			  else if(s>24.9 && s<30.0)
			  {
				  b="slightly overweight !!!";
				  result.setText(b +""); 
			  } 
			  else
			  {
				  b="Heavily Overweight..visit a Dietician";
				  result.setText(b +"");
			  }
			  
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
