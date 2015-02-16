package com.example.jeremiah.catamountcharacters;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * This is the Main Menu and home screen of Catamount Characters, an Android application meant to
 * display large characters, multiple characters, or other images based on the user's input. This
 * is the first project of Dr. Scott's CS467: Mobile Application Programming course. The ideal use
 * case for the application centers around multiple devices running this application with each
 * displaying the character necessary to create words or phrases that could be seen from a relatively
 * small distance.
 *
 * @author Jeremiah Griffin
 * @version 2/15/2015
 */

public class MainActivity extends ActionBarActivity implements View.OnClickListener{
    /**
     * This method starts the activity and registers all of it's contents.
     * @param savedInstanceState - saved state of activity.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /* Creating the necessary buttons and finding their ID's. */
        Button buttonOne = (Button) findViewById(R.id.one_letter);
        Button buttonTwo = (Button) findViewById(R.id.two_letters);
        Button buttonImg = (Button) findViewById(R.id.image_button);
        Button buttonInfo = (Button) findViewById(R.id.info_button);

        /* Set onClickListeners for buttons. */
        buttonOne.setOnClickListener(this);
        buttonTwo.setOnClickListener(this);
        buttonImg.setOnClickListener(this);
        buttonInfo.setOnClickListener(this);

    }
    public void onClick(View v){
        /** Button that was pressed. */
        Button b = (Button) findViewById(v.getId());
        Intent oneIn = new Intent(this,ChooseOne.class);
        Intent twoIn = new Intent(this,ChooseTwo.class);
        Intent imageIn = new Intent(this,Image.class);
        Intent infoIn = new Intent(this,Info.class);

        /** Getting values in the two text fields. */
      //  num1 = Integer.parseInt(text1.getText().toString());
        //num2 = Integer.parseInt(text2.getText().toString());


        /** Either adding or subtracting based on which button was pressed. */
        if(b.getId() == R.id.one_letter)    this.startActivity(oneIn);


        if(b.getId() == R.id.two_letters) this.startActivity(twoIn);

        if(b.getId() == R.id.image_button) this.startActivity(imageIn);

        if(b.getId() == R.id.info_button) this.startActivity(infoIn);
        /** Store the result and update the result text box. */
        //String result = Integer.toString(this.result);
        //tvResult.setText(result);
        //tvResult.setKeyListener(null);
        //  this.startActivity(in);

    }

    /* The following methods are provided by AndroidStudio by default. */

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
