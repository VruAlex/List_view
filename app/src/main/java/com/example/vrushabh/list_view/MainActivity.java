package com.example.vrushabh.list_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] codes = {"Android","Java","Kotlin","Ux/Ui design","Projects","Android","Java","Kotlin","Ux/Ui design","Projects","Android","Java","Kotlin","Ux/Ui design","Projects"};
        ListAdapter vruAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,codes);
        ListView vruListView =  findViewById(R.id.list_item);
        vruListView.setAdapter(vruAdapter);

        vruListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String codeQ = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(getApplicationContext(), ((TextView) view).getText(), Toast.LENGTH_SHORT).show();
                    }
                }
        );

    }
}