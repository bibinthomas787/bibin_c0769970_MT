package com.example.bibin_c0769970_mt;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;
import android.widget.SeekBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    TextView textView8;
    TextView textView9;
    EditText textView2;
    private SeekBar seekBar;
    Button button;
    Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewActivity();

            }
        });


        // taking the seekbar value and displaying the progrss value in the text view
        TextView seekbarValue = findViewById(R.id.textView10);
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setProgress(5);
        seekbarValue.setText(String.valueOf(seekBar.getProgress()));
        //Spinner spinner = (Spinner) findViewById(R.id.spinner1);

        spinner = findViewById(R.id.spinner1);
       textView2 = findViewById(R.id.textView2);
       textView8 =  findViewById(R.id.textView8);
       textView9 = findViewById(R.id.textView9);


        // spinner.setOnItemSelectedListener(new MyOnItemSelectedListener());
        createSpinnerDynamically();
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
            {

                String text = spinner.getSelectedItem().toString();

                if(text == "BMW") {
                    textView2.setText("25");
                    String content = textView2.getText().toString()+" $"; //gets you the contents of edit text
                    String payment = textView2.getText().toString();
                    textView8.setText(payment);
                    textView9.setText(content);

                    String content2 = textView2.getText().toString()+" $"; //gets you the contents of edit text
                    textView9.setText(content2);

                }
                else if(text == "Audi") {

                    textView2.setText("30");
                    String content3 = textView2.getText().toString()+" $"; //gets you the contents of edit text
                    textView9.setText(content3);
                    String payment = textView2.getText().toString();
                    textView8.setText(payment);

                }
                else if(text == "Bently") {

                    textView2.setText("40");
                    String content4 = textView2.getText().toString()+" $"; //gets you the contents of edit text
                    textView9.setText(content4);
                    String payment = textView2.getText().toString();
                    textView8.setText(payment);

                }
                else if(text == "Maserati") {

                    textView2.setText("62");
                    String content5 = textView2.getText().toString()+" $"; //gets you the contents of edit text
                    textView9.setText(content5);
                    String payment = textView2.getText().toString();
                    textView8.setText(payment);

                }
                 else if(text == "lamborghini")   {

                    textView2.setText("100");
                    String content10 = textView2.getText().toString()+" $"; //gets you the contents of edit text
                    textView9.setText(content10);
                    String payment = textView2.getText().toString();
                    textView8.setText(payment);

                }
                 else if(text == "Honda") {

                    textView2.setText("13");
                    String content11 = textView2.getText().toString()+"$"; //gets you the contents of edit text
                    textView9.setText(content11);
                    String payment = textView2.getText().toString();
                    textView8.setText(payment);
                }
                else if(text == "Mercedes") {

                    textView2.setText("43");
                    String content12 = textView2.getText().toString()+" $"; //gets you the contents of edit text
                    textView9.setText(content12);
                    String payment = textView2.getText().toString();
                    textView8.setText(payment);
                }



            }

            @Override
            public void onNothingSelected(AdapterView<?> parent)
            {
                // can leave this empty
            }
        });




    }

    public void openNewActivity(){
        Intent intent = new Intent(this, SecondPage.class);
        intent.putExtra("username",spinner.getSelectedItem().toString());
        intent.putExtra("price",textView2.getText().toString()+" $");



        startActivity(intent);
    }
    public void chooseFood(View view) {
        textView2.setText(spinner.getSelectedItem().toString());
    }


    private void createSpinnerDynamically() {


        Spinner spinner = (Spinner) findViewById(R.id.spinner1);


        List<String> list = new ArrayList<String>();
        list.add("BMW");
        list.add("Audi");
        list.add("Bently");
        list.add("Maserati");
        list.add("lamborghini");
        list.add("Honda");
        list.add("Mercedes");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(dataAdapter);


    }


}