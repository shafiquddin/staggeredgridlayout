package com.example.android.stragared;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.widget.LinearLayout;

import com.bumptech.glide.util.LogTime;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private static final int NUM_COL = 2;

    private ArrayList<String> mImagesUrl=new ArrayList<>();
    private ArrayList<String> mNames=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initImageMap();

    }
    private void initImageMap(){
        Log.d(TAG,"initImageMap");
        mImagesUrl.add("flavors");
        mNames.add("https://wallpaper-house.com/data/out/6/wallpaper2you_106757.jpg");
        mImagesUrl.add("Besties");
        mNames.add("http://www.whoa.in/20130627-Whoa/natural-butterfly-image-for-mobile.jpg");
        mImagesUrl.add("whiteway");
        mNames.add("https://images.pexels.com/photos/257360/pexels-photo-257360.jpeg?auto=compress&cs=tinysrgb&h=350");
        mImagesUrl.add("awesome");
        mNames.add("https://wallpaper-house.com/data/out/6/wallpaper2you_127552.jpg");
        mImagesUrl.add("colors");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTzS8PYkbRAv92C3Gp5kZDSSWUXHHILLQvpCtd9e7q3vts862Ut");
        mImagesUrl.add("parot");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRC31SBxvwgavdvbodMnngvoOiVgYUZlnrMf9Xks1k9GmBEJ_Rp6A");
        mImagesUrl.add("destination");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRtczXhFzDD_Za_PerqDA6OARjdzYQu00c78tSuj3HLzdgAzXdI");
        mImagesUrl.add("interior");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQoDHFp4_J5I_VaTyNwtlAZDxU65E6NNRG9s-9Bgwz9IOC9M9PW");
        mImagesUrl.add("pinky");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRKdQTGcGQ3eq5JRXkUqVgIKDBET1qruHH_mBB5kLqhDEXI62s2");
        mImagesUrl.add("loves");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTr5JziLlzFluS9ImUGkazafhZBQPh_n3TTyJTPoyo8AjZxFMsA");
        mImagesUrl.add("Ants");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1Crytbfs7zPKu1gubscHts6tg_wbBJWeVRw12pLv71Tfy1i480Q");
        mImagesUrl.add("not cool");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJ5BY44OuX-6Oc6HYo7RiSPfbBFJAzAknejjOAaGBBvpWRfaAB");
        mImagesUrl.add("Paintings");
        mNames.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRlto7KvnklrSfSJgMxpMIFUparpZdwQbYo-omW9Lt1Z-qqkeo4");

        initRecyclerView();
    }
    private void initRecyclerView(){
        Log.d(TAG,"initRecylerView");
        RecyclerView recyclerView=findViewById(R.id.recyler);
        RecyclerViewAdapter recyclerViewAdapter=new RecyclerViewAdapter(this,mImagesUrl,mNames);
        StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(NUM_COL,LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(recyclerViewAdapter);

    }
}
