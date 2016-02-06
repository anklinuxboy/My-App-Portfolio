package app.com.example.android.myappportfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

       /* View rootview = inflater.inflate(R.layout.fragment_main, container, false);

        Button btn = (Button) rootview.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Context context = getActivity().getApplicationContext();
                CharSequence text = "Hello toast!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });*/

        return inflater.inflate(R.layout.fragment_main, container, false);
    }
}
