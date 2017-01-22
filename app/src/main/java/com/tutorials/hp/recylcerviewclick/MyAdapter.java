package com.tutorials.hp.recylcerviewclick;

import android.content.Context;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Oclemmy on 3/15/2016.
 */
public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

    //PROPERTIES
    Context c;
    String[] players;
    String[] positions;
    int[] imgs;

    //CONSTRUCTOR
    public MyAdapter(Context ctx,String[] names,String[] positions,int[] images)
    {
        //ASSIGN THEM AFTER BEING PASSED IN
        this.c=ctx;
        this.players=names;
        this.positions=positions;
        this.imgs=images;

    }

    //WHEN VIEWHOLDER IS BEING CREATED
    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        //INFLATE XML AND HOLD IN VIEW
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,null);

        //HOLDER
        MyHolder holder=new MyHolder(v);

        return holder;
    }


    //DATA IS BOUND TO VIEWS
    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        holder.img.setImageResource(imgs[position]);
        holder.nameTxt.setText(players[position]);
        holder.posTxt.setText(positions[position]);

        //SET THE ITEM CLICK LISTENER
        holder.serItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View v, int pos) {
                Snackbar.make(v,players[position]+" : "+positions[position],Snackbar.LENGTH_SHORT).show();
            }
        });
    }

    //TOTLA NUM OF ITEMS

    @Override
    public int getItemCount() {
        return players.length;
    }
}
