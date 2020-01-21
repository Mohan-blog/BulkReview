package com.adteccorp.swipepulltorefresh;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.StrictMode;
import android.provider.MediaStore;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import java.io.File;
import java.io.IOException;

public class MyCameraApp extends AppCompatActivity {
    public static int index = 0;
    public final File directory = Environment.getExternalStoragePublicDirectory( Environment.DIRECTORY_PICTURES );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_my_camera_app );
        ActivityCompat.requestPermissions( this, new String[]{Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE}, PackageManager.PERMISSION_GRANTED );
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder(  );
        StrictMode.setVmPolicy( builder.build() );
    }

    public void camerabutton(View view) {
        index++;
        String file = directory + ".jpg" + index;
        File newfile = new File( file );
        try {
            newfile.createNewFile();

        } catch (IOException e) {
            e.printStackTrace();
        }
        Uri outputfield = Uri.fromFile( newfile );
        Intent cameraintent = new Intent( MediaStore.ACTION_IMAGE_CAPTURE );
        cameraintent.putExtra( MediaStore.EXTRA_OUTPUT,outputfield );
        startActivity( cameraintent );
    }
}
