package com.blend.jetpackstudy.databinding;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.blend.jetpackstudy.R;

public class TwoWayBindActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_two_way_bind);
        ActivityTwoWayBindBinding bindBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_bind);
        final TwoWayBindingViewModel3 twoWayBindingViewModel = new TwoWayBindingViewModel3();

        bindBinding.setViewModel(twoWayBindingViewModel);
        bindBinding.setLifecycleOwner(this);

        bindBinding.toWayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginModel value = twoWayBindingViewModel.getLiveData().getValue();
                value.userName += count;
                twoWayBindingViewModel.getLiveData().setValue(value);
                count++;
            }
        });
    }
}