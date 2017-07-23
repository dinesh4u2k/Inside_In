package com.dinesh.project_x;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by kavi on 9/7/17.
 */

public class imageAdapter extends RecyclerView.Adapter<imageHolder> {
    private  int[] items;
    private String[] imageName;
    private Context mcontext;
    public imageAdapter(int[] items, String[] imageName, Context context) {
        this.items = items;
        this.imageName = imageName;

        mcontext = context;
    }

    @Override
    public imageHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_images, parent, false);

         return new imageHolder(view,mcontext);
    }

    @Override
    public void onBindViewHolder(imageHolder holder, int position) {
         holder.populateItems(items[position],imageName[position]);

    }



    @Override
    public int getItemCount() {
        return items.length;
    }
}
