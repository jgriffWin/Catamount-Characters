package com.example.jeremiah.catamountcharacters;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

/**
 * This class displays the single image of either character or one of the options from Image
 * activity.
 *
 * @author Jeremiah Griffin
 * @version 2/15/2015
 */
public class OneCharacter extends ActionBarActivity {
    /** String variable that holds the name of the image to display to screen. */
    private static String to_display;

    /**
     * This method starts the activity and registers all of it's contents.
     * @param savedInstanceState - saved state of activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_character);
        /* Creating ImageView and finding it's ID.    */
        ImageView iv = (ImageView) findViewById(R.id.char_image);


        /* Data to send to OneCharacter. */
        Bundle extras = getIntent().getExtras();

        if (extras != null)
        {
            to_display = extras.getString("to_display"," ");

        }
        /* Case statement to handle input from user. */
        switch(to_display){
            case "a" : iv.setImageResource(R.drawable.a_bl);
                break;
            case "b" : iv.setImageResource(R.drawable.b_bl);
                break;
            case "c" : iv.setImageResource(R.drawable.c_bl);
                break;
            case "d" : iv.setImageResource(R.drawable.d_bl);
                break;
            case "e" : iv.setImageResource(R.drawable.e_bl);
                break;
            case "f" : iv.setImageResource(R.drawable.f_bl);
                break;
            case "g" : iv.setImageResource(R.drawable.g_bl);
                break;
            case "h" : iv.setImageResource(R.drawable.h_bl);
                break;
            case "i" : iv.setImageResource(R.drawable.i_bl);
                break;
            case "j" : iv.setImageResource(R.drawable.j_bl);
                break;
            case "k" : iv.setImageResource(R.drawable.k_bl);
                break;
            case "l" : iv.setImageResource(R.drawable.l_bl);
                break;
            case "m" : iv.setImageResource(R.drawable.m_bl);
                break;
            case "n" : iv.setImageResource(R.drawable.n_bl);
                break;
            case "o" : iv.setImageResource(R.drawable.o_bl);
                break;
            case "p" : iv.setImageResource(R.drawable.p_bl);
                break;
            case "q" : iv.setImageResource(R.drawable.q_bl);
                break;
            case "r" : iv.setImageResource(R.drawable.r_bl);
                break;
            case "s" : iv.setImageResource(R.drawable.s_bl);
                break;
            case "t" : iv.setImageResource(R.drawable.t_bl);
                break;
            case "u" : iv.setImageResource(R.drawable.u_bl);
                break;
            case "v" : iv.setImageResource(R.drawable.v_bl);
                break;
            case "w" : iv.setImageResource(R.drawable.w_bl);
                break;
            case "x" : iv.setImageResource(R.drawable.x_bl);
                break;
            case "y" : iv.setImageResource(R.drawable.y_bl);
                break;
            case "z" : iv.setImageResource(R.drawable.z_bl);
                break;
            case "0" : iv.setImageResource(R.drawable.n0_bl);
                break;
            case "1" : iv.setImageResource(R.drawable.n1_bl);
                break;
            case "2" : iv.setImageResource(R.drawable.n2_bl);
                break;
            case "3" : iv.setImageResource(R.drawable.n3_bl);
                break;
            case "4" : iv.setImageResource(R.drawable.n4_bl);
                break;
            case "5" : iv.setImageResource(R.drawable.n5_bl);
                break;
            case "6" : iv.setImageResource(R.drawable.n6_bl);
                break;
            case "7" : iv.setImageResource(R.drawable.n7_bl);
                break;
            case "8" : iv.setImageResource(R.drawable.n8_bl);
                break;
            case "9" : iv.setImageResource(R.drawable.n9_bl);
                break;
            case " " : iv.setImageResource(R.drawable.space_bl);
                break;
            case "Catamount" : iv.setImageResource(R.drawable.cat);
                break;
            case "Tower" : iv.setImageResource(R.drawable.tower);
                break;
            case "Computer" : iv.setImageResource(R.drawable.computer);
                break;
            case "Science" : iv.setImageResource(R.drawable.science);
                break;
            case "2013" : iv.setImageResource(R.drawable.cs467);
                break;
            default : iv.setImageResource(R.drawable.d_bl);
                break;
        }





    }

    /* The following the methods are provided by AndroidStudio by default. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_one_character, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
