package com.example.gykday1listviewcomponent;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    //İlleri diziye koyuyoruz.
    private String[] iller = {"irem","zeynep","nuray","elif","hayriye","fatma","ayşe", "reyhan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bu metod uygulama açıldığında çalıştırılan metod.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listView'i tasarımdakiyle bağlıyoruz.
        ListView lv = (ListView) findViewById(R.id.listView1);
        //ArrayAdapter'i hazırlıyoruz.
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, iller);
        //listView için hazırladığımız adapter'i ayarlıyoruz.
        lv.setAdapter(adapter);
        //Listede bir satıra tıklandığında yakalıyoruz.
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {

                Toast.makeText(getApplicationContext(),iller[position], Toast.LENGTH_LONG).show();

            }
        });
    }
}