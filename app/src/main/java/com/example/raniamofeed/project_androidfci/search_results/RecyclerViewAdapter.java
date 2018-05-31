package com.example.raniamofeed.project_androidfci.search_results;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.raniamofeed.project_androidfci.Book;
import com.example.raniamofeed.project_androidfci.R;
import com.example.raniamofeed.project_androidfci.utility.CircleTransform;

import java.util.ArrayList;
import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A custom adapter to use with the RecyclerView widget.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private ArrayList<AbstractModel> modelList;

    private OnItemClickListener mItemClickListener;



    Random rand = new Random();
    // nextInt as provided by Random is exclusive of the top value so you need to add 1

    String[] splist = {"", "Cardiothoracic", "Reconstructive",
    "Neurosurgery", "Ophthalmology", "Speech-Language", "Cardiology",
    "Infectious Diseases", "Emergency Medicine", "Anesthesiology", "Radiology"};

    String[] namesOfDoc = {"", "Dr Ahmed Kashaba", "Dr Mohamed Saad",
            "Dr Wafaa Ahmed", "Dr Mostafa Anter", "Dr Sabreen Mostafa", "Dr Mina Nabil",
            "Dr Tawfeek Akrm", "Dr Sara Abd El Fatah", "Dr Hassan Ramadan", "Dr Ebraheem Saad"};

    int[] images = {0, R.drawable.image1, R.drawable.image2, R.drawable.image3,
            R.drawable.image4, R.drawable.image5, R.drawable.image6, R.drawable.image7,
            R.drawable.image8, R.drawable.image9, R.drawable.image10};

    public RecyclerViewAdapter(Context context, ArrayList<AbstractModel> modelList) {
        this.mContext = context;
        this.modelList = modelList;
    }

    public void updateList(ArrayList<AbstractModel> modelList) {
        this.modelList = modelList;
        notifyDataSetChanged();

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_recycler, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, final int position) {

        //Here you can fill your row view
        if (holder instanceof ViewHolder) {
            final AbstractModel model = getItem(position);
            ViewHolder genericViewHolder = (ViewHolder) holder;

            genericViewHolder.b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mContext.startActivity(new Intent(mContext, Book.class));
                }
            });

            genericViewHolder.b2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mContext.startActivity(new Intent(mContext, Book.class));
                }
            });

            genericViewHolder.b3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mContext.startActivity(new Intent(mContext, Book.class));
                }
            });
            Glide.with(mContext)   // pass Context
                    .load(images[rand.nextInt((10 - 1) + 1) + 1]) // add your image url
                    .transform(new CircleTransform(mContext)) // applying the image transformer
                    .into(genericViewHolder.imageView);

            genericViewHolder.name.setText(namesOfDoc[rand.nextInt((10 - 1) + 1) + 1]);
            genericViewHolder.mail.setText(splist[rand.nextInt((10 - 1) + 1) + 1]);
        }
    }


    @Override
    public int getItemCount() {

        return modelList.size();
    }

    public void SetOnItemClickListener(final OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    private AbstractModel getItem(int position) {
        return modelList.get(position);
    }


    public interface OnItemClickListener {
        void onItemClick(View view, int position, AbstractModel model);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        @BindView(R.id.imageView)
        ImageView imageView;
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.ratingBar)
        RatingBar ratingBar;
        @BindView(R.id.textView3)
        TextView textView3;
        @BindView(R.id.mail)
        TextView mail;
        @BindView(R.id.mail2)
        TextView mail2;
        @BindView(R.id.mail232)
        TextView mail232;
        @BindView(R.id.b1)
        Button b1;
        @BindView(R.id.b2)
        Button b2;
        @BindView(R.id.b3)
        Button b3;
        @BindView(R.id.linear)
        LinearLayout linear;
        public ViewHolder(final View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mItemClickListener.onItemClick(itemView, getAdapterPosition(), modelList.get(getAdapterPosition()));


                }
            });

        }
    }

}

