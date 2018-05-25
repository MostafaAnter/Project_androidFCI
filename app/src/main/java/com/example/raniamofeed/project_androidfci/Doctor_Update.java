package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TabHost;

import com.bumptech.glide.Glide;
import com.example.raniamofeed.project_androidfci.utility.CircleTransform;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Doctor_Update extends AppCompatActivity {

    @BindView(R.id.imageButton)
    ImageButton imageButton;
    @BindView(R.id.found)
    Button found;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor__update);
        ButterKnife.bind(this);
        TabHost tab = (TabHost) findViewById(R.id.ta);
        tab.setup();

        TabHost.TabSpec specl = tab.newTabSpec("personal information");
        specl.setIndicator("personal information");
        specl.setContent(R.id.tab1);
        tab.addTab(specl);

        TabHost.TabSpec spec2 = tab.newTabSpec("Anther Info");
        spec2.setIndicator("Anther Info");
        spec2.setContent(R.id.tab2);
        tab.addTab(spec2);

        Glide.with(this)   // pass Context
                .load(R.drawable.image3) // add your image url
                .transform(new CircleTransform(this)) // applying the image transformer
                .into(imageButton);

        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("text/plain");
                i.putExtra(Intent.EXTRA_SUBJECT, "E7gzly");
                String sAux = "\nLet me recommend you this application\n\n";
                sAux = sAux + "E7gzly \n\n";
                i.putExtra(Intent.EXTRA_TEXT, sAux);
                startActivity(Intent.createChooser(i, "choose one"));
            }
        });

    }
}
