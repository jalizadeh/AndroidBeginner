package jalizadeh.com.androidbeginner;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

//video #8
public class PersonArrayAdapter extends ArrayAdapter<Person>{
    private static final String TAG = "PersonArrayAdapter";
    private Context mContext;
    private int mResource;
    //press ctrl+o and choose this constructor
    public PersonArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;
    }

    /**
     * press ctrl+o , then write "getView", then choose it
     *
     * @param position
     * @param convertView
     * @param parent
     * @return
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //I dont need it
        //return super.getView(position, convertView, parent);

        //get the person data
        String name = getItem(position).getName();
        String birhday = getItem(position).getBirthday();
        String gender = getItem(position).getGender();

        //create a person object
        //I dont know why Mitchel did it :|
        Person person = new Person(name, birhday, gender);

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.tv1List);
        TextView tvBirthday = (TextView) convertView.findViewById(R.id.tv2List);
        TextView tvGender = (TextView) convertView.findViewById(R.id.tv3List);

        tvName.setText(name);
        tvBirthday.setText(birhday);
        tvGender.setText(gender);

        return convertView;
    }
}
