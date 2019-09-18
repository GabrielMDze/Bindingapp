package com.example.bindingapp;

import android.content.Context;
import android.widget.TextView;

import androidx.core.content.ContextCompat;
import androidx.databinding.BindingAdapter;

public class BindingAdapters {

    @BindingAdapter("app:changeTextColor")
    public static void changeColor(TextView view, Integer likes){
        Context context = view.getContext();

        if (likes<10){
            view.setTextColor(context.getColor(R.color.corBaixo));
        }else if (likes >=10 && likes< 50){
            view.setTextColor(context.getColor(R.color.corMedio));
        }else {
            view.setTextColor(context.getColor(R.color.corAlto));
        }
    }
}
