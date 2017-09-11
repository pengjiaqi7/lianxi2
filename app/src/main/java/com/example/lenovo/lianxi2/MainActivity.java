package com.example.lenovo.lianxi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;
import static com.example.lenovo.lianxi2.R.id.textview1;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText et1;
    private TextView tv1;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.button1);
        tv1 = (TextView) findViewById(R.id.textview1);
        et1 = (EditText) findViewById(R.id.edittext1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ;
                Intent intent = new Intent();
                intent.putExtra("msg", et1.getText().toString());
                intent.setClass(MainActivity.this, Main2Activity.class);
                startActivityForResult(intent, 0);
            }

        });

    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        tv1.setText(data.getExtras().get("msg2").toString());
        //tv1.setText(data.getExtras().get("back").toString());//获得返回信息，并刷新UI

    }
}