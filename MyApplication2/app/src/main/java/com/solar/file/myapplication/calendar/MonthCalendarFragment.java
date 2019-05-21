package com.solar.file.myapplication.calendar;

import android.os.Bundle;
import android.provider.SyncStateContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.solar.file.myapplication.R;

import java.util.Date;
import java.util.logging.Logger;

public class MonthCalendarFragment extends AbstractCalendarFragment {
    private static final String START_Y_KEY = "startY";

    @Override
    protected int getFragmentLayoutId() {
        return R.layout.fragment_month_calendar;
    }

    @Override
    protected Logger getLogger() {
        return null;
    }

    public static MonthCalendarFragment getInstance(Date date, float f) {
        MonthCalendarFragment monthCalendarFragment = new MonthCalendarFragment();
        monthCalendarFragment.setArguments(getBundle(date, f));
        return monthCalendarFragment;
    }

    public static Bundle getBundle(Date date, float f) {
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constant.KEY_DATE, date);
        bundle.putFloat(START_Y_KEY, f);
        return bundle;
    }




    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
