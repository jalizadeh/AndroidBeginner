package jalizadeh.com.androidbeginner;

import android.Manifest;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

//video #28
public class PermissionCheck_Activity extends AppCompatActivity {

    private static final String[] STORAGE_PERMISSION = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
            };

    private static final String[] CALL_PHONE_PERMISSION = {Manifest.permission.CALL_PHONE};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_permission_check);

        checkPermissions();
    }



    private void checkPermissions(){
        int permissionCallPhone = ActivityCompat.checkSelfPermission(
                PermissionCheck_Activity.this, Manifest.permission.CALL_PHONE);


        int permissionStorageExternal = ActivityCompat.checkSelfPermission(
                PermissionCheck_Activity.this, Manifest.permission.WRITE_EXTERNAL_STORAGE);


        if(permissionCallPhone != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(
                    PermissionCheck_Activity.this,
                    CALL_PHONE_PERMISSION,
                    1 //OR I can define a final for here
            );
        }


        if(permissionStorageExternal != PackageManager.PERMISSION_GRANTED){
            ActivityCompat.requestPermissions(
                    PermissionCheck_Activity.this,
                    STORAGE_PERMISSION,
                    1 //OR I can define a final for here
            );
        }
    }
}
