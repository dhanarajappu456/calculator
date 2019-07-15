package com.dhanaraj.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Float.valueOf;

public class MainActivity extends AppCompatActivity {
    TextView result;
    EditText t1,t2;
    Button a,s,d,m;
    float z,y,x;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result =(TextView)findViewById(R.id.result);
        t1=(EditText)findViewById(R.id.text1);
        t2=(EditText)findViewById(R.id.text2);
        a=(Button)findViewById(R.id.addition);
        s=(Button)findViewById(R.id.subtract);
        d=(Button)findViewById(R.id.divide);
        m=(Button)findViewById(R.id.mul);

        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=valueOf(t1.getText().toString());
                y=valueOf(t2.getText().toString());
                if (x==0.0 || y==0.0 ){
                    result.setText("enter valid no:s");
                }
                z=x+y;
                result.setText(String.valueOf(z));


            }
        });
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=valueOf(t1.getText().toString());
                y=valueOf(t2.getText().toString());
                if (x==0.0 || y==0.0 ){
                    result.setText("enter valid no:s");
                }
                z=x-y;
                result.setText(String.valueOf(z));


            }
        });
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=valueOf(t1.getText().toString());
                y=valueOf(t2.getText().toString());
                if (x==0.0 || y==0.0 ){
                    result.setText("enter valid no:s");
                }
                z=x*y;
                result.setText(String.valueOf(z));


            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x=valueOf(t1.getText().toString());
                y=valueOf(t2.getText().toString());
                if (x==0.0 || y==0.0 ){
                    result.setText("enter valid no:s");
                }
                z=x/y;
                result.setText(String.valueOf(z));


            }
        });



    }

}
