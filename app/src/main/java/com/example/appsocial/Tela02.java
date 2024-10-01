package com.example.appsocial;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela02 extends AppCompatActivity {
    String listtext[]={"Apple marca o lançamento de \n" +
            "IPhone 16 para 9 de Setembro.", "Samsung lança galaxy ring \n" +
    "que deve chegar com preço salgado ao Brasil.", "RTX 5090 deve ser lançada \n" +
    "em breve, segundo vazamentos", "Intel vê os preços de suas ações despencarem \n" +
    "após escandândalo de oxidação na 13° geração de processadores."};
    int listimage[]={R.drawable.iphone16,
            R.drawable.galaxyring,
            R.drawable.nvidia,
            R.drawable.intel};
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela02);
        listView=(ListView) findViewById(R.id.listview1);
        adapimg adap = new adapimg(getApplicationContext(),listtext,listimage);
        listView.setAdapter(adap);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.layout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}