package com.example.jeremiah.catamountcharacters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * This activity allows the user to choose one character as input into a EditText object
 * and then if given correct input will advance the user to OneCharacter activity.
 *
 * @author Jeremiah Griffin
 * @version 2/15/2015
 */

public class ChooseOne extends ActionBarActivity implements View.OnClickListener{
    /** Text box for user input.   */
    private EditText et;

    /**
     * This method starts the activity and registers all of it's contents.
     * @param savedInstanceState - saved state of the activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_one);

        /* Creating the go button and finding it.  */
        Button go = (Button) findViewById(R.id.button_go1);
        /* Finding the text box. */
        et = (EditText) findViewById(R.id.one_char);
        /* Setting a listener for the go button. */
        go.setOnClickListener(this);

    }

    /**
     * This method handles when the go button is clicked and what characters are sent to the next
     * screen.
     * @param v - the next screen to go to.
     */
    public void onClick(View v){
        /* Creating a local button and identifying it.  */
        Button b = (Button) findViewById(v.getId());
        /* Creating an Intent so we can go to the next screen. */
        Intent showImage = new Intent(this,OneCharacter.class);
        /* Toast for invalid input. */
        Context context = getApplicationContext();
        CharSequence text = "Enter valid character please!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast;


        /* Identifying Go button. */
        if(b.getId() == R.id.button_go1){
            /* Make sure there is input. */
            if(et == null){

                toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            /* Storing input into local variable. */
            String input = et.getText().toString();
            if(input.length() > 1){


                toast = Toast.makeText(context, text, duration);
                toast.show();

            }

            input.toLowerCase();
            /* Case statement for user input. */
            switch(input){
                case "a" : showImage.putExtra("to_display",input);

                case "b" : showImage.putExtra("to_display",input);
                    break;
                case "c" : showImage.putExtra("to_display",input);
                    break;
                case "d" : showImage.putExtra("to_display",input);
                    break;
                case "e" : showImage.putExtra("to_display",input);
                    break;
                case "f" : showImage.putExtra("to_display",input);
                    break;
                case "g" : showImage.putExtra("to_display",input);
                    break;
                case "h" : showImage.putExtra("to_display",input);
                    break;
                case "i" : showImage.putExtra("to_display",input);
                    break;
                case "j" : showImage.putExtra("to_display",input);
                    break;
                case "k" : showImage.putExtra("to_display",input);
                    break;
                case "l" : showImage.putExtra("to_display",input);
                    break;
                case "m" : showImage.putExtra("to_display",input);
                    break;
                case "n" : showImage.putExtra("to_display",input);
                    break;
                case "o" : showImage.putExtra("to_display",input);
                    break;
                case "p" : showImage.putExtra("to_display",input);
                    break;
                case "q" : showImage.putExtra("to_display",input);
                    break;
                case "r" : showImage.putExtra("to_display",input);
                    break;
                case "s" : showImage.putExtra("to_display",input);
                    break;
                case "t" : showImage.putExtra("to_display",input);
                    break;
                case "u" : showImage.putExtra("to_display",input);
                    break;
                case "v" : showImage.putExtra("to_display",input);
                    break;
                case "w" : showImage.putExtra("to_display",input);
                    break;
                case "x" : showImage.putExtra("to_display",input);
                    break;
                case "y" : showImage.putExtra("to_display",input);
                    break;
                case "z" : showImage.putExtra("to_display",input);
                    break;
                case "0" : showImage.putExtra("to_display",input);
                    break;
                case "1" : showImage.putExtra("to_display",input);
                    break;
                case "2" : showImage.putExtra("to_display",input);
                    break;
                case "3" : showImage.putExtra("to_display",input);
                    break;
                case "4" : showImage.putExtra("to_display",input);
                    break;
                case "5" : showImage.putExtra("to_display",input);
                    break;
                case "6" : showImage.putExtra("to_display",input);
                    break;
                case "7" : showImage.putExtra("to_display",input);
                    break;
                case "8" : showImage.putExtra("to_display",input);
                    break;
                case "9" : showImage.putExtra("to_display",input);
                    break;
                case " " : showImage.putExtra("to_display",input);
                    break;
                default : showImage.putExtra("to_display"," ");
                    break;
            }





        }
        /* Start activity that displays character. */
        this.startActivity(showImage);

    }

    /* The following methods were added by AndroidStudio by default.  */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_one, menu);
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
