package com.example.dongja94.samplerecyclersectionlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dongja94 on 2016-01-19.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView titleView;
    public ItemViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.text_title);
    }

    public void setChildItem(ChildItem item) {
        titleView.setText(item.childName);
        titleView.setTextSize(item.fontSize);
    }
}
