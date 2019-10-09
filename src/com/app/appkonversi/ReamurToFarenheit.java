package com.app.appkonversi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.app.AlertDialog;
import android.content.Intent;

public class ReamurToFarenheit extends Activity {
	double reamur, farenheit;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_reamur_to_farenheit);
		
		final EditText edNilaiReamur = (EditText) findViewById(R.id.edNilaiReamurRTF);
		final EditText  edNilaiFarenheit = (EditText) findViewById(R.id.edNilaiFarenheitRTF);
		final Button btKonvert = (Button) findViewById(R.id.btKonvertRTF);
		final Button btMenuUtama = (Button) findViewById(R.id.btMenuUtamaRTF);
		final AlertDialog.Builder pesan = new AlertDialog.Builder(ReamurToFarenheit.this) ;
		
		btKonvert.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				try{
					reamur = Double.parseDouble(edNilaiReamur.getText().toString());
					farenheit = reamur * 5/4;
					edNilaiFarenheit.setText(String.valueOf(farenheit));
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
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.reamur_to_farenheit, menu);
		return true;
	}

}
