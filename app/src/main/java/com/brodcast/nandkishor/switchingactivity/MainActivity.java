package com.brodcast.nandkishor.switchingactivity;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewResult;
    private EditText mEditTextNumber1;
    private EditText mEditTextNumber2;

    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("........1onCreate");


        mTextViewResult = findViewById(R.id.text_view_result);
        mEditTextNumber1 = findViewById(R.id.edit_text_number1);
        mEditTextNumber2 = findViewById(R.id.edit_text_number2);

        Button buttonOpenActivity2 = findViewById(R.id.button_open_activity2);
        buttonOpenActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditTextNumber1.getText().toString().equals("")
                        || mEditTextNumber2.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Please insert numbers", Toast.LENGTH_SHORT).show();
                } else {

                    int number1 = Integer.parseInt(mEditTextNumber1.getText().toString());
                    int number2 = Integer.parseInt(mEditTextNumber2.getText().toString());

                    Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                    intent.putExtra("number1", number1);
                    intent.putExtra("number2", number2);
                    startActivityForResult(intent, 1);
                }



            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        System.out.println("Result code : "+resultCode);

        if (requestCode == 1) {
            if (resultCode == RESULT_OK) {
                int result = data.getIntExtra("result", 0);
                mTextViewResult.setText("" + result);
            }
            if (resultCode == RESULT_CANCELED) {
                mTextViewResult.setText("Nothing selected");
            }
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("........1onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("........1onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("........1onRestart");
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("........1onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("........1onStop");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("........1onDestroy");

    }


}
