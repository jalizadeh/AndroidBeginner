package jalizadeh.com.androidbeginner;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

//video #19
public class SharedPref_Activity extends AppCompatActivity {
    private static final String TAG = "SharedPref_Activity";

    private SharedPreferences mPreferences;
    private SharedPreferences.Editor mEditor;

    private EditText edName;
    private EditText edPass;
    private CheckBox cbRMe;
    private Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_pref_);

        edName = (EditText) findViewById(R.id.edLoginName);
        edPass = (EditText) findViewById(R.id.edLoginPass);
        cbRMe = (CheckBox) findViewById(R.id.cbRememberMe);
        btnlogin = (Button) findViewById(R.id.btnLogin);

        mPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        //OR
        //mPreferences = getSharedPreferences("jalizadeh.com.androidbeginner", Context.MODE_PRIVATE);

        //make shared pref. editable
        //it must bed done, before any commit()
        mEditor = mPreferences.edit();

        checkSharedPreferences();

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //if checked, keep the data
                if (cbRMe.isChecked()){
                    mEditor.putString(getString(R.string.chekbox),"True");
                    mEditor.commit();

                    mEditor.putString(getString(R.string.name), edName.getText().toString());
                    mEditor.commit();

                    mEditor.putString(getString(R.string.password), edPass.getText().toString());
                    mEditor.commit();


                    //video #20
                    Intent intent = new Intent(SharedPref_Activity.this, UsingSharedPref_Activity.class);
                    startActivity(intent);


                } else {
                    mEditor.putString(getString(R.string.chekbox),"False");
                    mEditor.commit();

                    mEditor.putString(getString(R.string.name), "");
                    mEditor.commit();

                    mEditor.putString(getString(R.string.password), "");
                    mEditor.commit();

                    //video #20
                    Intent intent = new Intent(SharedPref_Activity.this, UsingSharedPref_Activity.class);
                    startActivity(intent);
                }
            }
        });

    }

    private void checkSharedPreferences() {
        String checkbox = mPreferences.getString(getString(R.string.chekbox), "False");
        String name = mPreferences.getString(getString(R.string.name), "");
        String password = mPreferences.getString(getString(R.string.password), "");

        edName.setText(name);
        edPass.setText(password);

        if(checkbox.equals("False")){
            cbRMe.setChecked(false);
        } else {
            cbRMe.setChecked(true);
        }
    }
}
