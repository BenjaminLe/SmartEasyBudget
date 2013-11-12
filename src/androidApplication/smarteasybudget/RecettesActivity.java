package androidApplication.smarteasybudget;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.widget.*;
import android.view.*;



public class RecettesActivity extends Activity implements View.OnClickListener{
	

 	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_recettes);
					
	}
	
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(RecettesActivity.this, MainActivity.class);
			startActivity(intent);
		}	
}
