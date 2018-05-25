package com.example.raniamofeed.project_androidfci;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.raniamofeed.project_androidfci.utility.CircleTransform;
import com.example.raniamofeed.project_androidfci.utility.SweetDialogHelper;
import com.kosalgeek.android.photoutil.GalleryPhoto;
import com.kosalgeek.android.photoutil.ImageBase64;
import com.kosalgeek.android.photoutil.ImageLoader;
import com.kosalgeek.genasync12.AsyncResponse;
import com.kosalgeek.genasync12.EachExceptionsHandler;
import com.kosalgeek.genasync12.PostResponseAsyncTask;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URI;
import java.util.HashMap;

public class Regsister extends AppCompatActivity {

    final String LOG="Regsister";
    EditText username,password,repassword,mobilnumber,email;
    Button submit;
    ImageView image;
    GalleryPhoto galleryPhoto;
    int GALLERY_REQUEST=22131;
    String SELECTPHOTO;
    Spinner s;

    SweetDialogHelper sdh;

    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regsister);

        s=(Spinner)findViewById(R.id.sp);
        adapter=ArrayAdapter.createFromResource(this,R.array.Area,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);

        sdh = new SweetDialogHelper(this);

        username=(EditText)findViewById(R.id.usrusr);
        password=(EditText)findViewById(R.id.passwrd);
        repassword=(EditText)findViewById(R.id.rebeat_passwrd);
        email=(EditText)findViewById(R.id.mail);
        mobilnumber=(EditText)findViewById(R.id.mobphone);
        submit=(Button)findViewById(R.id.found);

      //  image=(ImageView) findViewById(R.id.imageButton);
       // galleryPhoto=new GalleryPhoto(getApplicationContext());


     /*   image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(galleryPhoto.openGalleryIntent(),GALLERY_REQUEST);

            }
        });*/




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().isEmpty()
                        || password.getText().toString().isEmpty()
                        ||repassword.getText().toString().isEmpty()
                        || email.getText().toString().isEmpty()
                        ||mobilnumber.getText().toString().isEmpty()) {
                    sdh.showErrorMessage("Failed!", "Can't let any field empty");
                }else {
                    sdh.showWithTimmer(new SweetDialogHelper.DoAction() {
                        @Override
                        public void doSomeThing() {
                                Intent intent = new Intent(Regsister.this, SearchHome.class)
                                        .addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_NEW_TASK);
                                startActivity(intent);

                        }
                    });
                }
            }
        });


        image=(ImageView) findViewById(R.id.ivg);
        galleryPhoto=new GalleryPhoto(getApplicationContext());
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                startActivityForResult(galleryPhoto.openGalleryIntent(),GALLERY_REQUEST);

            }
        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        Glide.with(this)   // pass Context
                .load(R.drawable.image3) // add your image url
                .transform(new CircleTransform(this)) // applying the image transformer
                .into(image);
    }
}
