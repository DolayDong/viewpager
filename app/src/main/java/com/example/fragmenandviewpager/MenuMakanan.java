package com.example.fragmenandviewpager;

import java.util.ArrayList;

class MenuMakanan {
    private String namaMenu;
    //    private String data;
    private ArrayList<Makanan> data;


    MenuMakanan(String namaMenu, ArrayList<Makanan> data) {
        this.namaMenu = namaMenu;
        this.data = data;
    }
    String getNamaMenu(){
        return namaMenu;
    }
    ArrayList<Makanan> getData(){
        return data;
    }
}