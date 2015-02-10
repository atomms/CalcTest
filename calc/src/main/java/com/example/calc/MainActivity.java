package com.example.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private TextView etiqueta;
	private Button suma;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main4);
		etiqueta = (TextView)findViewById(R.id.textView1); 
		suma = (Button)findViewById(R.id.button1);
//		***
		suma.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				calcularSuma();		
			}
		});
//		
		Button multiplica = (Button)findViewById(R.id.button2);
//		***
		multiplica.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				calcularMultiplica();		
			}
		});
	}
	
	public void calcularSuma(){
		EditText numero1 = (EditText)findViewById(R.id.editText1);
		EditText numero2 = (EditText)findViewById(R.id.editText2);
		int intNumero1 = Integer.parseInt(numero1.getText().toString());
		int intNumero2 = Integer.parseInt(numero2.getText().toString());
		int totalSuma = intNumero1 + intNumero2;
		etiqueta.setText(""+totalSuma);
//		Toast.makeText(this, "Result is: " + totalSuma, Toast.LENGTH_LONG).show();
		}
	
	public void calcularMultiplica(){
		EditText numero1 = (EditText)findViewById(R.id.editText1);
		EditText numero2 = (EditText)findViewById(R.id.editText2);
		int intNumero1 = Integer.parseInt(numero1.getText().toString());
		int intNumero2 = Integer.parseInt(numero2.getText().toString());
		int totalMultiplica = intNumero1 * intNumero2;
		etiqueta.setText(""+totalMultiplica);
//		Toast.makeText(this, "Result is: " + totalMultiplica, Toast.LENGTH_LONG).show();
		}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
