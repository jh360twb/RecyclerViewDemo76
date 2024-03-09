package com.example.recyclerviewdemo76;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Student> mStudents = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        for (int i = 0; i < 100; i++) {
            Student student = new Student("name:" + i);
            mStudents.add(student);
        }
    }

    private void initView() {
        RecyclerView recyclerView = findViewById(R.id.rv_main);
        //控制格式
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this,mStudents);
        recyclerView.setAdapter(recyclerViewAdapter);
    }
}
