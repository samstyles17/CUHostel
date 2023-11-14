package com.example.cuhostel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle extras = getIntent().getExtras();
        String value1 =extras.getString("value1");
        Toast.makeText(getApplicationContext(),"Name is: \n:"+value1,Toast.LENGTH_LONG).show();
    }
    public void gotoFacebook(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.facebook.com/www.christuniversity.in/"));
        startActivity(i);
    }

    public void gotoInstagram(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.instagram.com/christ_university_bangalore/"));
        startActivity(i);
    }

    public void gotoGoogleMaps(View view)
    {
        Uri gmmIntentUri = Uri.parse("google.streetview:cbll=12.9344,77.6062");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        startActivity(mapIntent);
    }

    public void gotoYoutube(View view)
    {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://www.youtube.com/thechristuniversity"));
        startActivity(i);
    }
}