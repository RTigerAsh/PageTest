package cn.edu.swufe.pagetest;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

public class MyPageAdapter extends FragmentPagerAdapter {
    private String[]  title=new String[]{"First","Second","Third"};

    public  MyPageAdapter(FragmentManager manager){
        super(manager);
    }



    @Override
    public Fragment getItem(int i) {
        if (i==0){
            return new FirstFragment();
        }else if (i==1){
            return new SecondFragment();
        }else{
            return new ThirdFragment();
        }

    }

    @Override
    public CharSequence getPageTitle(int position) {

        return title[position];
    }

    @Override
    public int getCount() {
        return 3;
    }
}
