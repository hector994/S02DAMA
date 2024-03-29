package net.lrivas.s02dama;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import net.lrivas.s02dama.ui.main.SectionsPagerAdapter;
import net.lrivas.s02dama.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    TabLayout tabs;
    private int[] losIconos = {
        R.drawable.baseline_assignment_ind_24,
        R.drawable.school4px,
        R.drawable.terminal3
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = binding.viewPager;
        viewPager.setAdapter(sectionsPagerAdapter);
        tabs = binding.tabs;
        tabs.setupWithViewPager(viewPager);

        configurarIconos();

        FloatingActionButton fab = binding.fab;

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void configurarIconos(){
        tabs.getTabAt(0).setIcon(losIconos[0]);
        tabs.getTabAt(1).setIcon(losIconos[1]);
        tabs.getTabAt(2).setIcon(losIconos[2]);

    }
}