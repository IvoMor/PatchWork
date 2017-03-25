package com.example.ivos.patchwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public String actualPatchColor = "blue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        LinearLayout mainLayout = (LinearLayout) findViewById(R.id.LL1);

//        for (int i = 1; i < 5; i++) {
//            //ImageView Setup
//            ImageView imageView = new ImageView(this);
//
//            //setting image resource
//            imageView.setImageResource(R.drawable.ball);
//
//            // Create layout parameters for ImageView
//            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
//                    LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
//            //set params
//            imageView.setLayoutParams(params);
//            //adding image view
//            mainLayout.addView(imageView);
//            ////make visible to program
//            //setContentView(imageView);
//        }
    }


    // change image with actual set patch
    public void changePatch(View v) {
        String sendTag = v.getTag().toString();    //save the tag
        ImageView changingImageView = (ImageView) findViewById(getImageID(sendTag));
        switch (actualPatchColor) {
            case "blue":
                changingImageView.setImageResource(R.drawable.blue);
                break;
            case "yellow":
                changingImageView.setImageResource(R.drawable.yellow);
                break;
            case "green":
                changingImageView.setImageResource(R.drawable.green);
                break;
        }
    }

    //choose color
    public void changePatchColor (View v) {
        String sendTagColor = v.getTag().toString();    //save the tag
        actualPatchColor = sendTagColor;                //save new color
    }

    //get id of clicked ImageView by sended Tag
    public int getImageID(String sendTag) {
        switch (sendTag) {
            case "I11": return R.id.I11;
            case "I12": return R.id.I12;
            case "I13": return R.id.I13;
            case "I14": return R.id.I14;
            case "I15": return R.id.I15;
            case "I21": return R.id.I21;
            case "I22": return R.id.I22;
            case "I23": return R.id.I23;
            case "I24": return R.id.I24;
            case "I25": return R.id.I25;
            case "I31": return R.id.I31;
            case "I32": return R.id.I32;
            case "I33": return R.id.I33;
            case "I34": return R.id.I34;
            case "I35": return R.id.I35;
            case "I41": return R.id.I41;
            case "I42": return R.id.I42;
            case "I43": return R.id.I43;
            case "I44": return R.id.I44;
            case "I45": return R.id.I45;
            case "I51": return R.id.I51;
            case "I52": return R.id.I52;
            case "I53": return R.id.I53;
            case "I54": return R.id.I54;
            case "I55": return R.id.I55;
        }
        return 0;
    }
}
