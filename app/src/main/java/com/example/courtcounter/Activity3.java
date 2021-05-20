package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity3 extends AppCompatActivity {

    /*
    Declaring the variables
     */

    EditText etTeamAName, etTeamBName;
    Button btnAct3Submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        /*
        Extracting the id of the variables
         */
        etTeamAName = findViewById(R.id.etTeamAName);
        etTeamBName = findViewById(R.id.etTeamBName);
        btnAct3Submit = findViewById(R.id.btnAct3Submit);

        btnAct3Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (etTeamAName.getText().toString().isEmpty() || etTeamBName.getText().toString().isEmpty()){
                    Toast.makeText(Activity3.this, "Please Enter All the fields!!", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(Activity3.this, com.example.courtcounter.MainActivity.class);
                    String teamAName = etTeamAName.getText().toString().trim();
                    String teamBName = etTeamBName.getText().toString().trim();

                    intent.putExtra("TeamAName", teamAName);
                    intent.putExtra("TeamBName", teamBName);

                    startActivity(intent);
                }
            }
        });


    }
}