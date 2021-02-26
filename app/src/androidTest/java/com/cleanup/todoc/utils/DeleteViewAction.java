package com.cleanup.todoc.utils;

import android.view.View;

import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;

import com.cleanup.todoc.R;

import org.hamcrest.Matcher;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class DeleteViewAction implements ViewAction {
    @Override
    public Matcher<View> getConstraints() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Click on specific button";
    }

    @Override
    public void perform(UiController uiController, View view) {
        View button = view.findViewById(R.id.img_delete);
        // Maybe check for null
        button.performClick();
        uiController.loopMainThreadForAtLeast(1000);
    }
}