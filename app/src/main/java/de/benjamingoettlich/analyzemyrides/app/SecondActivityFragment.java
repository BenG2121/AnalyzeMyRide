package de.benjamingoettlich.analyzemyrides.app;

/**
 * Created by benja_000 on 12.02.2017.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class SecondActivityFragment extends Fragment {
    public SecondActivityFragment(){

    }
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        return inflater.inflate(R.layout.fragment_second, container, false);
    }
}
