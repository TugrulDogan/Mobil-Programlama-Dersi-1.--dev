package com.example.mobilprogramlamaodev1;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.MyViewHolder> {
    Context context;
    List<Person> persons;

    public PersonAdapter(Context context, List<Person> persons)
        this.context =context;
        this.persons =persons;
}

public  class MyViewHolder extends RecyclerView.ViewHolder {
    imageView imageView;
    TextView username;
    TextView password;
    ToggleButton btn;

    public MyViewHolder(View itemView){
        super(itemView);

        imageView = itemView.findViewById(R.id.personImage);
        username = itemView.findViewById(R.id.personUsername);
        password = itemView.findViewById(R.id.personPassword);
        btn = itemView.findViewById(R.id.toggleButton);
    }
    @Override
