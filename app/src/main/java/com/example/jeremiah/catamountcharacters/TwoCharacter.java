package com.example.jeremiah.catamountcharacters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;

import javax.xml.datatype.Duration;

/**
 * This is This class displays two characters to the screen. It accepts a Bundle object and extracts the
 * characters in order to display both in their appropriate ImageView objects.
 *
 * @author Jeremiah Griffin
 * @version 2/15/2015
 */
public class TwoCharacter extends ActionBarActivity {
    /** First character to display  */
    private String to_display1;
    /** Second character to display */
    private String to_display2;

    /** Method starts activity and registers all the entities on it.   */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_character);

        /** ImageView object for first character. */
        ImageView iv = (ImageView) findViewById(R.id.char_img_one);
        /** ImageView object for second character. */
        ImageView iv2 = (ImageView) findViewById(R.id.char_img_two);

        /* Bundle to retrieve characters from ChooseTwo.java */
        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            to_display1 = extras.getString("to_display1", " ");
            to_display2 = extras.getString("to_display2", " ");

        }else{
            /* Print a Toast for lack of user input. */
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text1 = "Enter Valid Characters please!";

            Toast toast2 = Toast.makeText(context,text1,duration);
            toast2.show();
            Intent choose = new Intent(this,ChooseTwo.class);
            startActivity(choose);
        }
        if(!(to_display1.equals(""))){
          /* Case statement to map choice of character to correct images  */
          switch (to_display1) {
            case "a":
                iv.setImageResource(R.drawable.a_sl);
                break;
            case "b":
                iv.setImageResource(R.drawable.b_sl);
                break;
            case "c":
                iv.setImageResource(R.drawable.c_sl);
                break;
            case "d":
                iv.setImageResource(R.drawable.d_sl);
                break;
            case "e":
                iv.setImageResource(R.drawable.e_sl);
                break;
            case "f":
                iv.setImageResource(R.drawable.f_sl);
                break;
            case "g":
                iv.setImageResource(R.drawable.g_sl);
                break;
            case "h":
                iv.setImageResource(R.drawable.h_sl);
                break;
            case "i":
                iv.setImageResource(R.drawable.i_sl);
                break;
            case "j":
                iv.setImageResource(R.drawable.j_sl);
                break;
            case "k":
                iv.setImageResource(R.drawable.k_sl);
                break;
            case "l":
                iv.setImageResource(R.drawable.l_sl);
                break;
            case "m":
                iv.setImageResource(R.drawable.m_sl);
                break;
            case "n":
                iv.setImageResource(R.drawable.n_sl);
                break;
            case "o":
                iv.setImageResource(R.drawable.o_sl);
                break;
            case "p":
                iv.setImageResource(R.drawable.p_sl);
                break;
            case "q":
                iv.setImageResource(R.drawable.q_sl);
                break;
            case "r":
                iv.setImageResource(R.drawable.r_sl);
                break;
            case "s":
                iv.setImageResource(R.drawable.s_sl);
                break;
            case "t":
                iv.setImageResource(R.drawable.t_sl);
                break;
            case "u":
                iv.setImageResource(R.drawable.u_sl);
                break;
            case "v":
                iv.setImageResource(R.drawable.v_sl);
                break;
            case "w":
                iv.setImageResource(R.drawable.w_sl);
                break;
            case "x":
                iv.setImageResource(R.drawable.x_sl);
                break;
            case "y":
                iv.setImageResource(R.drawable.y_sl);
                break;
            case "z":
                iv.setImageResource(R.drawable.z_sl);
                break;
            case "0":
                iv.setImageResource(R.drawable.n0_sl);
                break;
            case "1":
                iv.setImageResource(R.drawable.n1_sl);
                break;
            case "2":
                iv.setImageResource(R.drawable.n2_sl);
                break;
            case "3":
                iv.setImageResource(R.drawable.n3_sl);
                break;
            case "4":
                iv.setImageResource(R.drawable.n4_sl);
                break;
            case "5":
                iv.setImageResource(R.drawable.n5_sl);
                break;
            case "6":
                iv.setImageResource(R.drawable.n6_sl);
                break;
            case "7":
                iv.setImageResource(R.drawable.n7_sl);
                break;
            case "8":
                iv.setImageResource(R.drawable.n8_sl);
                break;
            case "9":
                iv.setImageResource(R.drawable.n9_sl);
                break;
            default:
                iv.setImageResource(R.drawable.space_bl);
                Context context = getApplicationContext();
                int duration = Toast.LENGTH_SHORT;
                CharSequence text1 = "Enter Valid Characters please!";
                Toast toast2 = Toast.makeText(context,text1,duration);
                toast2.show();

                break;
        }
    }else{
            /* Show a toast for wrong input.*/
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text1 = "Enter Valid Characters please!";

            Toast toast2 = Toast.makeText(context,text1,duration);
            toast2.show();
        }

        if(!(to_display2.equals(""))) {
            /* Case statement to map choice of character to correct images  */
            switch (to_display2) {
                case "a":
                    iv2.setImageResource(R.drawable.a_sl);
                    break;
                case "b":
                    iv2.setImageResource(R.drawable.b_sl);
                    break;
                case "c":
                    iv2.setImageResource(R.drawable.c_sl);
                    break;
                case "d":
                    iv2.setImageResource(R.drawable.d_sl);
                    break;
                case "e":
                    iv2.setImageResource(R.drawable.e_sl);
                    break;
                case "f":
                    iv.setImageResource(R.drawable.f_sl);
                    break;
                case "g":
                    iv.setImageResource(R.drawable.g_sl);
                    break;
                case "h":
                    iv.setImageResource(R.drawable.h_sl);
                    break;
                case "i":
                    iv.setImageResource(R.drawable.i_sl);
                    break;
                case "j":
                    iv.setImageResource(R.drawable.j_sl);
                    break;
                case "k":
                    iv.setImageResource(R.drawable.k_sl);
                    break;
                case "l":
                    iv.setImageResource(R.drawable.l_sl);
                    break;
                case "m":
                    iv.setImageResource(R.drawable.m_sl);
                    break;
                case "n":
                    iv.setImageResource(R.drawable.n_sl);
                    break;
                case "o":
                    iv.setImageResource(R.drawable.o_sl);
                    break;
                case "p":
                    iv.setImageResource(R.drawable.p_sl);
                    break;
                case "q":
                    iv.setImageResource(R.drawable.q_sl);
                    break;
                case "r":
                    iv.setImageResource(R.drawable.r_sl);
                    break;
                case "s":
                    iv.setImageResource(R.drawable.s_sl);
                    break;
                case "t":
                    iv.setImageResource(R.drawable.t_sl);
                    break;
                case "u":
                    iv.setImageResource(R.drawable.u_sl);
                    break;
                case "v":
                    iv.setImageResource(R.drawable.v_sl);
                    break;
                case "w":
                    iv.setImageResource(R.drawable.w_sl);
                    break;
                case "x":
                    iv.setImageResource(R.drawable.x_sl);
                    break;
                case "y":
                    iv.setImageResource(R.drawable.y_sl);
                    break;
                case "z":
                    iv.setImageResource(R.drawable.z_sl);
                    break;
                case "0":
                    iv.setImageResource(R.drawable.n0_sl);
                    break;
                case "1":
                    iv.setImageResource(R.drawable.n1_sl);
                    break;
                case "2":
                    iv.setImageResource(R.drawable.n2_sl);
                    break;
                case "3":
                    iv.setImageResource(R.drawable.n3_sl);
                    break;
                case "4":
                    iv.setImageResource(R.drawable.n4_sl);
                    break;
                case "5":
                    iv.setImageResource(R.drawable.n5_sl);
                    break;
                case "6":
                    iv.setImageResource(R.drawable.n6_sl);
                    break;
                case "7":
                    iv.setImageResource(R.drawable.n7_sl);
                    break;
                case "8":
                    iv.setImageResource(R.drawable.n8_sl);
                    break;
                case "9":
                    iv.setImageResource(R.drawable.n9_sl);
                    break;
                default:
                    iv.setImageResource(R.drawable.space_bl);
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text1 = "Enter Valid Characters please!";
                    Toast toast2 = Toast.makeText(context,text1,duration);
                    toast2.show();

                    break;
            }
        }else{
            /* Show a toast for wrong input.*/
            Context context = getApplicationContext();
            int duration = Toast.LENGTH_SHORT;
            CharSequence text1 = "Enter Valid Characters please!";
            Toast toast2 = Toast.makeText(context,text1,duration);
            toast2.show();
        }


    }



    /* The following methods were in the activity by default. */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_two_character, menu);
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

