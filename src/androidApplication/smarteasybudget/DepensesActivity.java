package androidApplication.smarteasybudget;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DepensesActivity extends Activity implements View.OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_depenses);
					
	}
	
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(DepensesActivity.this, MainActivity.class);
			startActivity(intent);
		}	
	
}
