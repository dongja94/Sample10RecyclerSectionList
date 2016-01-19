package com.example.dongja94.samplerecyclersectionlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    SectionAdapter mAdapter;
//    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        mAdapter = new SectionAdapter();
        recyclerView.setAdapter(mAdapter);
//        layoutManager = new LinearLayoutManager(this);
//        GridLayoutManager layoutManager = new GridLayoutManager(this, 3);
//        layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
//            @Override
//            public int getSpanSize(int position) {
//                if (mAdapter.getItemViewType(position)
//                        == SectionAdapter.VIEW_TYPE_SECTION_HEADER) {
//                    return 3;
//                }
//                return 1;
//            }
//        });

        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        initData();
    }

    private void initData() {
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int childCount = 2 + r.nextInt(9);
            for (int j = 0; j < childCount; j++) {
                mAdapter.put("group"+i, "child:"+i+"-"+j);
            }
        }
    }
}
