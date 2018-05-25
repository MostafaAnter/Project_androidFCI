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
import com.example.raniamofeed.project_androidfci.utility.Utils;
import com.kosalgeek.genasync12.AsyncResponse;
import com.kosalgeek.genasync12.PostResponseAsyncTask;

import java.util.HashMap;

public class CheckUP extends AppCompatActivity {

    final String TEG="Log_in";
    EditText passup;
    Button okup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_up);

        passup=(EditText)findViewById(R.id.passupd);
        okup=(Button)findViewById(R.id.okupd);


        okup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (Utils.isEmailValid(passup.getText().toString().trim())){
                   new SweetDialogHelper(CheckUP.this).showWithTimmer(new SweetDialogHelper.DoAction() {
                       @Override
                       public void doSomeThing() {
                           Toast.makeText(CheckUP.this, "you received message to update account!", Toast.LENGTH_LONG).show();
                           Intent intent = new Intent(CheckUP.this, Update_User.class);
                           startActivity(intent);
                       }
                   });
               }else {
                   new SweetDialogHelper(CheckUP.this).showErrorMessage("Failed!", "Enter valid email!");
               }




           }
       });






    }
}
