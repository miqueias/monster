package com.example.marlon.estudo;


import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MapaCarregandoActivity extends Activity {

    private ImageView imgRotate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carregando);
//        getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        imgRotate = (ImageView) findViewById(R.id.animImage);
        final Animation animRotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
        imgRotate.startAnimation(animRotate);

    }
}
