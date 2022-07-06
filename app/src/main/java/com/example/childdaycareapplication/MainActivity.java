package com.example.childdaycareapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView Service, Enroll, About, Contacts, Address, Hours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Service = findViewById(R.id.cardservices);
        Enroll =  findViewById(R.id.cardenroll);
        About  =  findViewById(R.id.cardabout);
        Contacts =  findViewById(R.id.cardcontacts);
        Address =  findViewById(R.id.cardaddress);
        Hours  =  findViewById(R.id.cardopenhours);

        Service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "View Services!", Toast.LENGTH_SHORT).show();
                Intent serviceIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(serviceIntent);


            }
        });

        Enroll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Enroll A Child!", Toast.LENGTH_SHORT).show();
                Intent enrollIntent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(enrollIntent);

            }
        });

        About.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "About Us!!", Toast.LENGTH_SHORT).show();
            }
        });

        Contacts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "These are our Contacts!", Toast.LENGTH_SHORT).show();
            }
        });

        Hours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "These are our Open Hours!", Toast.LENGTH_SHORT).show();
            }
        });

        Address.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This is our Address!", Toast.LENGTH_SHORT).show();
            }
        });



    }

}