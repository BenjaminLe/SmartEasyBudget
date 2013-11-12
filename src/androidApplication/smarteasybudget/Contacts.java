package androidApplication.smarteasybudget;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.*;
import android.view.*;




public class Contacts extends Activity implements View.OnClickListener {

	private Button menu_principal = null;
	 	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.contacts);
					
		menu_principal = (Button) findViewById(R.id.button_menu_principal_contacts);
		menu_principal.setOnClickListener(this);	
			
	}
	
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(Contacts.this, MainActivity.class);
			startActivity(intent);		
		}	
	
}
