package jalizadeh.com.androidbeginner;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextClock;
import android.widget.TextView;

import org.w3c.dom.Text;


//video #20
public class UsingSharedPref_Activity extends AppCompatActivity {

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_using_shared_pref_);

        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        mEditor = mPreferences.edit();

        TextView data = (TextView) findViewById(R.id.tvUsingSP20);

        data.setText(mPreferences.getString(getString(R.string.name), "NOTHING SAVED"));
    }
}
