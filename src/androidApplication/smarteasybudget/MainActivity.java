package androidApplication.smarteasybudget;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;


public class MainActivity extends Activity implements View.OnClickListener {

	private Button lancerSimulation = null;
	private Button contacts = null;
	 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
					
		lancerSimulation = (Button) findViewById(R.id.button_lancer_simulation);
		lancerSimulation.setOnClickListener(this);	
		
		contacts = (Button) findViewById(R.id.button_contacts);
		contacts.setOnClickListener(this);
	
		
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
		switch(v.getId()){
		
		case R.id.button_lancer_simulation:
			Toast.makeText(this, "Ceci est un test OnClick Simulation", Toast.LENGTH_SHORT).show();
			break;
			
		case R.id.button_contacts:
			Toast.makeText(this, "Ceci est un test OnClick Contacts", Toast.LENGTH_SHORT).show();
			break;
		
		}
		
	}
	
}
