package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;
import com.example.raniamofeed.project_androidfci.utility.Utils;

import java.util.Random;


public class Forget_Pass extends AppCompatActivity implements View.OnClickListener {
    EditText fpm;
    Button rp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget__pass);

        fpm=(EditText)findViewById(R.id.fpm);
        rp=(Button)findViewById(R.id.rp);


       rp.setOnClickListener( this);





    }




    @Override
    public void onClick(View view) {
        //sendEmail();

        //Getting content for email
        final String email = fpm.getText().toString();
      /* Intent n=new Intent(Forget_Pass.this,RestPassword.class);
        n.putExtra("eemail",email);
        startActivity(n);*/

      if (Utils.isEmailValid(email.trim())){
          new SweetDialogHelper(this).showWithTimmer(new SweetDialogHelper.DoAction() {
              @Override
              public void doSomeThing() {
                  Intent nn=new Intent(Forget_Pass.this,Check_Code.class);
                  nn.putExtra("eemail",email);
                  startActivity(nn);
              }
          });
      }else {
          new SweetDialogHelper(this).showErrorMessage("Failed!", "Enter valid email!");
      }

    }
}
