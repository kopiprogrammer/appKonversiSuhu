package com.app.appkonversi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.app.AlertDialog;
import android.content.Intent;

public class CelciusToReamur extends Activity {
		double celcius, reamur;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_celcius_to_reamur);
		
		final EditText edNilaiCelciusCTR = (EditText) findViewById(R.id.edNilaiCelciusCTR);
		final EditText edNilaiReamurCTR = (EditText) findViewById(R.id.edNilaiReamurCTR);
		final Button btKonvertCTR = (Button) findViewById(R.id.btKonvertCTR);
		final Button btMenuUtama = (Button) findViewById(R.id.btMenuUtamaCTR);
		final AlertDialog.Builder pesan = new AlertDialog.Builder(CelciusToReamur.this);
		btKonvertCTR.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try{
				celcius = Double.parseDouble(edNilaiCelciusCTR.getText().toString());
				reamur =  celcius*4 / 5  ;
				edNilaiReamurCTR.setText(String.valueOf(reamur));
				}
				catch (Exception ex){
					pesan.setTitle("Pesan");
					pesan.setMessage("Error" +ex);
					pesan.setNeutralButton("OK", null);
					pesan.show();
					
					
				}
				
			}
		});
		
		btMenuUtama.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				Intent nextActivity = new Intent(getApplicationContext(), MenuUtama.class);
				startActivity(nextActivity);
				System.exit(0);
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.celcius_to_reamur, menu);
		return true;
	}

}
