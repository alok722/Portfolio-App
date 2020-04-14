package com.example.imalok.alokportfolio;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ExperienceFragment extends Fragment {

    public ExperienceFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View experienceView = inflater.inflate(R.layout.fragment_experience, container, false);

        return experienceView;
    }
}
