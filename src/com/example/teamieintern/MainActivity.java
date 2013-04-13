package com.example.teamieintern;

import java.util.ArrayList;
import java.util.Arrays;
import java.lang.String;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends Activity implements OnItemSelectedListener {
	Spinner[] spinner;
	 CharSequence[] op2;
	ArrayAdapter<String> adp2;
	static boolean flag=false;
	
	public static String[] OPTIONS  = {" phosphorescence"," electron"," plum pudding model", "radiation", "James Chadwick", "spectrum"," Albert Einstein", " mass–energy equivalence", " nucleons"}; // Used in spinner1
	ArrayAdapter<String> adapter1, adapter2; 
	ArrayList<String> list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		spinner= new Spinner[10];
		
		list.addAll(Arrays.asList(OPTIONS));
		
		spinner[1] = (Spinner) findViewById(R.id.spinner1);
		adapter1 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, list);
     adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
     spinner[1].setAdapter(adapter1); // Apply the adapter to the spinner
     spinner[1].setOnItemSelectedListener(this);
     
     spinner[2] = (Spinner) findViewById(R.id.spinner2);
		adapter2 = new ArrayAdapter<String> (this, android.R.layout.simple_spinner_item, list);
  adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
  spinner[2].setAdapter(adapter2); // Apply the adapter to the spinner
  spinner[2].setOnItemSelectedListener(this);
  
  spinner[3] = (Spinner) findViewById(R.id.spinner3);
	ArrayAdapter<CharSequence> adapter3 = new ArrayAdapter<CharSequence> (this, android.R.layout.simple_spinner_item, OPTIONS);
adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
spinner[3].setAdapter(adapter3); // Apply the adapter to the spinner
spinner[3].setOnItemSelectedListener(this);

spinner[4] = (Spinner) findViewById(R.id.spinner4);
ArrayAdapter<CharSequence> adapter4 = new ArrayAdapter<CharSequence> (this, android.R.layout.simple_spinner_item, OPTIONS);
adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
spinner[4].setAdapter(adapter4); // Apply the adapter to the spinner
spinner[4].setOnItemSelectedListener(this);

spinner[5] = (Spinner) findViewById(R.id.spinner5);
ArrayAdapter<CharSequence> adapter5 = new ArrayAdapter<CharSequence> (this, android.R.layout.simple_spinner_item, OPTIONS);
adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
spinner[5].setAdapter(adapter5); // Apply the adapter to the spinner
spinner[5].setOnItemSelectedListener(this);

spinner[6] = (Spinner) findViewById(R.id.spinner6);
ArrayAdapter<CharSequence> adapter6 = new ArrayAdapter<CharSequence> (this, android.R.layout.simple_spinner_item, OPTIONS);
adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
spinner[6].setAdapter(adapter6); // Apply the adapter to the spinner
spinner[6].setOnItemSelectedListener(this);

spinner[7] = (Spinner) findViewById(R.id.spinner7);
ArrayAdapter<CharSequence> adapter7 = new ArrayAdapter<CharSequence> (this, android.R.layout.simple_spinner_item, OPTIONS);
adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
spinner[7].setAdapter(adapter7); // Apply the adapter to the spinner
spinner[7].setOnItemSelectedListener(this);

spinner[8] = (Spinner) findViewById(R.id.spinner8);
ArrayAdapter<CharSequence> adapter8 = new ArrayAdapter<CharSequence> (this, android.R.layout.simple_spinner_item, OPTIONS);
adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
spinner[8].setAdapter(adapter8); // Apply the adapter to the spinner
spinner[8].setOnItemSelectedListener(this);

spinner[9] = (Spinner) findViewById(R.id.spinner9);
ArrayAdapter<CharSequence> adapter9 = new ArrayAdapter<CharSequence> (this, android.R.layout.simple_spinner_item, OPTIONS);
adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); // Specify the layout to use when the list of choices appears
spinner[9].setAdapter(adapter9); // Apply the adapter to the spinner
spinner[9].setOnItemSelectedListener(this);
     
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
		if(flag){
		switch(parent.getId()) {
		case R.id.spinner1:
			remove(position);
			break;
		case R.id.spinner2:
		break;
		case R.id.spinner3:
			break;
		case R.id.spinner4:
			break;
		case R.id.spinner5:
			break;
		case R.id.spinner6:
			break;
		case R.id.spinner7:
			break;
		case R.id.spinner8:
			break;
		case R.id.spinner9:
			break;
		/*case R.id.spinner3:
			showToast("Spinner2: position=" + position + ", Value= " + OPTIONS[position]);
			break;*/
		default:
			
			//showToast("Read error log"); // DEBUG
			break;
		}
		}
		else
		{
			flag=true;
		}
	}
	
	 private void remove(int pos) {
        
		 op2= new CharSequence[10];
		// TODO Auto-generated method stub
		 adapter2.clear();
		 for(int i=0;i<OPTIONS.length;i++)
		 {
			 if(i!=pos)
			 {
				 adapter2.add(OPTIONS[i]);
			 }
		 }
		 adapter2.notifyDataSetChanged();
     }
	
	@Override
	public void onNothingSelected(AdapterView<?> parent) {
		Toast.makeText(this, "You selected nothing", Toast.LENGTH_LONG).show();
	}

	/** Helper Functions */
 void showToast(CharSequence msg) {
     Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
 }
}
