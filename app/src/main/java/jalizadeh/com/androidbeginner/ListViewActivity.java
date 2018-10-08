package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;
import android.widget.ListView;

//video #8
public class ListViewActivity extends AppCompatActivity {

    private static final String TAG = "ListView";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        ListView lv = (ListView) findViewById(R.id.lvListView);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Person("Javad", "01/01/2000","Male"));
        persons.add(new Person("Farzaneh", "01/01/2001","Female"));
        persons.add(new Person("Sr. Alex", "01/01/2002","Male"));
        persons.add(new Person("Mr. Hi", "01/01/2003","Male"));
        persons.add(new Person("Ms. Bye", "01/01/2004","Female"));

        //my own adapter
        PersonArrayAdapter adapter =
                new PersonArrayAdapter(this, R.layout.my_list_custom_adapter_layout, persons);
        lv.setAdapter(adapter);
    }
}
