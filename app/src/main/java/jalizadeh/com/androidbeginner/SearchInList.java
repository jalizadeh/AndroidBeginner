package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

//video #11
public class SearchInList extends AppCompatActivity {

    private static final String TAG = "SearchInList";
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_in_list);

        EditText searchFactor = (EditText) findViewById(R.id.searchFactor);
        ListView lvSearch = (ListView) findViewById(R.id.lvSearch);

        ArrayList<String> list = new ArrayList<>();
        list.add("Javad");
        list.add("Farzaneh");
        list.add("Alex");
        list.add("Fergosen");
        list.add("hi");

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, list);
        lvSearch.setAdapter(adapter);


        searchFactor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                (SearchInList.this).adapter.getFilter().filter(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

    }

}
