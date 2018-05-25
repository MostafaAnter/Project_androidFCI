package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;
import com.example.raniamofeed.project_androidfci.utility.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Countact_Us extends AppCompatActivity {

    @BindView(R.id.logiin)
    Button logiin;
    @BindView(R.id.mail)
    EditText mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_countact__us);
        ButterKnife.bind(this);

        logiin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (Utils.isEmailValid(mail.getText().toString().trim())) {
                    new SweetDialogHelper(Countact_Us.this).showWithTimmer(new SweetDialogHelper.DoAction() {
                        @Override
                        public void doSomeThing() {
                            Intent nn = new Intent(Countact_Us.this, SearchHome.class)
                                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                            startActivity(nn);
                        }
                    });
                } else {
                    new SweetDialogHelper(Countact_Us.this).showErrorMessage("Failed!", "Enter valid email!");
                }
            }
        });
    }
}
