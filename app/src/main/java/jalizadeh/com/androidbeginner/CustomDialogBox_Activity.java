package jalizadeh.com.androidbeginner;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//video #22
public class CustomDialogBox_Activity extends AppCompatActivity {

    private Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog_box_);


        btn1 = (Button) findViewById(R.id.btnDB1_21);
        btn2 = (Button) findViewById(R.id.btnDB2_21);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog("DialogBox 1",
                        "Choose 1",
                        "cancelMethod1",
                        "okMethod1");
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                customDialog("DialogBox 2",
                        "Choose 2",
                        "cancelMethod2",
                        "okMethod2");
            }
        });



    }


    private void cancelMethod1(){
        toastMessage("Cancel Method1.");
    }
    private void cancelMethod2(){
        toastMessage("Cancel Method2.");
    }
    private void okMethod1(){
        toastMessage("OK Method1.");
    }
    private void okMethod2(){
        toastMessage("OK Method2.");
    }


    private void customDialog(String title, String message, final String cancelTitle, final String okTitle){
        final android.support.v7.app.AlertDialog.Builder builderSingle1 = new android.support.v7.app.AlertDialog.Builder(this);
        builderSingle1.setIcon(R.mipmap.image_failed);
        builderSingle1.setTitle(title);
        builderSingle1.setMessage(message);


        builderSingle1.setNegativeButton(
                "Cancel",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(cancelTitle.equals("cancelMethod1")){
                            cancelMethod1();
                        }else if(cancelTitle.equals("cancelMethod2")) {
                            cancelMethod2();
                        }
                    }
                }
        );

        builderSingle1.setPositiveButton(
                "Ok",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(okTitle.equals("okMethod1")){
                            okMethod1();
                        } else if(okTitle.equals("okMethod2")){
                            okMethod2();
                        }
                    }
                }
        );


        builderSingle1.show();
    }





    /**
     * This method will print the message easily
     *
     * @param msg
     */
    private void toastMessage(String msg){
        Toast.makeText(CustomDialogBox_Activity.this, msg, Toast.LENGTH_SHORT).show();
    }
}
