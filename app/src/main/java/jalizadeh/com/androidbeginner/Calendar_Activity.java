package jalizadeh.com.androidbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



//video #27
public class Calendar_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);


        Button btnGotopick = (Button)findViewById(R.id.btnGoToCalendar27);
        btnGotopick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Calendar_Activity.this, CalendarPicking_Activity.class);
                startActivity(intent);
            }
        });


        TextView textView = (TextView) findViewById(R.id.tvCalendarResult27);
        Intent getIntent = getIntent();
        textView.setText(getIntent.getStringExtra("date"));
    }
}
