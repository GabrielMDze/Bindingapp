package com.example.bindingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.example.bindingapp.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding biding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        biding.setLifecycleOwner(this);
        biding.setViewmodel(new FilmeViewModel());
    }
}
