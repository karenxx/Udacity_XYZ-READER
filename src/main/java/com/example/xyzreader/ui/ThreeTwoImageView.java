package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ThreeTwoImageView extends ImageView {
    public ThreeTwoImageView(Context context) {
        super(context);
    }

    public ThreeTwoImageView(Context c, AttributeSet attributeSet) {
        super(c, attributeSet);
    }
    public ThreeTwoImageView(Context c, AttributeSet attributeSet, int defStyle) {
        super(c, attributeSet, defStyle);
    }

    @Override
    protected void onMeasure (int widthSpec, int heightSpec) {
        int threeTwoHeight = MeasureSpec.getSize(widthSpec) * 2 / 3;
        int threeTwoHeightSpec = MeasureSpec.makeMeasureSpec(
                threeTwoHeight, MeasureSpec.EXACTLY);
        super.onMeasure(widthSpec, threeTwoHeightSpec);
    }
}
