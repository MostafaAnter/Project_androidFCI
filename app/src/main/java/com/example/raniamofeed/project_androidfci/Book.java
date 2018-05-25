package com.example.raniamofeed.project_androidfci;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.raniamofeed.project_androidfci.utility.CircleTransform;
import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Book extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.button)
    TextView button;
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
    @BindView(R.id.usrusr2)
    EditText usrusr2;
    @BindView(R.id.Book)
    Button Book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        ButterKnife.bind(this);

        Book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new SweetDialogHelper(Book.this).showSuccessfulMessage("Done!",
                        "you will recieve confirmation message soon", new SweetDialogHelper.DoAction() {
                            @Override
                            public void doSomeThing() {
                                com.example.raniamofeed.project_androidfci.Book.this.finish();
                            }
                        });
            }
        });

        Glide.with(this)   // pass Context
                .load(R.drawable.image5) // add your image url
                .transform(new CircleTransform(this)) // applying the image transformer
                .into(imageView);
    }
}
