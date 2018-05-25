package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;
import com.kosalgeek.genasync12.AsyncResponse;
import com.kosalgeek.genasync12.PostResponseAsyncTask;

import java.util.HashMap;

public class RestPassword extends AppCompatActivity {

    EditText paswords,repasswords;
    Button next;
    final String LOG="RestPassword";
    SweetDialogHelper sdh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_password);

        sdh = new SweetDialogHelper(this);
        paswords=(EditText)findViewById(R.id.paswords);
        repasswords=(EditText)findViewById(R.id.repaswords);
        next=(Button)findViewById(R.id.next);
        final String m =getIntent().getStringExtra("eeemail");
       // paswords.setText(m);
        //repasswords.setText("kk");



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (!paswords.getText().toString().equalsIgnoreCase(repasswords.getText().toString())) {
                    sdh.showErrorMessage("Failed!", "Can't let any field empty");
                }else {
                    sdh.showWithTimmer(new SweetDialogHelper.DoAction() {
                        @Override
                        public void doSomeThing() {

                                Intent intent = new Intent(RestPassword.this, SearchHome.class)
                                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);


                        }
                    });
                }



            }
        });

    }
}
