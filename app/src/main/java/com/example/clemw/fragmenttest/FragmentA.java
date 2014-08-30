package com.example.clemw.fragmenttest;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by clemw on 8/29/14.
 */
public class FragmentA extends Fragment implements View.OnClickListener {

    Button button;
    int counter = 0;
    // An interface variable can reference a subclass object
    Communicator communicator;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // communicator is pointing to the Main Activity
        communicator = (Communicator) getActivity();
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        counter++;
        // The respond method is in the Main Activity
        communicator.respond("The button was clicked " + counter + " times");
    }
}
