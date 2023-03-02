package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1,e2;
Button add,sub,mul,div;
TextView ans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=findViewById(R.id.e1);
        e2=findViewById(R.id.e2);
        add=findViewById(R.id.b1);
        sub=findViewById(R.id.b2);
        mul=findViewById(R.id.b3);
        div=findViewById(R.id.b4);
ans=findViewById(R.id.ans);
add.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        float a,b,c;
                    a=Integer.parseInt(e1.getText().toString());
                    b=Integer.parseInt(e2.getText().toString());
                    c=a+b;
                      ans.setText( "Answer is " +c);
    }
});
sub.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        float a,b,c;
                    a=Integer.parseInt(e1.getText().toString());
                    b=Integer.parseInt(e2.getText().toString());
                    c=a-b;
                      ans.setText( "Answer is " +c);
    }
});
      mul.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        float a,b,c;
                    a=Integer.parseInt(e1.getText().toString());
                    b=Integer.parseInt(e2.getText().toString());
                    c=a*b;
                      ans.setText( "Answer is " +c);
    }
});
div.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        float a,b,c;
                    a=Integer.parseInt(e1.getText().toString());
                    b=Integer.parseInt(e2.getText().toString());
                    c=a/b;
                      ans.setText( "Answer is " +c);
    }
});
    }
}