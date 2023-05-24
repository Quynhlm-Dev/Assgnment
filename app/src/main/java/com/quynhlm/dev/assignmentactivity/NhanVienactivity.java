package com.quynhlm.dev.assignmentactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NhanVienactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhan_vienactivity);
        ImageView imgexit = findViewById(R.id.imgexit);
        ListView listView = findViewById(R.id.lview);

        imgexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NhanVienactivity.this, TrangchuActicity.class));
            }
        });

        ArrayList<nhanvien> list = new ArrayList<>();
        list.add(new nhanvien("Ph32353", "Le Manh Quynh", "Nhân Viên"));
        list.add(new nhanvien("Ph40493", "Tong Doanh Chinh", "Hanh Chinh"));
        list.add(new nhanvien("Ph32354", "Le Manh Quynh1", "Dao tao"));
        list.add(new nhanvien("Ph32353", "Le Manh Quynh", "Nhân Viên"));
        list.add(new nhanvien("Ph40493", "Tong Doanh Chinh", "Hanh Chinh"));
        list.add(new nhanvien("Ph32354", "Le Manh Quynh1", "Dao tao"));
        list.add(new nhanvien("Ph32353", "Le Manh Quynh", "Nhân Viên"));
        list.add(new nhanvien("Ph40493", "Tong Doanh Chinh", "Hanh Chinh"));
        list.add(new nhanvien("Ph32354", "Le Manh Quynh1", "Dao tao"));

        ListViewAdapter adapter = new ListViewAdapter(list);
        listView.setAdapter(adapter);
    }

    class nhanvien {
        private String id;
        private String hoTen;
        private String phongban;

        public nhanvien() {
        }

        public nhanvien(String id, String hoTen, String phongban) {
            this.id = id;
            this.hoTen = hoTen;
            this.phongban = phongban;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getHoTen() {
            return hoTen;
        }

        public void setHoTen(String hoTen) {
            this.hoTen = hoTen;
        }

        public String getPhongban() {
            return phongban;
        }

        public void setPhongban(String phongban) {
            this.phongban = phongban;
        }
    }

    class ListViewAdapter extends BaseAdapter {

        ArrayList<nhanvien> list;

        public ListViewAdapter(ArrayList<nhanvien> list) {
            this.list = list;
        }

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View viewNhanvien;
            if (convertView == null) {
                viewNhanvien = View.inflate(parent.getContext(), R.layout.list_item_layout, null);
            } else {
                viewNhanvien = convertView;
            }
            nhanvien nhanvien = (nhanvien) getItem(position);

            TextView txtma = viewNhanvien.findViewById(R.id.txtma);
            TextView txtten = viewNhanvien.findViewById(R.id.txtten);
            TextView txtphongban = viewNhanvien.findViewById(R.id.txtphongban);

            txtma.setText(String.format("ID=%s", nhanvien.getId()));
            txtten.setText(String.format("Ho ten=%s", nhanvien.getHoTen()));
            txtphongban.setText(String.format("Phong ban=%s", nhanvien.getPhongban()));

            return viewNhanvien;
        }
    }
}
