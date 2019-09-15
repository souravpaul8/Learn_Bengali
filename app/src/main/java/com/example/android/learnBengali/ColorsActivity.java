package com.example.android.learnBengali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Words> words = new ArrayList<Words>();
        Words w = new Words("Red","Laal",R.drawable.color_red);
        words.add(w);

        words.add(new Words("Blue","Neel", R.drawable.color_blue));
        words.add(new Words("Yellow","Holud",R.drawable.color_yellow));
        words.add(new Words("Black","Kalo", R.drawable.color_black));
        words.add(new Words("Green","Shobuj",R.drawable.color_green));
        words.add(new Words("Orange","Kamola", R.drawable.color_orange));
        words.add(new Words("Pink","Golapi", R.drawable.color_pink));
        words.add(new Words("Purple","Beguni", R.drawable.color_purple));
        words.add(new Words("White","Shaadaa",R.drawable.color_white));
        words.add(new Words("Brown","Baadaami" , R.drawable.color_brown));


        WordsAdapter adapter = new WordsAdapter(this,words,R.color.category_colors);
        ListView listView= (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
