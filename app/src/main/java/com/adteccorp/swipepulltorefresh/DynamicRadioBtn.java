package com.adteccorp.swipepulltorefresh;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class DynamicRadioBtn extends AppCompatActivity {
    LinearLayout linearLayout;
    RadioGroup r;
    String[] names = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dynamic_radio_btn );
        linearLayout = findViewById( R.id.linearlayoutid );
        r = new RadioGroup( this );
        r.setOrientation( RadioGroup.VERTICAL );
        RadioGroup.LayoutParams layoutParams;
        for (int i = 0; i < names.length; i++) {
            RadioButton r1 = new RadioButton( this );
            r1.setText( names[i] );
            layoutParams = new RadioGroup.LayoutParams( RadioGroup.LayoutParams.MATCH_PARENT, RadioGroup.LayoutParams.MATCH_PARENT );
            r.addView( r1, layoutParams );
        }

        linearLayout.addView( r );
    }
}
