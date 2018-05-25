package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;

public class Check_Code extends AppCompatActivity {

    EditText ccc;
    Button ok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check__code);
        ccc=(EditText)findViewById(R.id.cc);
        ok=(Button)findViewById(R.id.ok);

        final String n=getIntent().getStringExtra("eemail");
       // ccc.setText(n);

        final SweetDialogHelper sweetDialogHelper = new SweetDialogHelper(this);
        sweetDialogHelper.showTitleWithATextUnder("Code is..", "4411",
                new SweetDialogHelper.DoAction() {
                    @Override
                    public void doSomeThing() {
                        ccc.setText("4411");
                        sweetDialogHelper.dismissDialog();
                    }
                });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ss=ccc.getText().toString();
                String cc=getIntent().getStringExtra("ccode");



                if(ss.equals("") || !ss.equalsIgnoreCase("4411"))
                {
                    new SweetDialogHelper(Check_Code.this).showErrorMessage("Failed!",
                            "Enter Your valid code");

                }
                else
                {
                    sweetDialogHelper.showSuccessfulMessage("Success!", "Now you can rest password!",
                            new SweetDialogHelper.DoAction() {
                                @Override
                                public void doSomeThing() {
                                    Intent intent=new Intent(Check_Code.this,RestPassword.class);
                                    startActivity(intent);
                                }
                            });

                }
            }
        });

    }
}
