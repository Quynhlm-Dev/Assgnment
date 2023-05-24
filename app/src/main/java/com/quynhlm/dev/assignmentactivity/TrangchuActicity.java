package com.quynhlm.dev.assignmentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TrangchuActicity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu_acticity);

        TextView txtphongban = findViewById(R.id.txtphongban);
        TextView txtnhanvien = findViewById(R.id.txtnhanvien);
        TextView txtthoat = findViewById(R.id.txtthoat);

        txtphongban.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrangchuActicity.this, PhongbanActivity.class));
            }
        });
        txtnhanvien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrangchuActicity.this, NhanVienactivity.class));
            }
        });
        txtthoat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(TrangchuActicity.this, DangNhapActivity.class));
            }
        });
    }
}