package jalizadeh.com.androidbeginner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import jalizadeh.com.androidbeginner.Classes.ArrayAdapter_Person;
import jalizadeh.com.androidbeginner.Classes.Person;

//video #8
public class ListViewActivity extends AppCompatActivity {

    private static final String TAG = "ListView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView lv = (ListView) findViewById(R.id.lvListView);

        final ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Javad", "01/01/2000","Male"));
        persons.add(new Person("Farzaneh", "01/01/2001","Female"));
        persons.add(new Person("Sr. Alex", "01/01/2002","Male"));
        persons.add(new Person("Mr. Hi", "01/01/2003","Male"));
        persons.add(new Person("Ms. Bye", "01/01/2004","Female"));
        persons.add(new Person("1", "01/01/2000","Male"));
        persons.add(new Person("2", "01/01/2001","Female"));
        persons.add(new Person("Sr. 3", "01/01/2002","Male"));
        persons.add(new Person("Mr. 4", "01/01/2003","Male"));
        persons.add(new Person("Ms. 5", "01/01/2004","Female"));
        persons.add(new Person("6", "01/01/2000","Male"));
        persons.add(new Person("7", "01/01/2001","Female"));
        persons.add(new Person("Sr. 8", "01/01/2002","Male"));
        persons.add(new Person("Mr. 9", "01/01/2003","Male"));
        persons.add(new Person("Ms. 10", "01/01/2004","Female"));
        persons.add(new Person("11", "01/01/2000","Male"));
        persons.add(new Person("12", "01/01/2001","Female"));
        persons.add(new Person("Sr. 13", "01/01/2002","Male"));
        persons.add(new Person("Mr. 14", "01/01/2003","Male"));
        persons.add(new Person("Ms. 15", "01/01/2004","Female"));
        persons.add(new Person("16", "01/01/2000","Male"));
        persons.add(new Person("17", "01/01/2001","Female"));
        persons.add(new Person("Sr. 18", "01/01/2002","Male"));
        persons.add(new Person("Mr. 19", "01/01/2003","Male"));
        persons.add(new Person("Ms. 20", "01/01/2004","Female"));
        persons.add(new Person("Javad", "01/01/2000","Male"));
        persons.add(new Person("Farzaneh", "01/01/2001","Female"));
        persons.add(new Person("Sr. Alex", "01/01/2002","Male"));
        persons.add(new Person("Mr. Hi", "01/01/2003","Male"));
        persons.add(new Person("Ms. Bye", "01/01/2004","Female"));
        persons.add(new Person("1", "01/01/2000","Male"));
        persons.add(new Person("2", "01/01/2001","Female"));
        persons.add(new Person("Sr. 3", "01/01/2002","Male"));
        persons.add(new Person("Mr. 4", "01/01/2003","Male"));
        persons.add(new Person("Ms. 5", "01/01/2004","Female"));
        persons.add(new Person("6", "01/01/2000","Male"));
        persons.add(new Person("7", "01/01/2001","Female"));
        persons.add(new Person("Sr. 8", "01/01/2002","Male"));
        persons.add(new Person("Mr. 9", "01/01/2003","Male"));
        persons.add(new Person("Ms. 10", "01/01/2004","Female"));
        persons.add(new Person("11", "01/01/2000","Male"));
        persons.add(new Person("12", "01/01/2001","Female"));
        persons.add(new Person("Sr. 13", "01/01/2002","Male"));
        persons.add(new Person("Mr. 14", "01/01/2003","Male"));
        persons.add(new Person("Ms. 15", "01/01/2004","Female"));
        persons.add(new Person("16", "01/01/2000","Male"));
        persons.add(new Person("17", "01/01/2001","Female"));
        persons.add(new Person("Sr. 18", "01/01/2002","Male"));
        persons.add(new Person("Mr. 19", "01/01/2003","Male"));
        persons.add(new Person("Ms. 20", "01/01/2004","Female"));
        persons.add(new Person("Javad", "01/01/2000","Male"));
        persons.add(new Person("Farzaneh", "01/01/2001","Female"));
        persons.add(new Person("Sr. Alex", "01/01/2002","Male"));
        persons.add(new Person("Mr. Hi", "01/01/2003","Male"));
        persons.add(new Person("Ms. Bye", "01/01/2004","Female"));
        persons.add(new Person("1", "01/01/2000","Male"));
        persons.add(new Person("2", "01/01/2001","Female"));
        persons.add(new Person("Sr. 3", "01/01/2002","Male"));
        persons.add(new Person("Mr. 4", "01/01/2003","Male"));
        persons.add(new Person("Ms. 5", "01/01/2004","Female"));
        persons.add(new Person("6", "01/01/2000","Male"));
        persons.add(new Person("7", "01/01/2001","Female"));
        persons.add(new Person("Sr. 8", "01/01/2002","Male"));
        persons.add(new Person("Mr. 9", "01/01/2003","Male"));
        persons.add(new Person("Ms. 10", "01/01/2004","Female"));
        persons.add(new Person("11", "01/01/2000","Male"));
        persons.add(new Person("12", "01/01/2001","Female"));
        persons.add(new Person("Sr. 13", "01/01/2002","Male"));
        persons.add(new Person("Mr. 14", "01/01/2003","Male"));
        persons.add(new Person("Ms. 15", "01/01/2004","Female"));
        persons.add(new Person("16", "01/01/2000","Male"));
        persons.add(new Person("17", "01/01/2001","Female"));
        persons.add(new Person("Sr. 18", "01/01/2002","Male"));
        persons.add(new Person("Mr. 19", "01/01/2003","Male"));
        persons.add(new Person("Ms. 20", "01/01/2004","Female"));
        persons.add(new Person("Javad", "01/01/2000","Male"));
        persons.add(new Person("Farzaneh", "01/01/2001","Female"));
        persons.add(new Person("Sr. Alex", "01/01/2002","Male"));
        persons.add(new Person("Mr. Hi", "01/01/2003","Male"));
        persons.add(new Person("Ms. Bye", "01/01/2004","Female"));
        persons.add(new Person("1", "01/01/2000","Male"));
        persons.add(new Person("2", "01/01/2001","Female"));
        persons.add(new Person("Sr. 3", "01/01/2002","Male"));
        persons.add(new Person("Mr. 4", "01/01/2003","Male"));
        persons.add(new Person("Ms. 5", "01/01/2004","Female"));
        persons.add(new Person("6", "01/01/2000","Male"));
        persons.add(new Person("7", "01/01/2001","Female"));
        persons.add(new Person("Sr. 8", "01/01/2002","Male"));
        persons.add(new Person("Mr. 9", "01/01/2003","Male"));
        persons.add(new Person("Ms. 10", "01/01/2004","Female"));
        persons.add(new Person("11", "01/01/2000","Male"));
        persons.add(new Person("12", "01/01/2001","Female"));
        persons.add(new Person("Sr. 13", "01/01/2002","Male"));
        persons.add(new Person("Mr. 14", "01/01/2003","Male"));
        persons.add(new Person("Ms. 15", "01/01/2004","Female"));
        persons.add(new Person("16", "01/01/2000","Male"));
        persons.add(new Person("17", "01/01/2001","Female"));
        persons.add(new Person("Sr. 18", "01/01/2002","Male"));
        persons.add(new Person("Mr. 19", "01/01/2003","Male"));
        persons.add(new Person("Ms. 20", "01/01/2004","Female"));

        //my own adapter
        ArrayAdapter_Person adapter =
                new ArrayAdapter_Person(this, R.layout.my_list_custom_adapter_layout, persons);
        lv.setAdapter(adapter);



        //video #18
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(ListViewActivity.this,
                        "Clicked on:\n" + persons.get(i).getName()
                        ,Toast.LENGTH_SHORT ).show();

                Intent intent = new Intent(ListViewActivity.this, GetDataByIntent.class);
                intent.putExtra("name", persons.get(i).getName());
                startActivity(intent);
            }
        });
    }
}
