package com.dbs.databind;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerDemo extends AppCompatActivity {

    ArrayList<Book> arrayList;
    RecyclerView rcycleMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        rcycleMain = (RecyclerView) findViewById(R.id.rcycleMain);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rcycleMain.setLayoutManager(llm);
        setData();
    }

    private void setData() {
        if (arrayList == null) {
            arrayList = new ArrayList<>();
        }
        for (int i = 0; i < 50; i++) {
            Book b = new Book(i, "Book Name ->" + i, "Publisher Name -> " + i, "http://taptaptap.com/blog/media/cameraplus-first-month-sales/SeaOfGamesLarge.jpg");
            arrayList.add(b);
        }
        RecyclerAdapterToMe recyclerAdapterToMe = new RecyclerAdapterToMe(arrayList);
        rcycleMain.setAdapter(recyclerAdapterToMe);
    }
}
