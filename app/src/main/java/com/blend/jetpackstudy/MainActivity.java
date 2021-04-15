package com.blend.jetpackstudy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.blend.jetpackstudy.databinding.other.NewDatabindingMainActivity;
import com.blend.jetpackstudy.lifecycle.LifeCycleMainActivity;
import com.blend.jetpackstudy.livedata.LiveDataMainActivity;
import com.blend.jetpackstudy.navigation.NavigationMainActivity;
import com.blend.jetpackstudy.room.RoomMainActivity;
import com.blend.jetpackstudy.viewmodel.ViewModelMainActivity;
import com.blend.jetpackstudy.workmanager.WorkManagerMainActivity;


public class MainActivity extends AppCompatActivity {


    private Button lifecycle;
    private Button navigation;
    private Button viewModel;
    private Button liveData;
    private Button room;
    private Button workManager;
    private Button dataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lifecycle = findViewById(R.id.lifecycle);
        navigation = findViewById(R.id.navigation);
        viewModel = findViewById(R.id.viewModel);
        liveData = findViewById(R.id.liveData);
        room = findViewById(R.id.room);
        workManager = findViewById(R.id.workManager);
        dataBinding = findViewById(R.id.dataBinding);
        lifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LifeCycleMainActivity.class));
            }
        });
        navigation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NavigationMainActivity.class));
            }
        });
        viewModel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ViewModelMainActivity.class));
            }
        });
        liveData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LiveDataMainActivity.class));
            }
        });
        room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RoomMainActivity.class));
            }
        });
        workManager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, WorkManagerMainActivity.class));
            }
        });
        dataBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, NewDatabindingMainActivity.class));
            }
        });
    }
}