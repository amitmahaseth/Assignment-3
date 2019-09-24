package com.example.recycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonAdapter extends RecyclerView.Adapter<PersonAdapter.ViewHolder> {

    private ArrayList<Person> people;

    public PersonAdapter(Context context,ArrayList<Person>list)
    {
        people = list;
    }


    public class ViewHolder extends RecyclerView.ViewHolder
    {

        EditText edit_Text,edt_Address,edt_phone;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            edit_Text = itemView.findViewById(R.id.edt_Text);
            edt_Address = itemView.findViewById(R.id.edt_Address);
            edt_phone = itemView.findViewById(R.id.edt_phone);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                }
            });
        }
    }

    @NonNull
    @Override
    public PersonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_massege,viewGroup,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PersonAdapter.ViewHolder viewHolder, int i) {

        viewHolder.itemView.setTag(people.get(i));
        viewHolder.edit_Text.setText(people.get(i).getName());
        viewHolder.edt_Address.setText(people.get(i).getAddress());
        viewHolder.edt_phone.setText(people.get(i).getContactNumber());
    }

    @Override
    public int getItemCount() {
        return people.size();
    }
}
