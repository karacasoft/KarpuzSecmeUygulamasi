package com.karacasoftware.karpuzsecmeuygulamasi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.startapp.android.publish.StartAppAd;

public class MainActivity extends Activity {
	Intent intent;
	Intent intent2;
	TextView TV;
	EditText ET;
	Button ses;
	private StartAppAd ads;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		intent=new Intent(this, com.karacasoftware.karpuzsecmeuygulamasi.SozlesmeActivity.class);
		intent2=new Intent(this, com.karacasoftware.karpuzsecmeuygulamasi.BilgiActivity.class);
		Button sozlesme=(Button)findViewById(R.id.button2);
		Button bilgi=(Button)findViewById(R.id.button3);
		ses=(Button)findViewById(R.id.button1);
		
		TV=(TextView)findViewById(R.id.textView2);
		
		ET=(EditText)findViewById(R.id.editText1);
		
		ses.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				new Thread(new Runnable() {
					
					
					
					@Override
					public void run() {
						ses.post(new Runnable() {
							public void run() {
								ses.setEnabled(false);
							}
						});
						if(!ET.getText().toString().equals(""))
						{
							
							TV.post(new Runnable() {
							
								@Override
								public void run() {
									TV.setText("Þimdi Karpuza Vurun.");
								
								}
							});
							try {
								Thread.sleep(2500);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
							double random=Math.random();
							if(random<0.2)
							{
								TV.post(new Runnable() {
									
									@Override
									public void run() {
										TV.setText("Öööðk. O ne lan. Karpuz deil kabak.");
									
									}
								});
							}else if(random>0.2 && random<0.4)
							{
								TV.post(new Runnable() {
									
									@Override
									public void run() {
										TV.setText("Yani ne bilim. Kanaatkar biriysen...");
									
									}
								});
							}else if(random>0.4 && random<0.6)
							{
								TV.post(new Runnable() {
									
									@Override
									public void run() {
										TV.setText("Ýyi ya");
									
									}
								});
							}else if(random>0.6 && random<0.8)
							{
								TV.post(new Runnable() {
									
									@Override
									public void run() {
										TV.setText("Güzeeeel. Yeterli bu.");
									
									}
								});
							}else if(random>0.8)
							{
								TV.post(new Runnable() {
									
									@Override
									public void run() {
										TV.setText("Oyyþ maþallah. Mükemmel. Harika");
									
									}
								});
							}
						}else{
							TV.post(new Runnable() {
								
								@Override
								public void run() {
									TV.setText("Lütfen karpuzun aðýrlýðýný yazýn.");
								
								}
							});
						}
						ses.post(new Runnable() {
							public void run() {
								ses.setEnabled(true);
							}
						});
					}
					
					
				}).start();
				
				
				
			}
		});
		
		
		
		
		sozlesme.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(intent);
				
			}
		});
		bilgi.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				startActivity(intent2);
				
			}
		});
	}

	@Override
	protected void onResume()
	{
		super.onResume();
		if (ads == null) {
		      ads = new StartAppAd(this);
		      ads.load();
		} 
		
	}
	
	@Override
	public void onBackPressed() {
	   if (ads != null) {
	          ads.show();
	          ads = null;     
	         }
	       super.onBackPressed();
	} 
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
