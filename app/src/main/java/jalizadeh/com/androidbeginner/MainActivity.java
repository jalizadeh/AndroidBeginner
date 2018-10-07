package jalizadeh.com.androidbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //type "logt" here, then get this line
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Application Started.");

        //video #2 - TextView
        TextView tv1 = (TextView) findViewById(R.id.textView1);
        tv1.setText("This is the first text");

        String textFromtv1 = tv1.getText().toString();
        System.out.println(textFromtv1);
        Log.d(TAG, "onCreate: " + textFromtv1);



        //video #3 - Button
        Button btn1 = (Button)findViewById(R.id.btn1);
        Button btn2 = (Button)findViewById(R.id.btn2);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btn1 clicked.");
                toastMessage("Button One clicked.");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btn1 clicked.");
                toastMessage("Button Two clicked.");
            }
        });





        //video #5
        ImageView firstImage = (ImageView) findViewById(R.id.firstImage);

        int firstImageID =
                getResources().getIdentifier("@drawable/javaapp", null, this.getPackageName());
        firstImage.setImageResource(firstImageID);





        //video #6
        Button btnGoToSecondActivity = (Button) findViewById(R.id.goToSecondActivity);
        btnGoToSecondActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: btnGoToSecondActivity clicked");

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

                Log.d(TAG, "onClick: 2nd activity run");
            }
        });


        //video #7
        ListView list = (ListView) findViewById(R.id.list1);

        ArrayList<String> name = new ArrayList<>();
        name.add("Javad");
        name.add("Farzaneh");
        name.add("Mr. Alex");
        name.add("Ms. Sera");

        //use one of the default layoutss
        //ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name);

        //OR, use a custom design for list
        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.my_list_layout, name);
        list.setAdapter(adapter);


    }


    /**
     * This method will print the message easily
     *
     * @param msg
     */
    private void toastMessage(String msg){
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
