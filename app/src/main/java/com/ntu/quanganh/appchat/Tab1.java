package com.ntu.quanganh.appchat;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Tab1 extends android.support.v4.app.Fragment {
    private ArrayList<ItemComent> arrayList ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_tab1,container,false);
    }

    @Override
    public void onStart() {
        super.onStart();
        arrayList = new ArrayList<ItemComent>();
        RecyclerView recyclerView = (RecyclerView)getView().findViewById(R.id.recylerview);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        arrayList.add(new ItemComent("Tình Trạng: abc","Nguyen van A","zyz","aaaaaaaaaaaaaaaaaaaa"));
        arrayList.add(new ItemComent("Tình Trạng: a2","Nguyen van B","zyzzzzz","bbbbbbbbbbbbbbbbbbb"));
        arrayList.add(new ItemComent("Tình Trạng: a3","Nguyen van C","zyzttttt","ccccccccccccccccc"));
        arrayList.add(new ItemComent("Tình Trạng: a4","Nguyen van D","zyzyyyyy","ddddddddddddddddd"));
        ListComent listComent = new ListComent(getContext(),arrayList);
        recyclerView.setAdapter(listComent);
    }
}
