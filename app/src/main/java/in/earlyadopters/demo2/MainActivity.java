package in.earlyadopters.demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.graphics.Color;
import android.widget.EditText;
import android.content.res.Resources;
import android.util.TypedValue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Layout
        RelativeLayout parthslayout = new RelativeLayout(this);
        parthslayout.setBackgroundColor(Color.BLUE);

        //Button
        Button redbutton = new Button(this);
        redbutton.setText("Log In");
        redbutton.setBackgroundColor(Color.GREEN);

        //Username Input
        EditText username = new EditText(this);

        redbutton.setId(1);
        username.setId(2);

        RelativeLayout.LayoutParams buttondetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        RelativeLayout.LayoutParams usernamedetails = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        usernamedetails.addRule(RelativeLayout.ABOVE, redbutton.getId());
        usernamedetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernamedetails.setMargins(0, 0, 0, 10);

        buttondetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttondetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics()
        );

        username.setWidth(px);

        //adding widget to a layout(button is now a child of layout)
        parthslayout.addView(redbutton,buttondetails);
        parthslayout.addView(username, usernamedetails);

        //set this activity to view or display
        setContentView(parthslayout);
        }

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
