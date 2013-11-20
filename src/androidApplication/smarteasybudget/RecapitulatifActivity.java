package androidApplication.smarteasybudget;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.*;
import android.view.*;


public class RecapitulatifActivity extends Activity {


	Contacts contactView = null; 
	final String EXTRA_RECETTE = "total_recette";
	final String EXTRA_DEPENSE= "total_depense";
	final String EXTRA_LISTE_DESCRIPTION_RECETTE = "total_recette";
	
	private float valeurRecette = 0;
	private float totalRecette = 0;
	private float valeurDepense = 0;
	private float totalDepense = 0;
	private Button menu_principal = null;
	private Button reco_simu = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_resume);
			float montantTotal = 0;

		 Intent intent = getIntent();
		   TextView total_conseil = (TextView) findViewById(R.id.textview_result_conseil);
	       TextView total_recette = (TextView) findViewById(R.id.textview_test_total_recette);
	       TextView total_depense = (TextView) findViewById(R.id.textview_test_total_depense);
	       TextView montant_restant = (TextView) findViewById(R.id.textview_montant_restant);
	       Button menu_principal = (Button) findViewById(R.id.button_menu_resume);
	       Button reco_simu = (Button) findViewById(R.id.button_recommencer_simu);
	       
	  //     TextView liste_desc_recette = (TextView) findViewById(R.id.textview_desc_recette);
	       
	       if (intent != null) {
	   // 	   listeDescRecette = new ArrayList<String>();
	    	   totalRecette=intent.getFloatExtra(EXTRA_RECETTE, valeurRecette);
	    	   total_recette.setText("Recette total: "+ String.valueOf(totalRecette)+" euros" );
	    	   totalDepense=intent.getFloatExtra(EXTRA_DEPENSE, valeurDepense);
	    	   total_depense.setText("Dépense total: "+ String.valueOf(totalDepense)+" euros");
	    	   montantTotal= totalRecette-totalDepense;
	    	   montant_restant.setText("Montant total restant: "+ String.valueOf(montantTotal) + " euros");
	    	   
	    	   if (montantTotal < 0) {
	    		   total_conseil.setText("Vous devez revoir votre budget, vous ne pouvez plus continuer ainsi !");
	    	   }	
	    	   		else if (montantTotal == 0 ){
	    	   			total_conseil.setText("Vous êtes tout juste sur le fil, des efforts sont à prévoir !");
	    	   		}   	   
	    	   			else {
	    	   				total_conseil.setText("Vous gérez votre budget, félicitations !");
	    	   			}
			
	    	   
	    	   //Récupérer la description des recettes
	    /*	   listeDescRecette= intent.getStringArrayListExtra(EXTRA_LISTE_DESCRIPTION_RECETTE);    	   
	    	   for (int i=0; i<listeDescRecette.size();i++){
	    	   liste_desc_recette.setText(listeDescRecette.get(i).toString()); 
	    	   } */
	       }
		
	   	reco_simu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {      
				totalRecette = totalDepense = 0;
				Intent intent = new Intent(RecapitulatifActivity.this, Transaction.class);
				startActivity(intent);
			 }
		 });
	   	
	   	menu_principal.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { 
				totalRecette = totalDepense = 0;
				Intent intent = new Intent(RecapitulatifActivity.this, MainActivity.class);
				startActivity(intent);
			 }
		 });
	}
	
}
