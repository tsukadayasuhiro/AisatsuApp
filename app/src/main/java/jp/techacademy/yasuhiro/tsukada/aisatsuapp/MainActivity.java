package jp.techacademy.yasuhiro.tsukada.aisatsuapp;



import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);

        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);

    }





    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button2) {
            showAlertDialog();
        } else if (v.getId() == R.id.button3) {
            showTimePickerDialog();
        }


    }






















  /*  >=	A >= B	A は B 以上
    <=	A <= B	A は B 以下

    2:00 ~ 9:59 では「おはよう」
    10:00 ~ 17:59 では「こんにちは」
    18:00 ~ 1:59 では「こんばんは」*/


    private void showAlertDialog() {

















    }






    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Log.d("UI-PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));



                        if((hourOfDay >=2) && (hourOfDay <=9)){
                            mTextView.setText("おはよう");
                        }else if ((hourOfDay >= 10) && (hourOfDay <= 17)){
                            mTextView.setText("こんにちは");
                        }else if ((hourOfDay >= 18) || (hourOfDay <= 1)){
                            mTextView.setText("こんばんは");
                        }

                    }
                },

                13,
                0,

                true);
        timePickerDialog.show();
    }



























}
