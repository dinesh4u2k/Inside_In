package com.dinesh.project_x;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;

/**
 * Created by kavi on 13/7/17.
 */

public class recycle implements RecyclerView.OnItemTouchListener {
    private OnItemClickListener mListener;
    private GestureDetector mGesture;


    public interface OnItemClickListener{
        void onItemClick(View view,int position);
        void onLongItemClick(View view, int position);
    }
    public recycle(Context context, final RecyclerView recycleView, OnItemClickListener listener){
        mListener = listener;

        mGesture = new GestureDetector(context,new GestureDetector.SimpleOnGestureListener(){
            public boolean onSingleTapUp(MotionEvent e){
                return true;
            }

            public void onLongPress(MotionEvent e){
                View child = recycleView.findChildViewUnder(e.getX(),e.getY());
                if (child!=null && mListener!=null){
                    mListener.onLongItemClick(child,recycleView.getChildAdapterPosition(child));
                }
            }
        });
    }
    @Override
    public boolean onInterceptTouchEvent(RecyclerView view, MotionEvent e) {
        View childView = view.findChildViewUnder(e.getX(),e.getY());
        if (childView != null && mListener != null && mGesture.onTouchEvent(e)){
            mListener.onItemClick(childView,view.getChildAdapterPosition(childView));
            return true;
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView view, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }


}
