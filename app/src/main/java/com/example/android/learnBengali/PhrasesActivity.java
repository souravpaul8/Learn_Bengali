package com.example.android.learnBengali;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

       final ArrayList<Words> words = new ArrayList<Words>();
        words.add(new Words("Where are you going?", "Aapni kothai jacchhen?",-1,R.raw.one));
        words.add(new Words("What is your name?", "Aapnar naam ki?",-1,R.raw.one));
        words.add(new Words("My name is...", "Aamar naam...",-1,R.raw.one));
        words.add(new Words("How are you feeling?", "Kaemon aacho tumi?",-1,R.raw.one));
        words.add(new Words("I’m feeling good.", "Aami bhaalo anubhav korchi.",-1,R.raw.one));
        words.add(new Words("Are you coming?", "Tumi ki ascho?",-1,R.raw.one));
        words.add(new Words("Yes, I’m coming.", "Haa,aami aschi.",-1,R.raw.one));
        words.add(new Words("I’m coming.", "Aami aschi.",-1,R.raw.one));
        words.add(new Words("Let’s go.", "Cholo jaay.",-1,R.raw.one));
        words.add(new Words("Come here.", "Eikhene Aaso.",-1,R.raw.one));


        WordsAdapter adapter = new WordsAdapter(this,words,R.color.category_phrases);
        ListView listView= (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Words word = words.get(i);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this, word.getAudioResourceId());
                mMediaPlayer.start();
            }
        });
    }
}
