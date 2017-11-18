package com.lorenz.konrad.healtapp.activities;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import com.lorenz.konrad.healtapp.R;
import com.lorenz.konrad.healtapp.entities.User;

import java.util.HashMap;
import java.util.Map;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);


        ImageView image = (ImageView) findViewById(R.id.sign_up_image);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

                startActivity(intent);
            }
        });


        final Map<String, User> users = new HashMap<String, User>();

        FirebaseDatabase db = FirebaseDatabase.getInstance();

        final DatabaseReference myRef = db.getReference("User");




        myRef.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                AutoCompleteTextView name = (AutoCompleteTextView) findViewById(R.id.sign_up_name);
                AutoCompleteTextView lastName = (AutoCompleteTextView) findViewById(R.id.sign_up_lastname);
                AutoCompleteTextView  id = (AutoCompleteTextView) findViewById(R.id.sign_up_id);
                AutoCompleteTextView phone = (AutoCompleteTextView) findViewById(R.id.sing_up_phone);
                AutoCompleteTextView clinicHist = (AutoCompleteTextView)findViewById(R.id.sing_up_clinic_history);
                AutoCompleteTextView familiarBack = (AutoCompleteTextView) findViewById(R.id.sign_up_family_background);

                //which parameter need to put onRadioButtonClicked()?

                User user = new User(name.getText().toString(),lastName.getText().toString(),Integer.parseInt(id.getText().toString()),
                        Integer.parseInt(phone.getText().toString()),clinicHist.getText().toString(),familiarBack.getText().toString(),
                        onRadioButtonClicked());



            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }

    public char onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        char selected=' ';

        switch (view.getId()) {
            case R.id.Patient:
                if (checked)
                    selected = 'P';
                break;
            case R.id.Doctor:
                if (checked)
                    selected = 'D';
                break;
        }
        return selected;
    }
}

