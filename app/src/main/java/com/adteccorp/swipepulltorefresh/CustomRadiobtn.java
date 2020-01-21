package com.adteccorp.swipepulltorefresh;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CustomRadiobtn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_custom_radiobtn );

    }

    public void onRadiobtnclick(View view) {
        RadioGroup radioGroup = findViewById( R.id.radiogroup );
        RadioButton radioButton = findViewById( radioGroup.getCheckedRadioButtonId() );
        Toast.makeText( this, radioButton.getText() + "is Selected", Toast.LENGTH_SHORT ).show();
    }
}
