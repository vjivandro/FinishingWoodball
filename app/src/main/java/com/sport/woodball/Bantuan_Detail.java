package com.sport.woodball;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by vjivandro on 10/8/17.
 */

public class Bantuan_Detail extends Fragment {
    private final int imageResourceId;


    public Bantuan_Detail(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("Test", "hello");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bantuan_detail, container, false);
        ImageView im1 = (ImageView) view.findViewById(R.id.im1);
        im1.setImageResource(imageResourceId);
        return view;
    }
}
