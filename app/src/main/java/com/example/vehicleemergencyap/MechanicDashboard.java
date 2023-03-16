package com.example.vehicleemergencyap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.button.MaterialButton;

public class MechanicDashboard extends AppCompatActivity {
    MaterialButton btnAddBusn; // add the button in this class

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mechanic_dashboard); // this code references the layout file (xml file)

//        implement the actions here
//        this declaration finds the button from the xml and then use it here to do some action
        btnAddBusn = findViewById(R.id.btnAddBusn);

//        create an onclick listener for the button. when the user taps the buttn then do...
        btnAddBusn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                this code moves you from one ui to the next in this case from dashboard to add busn
                Intent intent = new Intent(MechanicDashboard.this, AddBusiness.class);
                startActivity(intent);
            }
        });


    }
}