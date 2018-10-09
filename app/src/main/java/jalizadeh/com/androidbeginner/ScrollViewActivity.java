package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


//video #12
public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll_view);

        TextView title = (TextView)findViewById(R.id.svText1);
        TextView message = (TextView)findViewById(R.id.svText2);

        title.setText("This is the title:");

        //preparing msg 
        StringBuilder sb = new StringBuilder();
        String msg = "This is a sample message.";

        for (int i=0; i<1000; i++){
            sb.append(msg);
        }

        message.setText(sb.toString());
    }
}
