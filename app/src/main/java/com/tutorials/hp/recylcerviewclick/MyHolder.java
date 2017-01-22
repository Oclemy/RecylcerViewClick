package com.tutorials.hp.recylcerviewclick;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Oclemmy on 3/15/2016.
 * OUR HOLDER CLASS
 */
public class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    //VIEWS
    ImageView img;
    TextView nameTxt;
    TextView posTxt;
    ItemClickListener itemClickListener;

    public MyHolder(View itemView) {
        super(itemView);

        //ASSIGNING VIEWS
        img= (ImageView) itemView.findViewById(R.id.playerImage);
        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
        posTxt= (TextView) itemView.findViewById(R.id.posTxt);

        itemView.setOnClickListener(this);
    }

    //WHEN CLICKED
    @Override
    public void onClick(View v) {

        this.itemClickListener.onItemClick(v,getLayoutPosition());
    }


    //SHALL BE CALLED OUTSIDE
    public void serItemClickListener(ItemClickListener ic)
    {
        this.itemClickListener=ic;
    }
}
