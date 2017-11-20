package com.example.camdora.testmvvm;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.camdora.testmvvm.bean.User;
import com.example.camdora.testmvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener{
    private static final String TAG = "MainActivity";

    private ActivityMainBinding binding;
    private User user1, user4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil
                .setContentView(this, R.layout.activity_main);

        user1 = new User("Gs", 24);
        binding.setUser2(user1);

        user4 = new User("pxy", 26);
        binding.setUser3(user4);

        binding.setClickListener1(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_1:
                if(user1 != null && user4 != null){
                    user1.setName("Gs1993");
                    user4.setName("pxy1991");
                    Log.e(TAG, "改变user值");
                }
                break;
            default:
                break;
        }
    }
}
