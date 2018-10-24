package bdtak.example.com.liyeplimal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.CountDownTimer;
import android.os.Handler;
import android.provider.Settings;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.viksaa.sssplash.lib.activity.AwesomeSplash;
import com.viksaa.sssplash.lib.cnst.Flags;
import com.viksaa.sssplash.lib.model.ConfigSplash;

import static android.widget.Toast.*;

public class SplashActivity extends AwesomeSplash {

   /* @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }*/

    @Override
    public void initSplash(ConfigSplash configSplash) {

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        configSplash.setBackgroundColor(R.color.bg_splash);
        configSplash.setAnimCircularRevealDuration(3000);
        configSplash.setAnimCircularRevealDuration(Flags.WITH_LOGO);

        configSplash.setLogoSplash(R.drawable.logo);
        configSplash.setAnimLogoSplashDuration(5000);
        configSplash.setAnimLogoSplashTechnique(Techniques.Bounce);

        configSplash.setTitleSplash("Liyeplimal");
        configSplash.setAnimTitleDuration(3000);
        configSplash.setAnimTitleTechnique(Techniques.FadeIn);
        configSplash.setTitleTextSize(17);



    }

    @Override
    public void animationsFinished() {

     /*   Intent intent = new Intent(SplashActivity.this, MainActivity.class);
        SplashActivity.this.startActivity(intent);*/

    }
    @Override
    protected void onResume() {
        super.onResume();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SplashActivity.this.finish();
                Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                SplashActivity.this.startActivity(intent);
            }
        }, 8000);
    }

}
