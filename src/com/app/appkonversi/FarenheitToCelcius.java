package com.app.appkonversi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.app.*;
import android.content.Intent;

public class FarenheitToCelcius extends Activity {
	double farenheit, celcius;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_farenheit_to_celcius);
	
		final EditText edNilaiFarenheit = (EditText) findViewById(R.id.edNilaiFarenheitFTC);
		final EditText edNilaiCelcius = (EditText) findViewById(R.id.edNilaiCelciusFTC);
		final Button btKonvert = (Button) findViewById(R.id.btKonvertFTC);
		final Button btMenuUtama = (Button) findViewById(R.id.btMenuUtamaFTC);
		final AlertDialog.Builder pesan = new AlertDialog.Builder(FarenheitToCelcius.this);
		
		btKonvert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try{
					farenheit = Double.parseDouble(edNilaiFarenheit.getText().toString());
					celcius = (farenheit - 32) * 5/9;
					edNilaiCelcius.setText(String.valueOf(celcius));
				}
				catch(Exception ex){
					pesan.setTitle("Pesan");
					pesan.setMessage("Error :" + ex);
					pesan.setNeutralButton("OK", null);
					pesan.show();
					
					
				}
			}
		});
		
		btMenuUtama.setOnClickListener(new View. OnClickListener() {
			
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
		getMenuInflater().inflate(R.menu.farenheit_to_celcius, menu);
		return true;
	}

}
