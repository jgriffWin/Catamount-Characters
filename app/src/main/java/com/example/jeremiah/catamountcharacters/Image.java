package com.example.jeremiah.catamountcharacters;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

/**
 * This class displays buttons for the user to choose. Each button will either display a Catamount
 * head, the Alumni Tower, an image with the text "COMPUTER", another with the text "SCIENCE", and
 * finally the last with the text "2013".
 *
 * @author Jeremiah Griffin
 * @version 2/15/2015
 */

public class Image extends ActionBarActivity implements View.OnClickListener{

    /**
     * This method starts the activity and registers all of it's contents.
     *
     * @param savedInstanceState - saved state of activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        /* Creating the necessary buttons and finding the ID's. */
        Button catButton = (Button) findViewById(R.id.catamount_button);
        Button towButton = (Button) findViewById(R.id.tower_button);
        Button comButton = (Button) findViewById(R.id.computer_button);
        Button sciButton = (Button) findViewById(R.id.science_button);
        Button yearButton = (Button) findViewById(R.id.year_button);

        /* Setting listeners for each button. */
        catButton.setOnClickListener(this);
        towButton.setOnClickListener(this);
        comButton.setOnClickListener(this);
        sciButton.setOnClickListener(this);
        yearButton.setOnClickListener(this);
    }

    /**
     * This method handles when one of the buttons is pressed by the user and sends the necessary
     * data to the OneCharacter activity to display the image to the screen.
     * @param v - the next screen.
     */
    public void onClick(View v){
        /* Creating a button and assigning it an ID. */
        Button b = (Button) findViewById(v.getId());
        /* Creating intent to send data to the next screen. */
        Intent in = new Intent(this, OneCharacter.class);
        /* Identifying which button was pressed and pushing the correct data. */
        if(b.getId() == R.id.catamount_button){
            in.putExtra("to_display",b.getText());
        } else if(b.getId() == R.id.science_button){
            in.putExtra("to_display", b.getText());
        } else if(b.getId() == R.id.computer_button){
            in.putExtra("to_display", b.getText());
        } else if(b.getId() == R.id.tower_button){
            in.putExtra("to_display", b.getText());
        } else if(b.getId() == R.id.year_button){
            in.putExtra("to_display", b.getText());
        }
        /* Starting the appropriate activity. */
        this.startActivity(in);


    }

    /* The following methods were added by AndroidStudio by default. */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_image, menu);
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
