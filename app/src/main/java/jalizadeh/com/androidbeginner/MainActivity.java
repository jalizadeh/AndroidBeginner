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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {

    //type "logt" here, then get this line
    private static final String TAG = "MainActivity";

    //video #15
    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }


    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");;
    }


    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
    //end video #15


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: Application created.");

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
                //toastMessage("Button Two clicked.");

                Toasty.error(MainActivity.this, "TOASTY\nThis is an error toast.", Toast.LENGTH_SHORT, true).show();
                Toasty.success(MainActivity.this, "Success!", Toast.LENGTH_SHORT, true).show();
                Toasty.info(MainActivity.this, "Here is some info for you.", Toast.LENGTH_SHORT, true).show();
                Toasty.warning(MainActivity.this, "Beware of the dog.", Toast.LENGTH_SHORT, true).show();
                Toasty.normal(MainActivity.this, "Normal toast w/o icon").show();
                Toasty.normal(MainActivity.this, "Normal toast w/ icon", R.drawable.ic_check_white_48dp).show();
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




        //video #8
        //a button to switch to it`s activity
        Button btnGoToVideo8 = (Button) findViewById(R.id.goToVideo8);
        btnGoToVideo8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
                startActivity(intent);
            }
        });




        //video #10
        //a button to switch to it`s activity
        Button btnGoToVideo10 = (Button) findViewById(R.id.goToVideo10);
        btnGoToVideo10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListViewWithPhoto.class);
                startActivity(intent);
            }
        });



        //video #11
        //a button to switch to it`s activity
        Button btnGoToVideo11 = (Button) findViewById(R.id.goToVideo11);
        btnGoToVideo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SearchInList.class);
                startActivity(intent);
            }
        });



        //video #13
        //a button to switch to it`s activity
        Button btnGoToVideo12 = (Button) findViewById(R.id.goToVideo12);
        btnGoToVideo12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ScrollViewActivity.class);
                startActivity(intent);
            }
        });


        //video #12
        //a button to switch to it`s activity
        Button btnGoToVideo13 = (Button) findViewById(R.id.goToVideo13);
        btnGoToVideo13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ConstraintLayout_Activity.class);
                startActivity(intent);
            }
        });



        //video #14
        //a button to switch to it`s activity
        Button btnGoToVideo14 = (Button) findViewById(R.id.goToVideo14);
        btnGoToVideo14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, RelativeLayout_Activity.class);
                startActivity(intent);
            }
        });




        //video #16
        //a button to switch to it`s activity
        Button btnGoToVideo16 = (Button) findViewById(R.id.goToVideo16);
        btnGoToVideo16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, YoutubePlayer_Activity.class);
                startActivity(intent);
            }
        });



        //video #17
        //a button to switch to it`s activity
        Button btnGoToVideo17 = (Button) findViewById(R.id.goToVideo17);
        btnGoToVideo17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Graph_Activity.class);
                startActivity(intent);
            }
        });



        //video #19
        //a button to switch to it`s activity
        Button btnGoToVideo19 = (Button) findViewById(R.id.goToVideo19);
        btnGoToVideo19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SharedPref_Activity.class);
                startActivity(intent);
            }
        });



        //video #22
        //a button to switch to it`s activity
        Button btnGoToVideo22 = (Button) findViewById(R.id.goToVideo22);
        btnGoToVideo22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CustomDialogBox_Activity.class);
                startActivity(intent);
            }
        });



        //video #23
        //a button to switch to it`s activity
        Button btnGoToVideo23 = (Button) findViewById(R.id.goToVideo23);
        btnGoToVideo23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, WebView_Activity.class);
                startActivity(intent);
            }
        });


        //video #24
        //a button to switch to it`s activity
        Button btnGoToVideo24 = (Button) findViewById(R.id.goToVideo24);
        btnGoToVideo24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CardView_Activity.class);
                startActivity(intent);
            }
        });


        //video #25
        //a button to switch to it`s activity
        Button btnGoToVideo25 = (Button) findViewById(R.id.goToVideo25);
        btnGoToVideo25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListOfCardView_Activity.class);
                startActivity(intent);
            }
        });


        //video #26
        //a button to switch to it`s activity
        Button btnGoToVideo26 = (Button) findViewById(R.id.goToVideo26);
        btnGoToVideo26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DatePickerDialog_Activity.class);
                startActivity(intent);
            }
        });



        //video #27
        //a button to switch to it`s activity
        Button btnGoToVideo27 = (Button) findViewById(R.id.goToVideo27);
        btnGoToVideo27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Calendar_Activity.class);
                startActivity(intent);
            }
        });



        //video #28
        //a button to switch to it`s activity
        Button btnGoToVideo28 = (Button) findViewById(R.id.goToVideo28);
        btnGoToVideo28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PermissionCheck_Activity.class);
                startActivity(intent);
            }
        });



        //video #29
        //a button to switch to it`s activity
        Button btnGoToVideo29 = (Button) findViewById(R.id.goToVideo29);
        btnGoToVideo29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SwipeList_Activity.class);
                startActivity(intent);
            }
        });
    }


    /**
     * This method will print the message easily
     *
     * @param msg
     */
    public void toastMessage(String msg){
        Toast.makeText(MainActivity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
