package com.example.camdora.testmvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.camdora.testmvvm.bean.User;
import com.example.camdora.testmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);

        User user1 = new User("Gs", 24);
        binding.setUser2(user1);

        User user4 = new User("pxy", 26);
        binding.setUser3(user4);
    }
}
