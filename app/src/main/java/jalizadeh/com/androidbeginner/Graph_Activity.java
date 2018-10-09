package jalizadeh.com.androidbeginner;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;

//video #17
//http://www.android-graphview.org/
public class Graph_Activity extends AppCompatActivity {

    private LineGraphSeries<DataPoint> series1, series2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_);


        double x, y, z;
        x = 0;

        GraphView graph = (GraphView) findViewById(R.id.graph);
        series1 = new LineGraphSeries<>();
        series2 = new LineGraphSeries<>();

        int numDataPoints = 500;
        for (int i = 0; i< numDataPoints; i++){
            x += 0.1;
            y = Math.sin(x);
            z = Math.cos(x);
            series1.appendData(new DataPoint(x, y), true, 100);
            series2.appendData(new DataPoint(x, z), true, 100);
        }

        series1.setColor(Color.RED);
        series2.setColor(Color.BLUE);




        /*
        // set manual X bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-150);
        graph.getViewport().setMaxY(150);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(4);
        graph.getViewport().setMaxX(80);
        */

        // enable scaling and scrolling
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);

        graph.addSeries(series1);
        graph.addSeries(series2);

        series1.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Graph_Activity.this, "Series1: On Data Point clicked: "+dataPoint, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
