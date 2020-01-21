package com.adteccorp.swipepulltorefresh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OnTextchangeWatcher extends AppCompatActivity {
    TextView passstrenth,passnotenter;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_on_textchange_watcher );
        init();
    }
   public void init(){
        passstrenth =findViewById( R.id.tvpasswordstrenth );
        passnotenter =findViewById( R.id.tvnotentered );
        password =findViewById( R.id.etpassword );
         password.addTextChangedListener( new TextWatcher() {

             @Override
             public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                 Toast.makeText( OnTextchangeWatcher.this, "Type your Password", Toast.LENGTH_SHORT ).show();
             }

             @Override
             public void onTextChanged(CharSequence s, int start, int before, int count) {
                 Toast.makeText( OnTextchangeWatcher.this, "Pass Your Change", Toast.LENGTH_SHORT ).show();

             }

             @Override
             public void afterTextChanged(Editable no) {
                 if(no.length()==0){
                     passnotenter.setText( "Not Entered" );
                 }else if(no.length()<4){
                     passnotenter.setText( "short" );
                 }
                 else if(no.length()<8){
                     passnotenter.setText( "medium" );
                 }
                 else if(no.length()<10){
                     passnotenter.setText( "max length reached" );
                 }

             }
         } );
    }
}
