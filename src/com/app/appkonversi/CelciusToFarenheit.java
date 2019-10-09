package com.app.appkonversi;


import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.app.AlertDialog;
import android.content.Intent;

public class CelciusToFarenheit extends Activity {
	double celcius, farenheit;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_celcius_to_farenheit);
	
		//MEMBUAT VARIABLE STATEMENT
		final Button btKonvertCelciusTOFarenheit = (Button) findViewById(R.id.btKonvertCelciustoFarenheit);
		final Button btMenuUtama = (Button) findViewById(R.id.btMenuUtama);
		final EditText edNilaiCelcius = (EditText) findViewById(R.id.edNilaiCelcius2);
		final EditText edNilaiFarenheit = (EditText) findViewById(R.id.edNilaiFarenheit);
		final AlertDialog.Builder pesan = new AlertDialog.Builder(CelciusToFarenheit.this);
				
		btKonvertCelciusTOFarenheit.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				try{
					celcius = Double.parseDouble(edNilaiCelcius.getText().toString());
					farenheit = (9/5 * celcius) + 32;
					edNilaiFarenheit.setText(String.valueOf(farenheit));
				}
				catch(Exception ex){
					pesan.setTitle("Pesan");
					pesan.setMessage("Error" +ex);
					pesan.setNeutralButton("OK", null);
					pesan.show();
					
				};
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
		getMenuInflater().inflate(R.menu.celcius_to_farenheit, menu);
		return true;
	}

}
