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
 * This class allows the user to choose two characters as input into two EditTexts and
 * sends the data two the TwoCharacter class.
 *
 * @author Jeremiah Griffin
 * @version 2/15/2015
 */

public class ChooseTwo extends ActionBarActivity implements View.OnClickListener {
    /** Text box for first character value.   */
    EditText et1;
    /** Text box for the second character value. */
    EditText et2;

    /**
     *  This method creates the activity and registers all the entities on it.
     * @param savedInstanceState - Bundle object with data.
     * */
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_two);

        /* Finding both the text boxes.  */
        et1 = (EditText) findViewById(R.id.enter_char_a);
        et2 = (EditText) findViewById(R.id.enter_char_b);



        /* Creating button to go to next screen and finding it.   */
        Button goButton = (Button) findViewById(R.id.button_go2);
        goButton.setOnClickListener(this);



    }

    /**
     * This method handles when the go button is pressed and sends the data to the TwoCharacter
     * activity.
     * @param v - the next screen.
     */
    public void onClick(View v){
        /* Finding the button.  */
        Button b = (Button) findViewById(v.getId());

        /* Creating the intents in order to proceed to next screens. */
        Intent thisImage = new Intent(this,this.getClass());
        Intent showImage = new Intent(this,TwoCharacter.class);

        /* Storing the input in two string values.  */
        if (!(et1.getText().equals("")||(et2.getText().equals("")))) {
            String input = et1.getText().toString();
            String input2 = et2.getText().toString();

            /* identifying button. */
            if (b.getId() == R.id.button_go2) {


                input.toLowerCase();
                /* Case statement for input */
                if (!(input.equals(""))) {
                    switch (input) {
                        case "a":
                            showImage.putExtra("to_display1", input);

                        case "b":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "c":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "d":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "e":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "f":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "g":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "h":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "i":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "j":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "k":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "l":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "m":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "n":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "o":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "p":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "q":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "r":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "s":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "t":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "u":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "v":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "w":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "x":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "y":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "z":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "0":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "1":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "2":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "3":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "4":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "5":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "6":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "7":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "8":
                            showImage.putExtra("to_display1", input);
                            break;
                        case "9":
                            showImage.putExtra("to_display1", input);
                            break;
                        case " ":
                            showImage.putExtra("to_display1", input);
                            break;
                        default:
                            showImage.putExtra("to_display1", " ");
                            break;
                    }

                } else {
                    /* Toast for invalid input */
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text1 = "Enter Valid Characters please!";
                    Toast toast2 = Toast.makeText(context, text1, duration);
                    toast2.show();

                }

                input2.toLowerCase();
                /* Case statement for input values. */
                if (!(input2.equals(""))) {
                    switch (input2) {
                        case "a":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "b":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "c":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "d":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "e":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "f":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "g":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "h":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "i":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "j":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "k":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "l":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "m":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "n":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "o":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "p":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "q":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "r":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "s":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "t":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "u":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "v":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "w":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "x":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "y":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "z":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "0":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "1":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "2":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "3":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "4":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "5":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "6":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "7":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "8":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case "9":
                            showImage.putExtra("to_display2", input2);
                            break;
                        case " ":
                            showImage.putExtra("to_display2", input2);
                            break;
                        default:
                            showImage.putExtra("to_display2", " ");
                            break;
                    }

                } else {
                    /* Toast for invalid input */
                    Context context = getApplicationContext();
                    int duration = Toast.LENGTH_SHORT;
                    CharSequence text1 = "Enter Valid Characters please!";
                    Toast toast2 = Toast.makeText(context, text1, duration);
                    toast2.show();

                }
                this.startActivity(showImage);

            }

        }
           // this.startActivity(showImage);

    }

    /** The following methods were added by AndroidStudio by default. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_choose_two, menu);
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
