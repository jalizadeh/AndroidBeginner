package jalizadeh.com.androidbeginner;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.baoyz.swipemenulistview.SwipeMenu;
import com.baoyz.swipemenulistview.SwipeMenuCreator;
import com.baoyz.swipemenulistview.SwipeMenuItem;
import com.baoyz.swipemenulistview.SwipeMenuListView;

import java.util.ArrayList;

//video #29
// https://github.com/baoyongzhang/SwipeMenuListView
public class SwipeList_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swipe_list);


        SwipeMenuListView listView = (SwipeMenuListView) findViewById(R.id.smlvSwipeList29);

        ArrayList<String> list = new ArrayList<>();
        list.add("Javad");
        list.add("Javad");
        list.add("Javad");
        list.add("Javad");
        list.add("Javad");
        list.add("Javad");
        list.add("Javad");
        list.add("Javad");
        list.add("Javad");

        ArrayAdapter adapter = new ArrayAdapter(SwipeList_Activity.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);



        SwipeMenuCreator creator = new SwipeMenuCreator() {

            @Override
            public void create(SwipeMenu menu) {
                // create "open" item
                SwipeMenuItem openItem = new SwipeMenuItem(getApplicationContext());
                // set item background
                openItem.setBackground(new ColorDrawable(Color.rgb(0x00, 0x66,0xFF)));
                // set item width
                openItem.setWidth(50);
                // set item title
                openItem.setTitle("Open");
                // set item title fontsize
                openItem.setTitleSize(14);
                // set item title font color
                openItem.setTitleColor(Color.WHITE);
                // add to menu
                menu.addMenuItem(openItem);


                // create "delete" item
                SwipeMenuItem deleteItem = new SwipeMenuItem(getApplicationContext());
                // set item background
                deleteItem.setBackground(new ColorDrawable(Color.rgb(0xF9, 0x3F, 0x25)));
                // set item width
                deleteItem.setWidth(50);
                // set a icon
                deleteItem.setIcon(R.mipmap.ic_delete);
                // add to menu
                menu.addMenuItem(deleteItem);
            }
        };

        // set creator
        listView.setMenuCreator(creator);



        listView.setOnMenuItemClickListener(new SwipeMenuListView.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(int position, SwipeMenu menu, int index) {
                switch (index) {
                    case 0:
                        toastMessage("Item 1 clicked");
                        break;
                    case 1:
                        toastMessage("Item delete clicked");
                        break;
                }
                // false : close the menu; true : not close the menu
                return false;
            }
        });


    }



    /**
     * This method will print the message easily
     *
     * @param msg
     */
    public void toastMessage(String msg){
        Toast.makeText(SwipeList_Activity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
