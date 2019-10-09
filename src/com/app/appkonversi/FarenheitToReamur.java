package com.app.appkonversi;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.view.Menu;
import android.view.View;
import android.content.Intent;
import android.widget.*;

public class FarenheitToReamur extends Activity {
	double farenheit, reamur;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_farenheit_to_reamur);
		
		final EditText edNilaiFarenheit = (EditText) findViewById(R.id.edNilaiFarenheitFTR);
		final EditText edNilaiReamur = (EditText) findViewById(R.id.edNIlaiReamurFTR);
		final Button btKonvert = (Button) findViewById(R.id.btKonvertFTR);
		final Button btMenuUtama = (Button) findViewById(R.id.btMenuUtamaFTR);
		final AlertDialog.Builder pesan = new AlertDialog.Builder(FarenheitToReamur.this);
	
		btKonvert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try{
					farenheit = Double.parseDouble(edNilaiFarenheit.getText().toString());
					reamur = (farenheit - 32) * 4/9;
					edNilaiReamur.setText(String.valueOf(reamur));
				}
				catch(Exception ex){
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
		getMenuInflater().inflate(R.menu.farenheit_to_reamur, menu);
		return true;
	}

}
