package com.brodcast.nandkishor.switchingactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        System.out.println("........2onCreate");

        setTitle("Activity 2");

        Intent intent = getIntent(); //return a intent which is used to call this activity
        final int number1 = intent.getIntExtra("number1", 0);
        final int number2 = intent.getIntExtra("number2", 0);

        TextView textViewNumbers = findViewById(R.id.text_view_numbers);
        textViewNumbers.setText("Numbers: " + number1 + ", " + number2);

        Button buttonAdd = findViewById(R.id.button_add);
        Button buttonSubtract = findViewById(R.id.button_subtract);

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = number1 + number2;

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int result = number1 - number2;

                Intent resultIntent = new Intent();
                resultIntent.putExtra("result", result);

                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });


    }

    @Override
    public void finish() {
        super.finish();
        System.out.println("Clicked back button bro");
    }


    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("........2onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("........2onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println("........2onRestart");
    }


    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("........2onStart");

    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("........2onStop");
    }



    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("........2onDestroy");

    }

}
