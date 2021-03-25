package com.example.tp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    PlaneteAdapter adapter;
    private Data data;
    private PlaneteAdapter planeteAdapter;
    Button verif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         data=new Data();

        listview = (ListView) findViewById(R.id.listView);

        adapter = new PlaneteAdapter(this,data);

        listview.setAdapter(adapter);

        verif = findViewById(R.id.verif);
         verif.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 int scor=0;
                 String[] taillePlanette= data.getTaillePlanetes();
                 for(int i=0;i<taillePlanette.length;i++)
                 {
                     View v=listview.getChildAt(i);
                     Spinner sp = v.findViewById(R.id.spinner);

                     TextView textView = v.findViewById(R.id.textView);
                     if (sp.getSelectedItem().toString().equals(taillePlanette[i])){
                         scor++;
                     }
                 }
                 Toast.makeText(MainActivity.this,"Score : "+scor+ "/"+taillePlanette.length, Toast.LENGTH_LONG).show();
             }
         });


    }


}