package com.app.appkonversi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.app.AlertDialog;
import android.content.Intent;

public class ReamurToCelcius extends Activity {
	double reamur, celcius;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reamur_to_celcius);
		
		final EditText edNilaiReamur = (EditText) findViewById(R.id.edNilaiReamurRTC);
		final EditText  edNilaiCelcius = (EditText) findViewById(R.id.edNilaiCelciusRTC);
		final Button btKonvert = (Button) findViewById(R.id.btKonvertRTC);
		final Button btMenuUtama = (Button) findViewById(R.id.btMenuUtamaRTC);
		final AlertDialog.Builder pesan = new AlertDialog.Builder(ReamurToCelcius.this) ;
		
		btKonvert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try{
					reamur = Double.parseDouble(edNilaiReamur.getText().toString());
					celcius = (reamur * 9/4) + 32;
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
		getMenuInflater().inflate(R.menu.reamur_to_celcius, menu);
		return true;
	}

}
