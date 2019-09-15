package com.example.android.learnBengali;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Words> words = new ArrayList<Words>();
        Words w = new Words("Mother","Maa",R.drawable.family_mother);
        words.add(w);

        words.add(new Words("Father","Baba",R.drawable.family_father));
        words.add(new Words("Son","Putro",R.drawable.family_son));
        words.add(new Words("Daughter","Putri",R.drawable.family_daughter));
        words.add(new Words("Grandfather","Daadu",R.drawable.family_grandfather));
        words.add(new Words("Grandmother","Thakuma",R.drawable.family_grandmother));
        words.add(new Words("Older Brother","Dada",R.drawable.family_older_brother));
        words.add(new Words("Older Sister","Didi",R.drawable.family_older_sister));
        words.add(new Words("Younger Brother","Bhai",R.drawable.family_younger_brother));
        words.add(new Words("Young Sister","Bon",R.drawable.family_younger_sister));


        WordsAdapter adapter = new WordsAdapter(this,words,R.color.category_family);
        ListView listView= (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
