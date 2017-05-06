package com.cibertec.demo05;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
	private final int REQUEST_CODE = 1;
	private TextView tvMainFirstName, tvMainLastName, tvMainCellphone, tvMainAge;
	private Button btMainCall;

	private final View.OnClickListener btMainCallOnClickListener = new View.OnClickListener() {
		@Override
		public void onClick(View view) {
			Intent intent = new Intent(MainActivity.this, SecondActivity.class);
			startActivityForResult(intent, REQUEST_CODE);
		}
	};

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		tvMainFirstName = (TextView) findViewById(R.id.tvMainFirstName);
		tvMainLastName = (TextView) findViewById(R.id.tvMainLastName);
		tvMainCellphone = (TextView) findViewById(R.id.tvMainCellphone);
		tvMainAge = (TextView) findViewById(R.id.tvMainAge);
		btMainCall = (Button) findViewById(R.id.btMainCall);
		btMainCall.setOnClickListener(btMainCallOnClickListener);
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		if (requestCode == REQUEST_CODE) {
			if (resultCode == RESULT_OK) {
				tvMainFirstName.setText(data.getStringExtra("firstName"));
				tvMainLastName.setText(data.getStringExtra("lastName"));
				tvMainCellphone.setText(data.getStringExtra("cellphone"));
				tvMainAge.setText(data.getStringExtra("age"));
			}
		}
	}
}
