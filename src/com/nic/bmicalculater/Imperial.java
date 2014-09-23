package com.nic.bmicalculater;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Imperial extends Activity {
	private Button btn4;
	private EditText hei;
	private EditText ma;
	private EditText sol;
	private Button btn1,btn3;
	private TextView result;
	private Double h,m,s;
	private String b;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.imperial);
		btn4=(Button)findViewById(R.id.btnmet1);
		hei=(EditText)findViewById(R.id.edithei);
		ma=(EditText)findViewById(R.id.ma);
		sol=(EditText)findViewById(R.id.editsol);
		btn1=(Button)findViewById(R.id.button1);
		
		btn3=(Button)findViewById(R.id.btnimp);
		result=(TextView)findViewById(R.id.txtresult);
		btn3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent imp=new Intent(Imperial.this,MainActivity.class);
				startActivity(imp);
				Toast.makeText(getBaseContext(), "Imperial BMI", Toast.LENGTH_LONG).show();
			}
		});
		btn4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent met=new Intent(Imperial.this,MainActivity.class);
				startActivity(met);
				Toast.makeText(getBaseContext(), "Metric BMI", Toast.LENGTH_LONG).show();
			}
		});
		btn1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				h=Double.parseDouble(hei.getText().toString());
				  m=Double.parseDouble(ma.getText().toString());
				  h=h*0.453595;//converting pounds to kilograms
					m=m/100;// converting centimeters into metres
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
