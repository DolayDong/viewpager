package com.example.fragmenandviewpager;

import android.content.Context;
import java.util.ArrayList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

// SUBCLASS DARI ACTIVITY MAIN
public class MyAdapter extends FragmentStatePagerAdapter {
    private static ArrayList<String> myTitles;
    private static ArrayList<String> myData;

    private static ArrayList<MenuMakanan> myMenu = new ArrayList<>();

    private static int numOfItem;
    private static Context ctx;

    public static MyAdapter newInstance(FragmentManager fragmentManager, ArrayList<String> titles, ArrayList<String> data) {
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myTitles = titles;
        myData = data;
        numOfItem = data.size();
        return myAdapter;
    }

    //Overload newInstance() above
    static MyAdapter newInstance(FragmentManager fragmentManager, ArrayList<MenuMakanan> kumpulanMenu, Context context) {
        MyAdapter myAdapter = new MyAdapter(fragmentManager);
        myMenu = kumpulanMenu;
        numOfItem = myMenu.size();
        ctx = context;
        return myAdapter;


    }

    //Constractor
    MyAdapter(FragmentManager fragmentManager) {
        super(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        ArrayList<Makanan> makanan = myMenu.get(position).getData();
        FirstFragment fragment = new FirstFragment();
        fragment.setData(makanan);
        //          Toast.makeText(ctx, String.valueOf(myMenu.get(position).getNamaMenu()),Toast.LENGTH_SHORT).show();
        //  FragmentSatu fragmentSatu = new FragmentSatu();

        return fragment;
    }

    @Override
    public int getCount() {
        return numOfItem;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title;
        try {
            title = myMenu.get(position).getNamaMenu(); //object MenuMakanan menu.getNamaMenu();
        } catch (IndexOutOfBoundsException e) {
            title = "Apa Saja";
        }
        return title;
    }
}