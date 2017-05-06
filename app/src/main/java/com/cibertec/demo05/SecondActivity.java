package com.cibertec.demo05;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by luisrios on 5/6/17.
 */

public class SecondActivity extends AppCompatActivity {

	private EditText etSecondFirstName, etSecondLastName, etSecondCellphone, etSecondAge;
	private Button btSecondSend;

	private final View.OnClickListener btSecondSendOnClickListener = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Intent intent = new Intent();
			intent.putExtra("firstName", etSecondFirstName.getText().toString());
			intent.putExtra("lastName", etSecondLastName.getText().toString());
			intent.putExtra("cellphone", etSecondCellphone.getText().toString());
			intent.putExtra("age", etSecondAge.getText().toString());
			setResult(RESULT_OK,intent);
			finish();
		}
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second_activity);

		etSecondFirstName = (EditText) findViewById(R.id.etSecondFirstName);
		etSecondLastName = (EditText) findViewById(R.id.etSecondLastName);
		etSecondCellphone = (EditText) findViewById(R.id.etSecondCellphone);
		etSecondAge = (EditText) findViewById(R.id.etSecondAge);
		btSecondSend = (Button) findViewById(R.id.btSecondSend);
		btSecondSend.setOnClickListener(btSecondSendOnClickListener);
	}
}