package com.example.raniamofeed.project_androidfci;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.raniamofeed.project_androidfci.utility.CircleTransform;
import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;
import com.example.raniamofeed.project_androidfci.utility.Utils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Log_in extends AppCompatActivity {
    final String TEG = "Log_in";

    Button btnLogin, Found, brp;
    EditText etUsername, etPassword;
    @BindView(R.id.imageView)
    ImageView imageView;
    SweetDialogHelper sdh;
    @BindView(R.id.imageView4)
    ImageView imageView4;
    @BindView(R.id.imageView3)
    ImageView imageView3;
    @BindView(R.id.imageView2)
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        ButterKnife.bind(this);
        sdh = new SweetDialogHelper(this);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        Found = (Button) findViewById(R.id.reg);
        brp = (Button) findViewById(R.id.brp);

        Glide.with(this)   // pass Context
                .load(R.drawable.rania) // add your image url
                .transform(new CircleTransform(this)) // applying the image transformer
                .into(imageView);

        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sdh.showWithTimmer(new SweetDialogHelper.DoAction() {
                    @Override
                    public void doSomeThing() {

                        Intent intent = new Intent(Log_in.this, SearchHome.class)
                                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);


                    }
                });
            }
        });

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sdh.showWithTimmer(new SweetDialogHelper.DoAction() {
                    @Override
                    public void doSomeThing() {

                        Intent intent = new Intent(Log_in.this, SearchHome.class)
                                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);


                    }
                });
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sdh.showWithTimmer(new SweetDialogHelper.DoAction() {
                    @Override
                    public void doSomeThing() {

                            Intent intent = new Intent(Log_in.this, SearchHome.class)
                                    .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                            startActivity(intent);


                    }
                });
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("StaticFieldLeak")
            @Override
            public void onClick(View view) {

                new AsyncTask<Void, Void, Void>() {
                    @Override
                    protected Void doInBackground(Void... voids) {
                        try {
                            Thread.sleep(3000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        return null;
                    }

                    @Override
                    protected void onPreExecute() {
                        super.onPreExecute();
                        if (! Utils.isEmailValid(etUsername.getText().toString().trim()) || etUsername.getText().toString().isEmpty()
                                || etPassword.getText().toString().isEmpty()) {
                            sdh.showErrorMessage("Failed!", "Enter valid data!");
                        } else {
                            sdh.showWithTimmer(new SweetDialogHelper.DoAction() {
                                @Override
                                public void doSomeThing() {
                                    if (!etUsername.getText().toString().isEmpty()
                                            && !etPassword.getText().toString().isEmpty()) {
                                        Intent intent = new Intent(Log_in.this, SearchHome.class)
                                                .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                                        startActivity(intent);

                                    }
                                }
                            });
                        }
                    }

                    @Override
                    protected void onPostExecute(Void aVoid) {
                        super.onPostExecute(aVoid);


                    }
                }.execute();

            }
        });

        Found.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Log_in.this, Regsister.class);
                startActivity(intent);
            }
        });

        brp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Log_in.this, Forget_Pass.class);
                startActivity(intent);
            }
        });


    }

}
