package com.example.calc.test;

import com.example.calc.MainActivity;
import com.example.calc.R;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyTestCase extends ActivityInstrumentationTestCase2<MainActivity> {
	private TextView etiqueta;
	private Button suma;
	private Button mul;
	private EditText etext1;
	private EditText etext2;
	private MainActivity actividad;

	public MyTestCase() {
//		super("com.example.calc", MainActivity.class);
		super(MainActivity.class);
	}

	protected void setUp() throws Exception {
		super.setUp();
		actividad = getActivity();
		etiqueta = (TextView) actividad.findViewById(R.id.textView1);
		etext1 = (EditText) actividad.findViewById(R.id.editText1);
		etext2 = (EditText) actividad.findViewById(R.id.editText2);
		suma = (Button) actividad.findViewById(R.id.button1);
		mul = (Button) actividad.findViewById(R.id.button2);
		// MainActivity actividad = getActivity();
		// suma = (Button) actividad.findViewById(R.id.button1);
		// suma.requestFocus();
		// suma.performClick();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	private static final String NUMBER_1 = "2";
	private static final String NUMBER_2 = "3";
	private static final String ADD_RESULT = "5";
	private static final String MUL_RESULT = "6";

	public void testAddValues() {
		TouchUtils.tapView(this, etext1);
		sendKeys(NUMBER_1);
		// now on value2 entry
 		TouchUtils.tapView(this, etext2);
		sendKeys(NUMBER_2);
		// now on Add button
		TouchUtils.clickView(this, suma);
		// sendKeys("ENTER");
		// get result
		String mathResult1 = etiqueta.getText().toString();
		// Log.d("JUNIT", mathResult1);
		assertTrue("Add result should be 86", mathResult1.equals(ADD_RESULT));
	}

	public void testMultiplyValues() {
		TouchUtils.tapView(this, etext1);
		sendKeys(NUMBER_1);
		// now on value2 entry
		TouchUtils.tapView(this, etext2);
		sendKeys(NUMBER_2);
		// now on Multiply button
		TouchUtils.clickView(this, mul);
		// sendKeys(KeyEvent.KEYCODE_DPAD_RIGHT);
		// sendKeys("ENTER");
		// get result
		String mathResult2 = etiqueta.getText().toString();
		assertTrue("Multiply result should be 888",
				mathResult2.equals(MUL_RESULT));
	}

}
