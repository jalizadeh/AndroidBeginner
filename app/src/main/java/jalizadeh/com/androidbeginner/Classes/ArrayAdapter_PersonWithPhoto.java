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
import android.widget.ImageView;
import android.widget.TextView;

import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;

import jalizadeh.com.androidbeginner.Classes.Person;
import jalizadeh.com.androidbeginner.Classes.PersonWithPhoto;
import jalizadeh.com.androidbeginner.R;

public class ArrayAdapter_PersonWithPhoto extends ArrayAdapter<PersonWithPhoto>{
    private static final String TAG = "PersonWithPhotoArrayAda";
    private Context mContext;
    private int mResource;

    //it will hold the index (position) of the last inserted item
    private int lastPosition = -1;

    //video #10

    /**
     * This viewHolder will keep the data and will be used for
     * smooth scrolling
     *
     * {@link https://developer.android.com/training/improving-layouts/smooth-scrolling#java}
     */
    private static class ViewHolderWithPhoto {
        TextView name;
        TextView birthday;
        TextView gender;
        ImageView imageView;
    }
    // end video #9


    //press ctrl+o and choose this constructor
    public ArrayAdapter_PersonWithPhoto(@NonNull Context context, int resource, @NonNull ArrayList<PersonWithPhoto> objects) {
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

        //setup of image loader
        setUpImageLoader();

        //get the person data
        String name = getItem(position).getName();
        String birhday = getItem(position).getBirthday();
        String gender = getItem(position).getGender();
        String imgUrl = getItem(position).getImgUrl();

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

        ViewHolderWithPhoto holder;

        /**
         * using this condition will make sure that the performance
         * and memory usage is optimized
         */
        if(convertView == null){
            LayoutInflater inflater = LayoutInflater.from(mContext);
            convertView = inflater.inflate(mResource, parent, false);

            //ViewHolder object
            holder = new ViewHolderWithPhoto();
            holder.name = (TextView) convertView.findViewById(R.id.tv1List);
            holder.birthday = (TextView) convertView.findViewById(R.id.tv2List);
            holder.gender = (TextView) convertView.findViewById(R.id.tv3List);
            holder.imageView = (ImageView) convertView.findViewById(R.id.lvImage);

            result = convertView;
            convertView.setTag(holder);
        } else {
            holder = (ViewHolderWithPhoto) convertView.getTag();
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


        //image part

        //I need a image as fallback, which will be shown if there is any problem
        //with loading my requested image
        int imageFailed = mContext.getResources().getIdentifier("@draable/image_failed", null, mContext.getPackageName());

        ImageLoader imageLoader = ImageLoader.getInstance();
        DisplayImageOptions options = new DisplayImageOptions.Builder().cacheInMemory(true)
                .cacheOnDisc(true).resetViewBeforeLoading(true)
                .showImageForEmptyUri(imageFailed)
                .showImageOnFail(imageFailed)
                .showImageOnLoading(imageFailed).build();



        imageLoader.displayImage(imgUrl, holder.imageView, options);

        holder.name.setText(name);
        holder.birthday.setText(birhday);
        holder.gender.setText(gender);



        return convertView;
    }


    /**
     * for grabbing the images
     *
     * {@link https://www.stacktips.com/tutorials/android/universal-image-loader-library-in-android}
     */
    private void setUpImageLoader(){
// UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                mContext)
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }
}
