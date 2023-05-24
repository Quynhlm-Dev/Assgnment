package com.quynhlm.dev.assignmentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class DangNhapActivity extends AppCompatActivity {

    public boolean isChuoi(String str) {
        return str.matches("[a-z A-Z 0-9]+");
    }

    public static String KEY_USERNAME = "username";
    public static String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_nhap);

        EditText edtname = findViewById(R.id.edtUsername);
        EditText edtpass = findViewById(R.id.edtPassWord);
        Button btndangnhap = findViewById(R.id.btndangnhap);
        TextView txtdangky = findViewById(R.id.txtdangky);

        Intent intent = getIntent();
        String username = intent.getStringExtra(KEY_USERNAME);
        String password = intent.getStringExtra(KEY_PASSWORD);

        edtname.setText(username);
        edtpass.setText(password);


        btndangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = edtname.getText().toString();
                String pass = edtpass.getText().toString();
                if (name.trim().isEmpty()) {
                    Toast.makeText(DangNhapActivity.this, "Chua nhap tai khoan", Toast.LENGTH_SHORT).show();
                } else if (pass.trim().isEmpty()) {
                    Toast.makeText(DangNhapActivity.this, "Chua nhap mat khau", Toast.LENGTH_SHORT).show();
                } else if (!isChuoi(name)) {
                    Toast.makeText(DangNhapActivity.this, "Nhap sai dinh dang user name", Toast.LENGTH_SHORT).show();
                } else if (!name.equals(username)) {
                    Toast.makeText(DangNhapActivity.this, "Tai khoan khong dung", Toast.LENGTH_SHORT).show();
                } else if (!pass.equals(password)) {
                    Toast.makeText(DangNhapActivity.this, "Pass word khong dung", Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(DangNhapActivity.this, TrangchuActicity.class));
                }
            }
        });
        txtdangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DangNhapActivity.this, DangKyActivity.class));
            }
        });

    }
}