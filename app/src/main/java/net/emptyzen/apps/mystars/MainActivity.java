package net.emptyzen.apps.mystars;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the 1st check box */
    public void oneStar( View view) {
        // Do something in response to button
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("nice 1 star!");
        LinearLayout layout = (LinearLayout) findViewById(R.id.content);
        layout.addView(textView);
    }

    public void twoStar( View view) {
        // Do something in response to button
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText("nice 2 stars!");
        LinearLayout layout = (LinearLayout) findViewById(R.id.content);
        layout.addView(textView);
    }
}
