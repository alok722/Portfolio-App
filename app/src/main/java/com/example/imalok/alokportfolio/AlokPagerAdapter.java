package com.example.imalok.alokportfolio;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class AlokPagerAdapter extends FragmentPagerAdapter {

    public AlokPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0: return new AboutFragment();
            case 1: return new ExperienceFragment();
            case 2: return new SkillsFragment();
            case 3: return new EducationFragment();
            case 4: return new SocialFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0: return "ABOUT";
            case 1: return "EXPERIENCE";
            case 2: return "SKILLS";
            case 3: return "EDUCATION";
            case 4: return "SOCIAL";
        }
        return null;
    }
}
