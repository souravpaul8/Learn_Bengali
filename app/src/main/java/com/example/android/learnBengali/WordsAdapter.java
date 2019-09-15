package com.example.android.learnBengali;

import android.support.v4.content.ContextCompat;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import android.app.Activity;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * Created by SOURAV PAUL on 2/14/2018.
 */


public class WordsAdapter extends ArrayAdapter<Words> {

    private int mColorResourceId;

        public WordsAdapter (Activity context, ArrayList<Words> words, int ColorResourceId) {

            super(context , 0, words);
            mColorResourceId = ColorResourceId;
        }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Words languageView = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        defaultTextView.setText(languageView.getEnglishText());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView bengaliTextView = (TextView) listItemView.findViewById(R.id.bengali_text_view);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        bengaliTextView.setText(languageView.getBengaliText());

        // Find the ImageView in the list_item.xml layout with the ID list_item_icon
        ImageView image = (ImageView) listItemView.findViewById(R.id.image_view);

        if(languageView.hasImage()) {
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            image.setImageResource(languageView.getImageResourceId());

            image.setVisibility(View.VISIBLE);
        }

        else
        {
            image.setVisibility(View.GONE);
        }

        View  textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;

    }
}
