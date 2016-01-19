package com.example.dongja94.samplerecyclersectionlist;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by dongja94 on 2016-01-19.
 */
public class SectionHeaderViewHolder extends RecyclerView.ViewHolder {
    TextView titleView;
    public SectionHeaderViewHolder(View itemView) {
        super(itemView);
        titleView = (TextView)itemView.findViewById(R.id.text_title);
    }

    public void setGroupItem(GroupItem group) {
        titleView.setText(group.groupName);
    }
}
