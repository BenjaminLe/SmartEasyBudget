package androidApplication.smarteasybudget;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.*;
import android.view.*;


public class RecapitulatifActivity extends Activity implements View.OnClickListener {


	Contacts contactView = null; 
	final String EXTRA_RECETTE = "total_recette";
	final String EXTRA_DEPENSE= "total_depense";
	private float valeurRecette = 0;
	private float totalRecette = 0;
	private float valeurDepense = 0;
	private float totalDepense = 0;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resume);
					
		
		 Intent intent = getIntent();
	       TextView total_recette = (TextView) findViewById(R.id.textview_test_total_recette);
	       TextView total_depense = (TextView) findViewById(R.id.textview_test_total_depense);
	       
	       if (intent != null) {
	    	   totalRecette=intent.getFloatExtra(EXTRA_RECETTE, valeurRecette);
	    	   total_recette.setText(String.valueOf(totalRecette));
	    	   totalDepense=intent.getFloatExtra(EXTRA_DEPENSE, valeurDepense);
	    	   total_depense.setText(String.valueOf(totalDepense));
	    	   
	       }
		
		
		
	/*	lancerSimulation = (Button) findViewById(R.id.button_lancer_simulation);
		lancerSimulation.setOnClickListener(this);	
		
		contacts = (Button) findViewById(R.id.button_contacts);
		contacts.setOnClickListener(this);
	
		*/
	/*	 lancerSimulation.setOnClickListener(new View.OnClickListener() {
		      @Override
		      public void onClick(View v) {
		    	  
		    	  Toast.makeText(MainActivity.this, "Ceci est un test OnClick Simulation", Toast.LENGTH_SHORT).show();
		    	  
		      }
		    });
		         
		 contacts.setOnClickListener(new View.OnClickListener() {
		      @Override
		      public void onClick(View v) {
		    	  Toast.makeText(MainActivity.this, "Ceci est un test OnClick Contacts", Toast.LENGTH_SHORT).show();
		      }
		    });	*/
		
	}

	@Override
	public void onClick(View v) {
	/*	switch(v.getId()){
		
		case R.id.button_lancer_simulation:
			Intent intent1 = new Intent(MainActivity.this, Transaction.class);
			startActivity(intent1);
			break;
			
		case R.id.button_contacts:
			Intent intent2 = new Intent(MainActivity.this, Contacts.class);
			startActivity(intent2);
			break;
			
		} */
		
	}
	
}
