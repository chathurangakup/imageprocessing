package com.lathusha.imageprocessing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class Suggestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestion);

        getSupportActionBar().setTitle("Suggested pesticides");

        ListView lvCards = (ListView) findViewById(R.id.list_cards);
        CardsAdapter adapter = new CardsAdapter(this);

        lvCards.setAdapter(adapter);
        adapter.addAll(new CardModel(R.drawable.image_pesti, R.string.immediator, R.string.immediator_sub),
                new CardModel(R.drawable.image_pesti, R.string.immediator, R.string.immediator_sub),
                new CardModel(R.drawable.image_pesti, R.string.immediator, R.string.immediator_sub),
                new CardModel(R.drawable.image_pesti, R.string.immediator, R.string.immediator_sub),
                new CardModel(R.drawable.image_pesti, R.string.immediator, R.string.immediator_sub),
                new CardModel(R.drawable.image_pesti, R.string.immediator, R.string.immediator_sub),
                new CardModel(R.drawable.image_pesti, R.string.immediator, R.string.immediator_sub));
    }
}