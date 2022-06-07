package com.bipul.spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] districtNames;
    private Spinner spinner;
    private TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        districtNames = getResources().getStringArray(R.array.district_names);
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);

        //creating arrayadapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.sample_view, R.id.sampletextView, districtNames);
        spinner.setAdapter(adapter);

        //setting action to button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value=spinner.getSelectedItem().toString();

                textView.setText(value);
            }
        });




    }
}