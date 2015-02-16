package com.example.jeremiah.catamountcharacters;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;


/**
 * This activity is the splash screen for Catamount Characters. It's duration is for 5 seconds and
 * then the application proceeds to the main menu.
 *
 * @author Jeremiah Griffin
 * @version 2/15/2015
 *
 *
 */
public class SplashScreen extends Activity {


        /**
         * A handler to invoke new processes on the UI thread.*
         */
        Handler handler;

        /**
         * The number of seconds the splash screen will display for*
         */
        static final int DELAY = 5000;

        /**
         * The next activity to start*
         */
        Class nextActivity = MainActivity.class;

        //==============================================================================================

        /**
         * Android calls this when the activity starts.
         *
         * @param savedInstanceState
         */
        //==============================================================================================
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_splash_screen);

            //A good place to start services and background processes
        }//ene onCreate=================================================================================

        //==============================================================================================

        /**
         * When the activity has been created the layout chosen and it's about to become interactive
         */
        //==============================================================================================
        public void onStart() {
            super.onStart();
            handler = new Handler();
            handler.postDelayed(r, DELAY);//Start the runnable

        }//=============================================================================================

        //==============================================================================================
        /**
         * Will run a second proceess on the main UI thread via the handler.
         */
        //==============================================================================================
        Runnable r = new Runnable() {
            public void run() {
                gotoNextScreen();
            }
        };//end runnable================================================================================


        //==============================================================================================

        /**
         * Start the main menu activity.
         */
        //==============================================================================================
        public void gotoNextScreen() {
            Intent nextScreen = new Intent(this, nextActivity);
            this.startActivity(nextScreen);
            finish();
        }//end gotoNextScreen===========================================================================



}