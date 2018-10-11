package jalizadeh.com.androidbeginner.Classes;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import jalizadeh.com.androidbeginner.Classes.Person;
import jalizadeh.com.androidbeginner.R;

//video #8
public class ArrayAdapter_Person extends ArrayAdapter<Person>{
    private static final String TAG = "ArrayAdapter_Person";
    private Context mContext;
    private int mResource;

    //it will hold the index (position) of the last inserted item
    private int lastPosition = -1;

    //video #9

    /**
     * This viewHolder will keep the data and will be used for
     * smooth scrolling
     *
     * {@link https://developer.android.com/training/improving-layouts/smooth-scrolling#java}
     */
    private static class ViewHolder {
        TextView name;
        TextView birthday;
        TextView gender;
    }
    // end video #9


    //press ctrl+o and choose this constructor
    public ArrayAdapter_Person(@NonNull Context context, int resource, @NonNull ArrayList<Person> objects) {
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


        /*used in video #8

        LayoutInflater inflater = LayoutInflater.from(mContext);
        convertView = inflater.inflate(mResource, parent, false);

        TextView tvName = (TextView) convertView.findViewById(R.id.tv1List);
        TextView tvBirthday = (TextView) convertView.findViewById(R.id.tv2List);
        TextView tvGender = (TextView) convertView.findViewById(R.id.tv3List);

        tvName.setText(name);
        tvBirthday.setText(birhday);
        tvGender.setText(gender);
        */

        //video #9
        //create the view result, for showing animation
        final View result;

        ViewHolder holder;

        /**
         * using this condition will make sure that the performance
         * and memory usage is optimized
         */
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);

            //ViewHolder object
            holder = new ViewHolder();
            holder.name = (TextView) convertView.findViewById(R.id.tv1List);
            holder.birthday = (TextView) convertView.findViewById(R.id.tv2List);
            holder.gender = (TextView) convertView.findViewById(R.id.tv3List);

            result = convertView;
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
            result = convertView;
        }


        /**
         * if I scroll down, I want to see the next item (index++), so
         * I have to use animation of "load_down", otherwise I`m going up
         */
        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition) ? R.anim.load_down_anim : R.anim.load_up_anim);

        result.startAnimation(animation);
        lastPosition = position;

        holder.name.setText(name);
        holder.birthday.setText(birhday);
        holder.gender.setText(gender);

        return convertView;
    }
}
