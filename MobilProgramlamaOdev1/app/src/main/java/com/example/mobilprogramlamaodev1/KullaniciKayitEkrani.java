package com.example.mobilprogramlamaodev1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class KullaniciKayitEkrani {
    public class MainActivity extends AppCompatActivity {
        EditText nameSurname;
        EditText telefon;
        EditText email;
        EditText pass;
        TextView textMessage;
        Button buton_sign;
        ArrayList<Person> persons;
        Integer attempt;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_kullanicikayitekrani);
            defineVariables();
            defineListeners();
        }
        private void cleanTextBoxes(){
            nameSurname.setText("");
            telefon.setText("");
            email.setText("");
            pass.setText("");
        }
        private  boolean checkPerson(){
            for (Person aPerson : persons){
                if( nameSurname.getText().toString().equals(aPerson.getUserName())

                    return false;
            }
            return  true;

        }
        public void defineVariables(){
            attempt=0;
            persons = Person.getPersonsList();
            nameSurname = (EditText) findViewById(R.id.nameSurname);
            telefon = (EditText) findViewById(R.id.telefon);
            email = (EditText) findViewById(R.id.email);
            pass = (EditText) findViewById(R.id.pass);
            textMessage = (TextView) findViewById(R.id.textMessage);
        }

        public void defineListeners(){
            buton_sign.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent;
                    if(checkPerson()) {
                        intent = new Intent(v.getContext(), MenuActivity.class);
                        intent.putExtra(nameSurname: "userId",nameSurname.getText().toString());
                        cleanTextBoxes();
                        startActivity(intent);
                    }
                    else {
                        cleanTextBoxes();
                        attempt +=1;
                        textMessage.setText("Aynı isimle kullanıcı mevcut");
                        if(attempt >=3){
                            Toast.makeText(context:MainActivity.this, text:"Aynı isimle farklı kullanıcılar sisteme giriş yapamaz"
                                    , Toast.LENGTH_SHORT).show;
                            finish();
                        }
                    }
                }

            }
        }
    }
}
