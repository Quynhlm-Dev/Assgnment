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

public class DangKyActivity extends AppCompatActivity {


    public static String KEY_USERNAME = "username";
    public static String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dang_ky);
        Button btndangky = findViewById(R.id.btndangky);
        TextView txttrove = findViewById(R.id.txttrove);

        EditText edtusername = findViewById(R.id.edtUsername);
        EditText edtpassword = findViewById(R.id.edtPassWord);
        EditText edtNhaplai = findViewById(R.id.edtlaiPassWord);

        btndangky.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = edtusername.getText().toString();
                String password = edtpassword.getText().toString();
                String nhaplai = edtNhaplai.getText().toString();

                if (username.trim().equals("")) {
                    Toast.makeText(DangKyActivity.this, "Chua nhap username", Toast.LENGTH_SHORT).show();
                } else if (password.trim().equals("")) {
                    Toast.makeText(DangKyActivity.this, "Chua nhap password", Toast.LENGTH_SHORT).show();
                } else if (nhaplai.trim().equals("")) {
                    Toast.makeText(DangKyActivity.this, "Chua nhap lai password", Toast.LENGTH_SHORT).show();
                } else if (!nhaplai.equals(password)) {
                    Toast.makeText(DangKyActivity.this, "password nhap lai khong dung", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(DangKyActivity.this, DangNhapActivity.class);
                    intent.putExtra(KEY_USERNAME, username);
                    intent.putExtra(KEY_PASSWORD, password);
                    startActivity(intent);
                }
            }
        });
        txttrove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(DangKyActivity.this, DangNhapActivity.class);
                startActivity(intent1);
            }
        });
    }
}