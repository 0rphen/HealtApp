package com.lorenz.konrad.healtapp.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.lorenz.konrad.healtapp.R;
import com.lorenz.konrad.healtapp.entities.Forms;

public class FormActivity extends AppCompatActivity {

    private DatabaseReference dbRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_diagnostic);

        setContentView(R.layout.activity_form);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        String question1 = findViewById(R.id.pregunta1).toString();
        String question2 = findViewById(R.id.pregunta2).toString();
        String question3 = findViewById(R.id.pregunta3).toString();
        newFormRegister(question1, question2, question3);
    }

    public void newFormRegister(String question1, String question2, String question3) {
        dbRef = FirebaseDatabase.getInstance().getReference();
        Forms form = new Forms(question1, question2, question3);
        dbRef.child("form").setValue(form);
    }
}
