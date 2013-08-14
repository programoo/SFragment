package com.example.sfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;

public class MainActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println(this.getClass().getSimpleName());

		setContentView(R.layout.activity_main);

		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		Fragment productDetails = new FragmentA();
		fragmentTransaction.replace(R.id.mainFragement, productDetails);
		fragmentTransaction.commit();
        
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		
	}

	@Override
	public boolean onKeyUp(int keyCode, KeyEvent event) {
		// TODO Auto-generated method stub
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		Fragment productDetails = new FragmentA();
		fragmentTransaction.replace(R.id.mainFragement, productDetails);
		fragmentTransaction.commit();
		
		return super.onKeyUp(keyCode, event);
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		
		// TODO Auto-generated method stub
		FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
		Fragment productDetails = new FragmentB();
		fragmentTransaction.replace(R.id.mainFragement, productDetails);
		fragmentTransaction.commit();
		
		
		return super.onKeyDown(keyCode, event);

	}
	

}
