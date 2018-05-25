package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Setting extends AppCompatActivity {
    Spinner s1, s2;
    ArrayAdapter<CharSequence> adapter;
    @BindView(R.id.found)
    Button found;

    SweetDialogHelper sdh;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        ButterKnife.bind(this);

        sdh = new SweetDialogHelper(this);
        s1 = (Spinner) findViewById(R.id.sp2);
        adapter = ArrayAdapter.createFromResource(this, R.array.Lan, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s1.setAdapter(adapter);


        s2 = (Spinner) findViewById(R.id.sp);
        adapter = ArrayAdapter.createFromResource(this, R.array.No, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s2.setAdapter(adapter);

        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sdh.showWithTimmer(new SweetDialogHelper.DoAction() {
                    @Override
                    public void doSomeThing() {

                        Intent intent = new Intent(Setting.this, SearchHome.class)
                                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);


                    }
                });

            }
        });


    }
}
