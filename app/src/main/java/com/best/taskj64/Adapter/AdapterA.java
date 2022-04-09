package com.best.taskj64.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.best.taskj64.Muldle.Member;
import com.best.taskj64.R;

import java.util.ArrayList;

public class AdapterA  extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Member> list;

    public AdapterA(Context context, ArrayList<Member> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_adapter, parent, false);
        return new Mode(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Member member = list.get(position);
        if (holder instanceof Mode) {
            TextView a = ((Mode) holder).a;
            TextView b = ((Mode) holder).b;
            a.setText(member.getName());
            b.setText(member.getId());
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class Mode extends RecyclerView.ViewHolder {
        TextView a, b;
        public Mode(@NonNull View itemView) {
            super(itemView);
            a = itemView.findViewById(R.id.item_txt1);
            b = itemView.findViewById(R.id.item_txt2);
        }
    }
}