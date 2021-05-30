package com.example.mobilprogramlamaodev1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button users;
    private Button soruekle;
    private Button sorulistele;
    private Button sinavolustur;
    private Button sinavayarlari;
    private String currentUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);


        currentUserName = getIntent().getStringExtra(name:"userId");
        users = (Button) findViewById(R.id.users);
        soruekle = (Button) findViewById(R.id.soruekle);
        sorulistele = (Button) findViewById(R.id.sorulistele);
        sinavolustur = (Button) findViewById(R.id.sinavolustur);
        sinavayarlari = (Button) findViewById(R.id.sinavayarlari);

        public void defineListeners {
        }
        {
            users.setOnClickListener(this);
            soruekle.setOnClickListener(this);
            sorulistele.setOnClickListener(this);
            sinavolustur.setOnClickListener(this);
            sinavayarlari.setOnClickListener(this);

            @Override
            public void onClick (View v){
            Intent intent;
            switch (v.getId()) {
                case R.id.users:
                    intent = new Intent(v.getContext(), RecyclerViewActivity.class);
                    intent.putExtra(name:"userId", currentUserName);
                    startActivity(intent);
                    break;
                case R.id.soruekle:
                    intent = new Intent(v.getContext(), SoruEkle.class);
                    startActivity(intent);
                    break;

                case R.id.sorulistele:
                    intent = new Intent(v.getContext(), SoruListele.class);
                    startActivity(intent);
                    break;
                case R.id.sinavolustur:
                    intent = new Intent(v.getContext(), SinavOlustur.class);
                    startActivity(intent);
                    break;
                case R.id.sinavayarlari:
                    intent = new Intent(v.getContext(), SinavAyarlari.class);
                    startActivity(intent);
                    break;

                default:
                    break;
            }
        }

        }
    }
