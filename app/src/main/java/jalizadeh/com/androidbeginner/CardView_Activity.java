package jalizadeh.com.androidbeginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CardView_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);


        ImageView imgView = (ImageView) findViewById(R.id.cvImageView);
        TextView text = (TextView) findViewById(R.id.cvText);

        int imgSrc = getResources().getIdentifier("@drawable/cover", null, this.getPackageName());
        imgView.setImageResource(imgSrc);

        text.setText("Cover photo here");
    }
}
