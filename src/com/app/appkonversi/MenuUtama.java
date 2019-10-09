package com.app.appkonversi;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.app.AlertDialog;
import android.content.Intent;


public class MenuUtama extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menuutama);
        final AlertDialog.Builder pesan = new AlertDialog.Builder(MenuUtama.this);
        final Button btCelciusToFarenheit = (Button) findViewById(R.id.btCelciustoFarenheit);
        final Button btCelciusToReamur = (Button) findViewById(R.id.btCelciustoReamur);
        final Button btFarenheitToCelcius = (Button) findViewById(R.id.btFarenheittoCelcius);
        final Button btFarenheitToReamur = (Button) findViewById(R.id.btFarenheittoReamur);
        final Button btReamurToFarenheit = (Button) findViewById(R.id.btReamurtoFarenheit);
        final Button btReamurToCelcius = (Button) findViewById(R.id.btReamurtoCelcius);
        final Button btkeluar = (Button) findViewById(R.id.btKeluar);
        final Button btAbout = (Button) findViewById(R.id.btAbout);
        
        
    
    btCelciusToFarenheit.setOnClickListener(new View.OnClickListener() {
		public void onClick(View arg0) {
	//		try{
			Intent nextActivity = new Intent(MenuUtama.this, CelciusToFarenheit.class);
			startActivity(nextActivity);
			System.exit(0);
		/*	}
			catch(Exception ex){
				pesan.setTitle("Pesan");
				pesan.setMessage("Error" +ex);
				pesan.setNeutralButton("OK", null);
				pesan.show();
				
			} 
		}*/ }
	});
    
    btCelciusToReamur.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			Intent nextActivity = new Intent(getApplicationContext(), CelciusToReamur.class);
			startActivity(nextActivity);
			System.exit(0);
		}
	});
    
    btFarenheitToReamur.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			try{
			Intent nextActivity = new Intent(getApplicationContext(), FarenheitToReamur.class);
			startActivity(nextActivity);
			System.exit(0);
		}
		catch(Exception ex){
			pesan.setTitle("Pesan");
			pesan.setMessage("Error" +ex);
			pesan.setNeutralButton("OK", null);
			pesan.show();
			
		} 
			
		}
	});
    
btReamurToFarenheit.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			try{
			Intent nextActivity = new Intent(getApplicationContext(), ReamurToFarenheit.class);
			startActivity(nextActivity);
			System.exit(0);
		}
		catch(Exception ex){
			pesan.setTitle("Pesan");
			pesan.setMessage("Error" +ex);
			pesan.setNeutralButton("OK", null);
			pesan.show();
			
		} 
			
		}
	});

btReamurToCelcius.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		try{
		Intent nextActivity = new Intent(getApplicationContext(), ReamurToCelcius.class);
		startActivity(nextActivity);
		System.exit(0);
	}
	catch(Exception ex){
		pesan.setTitle("Pesan");
		pesan.setMessage("Error" +ex);
		pesan.setNeutralButton("OK", null);
		pesan.show();
		
	} 
		
	}
});

btkeluar.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		finish();
		System.exit(0);

		
	}
});


btFarenheitToCelcius.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		try{
		Intent nextActivity = new Intent(getApplicationContext(), FarenheitToCelcius.class);
		startActivity(nextActivity);
		System.exit(0);
	}
	catch(Exception ex){
		pesan.setTitle("Pesan");
		pesan.setMessage("Error" +ex);
		pesan.setNeutralButton("OK", null);
		pesan.show();
		
	} 
		
	}
}); 

btAbout.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		pesan.setTitle("INFORMATION");
		pesan.setMessage("2016, APPLICATION CREATED BY ALDI DARMAWAN\n\n AVproject\n\n   CONTACT \nALDI.darmawan05@gmail.com");
		pesan.setNeutralButton("OK", null);
		pesan.show();
		
	}
});
    
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_utama, menu);
        return true;
    }
    
}
