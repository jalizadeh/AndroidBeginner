package jalizadeh.com.androidbeginner;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    private static final String TAG = "SecondActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //video #6
        Button btnGoToFirstActivity = (Button) findViewById(R.id.goToFirstActivity);

        btnGoToFirstActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnGoToFirstActivity clicked");

                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

                Log.d(TAG, "onClick: going to 1st activity");
            }
        });
    }

}
