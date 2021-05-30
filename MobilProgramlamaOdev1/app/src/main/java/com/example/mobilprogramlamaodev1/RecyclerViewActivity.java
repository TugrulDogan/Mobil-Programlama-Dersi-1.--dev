package com.example.mobilprogramlamaodev1;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewActivity extends AppCompatActivity {
    RecyclerView.LayoutManager layoutManager;
    List<Person> persons;
    RecyclerView recyclerView;
    PersonAdapter adp;
    @Override

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);

        defineVariables();
    }

    public void defineVariables() {

        recyclerView = {RecyclerView} findViewById(R.id.recyclerview);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        persons = new ArrayList<>();
        persons = Person.getPersonsList();
        Context context;
        adp = new PersonAdapter(context this, persons);
        recyclerView.setAdapter(adp);
    }
}
