package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

import jalizadeh.com.androidbeginner.Classes.PersonWithPhoto;
import jalizadeh.com.androidbeginner.Classes.ArrayAdapter_PersonWithPhoto;

public class ListViewWithPhoto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_photo);


        ListView lv = (ListView) findViewById(R.id.lvListViewWithPhoto);

        ArrayList<PersonWithPhoto> persons = new ArrayList<>();
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));
        persons.add(new PersonWithPhoto("Javad", "01/01/2000","Male", "drawable://" + R.drawable.p1));
        persons.add(new PersonWithPhoto("Farzaneh", "01/01/2001","Female", "drawable://" + R.drawable.p2));
        persons.add(new PersonWithPhoto("Sr. Alex", "01/01/2002","Male", "drawable://"+R.drawable.p3));
        persons.add(new PersonWithPhoto("Mr. Hi", "01/01/2003","Male", "drawable://" + R.drawable.p4));
        persons.add(new PersonWithPhoto("Ms. Bye", "01/01/2004","Female", "drawable://" + R.drawable.p5));

        //my own adapter
        ArrayAdapter_PersonWithPhoto adapter =
                new ArrayAdapter_PersonWithPhoto(this, R.layout.my_list_photo_custom_adapter_layout, persons);
        lv.setAdapter(adapter);
    }
}
