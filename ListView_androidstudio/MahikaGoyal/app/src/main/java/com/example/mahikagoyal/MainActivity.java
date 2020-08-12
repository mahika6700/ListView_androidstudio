package com.example.mahikagoyal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView= findViewById(R.id.listView);

        final ArrayList <String> states= new ArrayList <String>();
        states.add("Rajasthan");
        states.add("Sikkim");
        states.add("Assam");
        states.add("Bihar");
        states.add("Maharashtra");
        states.add("Madhya Pradesh");
        states.add("Karnataka");
        states.add("Tamil Nadu");
        states.add("Uttar Pradesh");
        states.add("Kerala");
        ArrayAdapter<String> arrayAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, states);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, " This state is "+" "+ states.get(position).toString() , Toast.LENGTH_SHORT).show();
            }
        });
    }
}