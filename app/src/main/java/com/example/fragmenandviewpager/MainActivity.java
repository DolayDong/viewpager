package com.example.fragmenandviewpager;
//membuat view pager dan adapternya

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    ArrayList<String> menuTitleData = new ArrayList<>();
    ArrayList<String> data = new ArrayList<>();

    ArrayList<MenuMakanan> kumpulanMenu = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // generateTitle();
        //generateData();
        generateMenu();

        //Panggil viewPager yang ada di activity_main ke Main Activity
        ViewPager viewPager = findViewById(R.id.view_pager_fragment);
        new MyAdapter(getSupportFragmentManager());
        //myAdapter = MyAdapter.newInstance(getSupportFragmentManager(), menuTitleData, data);
        MyAdapter myAdapter = MyAdapter.newInstance(getSupportFragmentManager(), kumpulanMenu, getApplicationContext());
        viewPager.setAdapter(myAdapter);

        //Tambahkan TabLayout
        TabLayout tabLayout = findViewById(R.id.tab_menu);
        tabLayout.setupWithViewPager(viewPager);

    }
        /**
         *
         */
        //Membuat dummy title data
        protected void generateTitle () {
            menuTitleData.add("T dot");
            menuTitleData.add("Techpolitan");
            menuTitleData.add("ZONK");
        }
        private void generateData () {
            data.add("Data 1");
            data.add("Data 2");
            data.add("Data 3");
        }

        public void generateMenu () {
            ArrayList<Makanan> menuAyam = new ArrayList<>();
            menuAyam.add(new Makanan("Ayam Goreng Cewek", "10000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam non est eu lorem porttitor auctor. Duis malesuada ornare ornare. Duis ut odio augue. Ut volutpat mauris non eros ullamcorper, tincidunt viverra libero cursus. Etiam eget massa sit amet orci gravida sodales. Quisque dapibus libero in orci rutrum, ut facilisis tortor pharetra. Cras sed odio tristique, dictum erat ac, eleifend tortor. Suspendisse enim eros, dapibus eu arcu nec, placerat cursus purus. Phasellus tincidunt ultrices purus at volutpat. Nulla pulvinar mauris non risus sodales laoreet.", R.drawable.ayamgoreng));
            menuAyam.add(new Makanan("Ayam Betutu Cowok", "20000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Pellentesque urna leo, bibendum vitae nibh eu, scelerisque mattis elit. Praesent in ex justo. Cras leo sapien, sollicitudin sit amet dui et, sollicitudin convallis lectus. Praesent eros justo, faucibus at ligula sit amet, vehicula auctor libero. Vestibulum sagittis leo vel nulla condimentum, a ultricies velit pulvinar. Maecenas ac bib", R.drawable.ayambetutu));
            kumpulanMenu.add(new MenuMakanan("Ayam", menuAyam));

            ArrayList<Makanan> menuMie = new ArrayList<>();
            menuMie.add(new Makanan("Mie Goreng", "10000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum bibendum tincidunt molestie. Sed libero elit, placerat ut odio eget, vehicula ultricies nulla. Fusce in vestibulum nibh. Pellentesque vel pulvinar lacus, eget tempus augue. Vivamus consectetur arcu est, blandit aliquet neque ullamcorper id. Fusce fringilla et metus id tristique. Integer dictum augue ac mi blandit ultrices. Aenean feugiat diam metus, eu ornare augue imperdiet in. Ut eget nibh diam.", R.drawable.taiamerica));
            menuMie.add(new Makanan("Mie Rendang", "20000", "Lorem ipsum dolor sit amet, ", R.drawable.mierendang));
            kumpulanMenu.add(new MenuMakanan("Mie", menuMie));

            ArrayList<Makanan> menuSapi = new ArrayList<>();
            menuSapi.add(new Makanan("Gulai Sapi Cowok", "20000", "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum bibendum tincidunt molestie. Sed libero elit, placerat ut odio eget, vehicula ultricies nulla. Fusce in vestibulum nibh. Pellentesque vel pulvinar lacus, eget tempus augue. Vivamus consectetur arcu est, blandit aliquet neque ullamcorper id. Fusce fringilla et metus id tristique. Integer dictum augue ac mi blandit ultrices. Aenean feugiat diam metus, eu ornare augue imperdiet in. Ut eget nibh diam.", R.drawable.gulaisapi));
            menuSapi.add(new Makanan("Sate Sapi Cewe", "30000", "Lorem ipsum dolor sit amet, ", R.drawable.satesapi));
            kumpulanMenu.add(new MenuMakanan("Sapi", menuSapi));

        }



}