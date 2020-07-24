package com.example.spanishconjugatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PastTense extends AppCompatActivity {



    String verb;
    String form;
    String clVerb;
    String clForm;
    Button submitButton;

    EditText verbInput;
    EditText formInput;

    TextView results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_past_tense);

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

                ;
                String substring = verb.substring(Math.max(verb.length() - 2, 0));

                if (verb.equals("ser")) {
                    ConjugateSer(clForm);
                } else if (verb.equals("ir")) {
                    ConjugateSer(clForm);
                } else if (verb.equals("dar")) {
                    ConjugateDar(clForm);
                } else if (verb.equals("ver")) {
                    COnjugateVer(clForm);
                } else{
                    switch(substring){
                        case "ar":{
                            ConjugateAR(verb, clForm);
                            break;
                        }
                        case "ir":
                        case "er":{
                            ConjugateER(verb, clForm);
                            break;
                        }
                    }
                }



            }

            public void ConjugateER(String verb, String clForm) {
                String root = verb.substring(0, verb.length() - 2);

                switch (clForm) {
                    case "YO": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "í");
                        break;

                    }
                    case "TU":
                    case "TÚ":    {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "iste");
                        break;
                    }
                    case "EL":
                    case "USTED":
                    case "ELLA": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "ió");
                        break;
                    }
                    case "NOS":
                    case "NOSOTROS": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "imos");
                        break;
                    }
                    case "ELLOS":
                    case "USTEDES":
                    case "ELLAS": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "ieron");
                        break;
                    }
                }


            }

            public void ConjugateAR(String verb, String clForm) {
                String root = verb.substring(0, verb.length() - 2);

                switch (clForm) {
                    case "YO": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "é");
                        break;

                    }
                    case "TU": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "aste");
                        break;
                    }
                    case "EL":
                    case "USTED":
                    case "ELLA": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "ó");
                        break;
                    }
                    case "NOS":
                    case "NOSOTROS": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "amos");
                        break;
                    }
                    case "ELLOS":
                    case "USTEDES":
                    case "ELLAS": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is " + root + "aron");
                        break;
                    }
                }
            }

            public void ConjugateSer(String clForm) {
                switch (clForm) {
                    case "YO": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is fui ");
                        break;
                    }
                    case "TU": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is fuiste ");
                         break;
                    }
                    case "EL":
                    case "ELLA":
                    case "USTED": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is fue ");
                         break;
                    }
                    case "NOS":
                    case "NOSOTROS": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is fuimos ");
                         break;
                    }
                    case "ELLOS":
                    case "ELLAS":
                    case "USTEDES": {
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is fueron ");
                         break;
                    }

                }
            }
            public void ConjugateDar(String clForm){


               switch(clForm){
                   case "YO":{
                       TextView theTextView = (TextView) findViewById(R.id.TVResults);
                       theTextView.setText("Your Conjugated verb is di");
                       break;
                   }
                   case "TU":{
                       TextView theTextView = (TextView) findViewById(R.id.TVResults);
                       theTextView.setText("Your Conjugated verb is diste");
                       break;
                   }
                   case "EL":
                   case "ELLA":
                   case "USTED":    {
                       TextView theTextView = (TextView) findViewById(R.id.TVResults);
                       theTextView.setText("Your Conjugated verb is dio");
                       break;
                   }
                   case "NOS":
                   case "NOSOTROS" :   {
                       TextView theTextView = (TextView) findViewById(R.id.TVResults);
                       theTextView.setText("Your Conjugated verb is dimos");
                       break;
                   }
                   case "ELLOS":
                   case "ELLAS":
                   case "USTEDES":{
                        TextView theTextView = (TextView) findViewById(R.id.TVResults);
                        theTextView.setText("Your Conjugated verb is dieron");
                        break;

                   }
               }
            }
            public void COnjugateVer(String clForm){

                 switch(clForm){
                     case "YO":{
                         TextView theTextView = (TextView) findViewById(R.id.TVResults);
                         theTextView.setText("Your Conjugated verb is vi");
                         break;
                     }
                     case "TU":{
                         TextView theTextView = (TextView) findViewById(R.id.TVResults);
                         theTextView.setText("Your Conjugated verb is viste");
                         break;
                     }
                     case "EL":
                     case "ELLA":
                     case "USTED":    {
                         TextView theTextView = (TextView) findViewById(R.id.TVResults);
                         theTextView.setText("Your Conjugated verb is vio");
                         break;
                     }
                     case "NOS":
                     case "NOSOTROS" :   {
                         TextView theTextView = (TextView) findViewById(R.id.TVResults);
                         theTextView.setText("Your Conjugated verb is vimos");
                         break;
                     }
                     case "ELLOS":
                     case "ELLAS":
                     case "USTEDES":{
                          TextView theTextView = (TextView) findViewById(R.id.TVResults);
                          theTextView.setText("Your Conjugated verb is vieron");
                          break;

                     }
                 }
























            }


        });

    }
}