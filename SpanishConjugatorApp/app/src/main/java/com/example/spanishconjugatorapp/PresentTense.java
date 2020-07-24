package com.example.spanishconjugatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class PresentTense extends AppCompatActivity {


    String verb;
    String clVerb;
    String form;
    String clForm;
    Button submitButton;

    EditText verbInput;
    EditText formInput;

    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present_tense);



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
                    case "er": {
                        ConjugateER(verb, clForm);
                        break;
                    }
                    case "ir": {
                        ConjugateIR(verb, clForm);
                        break;
                    }
                    case "ar": {
                        ConjugateAR(verb, clForm);
                        break;
                    }
                    default: {
                        //"opps"
                    }

                }
            }


            public void ConjugateER(String verb, String clForm) {
                String root = verb.substring(0, verb.length() - 2);

                switch (clForm) {
                    case "YO": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "o");
                        break;

                    }
                    case "TU":
                    case "TÚ":    {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "es");
                        break;
                    }
                    case "EL":
                    case "USTED":
                    case "ELLA":
                        {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "e");
                        break;
                    }
                    case "NOS":
                    case "NOSOTROS":{
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "emos");
                        break;
                    }
                    case "ELLOS":
                    case "USTEDES":
                    case "ELLAS":{
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "en");
                        break;
                    }
                }


            }
            public void ConjugateAR(String verb, String clForm) {
                String root = verb.substring(0, verb.length() - 2);

                    switch (clForm) {
                        case "YO": {
                            TextView theTextView = (TextView) findViewById(R.id.TVResults);
                            theTextView.setText( "Your Conjugated verb is "+root + "o");
                            break;

                        }
                        case "TU":{
                            TextView theTextView = (TextView) findViewById(R.id.TVResults);
                            theTextView.setText( "Your Conjugated verb is "+root + "as");
                            break;
                        }
                        case "EL":
                        case "USTED":
                        case "ELLA":
                        {
                            TextView theTextView = (TextView) findViewById(R.id.TVResults);
                            theTextView.setText( "Your Conjugated verb is "+root + "a");
                            break;
                        }
                        case "NOS":
                        case "NOSOTROS":{
                            TextView theTextView = (TextView) findViewById(R.id.TVResults);
                            theTextView.setText( "Your Conjugated verb is "+root + "amos");
                            break;
                        }
                        case "ELLOS":
                        case "USTEDES":
                        case "ELLAS":{
                            TextView theTextView = (TextView) findViewById(R.id.TVResults);
                            theTextView.setText( "Your Conjugated verb is "+root + "an");
                            break;
                        }
                    }
                }
            public void ConjugateIR(String verb, String clForm) {
                String root = verb.substring(0, verb.length() - 2);

                switch (clForm) {
                    case "YO": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "o");
                        break;

                    }
                    case "TU":{
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "es");
                        break;
                    }
                    case "EL":
                    case "USTED":
                    case "ELLA":
                    {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "e");
                        break;
                    }
                    case "NOS":
                    case "NOSOTROS":{
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "imos");
                        break;
                    }
                    case "ELLOS":
                    case "USTEDES":
                    case "ELLAS":{
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText( "Your Conjugated verb is "+root + "en");
                        break;
                    }
                }
            }


        });

    }


}
