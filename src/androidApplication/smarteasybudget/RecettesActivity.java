package androidApplication.smarteasybudget;

import java.util.Hashtable;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.*;
import android.view.*;



public class RecettesActivity extends Activity {
	
	private Hashtable<String, Float> h = null;
 	private Button ajouter = null;
	private EditText edit_description = null;
	private EditText edit_montant = null;
 	private Button suivant = null;
	private float totalRecette = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recettes);
		
		
		edit_description = (EditText)findViewById(R.id.edittext_description_recette);
		edit_montant = (EditText)findViewById(R.id.edittext_montant_recette);
		ajouter = (Button) findViewById(R.id.button_ajouter_recette);
		suivant = (Button) findViewById(R.id.button_suivant_recette);
		
					
		ajouter.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				h = new Hashtable<String,Float> ();
				
				if ((edit_description.getText().toString().equals("")) && (edit_montant.getText().toString().equals("")) ){	
					Toast.makeText(RecettesActivity.this, "Veuillez remplir le champ description et montant", Toast.LENGTH_SHORT).show();	
				} 
				else if (edit_description.getText().toString().equals("")){
					Toast.makeText(RecettesActivity.this, "Veuillez remplir le champ description", Toast.LENGTH_SHORT).show();
				}
				else if (edit_montant.getText().toString().equals("")){
					Toast.makeText(RecettesActivity.this, "Veuillez remplir le champ montant", Toast.LENGTH_SHORT).show();
				}	
				else{ 
				Toast.makeText(RecettesActivity.this,"Ajout Enregistré", Toast.LENGTH_SHORT).show();	
				h.put(edit_description.getText().toString(), Float.parseFloat(edit_montant.getText().toString()));
				totalRecette= totalRecette + h.get(edit_description.getText().toString());
				edit_description.setText("");
				edit_montant.setText("");
				}
			 }
		 });
			
		suivant.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {      
				Intent intent = new Intent(RecettesActivity.this, DepensesActivity.class);
				//intent.put
				startActivity(intent);
			 }
		 });
		
	}
			
}
