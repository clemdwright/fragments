package com.example.clemw.fragmenttest;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity implements Communicator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        /*
//         * Dynamically add fragment
//         */
//        // Create fragment object. This contains a layout inflater on onCreateView
//        MyFragment frag = new MyFragment();
//        // Create fragment manager object
//        FragmentManager manager = getFragmentManager();
//        //Begin the fragment transaction
//        FragmentTransaction transaction = manager.beginTransaction();
//        // Add the fragment to the transaction. params: parent, fragment object, tag
//        transaction.add(R.id.my_layout, frag, "VivzFragment");
//        // Commit the transaction
//        transaction.commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void respond(String data) {
        FragmentManager fragmentManager = getFragmentManager();
//        FragmentB f2 = (FragmentB) fragmentManager.findFragmentById(R.id.fragment2);
//        f2.changeText(data);
    }
}
