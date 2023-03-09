package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

ArrayList<ContactModel> arrContacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        //ContactModel model = new ContactModel(R.drawable.contact_us_svg,"ABC","1234567890");

        arrContacts.add(new ContactModel(R.drawable.contact_us_svg,"A","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.d,"B","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact_us_svg,"C","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.d,"D","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact_us_svg,"E","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.d,"F","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact_us_svg,"G","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.d,"H","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact_us_svg,"I","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.d,"J","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact_us_svg,"K","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.d,"L","9876543210"));
        arrContacts.add(new ContactModel(R.drawable.contact_us_svg,"M","1234567890"));
        arrContacts.add(new ContactModel(R.drawable.d,"N","9876543210"));


        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this,arrContacts);

        recyclerView.setAdapter(adapter);

    }
}