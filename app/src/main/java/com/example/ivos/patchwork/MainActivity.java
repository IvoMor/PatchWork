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
        actualPatchColor = v.getTag().toString();        //save new color from send Tag
    }

    //get id of clicked ImageView by send Tag
    public int getImageID(String sendTag) {
        switch (sendTag) {
            case "I11":return R.id.I11;
            case "I12":return R.id.I12;
            case "I13":return R.id.I13;
            case "I14":return R.id.I14;
            case "I15":return R.id.I15;
            case "I16":return R.id.I16;
            case "I17":return R.id.I17;
            case "I18":return R.id.I18;
            case "I19":return R.id.I19;
            case "I20":return R.id.I20;
            case "I21":return R.id.I21;
            case "I22":return R.id.I22;
            case "I23":return R.id.I23;
            case "I24":return R.id.I24;
            case "I25":return R.id.I25;
            case "I26":return R.id.I26;
            case "I27":return R.id.I27;
            case "I28":return R.id.I28;
            case "I29":return R.id.I29;
            case "I30":return R.id.I30;
            case "I31":return R.id.I31;
            case "I32":return R.id.I32;
            case "I33":return R.id.I33;
            case "I34":return R.id.I34;
            case "I35":return R.id.I35;
            case "I36":return R.id.I36;
            case "I37":return R.id.I37;
            case "I38":return R.id.I38;
            case "I39":return R.id.I39;
            case "I40":return R.id.I40;
            case "I41":return R.id.I41;
            case "I42":return R.id.I42;
            case "I43":return R.id.I43;
            case "I44":return R.id.I44;
            case "I45":return R.id.I45;
            case "I46":return R.id.I46;
            case "I47":return R.id.I47;
            case "I48":return R.id.I48;
            case "I49":return R.id.I49;
            case "I50":return R.id.I50;
            case "I51":return R.id.I51;
            case "I52":return R.id.I52;
            case "I53":return R.id.I53;
            case "I54":return R.id.I54;
            case "I55":return R.id.I55;
            case "I56":return R.id.I56;
            case "I57":return R.id.I57;
            case "I58":return R.id.I58;
            case "I59":return R.id.I59;
            case "I60":return R.id.I60;
            case "I61":return R.id.I61;
            case "I62":return R.id.I62;
            case "I63":return R.id.I63;
            case "I64":return R.id.I64;
            case "I65":return R.id.I65;
            case "I66":return R.id.I66;
            case "I67":return R.id.I67;
            case "I68":return R.id.I68;
            case "I69":return R.id.I69;
            case "I70":return R.id.I70;
            case "I71":return R.id.I71;
            case "I72":return R.id.I72;
            case "I73":return R.id.I73;
            case "I74":return R.id.I74;
            case "I75":return R.id.I75;
            case "I76":return R.id.I76;
            case "I77":return R.id.I77;
            case "I78":return R.id.I78;
            case "I79":return R.id.I79;
            case "I80":return R.id.I80;
            case "I81":return R.id.I81;
            case "I82":return R.id.I82;
            case "I83":return R.id.I83;
            case "I84":return R.id.I84;
            case "I85":return R.id.I85;
            case "I86":return R.id.I86;
            case "I87":return R.id.I87;
            case "I88":return R.id.I88;
            case "I89":return R.id.I89;
            case "I90":return R.id.I90;
            case "I91":return R.id.I91;
            case "I92":return R.id.I92;
            case "I93":return R.id.I93;
            case "I94":return R.id.I94;
            case "I95":return R.id.I95;
            case "I96":return R.id.I96;
            case "I97":return R.id.I97;
            case "I98":return R.id.I98;
            case "I99":return R.id.I99;
            case "I100":return R.id.I100;
            case "I101":return R.id.I101;
            case "I102":return R.id.I102;
            case "I103":return R.id.I103;
            case "I104":return R.id.I104;
            case "I105":return R.id.I105;
            case "I106":return R.id.I106;
            case "I107":return R.id.I107;
            case "I108":return R.id.I108;
            case "I109":return R.id.I109;
            case "I110":return R.id.I110;
        }
        return 0;
    }
}
