package com.example.spanishconjugatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FutureTense extends AppCompatActivity {

    String verb;
    String form;
    String clForm;
    String clVerb;
    Button submitButton;

    EditText verbInput;
    EditText formInput;

    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_future_tense);

        verbInput = (EditText) findViewById(R.id.TVVerb);
        formInput = (EditText) findViewById(R.id.TVForm);
        results = (TextView) findViewById(R.id.TVResults);

        submitButton = (Button) findViewById(R.id.BtnSubmit);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clVerb = verbInput.getText().toString();
                verb = clVerb.toLowerCase();
                form = formInput.getText().toString();
                clForm = form.toUpperCase();


                String substring = verb.substring(Math.max(verb.length() - 2, 0));

                switch (substring) {
                    case "er":
                    case "ar":
                    case "ir":    {
                        ConjugateER(verb, clForm);
                        break;
                    }


                }
            }


            public void ConjugateER(String verb, String clForm) {
                String root = verb.substring(0, verb.length() - 2);

                switch (clForm) {
                    case "YO": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+verb + "é");
                        break;

                    }
                    case "TU":
                    case "TÚ":    {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+verb + "ás");
                        break;
                    }
                    case "EL":
                    case "USTED":
                    case "ELLA":
                    {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+verb + "á");
                        break;
                    }
                    case "NOS":
                    case "NOSOTROS":{
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+verb + "emos");
                        break;
                    }
                    case "ELLOS":
                    case "USTEDES":
                    case "ELLAS":{
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+verb + "án");
                        break;
                    }
                }


            }



        });

    }
}