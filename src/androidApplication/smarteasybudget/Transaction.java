package androidApplication.smarteasybudget;

import java.util.Hashtable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.*;
import android.view.*;



public class Transaction extends Activity {
	
	private Hashtable<String, Float> h_recette = null;
	private Hashtable<String, Float> h_depense = null;
 	private Button ajouter = null;
	private EditText edit_description = null;
	private EditText edit_montant = null;
 	private Button suivant = null;
	private float totalRecette = 0;
	private float totalDepense = 0;
	private RadioGroup radioGr_transaction = null;
	private RadioButton radioButton_recette = null;
	private RadioButton radioButton_depense = null;
	
	final String EXTRA_RECETTE = "total_recette";
	final String EXTRA_DEPENSE = "total_depense";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_transaction);
		
		// On récupère le RadioGroup et les radiobuttons
		    radioGr_transaction = (RadioGroup) findViewById(R.id.radioGroup_transaction);
		    radioButton_recette = (RadioButton) findViewById(R.id.radioB_recette);
		    radioButton_depense = (RadioButton) findViewById(R.id.radioB_depense);
		    ajouter = (Button) findViewById(R.id.button_ajouter_transaction);
			suivant = (Button) findViewById(R.id.button_suivant_transaction);
			edit_description = (EditText)findViewById(R.id.edittext_description_transaction);
			edit_montant = (EditText)findViewById(R.id.edittext_montant_transaction);
			
			
		    // On rajoute un Listener sur le changement de RadioButton sélectionné
		    radioGr_transaction.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
		      @Override
		      public void onCheckedChanged(RadioGroup group, int checkedId) {
		    /*    // En fonction de l'identifiant du RadioButton sélectionné…
		        switch(checkedId)
		        {
		          // On change la couleur actuelle pour noir
		          case R.id.radioB_recette:
		            if(radioButton_recette.isChecked())
		            else radioButton_recette.f
		            break;
		          // On change la couleur actuelle pour bleu
		          case R.id.blue:
		            currentColor = "#0022FF";
		            break; 
		       
				} */
		      }
		    });
		
		
					
		ajouter.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				h_recette = new Hashtable<String,Float> ();
				h_depense = new Hashtable<String,Float> ();
				
				if ((edit_description.getText().toString().equals("")) && (edit_montant.getText().toString().equals("")) ){	
					Toast.makeText(Transaction.this, "Veuillez remplir le champ description et montant", Toast.LENGTH_SHORT).show();	
				} 
				else if (edit_description.getText().toString().equals("")){
					Toast.makeText(Transaction.this, "Veuillez remplir le champ description", Toast.LENGTH_SHORT).show();
				}
				else if (edit_montant.getText().toString().equals("")){
					Toast.makeText(Transaction.this, "Veuillez remplir le champ montant", Toast.LENGTH_SHORT).show();
				}	
				else if (radioButton_recette.isChecked() == true){ 
				
					Toast.makeText(Transaction.this,"Ajout Recette Enregistré", Toast.LENGTH_SHORT).show();	
					h_recette.put(edit_description.getText().toString(), Float.parseFloat(edit_montant.getText().toString()));
					totalRecette= totalRecette + h_recette.get(edit_description.getText().toString());
					edit_description.setText("");
					edit_montant.setText("");
				}
				else {
					Toast.makeText(Transaction.this,"Ajout Dépense Enregistré", Toast.LENGTH_SHORT).show();	
					h_depense.put(edit_description.getText().toString(), Float.parseFloat(edit_montant.getText().toString()));
					totalDepense= totalDepense + h_depense.get(edit_description.getText().toString());
					edit_description.setText("");
					edit_montant.setText("");
					
				}
			 }
		 });
			
		suivant.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {      
				Intent intent = new Intent(Transaction.this, RecapitulatifActivity.class);
			    intent.putExtra(EXTRA_RECETTE, totalRecette);
			    intent.putExtra(EXTRA_DEPENSE, totalDepense);
				startActivity(intent);
			 }
		 });
		 
		
	} 
			
}
