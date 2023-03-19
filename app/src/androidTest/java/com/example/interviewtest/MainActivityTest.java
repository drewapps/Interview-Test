package com.example.interviewtest;

import androidx.recyclerview.widget.RecyclerView;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.runner.AndroidJUnit4;

import com.example.interviewtest.MainActivity;
import com.example.interviewtest.Repository;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTest {

    private List<Repository> testData;

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Before
    public void setup() {
        testData = new ArrayList<>();
        testData.add(new Repository("Repo 1", "", "User 1", "Description 1", 100, ""));
        testData.add(new Repository("Repo 2", "", "User 2", "Description 2", 200, ""));
        testData.add(new Repository("Repo 3", "", "User 3", "Description 3", 300, ""));
    }

    @Test
    public void recyclerViewIsDisplayed() {
        Espresso.onView(ViewMatchers.withId(R.id.reposRecyclerView))
                .check(ViewAssertions.matches(ViewMatchers.isDisplayed()));
    }

}

