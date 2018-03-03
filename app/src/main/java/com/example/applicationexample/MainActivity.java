package com.example.applicationexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //se kreira ovoj metod so sto podocna ke se dodeli na SUM kopceto
    public void onButtonClick(View v){
        //za Number1 da se vnese prviot broj
        EditText e1 = (EditText) findViewById(R.id.editText);
        //za Number2 da se vnese vtoriot broj
        EditText e2 = (EditText) findViewById(R.id.editText2);
        //Za Text View kaj sto ke bide prikazan rezulatatot
        TextView t1 = (TextView)findViewById(R.id.textView);
        //se zema brojkata od Number1 i se praj vo tekst
        int num1 = Integer.parseInt(e1.getText().toString());
        //se zema brojkata od Number2 i se praj vo tekst
        int num2 = Integer.parseInt(e2.getText().toString());
        //sobiranje na dvete brojki
        int sum = num1 + num2;
        //se prikazuva soberenoto - od integer vo string mora da se prefrli
        t1.setText(Integer.toString(sum));
    }
}
