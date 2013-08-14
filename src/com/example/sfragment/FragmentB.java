package com.example.sfragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment{
	public FragmentB(){
		System.out.println(this.getClass().getSimpleName());
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		TextView t = new TextView(getActivity());
		t.setText("Press spacebar to switch to A");
		
		return t;
	}
}