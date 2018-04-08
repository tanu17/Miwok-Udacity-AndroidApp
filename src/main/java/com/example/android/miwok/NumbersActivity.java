
package com.example.android.miwok;

import java.util.ArrayList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        
        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("ten");
        
        //parent view
        LinearLayout rootView =(LinearLayout) findViewById(R.id.rootView);
        //child view
        TextView wordView=  new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);
    }
}
