package com.example.myfirstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Compras extends AppCompatActivity {
    double compra, total, des;
    Button d1, d2;
    TextView c1, res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compras);
        c1 = findViewById(R.id.caja);
        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        res = findViewById(R.id.textView8);

        d1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                compra = Double.parseDouble(c1.getText().toString());
                if(compra >100){
                    des = compra *0.15;
                }else{
                    des = 0;
                }
                total = compra - des;
                res.setText(String.valueOf(total));
            }
        });
        d2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                compra = Double.parseDouble(c1.getText().toString());
                if(compra >100){
                    des = compra *0.3;
                }else{
                    des = 0;
                }
                total = compra - des;
                res.setText(String.valueOf(total));
            }
        });
    }
}