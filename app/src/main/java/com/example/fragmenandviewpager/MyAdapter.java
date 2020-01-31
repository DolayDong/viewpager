package com.example.fragmenandviewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyAdapter extends FragmentStatePagerAdapter {

    public MyAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();

        Fragment item = null;
        switch (position){
            case 0:
                item = firstFragment;
                break;
            case 1:
                item = secondFragment;
                break;
                default:
                    item = firstFragment;
                    break;
        }
        return item;
    }

    @Override
    public int getCount() {
        return 3;
    }
}
