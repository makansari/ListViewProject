package com.ansari.listviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] myCountries = {"China","India","Japan", "Nepal", "Nigeria","England",
            "China","India","Japan", "Nepal", "Nigeria","England"};
    int[] myImages = {R.drawable.china,R.drawable.india,R.drawable.japan,R.drawable.nepal,R.drawable.usa,R.drawable.uk,
            R.drawable.china,R.drawable.india,R.drawable.japan,R.drawable.nepal,R.drawable.usa,R.drawable.uk};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.mylistview);

    /*    ArrayAdapter<String> adapter = new ArrayAdapter<>
                (MainActivity.this,android.R.layout.simple_list_item_1,myCountries);*/
        /*ArrayAdapter<String> adapter = new ArrayAdapter<>
                (MainActivity.this,R.layout.item_layout,R.id.textViewItem,myCountries);*/

       // listView.setAdapter(adapter);



        MyAdapter myAdapter = new MyAdapter(myCountries,myImages,this);
        listView.setAdapter(myAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

               String item = (String) listView.getItemAtPosition(position);

                Toast.makeText(MainActivity.this,
                        "you selected " + item + " at postion " + position + " with id " + id , Toast.LENGTH_LONG).show();
            }
        });
    }
}
