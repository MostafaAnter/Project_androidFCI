package com.example.raniamofeed.project_androidfci;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.raniamofeed.project_androidfci.utility.CircleTransform;
import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.content.ContentValues.TAG;

public class ProfileDoctor extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.textView)
    TextView textView;
    @BindView(R.id.imageButton3)
    ImageButton imageButton3;
    @BindView(R.id.imageView)
    ImageView imageView;
    @BindView(R.id.button)
    TextView button;
    @BindView(R.id.ratingBar)
    RatingBar ratingBar;
    @BindView(R.id.textView3)
    TextView textView3;
    @BindView(R.id.relativeLayout2)
    RelativeLayout relativeLayout2;
    @BindView(R.id.toolbar2)
    Toolbar toolbar2;
    @BindView(R.id.tv)
    TextView tv;
    @BindView(R.id.textView5)
    TextView textView5;
    @BindView(R.id.b1)
    Button b1;
    @BindView(R.id.b2)
    Button b2;
    @BindView(R.id.b3)
    Button b3;
    @BindView(R.id.b4)
    Button b4;
    @BindView(R.id.b5)
    Button b5;
    @BindView(R.id.b6)
    Button b6;
    @BindView(R.id.found)
    Button found;
    @BindView(android.R.id.tabs)
    TabWidget tabs;
    @BindView(R.id.sp3)
    TextView sp3;
    @BindView(R.id.spp3)
    TextView spp3;
    @BindView(R.id.sp4)
    TextView sp4;
    @BindView(R.id.sp)
    TextView sp;
    @BindView(R.id.rr)
    TextView rr;
    @BindView(R.id.ee)
    TextView ee;
    @BindView(R.id.ii)
    TextView ii;
    @BindView(R.id.ii2)
    TextView ii2;
    @BindView(R.id.ii3)
    TextView ii3;
    @BindView(R.id.ii4)
    TextView ii4;
    @BindView(R.id.ii5)
    TextView ii5;
    @BindView(R.id.tab1)
    LinearLayout tab1;
    @BindView(R.id.sri)
    TextView sri;
    @BindView(R.id.si)
    TextView si;
    @BindView(R.id.s)
    TextView s;
    @BindView(R.id.tab2)
    LinearLayout tab2;
    @BindView(R.id.tabb)
    LinearLayout tabb;
    @BindView(android.R.id.tabcontent)
    FrameLayout tabcontent;
    @BindView(R.id.ta)
    TabHost ta;
    @BindView(R.id.scroll1)
    ScrollView scroll1;
    private DatePickerDialog.OnDateSetListener mDateSetListener;
    TabHost tabh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_doctor);
        ButterKnife.bind(this);
        final TabHost tab = (TabHost) findViewById(R.id.ta);
        tab.setup();
        TabHost.TabSpec specl = tab.newTabSpec("personal information");
        specl.setIndicator("personal information");
        specl.setContent(R.id.tab1);
        tab.addTab(specl);

        TabHost.TabSpec spec2 = tab.newTabSpec("Evaluation");
        spec2.setIndicator("Evaluation");
        spec2.setContent(R.id.tab2);
        tab.addTab(spec2);


        ////////////////////////////////////////////


        //////////////////////////////////////////////
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog
                        (ProfileDoctor.this, android.R.style.Theme_Holo_Light_Dialog, mDateSetListener, year, month, day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();

            }
        });
        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDataSet:mm/dd/yyy:" + year + "/" + month + "/" + day);
                String date = month + "/" + day + "/" + year;
                tv.setText(date);


            }
        };


        scroll1.fullScroll(ScrollView.FOCUS_UP);
        scroll1.smoothScrollTo(0, 0);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundResource(R.drawable.border);
                b2.setBackgroundResource(R.drawable.border3);
                b3.setBackgroundResource(R.drawable.border3);
                b4.setBackgroundResource(R.drawable.border3);
                b5.setBackgroundResource(R.drawable.border3);
                b6.setBackgroundResource(R.drawable.border3);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundResource(R.drawable.border3);
                b2.setBackgroundResource(R.drawable.border);
                b3.setBackgroundResource(R.drawable.border3);
                b4.setBackgroundResource(R.drawable.border3);
                b5.setBackgroundResource(R.drawable.border3);
                b6.setBackgroundResource(R.drawable.border3);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundResource(R.drawable.border3);
                b2.setBackgroundResource(R.drawable.border3);
                b3.setBackgroundResource(R.drawable.border);
                b4.setBackgroundResource(R.drawable.border3);
                b5.setBackgroundResource(R.drawable.border3);
                b6.setBackgroundResource(R.drawable.border3);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundResource(R.drawable.border3);
                b2.setBackgroundResource(R.drawable.border3);
                b3.setBackgroundResource(R.drawable.border3);
                b4.setBackgroundResource(R.drawable.border);
                b5.setBackgroundResource(R.drawable.border3);
                b6.setBackgroundResource(R.drawable.border3);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundResource(R.drawable.border3);
                b2.setBackgroundResource(R.drawable.border3);
                b3.setBackgroundResource(R.drawable.border3);
                b4.setBackgroundResource(R.drawable.border3);
                b5.setBackgroundResource(R.drawable.border);
                b6.setBackgroundResource(R.drawable.border3);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundResource(R.drawable.border3);
                b2.setBackgroundResource(R.drawable.border3);
                b3.setBackgroundResource(R.drawable.border3);
                b4.setBackgroundResource(R.drawable.border3);
                b5.setBackgroundResource(R.drawable.border3);
                b6.setBackgroundResource(R.drawable.border);
            }
        });

        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ProfileDoctor.this, Book.class));
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new SweetDialogHelper(ProfileDoctor.this).showSuccessfulMessage("Done!",
                        "Added to favorite successfully!", new SweetDialogHelper.DoAction() {
                            @Override
                            public void doSomeThing() {
                                startActivity(new Intent(ProfileDoctor.this, Favourate.class));
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
