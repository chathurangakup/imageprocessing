package com.lathusha.imageprocessing;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Description extends AppCompatActivity {

    TextView description;
    Button suggest;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);

        getSupportActionBar().setTitle("Disease description");

        description = findViewById(R.id.txt_description);
        description.setText("A serious disorder of tomato, pepper, cucumber and eggplant, blossom end rot is an environmental problem (not fungal) most often caused by uneven watering or by calcium deficiency. (These can be related; uneven watering can interfere with the uptake of calcium).");

        suggest = findViewById(R.id.btn_suggest);
        suggest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Description.this, Suggestion.class);
                startActivity(intent);
            }
        });
    }
}