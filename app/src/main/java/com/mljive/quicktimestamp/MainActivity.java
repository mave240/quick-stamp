package com.mljive.quicktimestamp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.app.Activity;

	/**
	 * AppWidgetSample demonstrates app widgets, including:
	 * - Creating a template app widget to an app.
	 * - Updating the app widget periodically (every 30 minutes).
	 * - Adding a button to the app widget that updates on demand.
	 * <p>
	 * MainActivity is unused and includes a message to add the app widget to
	 * the user's home screen.
	 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	public void onNewLabelButtonClick(View view) 
    {
        finish();
	}
}
