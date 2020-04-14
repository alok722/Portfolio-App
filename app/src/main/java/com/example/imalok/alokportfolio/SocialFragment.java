package com.example.imalok.alokportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 */
public class SocialFragment extends Fragment {


    public SocialFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View contactView =inflater.inflate(R.layout.fragment_social, container, false);

        CardView linkedin = contactView.findViewById(R.id.linkedIn);
        CardView github = contactView.findViewById(R.id.github);
        CardView facebook = contactView.findViewById(R.id.facebook);
        CardView twitter = contactView.findViewById(R.id.twitter);
        CardView instagram = contactView.findViewById(R.id.instagram);

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.linkedin.com/in/alok722/"));
                startActivity(browserIntent);
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/alok722"));
                startActivity(browserIntent);
            }
        });

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.facebook.com/profile.php?id=100010071970453"));
                startActivity(browserIntent);
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://twitter.com/AlokR1"));
                startActivity(browserIntent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.instagram.com/_rajalok_/"));
                startActivity(browserIntent);
            }
        });
        return contactView;
    }

}
