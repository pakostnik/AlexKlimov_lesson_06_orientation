package com.ex.pakostnik.alexklimov_lesson_06_orientation;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Surface;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Su.I.M. on 10.04.16.
 */
public class MainOrientation extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        getOrientation();
    }

    public void getOrientation(){
        Context appCont = getApplicationContext();
        int rotate = getWindowManager().getDefaultDisplay().getRotation();
        switch (rotate){
            case Surface.ROTATION_0:
                Toast.makeText(appCont,"не повернут", Toast.LENGTH_SHORT).show();
                break;
            case Surface.ROTATION_90:
                Toast.makeText(appCont, "повернут на 90 градусов по часовой стрелке", Toast.LENGTH_SHORT).show();
                break;
            case Surface.ROTATION_180:
                Toast.makeText(appCont, "повернут на 180 градусов", Toast.LENGTH_SHORT).show();
                break;
            case Surface.ROTATION_270:
                Toast.makeText(appCont, "повернут на 90 градусов против часовой стрелки", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(appCont, "Непонятно", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
