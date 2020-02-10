package com.example.fragmenandviewpager;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class UserAdapter extends BaseAdapter{
    TextView tvNamaMakanan;


    private Context context;

    private ArrayList<Makanan> foods;

    UserAdapter(Context context, ArrayList<Makanan> makanans) {
        this.context = context;
        this.foods=makanans;
    }


    @Override
    public int getCount() {
        return foods.size();
    }

    @Override
    public Makanan getItem(int position) {
        return foods.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //return super.getView(position, convertView, parent);
        Makanan food = (Makanan) getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.menu_item, parent, false);
        }
         tvNamaMakanan = convertView.findViewById(R.id.tv_nama);
        TextView tvHarga = convertView.findViewById(R.id.tv_harga);

        tvNamaMakanan.setText(food.getNama());
        tvHarga.setText(food.getHarga());

        return convertView;
    }


}