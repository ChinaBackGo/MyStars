package net.emptyzen.apps.mystars;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class StarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);
    }

    /** Called when the user clicks the 1st check box */
    public void oneStar(View view) {
        // Do something in response to checkbox
    }

    public void twoStar( View view) {
        // Do something in response to checkbox
    }

    /** Called when the user clicks the Back button */
    public void backToMainActivity( View view) {
        // Do something in response to button
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
