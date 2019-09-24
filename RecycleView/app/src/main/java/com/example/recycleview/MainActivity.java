package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    PersonAdapter myAdapter;
    RecyclerView.LayoutManager layoutManager;

    ArrayList<Person>people;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        people = new ArrayList<Person>();
        people.add(new Person("Amit","Motihari","9128968619"));
        people.add(new Person("Sumit","Motihari","9128968619"));
        people.add(new Person("Kamlesh","Motihari","9128968619"));
        people.add(new Person("Ankit","Motihari","9128968619"));
        people.add(new Person("Amit","Motihari","9128968619"));
        people.add(new Person("Amit","Motihari","9128968619"));
        people.add(new Person("Amit","Motihari","9128968619"));
        people.add(new Person("Amit","Motihari","9128968619"));
        people.add(new Person("Amit","Motihari","9128968619"));
        people.add(new Person("Amit","Motihari","9128968619"));
        people.add(new Person("Amit","Motihari","9128968619"));


       myAdapter = new PersonAdapter(this,people);
       recyclerView.setAdapter(myAdapter);

    }

}
