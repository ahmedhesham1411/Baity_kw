package com.example.baity.Designs;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.EditText;

import androidx.annotation.Nullable;

@SuppressLint("AppCompatCustomView")
public class MyEditTextNormal extends EditText {
    public MyEditTextNormal(Context context) {
        super(context);
    }

    public MyEditTextNormal(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyEditTextNormal(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void setTypeface(@Nullable Typeface tf, int style) {
        tf=Typeface.createFromAsset(getContext().getAssets(), "jozoor.ttf");
        super.setTypeface(tf, Typeface.NORMAL);

    }
}