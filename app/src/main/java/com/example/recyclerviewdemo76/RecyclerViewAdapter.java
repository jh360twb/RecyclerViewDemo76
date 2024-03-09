package com.example.recyclerviewdemo76;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author Tian
 * @description
 * @date :2020/7/6 09:32
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.InnerHolder> {
    Context mContext;
    List<Student> mStudents = new ArrayList<>();

    public RecyclerViewAdapter(Context context,List<Student> list){
        this.mContext = context;
        mStudents = list;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.InnerHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(mContext,R.layout.item_listview,null);
        return new InnerHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.InnerHolder holder, int position) {
        Student student = mStudents.get(position);
        holder.itemText.setText(student.getStName());
    }

    @Override
    public int getItemCount() {
        return mStudents.size();
    }

    public class InnerHolder extends RecyclerView.ViewHolder {
        TextView itemText;
        //对item实例化
        public InnerHolder(@NonNull View itemView) {
            super(itemView);
            itemText = itemView.findViewById(R.id.item_text);
        }
    }
}
