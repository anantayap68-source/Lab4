package com.example.lab3;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Polymorphism
        Note noteA = new TextNote("Do Lab3", "create class diagram and code", "6 July 2026");
        noteA.getSummary();

        Note noteB = new CheckListNote("Shopping List", Arrays.asList("Milk", "Bread", "Eggs"), "6 July 2026");
        noteB.getSummary();

        User user1 = new StudentUser("6812247074", "Anantaya", "anantaya.p68@psru.ac.th", "200149", "Science and Technology");
        user1.showUser();
    }
}