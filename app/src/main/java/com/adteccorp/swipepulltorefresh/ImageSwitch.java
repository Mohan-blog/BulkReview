package com.adteccorp.swipepulltorefresh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class ImageSwitch extends AppCompatActivity {
    private ImageSwitcher imageSwitcher;
    private Button previewbtn, nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.refractor );
      imageSwitcher =findViewById( R.id.iswitcher );
      previewbtn =findViewById( R.id.preview );
      nextbtn =findViewById( R.id.next );
      imageSwitcher.setFactory( new ViewSwitcher.ViewFactory() {
          @Override
          public View makeView() {
              ImageView imageView = new ImageView( getApplicationContext() );
              imageView.setScaleType( ImageView.ScaleType.FIT_CENTER );

              return imageView;
          }
      } );
      previewbtn.setOnClickListener( new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              imageSwitcher.setImageResource( R.drawable.adtech );
          }
      } );
      nextbtn.setOnClickListener( new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              imageSwitcher.setImageResource( R.drawable.round );
          }
      } );

    }
}
