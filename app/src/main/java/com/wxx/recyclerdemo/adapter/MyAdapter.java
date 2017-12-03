package com.wxx.recyclerdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wxx.recyclerdemo.R;

import java.util.List;

/**
 * 作者: Tangren on 2017-12-03
 * 包名：com.wxx.recyclerdemo.adapter
 * 邮箱：996489865@qq.com
 * TODO:一句话描述
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    private List<String> mList;
    private MyHolder.OnItemClickListener listener;

    public MyAdapter(List<String> mList) {
        this.mList = mList;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        return new MyHolder(view, listener);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.title.setText(mList.get(position));
    }

    @Override
    public int getItemCount() {
        return mList == null ? 0 : mList.size();
    }

    public void setOnCLickListener(MyHolder.OnItemClickListener listener) {
        this.listener = listener;
    }
}
