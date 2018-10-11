package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import jalizadeh.com.androidbeginner.Classes.ArrayAdapter_Card;
import jalizadeh.com.androidbeginner.Classes.Card;

//#video 25
public class ListOfCardView_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_card_view);

        ListView lv = (ListView) findViewById(R.id.list25);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card("Picture 1", "drawable://" + R.drawable.pic1));
        cards.add(new Card("Picture 2", "drawable://" + R.drawable.pic2));
        cards.add(new Card("Picture 3", "drawable://" + R.drawable.pic3));
        cards.add(new Card("Picture 4", "drawable://" + R.drawable.pic4));
        cards.add(new Card("Picture 1", "drawable://" + R.drawable.pic1));
        cards.add(new Card("Picture 2", "drawable://" + R.drawable.pic2));
        cards.add(new Card("Picture 3", "drawable://" + R.drawable.pic3));
        cards.add(new Card("Picture 4", "drawable://" + R.drawable.pic4));

        ArrayAdapter_Card adapter = new ArrayAdapter_Card(this, R.layout.activity_card_view, cards);
        lv.setAdapter(adapter);

    }
}
