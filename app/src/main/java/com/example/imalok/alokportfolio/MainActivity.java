package com.example.imalok.alokportfolio;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new com.example.imalok.alokportfolio.AlokPagerAdapter(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.tabLayoutId);
        tabs.setupWithViewPager(viewPager);

        tabs.setTabTextColors(Color.WHITE, Color.parseColor("white"));

        cardView = (CardView)findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_DIAL);
                i.setData(Uri.parse("tel:+918240159173"));
                startActivity(i);
            }
        });
    }
}
