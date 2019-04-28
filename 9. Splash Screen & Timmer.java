//Splash Screen

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Splash extends Activity {

    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 1000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splashscreen);

        /* New Handler to start the Menu-Activity 
         * and close this Splash-Screen after some seconds.*/

        new Handler().postDelayed(new Runnable(){
            @Override

            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splash.this,Menu.class);
                Splash.this.startActivity(mainIntent);
                Splash.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}

..........................................................................................................................

//Use Timmer to do something(Reverse Splash)

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class FlashScreen extends AppCompatActivity {

    private static int interval = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);


         Handler handler = new Handler();
         Runnable runnable = new Runnable(){
            public void run() {
                //Intent mainact=new Intent(FlashScreen.this,Home.class);
                //startActivity(mainact);
                finish();
            }
        };
        handler.postAtTime(runnable, System.currentTimeMillis()+interval);
        handler.postDelayed(runnable, interval);

    }
}
