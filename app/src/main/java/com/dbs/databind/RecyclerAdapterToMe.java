package com.dbs.databind;

import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dbs.databind.databinding.ActivityRecyclerDemoBinding;

import java.util.ArrayList;

/**
 * Created by windws on 08-Apr-16.
 */
public class RecyclerAdapterToMe extends RecyclerView.Adapter<RecyclerAdapterToMe.ViewHoldersssss> {
    private ArrayList<Book> arrayList;

    public RecyclerAdapterToMe(ArrayList<Book> arrayLisst) {
        this.arrayList = arrayLisst;
    }

    @Override
    public ViewHoldersssss onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.activity_recycler_demo, parent, false);
        ViewHoldersssss holder = new ViewHoldersssss(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHoldersssss holder, int position) {
        final Book book = arrayList.get(position);
        holder.getBinding().setVariable(com.dbs.databind.BR.book, book);
        holder.getBinding().executePendingBindings();
    }


    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHoldersssss extends RecyclerView.ViewHolder {
        private ActivityRecyclerDemoBinding binding;

        public ViewHoldersssss(View rowView) {
            super(rowView);
            binding = DataBindingUtil.bind(rowView);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }
}
