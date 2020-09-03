package com.example.android.listproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Home(View view){
        Intent intent = new Intent (this, HomeActivity.class);
        startActivity(intent);
    }

    public void Explore(View view){
        Intent intent = new Intent (this, ExploreActivity.class);
        startActivity(intent);
    }
}