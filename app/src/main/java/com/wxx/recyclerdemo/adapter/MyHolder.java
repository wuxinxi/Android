package com.wxx.recyclerdemo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.wxx.recyclerdemo.R;

/**
 * 作者: Tangren on 2017-12-03
 * 包名：com.wxx.recyclerdemo.adapter
 * 邮箱：996489865@qq.com
 * TODO:一句话描述
 */

public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView title;
    private OnItemClickListener listener;

    public MyHolder(View itemView, OnItemClickListener listener) {
        super(itemView);
        this.listener = listener;
        title = (TextView) itemView.findViewById(R.id.title);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (listener != null) {
            listener.setOnClick(v, getAdapterPosition());
        }
    }

    public interface OnItemClickListener {
        void setOnClick(View view, int position);
    }
}
