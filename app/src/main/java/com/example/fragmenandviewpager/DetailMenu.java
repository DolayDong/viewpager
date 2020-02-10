package com.example.fragmenandviewpager;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailMenu extends AppCompatActivity {
    TextView detailText;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);
// mengambil data dari intent di FirstFragment
        Makanan detMakanan = getIntent().getParcelableExtra("Menu");
        //tampung data ke variabel String dari method getDeskripsi di Makanan
        String detail = detMakanan.getDeskripsi();
        //tandai tempat gambar pad layout mengunakan id layout di activity_detail_menu
        image = findViewById(R.id.image_view);
//tandai tempat TextView di layout menggunakan id
        detailText = findViewById(R.id.tv_detail);
        //ubah isi TextView dengan data dari intent
        detailText.setText(detail);
        //ubah gambar
        image.setImageResource(detMakanan.getImage());

    }
}
