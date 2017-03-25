package com.example.ivos.patchwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.LL1);

        for (int i=1; i<5; i++) {
            //ImageView Setup
            ImageView imageView = new ImageView(this);

            //setting image resource
            imageView.setImageResource(R.drawable.ball);

            // Create layout parameters for ImageView
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                    LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            //set params
            imageView.setLayoutParams(params);
            //adding image view
            mainLayout.addView(imageView);
            ////make visible to program
            //setContentView(imageView);
        }

    }
}
