package net.danlew.pseudolocalization;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView paramTextView = (TextView) findViewById(R.id.param_text_view);
        paramTextView.setText(getString(R.string.param_string, "Dan"));
    }
}
