package com.wxx.recyclerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.wxx.recyclerdemo.adapter.MyAdapter;
import com.wxx.recyclerdemo.adapter.MyHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tangren
 */
public class MainActivity extends AppCompatActivity implements MyHolder.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        MyAdapter mAdapter = new MyAdapter(getDatas());
        recyclerView.setAdapter(mAdapter);
        mAdapter.setOnCLickListener(this);

//        recyclerView.addItemDecoration();
    }

    private List<String> getDatas() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    @Override
    public void setOnClick(View view, int position) {
        Toast.makeText(this, "position:" + position, Toast.LENGTH_SHORT).show();
    }
}
