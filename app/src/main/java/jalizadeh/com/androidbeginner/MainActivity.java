package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //type "logt" here, then get this line
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setText("This is the first text");

        String textFromtv1 = tv1.getText().toString();
        System.out.println(textFromtv1);
        Log.d(TAG, "onCreate: " + textFromtv1);
    }
}
