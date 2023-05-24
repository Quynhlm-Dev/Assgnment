package com.quynhlm.dev.assignmentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhongbanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phongban);

        ImageView imgexit = findViewById(R.id.imgexit);
        ListView listView = findViewById(R.id.listview1);


        imgexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PhongbanActivity.this, TrangchuActicity.class);
                startActivity(intent);
            }
        });
        ArrayList<String> list = new ArrayList<>();
        list.add("Nhân viên");
        list.add("Hành chính");
        list.add("Đào tạo");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);

        listView.setAdapter(adapter);

    }
}