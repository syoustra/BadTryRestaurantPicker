package com.syoustra.dinnertimedilemma;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Button randomSelectorButton;
        randomSelectorButton = (Button) findViewById(R.id.randomSelectorButton);

        randomSelectorButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectRestaurant();
            }
        });
    }

    private void selectRestaurant(){
        Intent intent = new Intent(this, RestaurantActivity.class);
        startActivity(intent);
    }



//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        }
//
//            }
//        }


        //Declare our View variables and assign them the Views from the layout file
//        Button randomSelectorButton = (Button) findViewById(R.id.randomSelectorButton);
//        View.OnClickListener listener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //*********WHERE I LEFT OFF WITH THE ADDING THE ONCLICK METHOD 0:54 ************************
//            }
//        };
//        randomSelectorButton.setOnClickListener(listener);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_splash, menu);
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
