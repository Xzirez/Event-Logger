package com.example.eventlogger;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profile_fragment extends Activity {

    FirebaseAuth auth;
    FirebaseUser firebaseUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        auth = FirebaseAuth.getInstance();
        firebaseUser = auth.getCurrentUser();
        setContentView(R.layout.fragment_profile);

        if(firebaseUser != null) {
            TextView name = findViewById(R.id.name);
            name.setText(firebaseUser.getDisplayName());
            TextView email = findViewById(R.id.email);
            email.setText(firebaseUser.getEmail());
        }
    }
}
