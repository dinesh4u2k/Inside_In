package com.dinesh.project_x;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by kavi on 9/7/17.
 */

public class imageHolder extends RecyclerView.ViewHolder {

    private ImageView image;
    private TextView tvimgname;
    private Context mcontext;
    public imageHolder(View itemView,Context context) {
        super(itemView);

        mcontext = context;
        image = (ImageView)itemView.findViewById(R.id.images);
        tvimgname = (TextView)itemView.findViewById(R.id.tv_name);
    }

    public void populateItems(int item,String s) {
        Glide.with(mcontext).load(item).into(image);
        tvimgname.setText(s);

    }
}
