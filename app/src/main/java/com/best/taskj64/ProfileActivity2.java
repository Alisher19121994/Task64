package com.best.taskj64;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.best.taskj64.Adapter.AdapterA;
import com.best.taskj64.Muldle.Member;

import java.util.ArrayList;

public class ProfileActivity2 extends AppCompatActivity {
    Context context;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile2);
        open();
    }

    public void open() {
        context = this;
        recyclerView = findViewById(R.id.recyclerviewP);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 1));
        ArrayList<Member> list = new ArrayList<>();
        list.add(new Member("Alisher", "12345"));
        list.add(new Member("Abbos", "456"));
        list.add(new Member("Begzod", "789"));
        list.add(new Member("Humoyun", "984"));
        list.add(new Member("Vali", "3214"));
        list.add(new Member("Rustam", "9632147"));
        refresh(list);

    }

    public void refresh(ArrayList<Member> list) {
        AdapterA adapterA = new AdapterA(context, list);
        recyclerView.setAdapter(adapterA);
    }
}