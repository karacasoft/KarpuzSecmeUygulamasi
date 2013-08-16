package com.karacasoftware.karpuzsecmeuygulamasi;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class SozlesmeActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sozlesme);
		// Show the Up button in the action bar.
		setupActionBar();
		
		TextView TV=(TextView) findViewById(R.id.textView1);
		TV.setText("Uygulamay� kullanan ki�i a�a��daki �artlar� kabul etmi� say�l�r.\n"
				+ "1. Uygulama hi� bir �ekilde k�t� ama�lar i�in kullan�lmamal�d�r.\n"
				+ "2. Uygulama sadece karpuz se�mek i�in kullan�lmal�d�r. (Ba�ka �eyler de�il)\n"
				+ "3. Uygulaman�n ��kard��� sonu�lara sayg� duyulmal�d�r.\n"
				+ "4. Uygulaman�n herhangi bir �ekilde k�t� ama�l� kullan�m�na �ahit olunursa bildirilmelidir.\n"
				+ "5. Uygulaman�n yap�mc�s� (m�kemmel insan) Mahmut Karaca'ya (ciddiye almay�n l�tfen :D) yapt��� bu harika uygulama i�in Google Play'de 5 y�ld�z verilmelidir.\n"
				+ "6. Bu �artlar� kabul etmeyen kullan�c�lara uygulama d�nyan�n en dandik karpuzlar�n� bulup getirecektir. :P");
		
	}

	/**
	 * Set up the {@link android.app.ActionBar}, if the API is available.
	 */
	@TargetApi(Build.VERSION_CODES.HONEYCOMB)
	private void setupActionBar() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
			getActionBar().setDisplayHomeAsUpEnabled(true);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sozlesme, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpFromSameTask(this);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
