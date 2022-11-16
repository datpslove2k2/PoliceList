package com.example.conganapk126;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PoliceListPage extends AppCompatActivity {
    private ListView lvPolice;
    private ArrayList <PoliceItem> arrayListPolice;
    private PoliceAdapter adapter;
    private ImageView btnBackLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_police_list_page);
        AnhXa();
        adapter = new PoliceAdapter(this, R.layout.police, arrayListPolice);
        lvPolice.setAdapter(adapter);
        btnBackLogin = (ImageView) findViewById(R.id.imgBackLogin);
        btnBackLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PoliceListPage.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void AnhXa() {
        lvPolice = (ListView) findViewById(R.id.list_item_police);
        arrayListPolice = new ArrayList<>();
        arrayListPolice.add(new PoliceItem("Trần Tiến Đạt", "Đại Tá", "Quảng Nam", "Việt Nam", 5, R.drawable.police_main));
        arrayListPolice.add(new PoliceItem("Nguyễn Huy Vũ", "Trung Tá", "Quảng Trị", "Việt Nam", 4, R.drawable.police_6));
        arrayListPolice.add(new PoliceItem("Phạm Thành Long", "Thiếu Úy", "Hà Nội", "Việt Nam", 5, R.drawable.police_2));
        arrayListPolice.add(new PoliceItem("Trần Thu Hương", "Đại Úy", "Hà Tĩnh", "Việt Nam", 4, R.drawable.police_3));
        arrayListPolice.add(new PoliceItem("Trần Hoàng Phúc", "Đại Tá", "Cà Mau", "Việt Nam", 5, R.drawable.police_4));
        arrayListPolice.add(new PoliceItem("Trần Quang Long", "Thiếu Tá", "Đồng Nai", "Việt Nam", 4, R.drawable.police_5));
        arrayListPolice.add(new PoliceItem("Phạm Thành Côn", "Thượng Úy", "Phú Thọ", "Việt Nam", 5, R.drawable.police_6));
        arrayListPolice.add(new PoliceItem("Trương Vô Kỵ", "Đại Úy", "Kon Tum", "Việt Nam", 4, R.drawable.police_7));

    }
}