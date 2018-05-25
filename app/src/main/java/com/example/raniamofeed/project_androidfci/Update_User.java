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

public class Update_User extends AppCompatActivity {
    Spinner up;
    ArrayAdapter<CharSequence> adapter;
    @BindView(R.id.found)
    Button found;

    SweetDialogHelper sdh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__user);
        ButterKnife.bind(this);
        sdh = new SweetDialogHelper(this);
        up = (Spinner) findViewById(R.id.spup);
        adapter = ArrayAdapter.createFromResource(this, R.array.Area, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        up.setAdapter(adapter);


        found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sdh.showWithTimmer(new SweetDialogHelper.DoAction() {
                    @Override
                    public void doSomeThing() {
                        Intent intent = new Intent(Update_User.this, SearchHome.class)
                                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                });
            }
        });
    }
}
