package com.solar.file.myapplication.calendar;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;

public class SlowerScrollRecyclerView  extends RecyclerView {
    public SlowerScrollRecyclerView(Context context) {
        super(context);
    }

    public SlowerScrollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SlowerScrollRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public boolean fling(int i, int i2) {
        return super.fling(i, (int) (((double) i2) * 0.7d));
    }
}
