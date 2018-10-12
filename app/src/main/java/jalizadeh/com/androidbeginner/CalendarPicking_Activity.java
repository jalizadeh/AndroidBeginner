package jalizadeh.com.androidbeginner;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CalendarView;


//video #27
public class CalendarPicking_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * check this thread for an important thing
         *
         * https://stackoverflow.com/questions/34438682/calendarview-not-showing-days-of-the-month
         */
        setContentView(R.layout.activity_calendar_picking);


        CalendarView calendarView = (CalendarView)findViewById(R.id.calendarView27);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int day) {
                //January == 0 , so add 1 to make it real
                month++;

                //I need to pass to previous activity
                Intent intent = new Intent(CalendarPicking_Activity.this, Calendar_Activity.class);
                intent.putExtra("date", year+"/"+month+"/"+day);
                startActivity(intent);
            }
        });
    }
}
