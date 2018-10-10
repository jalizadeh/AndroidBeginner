package jalizadeh.com.androidbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


//video #21
public class GetDataByIntent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data_by_intent);

        TextView text = (TextView) findViewById(R.id.tIncomingText21);

        Intent incomingIntent = getIntent();
        text.setText(incomingIntent.getStringExtra("name"));
    }
}
