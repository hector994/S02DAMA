package net.lrivas.s02dama.ui.main;

import android.content.Context;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import net.lrivas.s02dama.R;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{
            R.string.tab_text_1,
            R.string.tab_text_2,
            R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
       Fragment fragmento = null;

       try{
           if(position==0){
               fragmento = new FragmentoUno();
           }else if(position==1){
               fragmento = new FragmentoDos();
           }else if(position==2){
               fragmento = new FragmentoTres();
           }
       }catch (Exception error){
           Log.e("errorSectionPage","Ocurrio un error: "+ error.getMessage());
       }

        return fragmento;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return  3;
    }
}