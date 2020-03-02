package com.selim.stockbangladesh.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

import com.selim.stockbangladesh.R;

public class PriceList extends LinearLayout {


    public PriceList(Context context) {
        super(context);
        LayoutInflater inflater = LayoutInflater.from(getContext()) ;
        inflater.inflate(R.layout.price_list, this);
    }



}
