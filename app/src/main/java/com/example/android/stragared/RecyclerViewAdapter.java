package com.example.android.stragared;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.viewHolder> {

    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> nNames=new ArrayList<>();
    private  ArrayList<String> nimagesurl=new ArrayList<>();
    private Context mcontext;


    public RecyclerViewAdapter(Context context,ArrayList Names,ArrayList imagesurl){
        nNames=Names;
        nimagesurl=imagesurl;
        mcontext=context;

    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid,parent,false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, final int position) {
        Log.d(TAG,"onBindViewHolder:called");
        RequestOptions requestOptions=new RequestOptions()
        .placeholder(R.drawable.ic_launcher_background);

        Glide.with(mcontext)
                .load(nimagesurl.get(position))
                .apply(requestOptions)
                .into(holder.img);
        holder.txt.setText(nNames.get(position));
        holder.img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG,"onClicked"+nNames.get(position));
                Toast.makeText(mcontext,nNames.get(position), Toast.LENGTH_SHORT).show();

            }
        });
    }

    @Override
    public int getItemCount() {
        return nimagesurl.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;

        public viewHolder(View itemView) {
            super(itemView);
            this.img=(ImageView)itemView.findViewById(R.id.image);
            this.txt=(TextView)itemView.findViewById(R.id.txt);
        }


//        public viewHolder(View itemView, ImageView img, TextView txt) {
//            super(itemView);
//            this.img = img;
//            this.txt = txt;
        }
    }

