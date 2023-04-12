package io.agora.gittrial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("Changes 1 by faizan/master");
        System.out.println("Change 1 by master itself");
        System.out.println("Changes 1 by faizan only");
        System.out.println("Changes made by the master branch");
        System.out.println("This line will be merge");
    }
}