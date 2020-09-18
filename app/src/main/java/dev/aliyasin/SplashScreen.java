package dev.aliyasin;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    private int time=5000;
    TextView satu;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        satu=(TextView)findViewById(R.id.satu);
        img=findViewById(R.id.img);
        Typeface customfont=Typeface.createFromAsset(getAssets(),"font/frijole.ttf");
        satu.setTypeface(customfont);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home=new Intent(SplashScreen.this, EntryActivity.class);
                startActivity(home);
                finish();
            }
        },time);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.enter_transition);
        satu.startAnimation(myanim);
        img.startAnimation(myanim);


    }


}

