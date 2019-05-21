package com.solar.file.myapplication.calendar;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.logging.Logger;

public abstract class AbstractFragment extends Fragment {

    protected abstract int getFragmentLayoutId();
    protected abstract Logger getLogger();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(getFragmentLayoutId(),container,false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        init();
    }

    private void init(){

    }

    protected int getToolbarIcon() {
        return 0;
    }

    protected boolean hasBottomTabs() {
        return false;
    }

    protected boolean hasBackgroundImage() {
        return false;
    }

    protected boolean isHorizontalImage() {
        return true;
    }

    protected String getToolbarTitle() {
        return "";
    }



}

