package com.example.lenovo.lianxi2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private Button btn2;
    private TextView tv2;
    private String s;

    private EditText ed2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btn2 =(Button)findViewById(R.id.button2);
        tv2=(TextView)findViewById(R.id.textview2);

        ed2=(EditText)findViewById(R.id.edittext2);

        s=getIntent().getStringExtra("msg");
        tv2.setText(s);


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.putExtra("msg2",ed2.getText().toString());
                //intent.putExtra("back","back->"+s);
                setResult(1,intent);//发送返回码
                finish();//关闭当前界面

            }

        });
    }
}
