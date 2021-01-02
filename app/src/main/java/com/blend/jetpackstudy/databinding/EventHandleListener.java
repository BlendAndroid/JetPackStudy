package com.blend.jetpackstudy.databinding;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class EventHandleListener {

    private Context mContext;

    public EventHandleListener(Context context) {
        mContext = context;
    }

    public void onButtonClicked(View view) {
        Toast.makeText(mContext, "I am clicked!", Toast.LENGTH_SHORT).show();
        mContext.startActivity(new Intent(mContext, TwoWayBindActivity.class));
    }
}
