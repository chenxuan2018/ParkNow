package com.example.min.sjsuparkingtesting;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //SJSU ParkNow web - South Garage
    public void browserS(View view) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Status for South Garage", Toast.LENGTH_LONG);
        myToast.show();
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sites.google.com/view/sjsuparknow/south"));
        startActivity(browserIntent);
    }


    // SJSU Parknow web - North Garage
    public void browserN(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Status for North Garage", Toast.LENGTH_LONG);
        myToast.show();
        Intent browserIntent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sites.google.com/view/sjsuparknow/north"));
        startActivity(browserIntent1);
    }

    //SJSU Parknow web - West Garage
    public void browserW(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Status for West Garage", Toast.LENGTH_LONG);
        myToast.show();
        Intent browserIntent2 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sites.google.com/view/sjsuparknow/west"));
        startActivity(browserIntent2);
    }

    //SJSU Parknow web - Park N' Ride
    public void browerP(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Status for Park N' Ride", Toast.LENGTH_LONG);
        myToast.show();
        Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sites.google.com/view/sjsuparknow/park-n-ride"));
        startActivity(browserIntent3);
    }
    //Additional convinence feature for SJSU students
    public void browserSJSU(View v) {
        Toast myToast = Toast.makeText(getApplicationContext(), "Directing to SJSU.edu", Toast.LENGTH_LONG);
        myToast.show();
        Intent browserIntent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sjsu.edu"));
        startActivity(browserIntent3);
    }

}
