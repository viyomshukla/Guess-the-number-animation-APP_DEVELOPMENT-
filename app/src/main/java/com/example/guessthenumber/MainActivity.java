package com.example.guessthenumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
boolean ismotu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn);
        ImageView img=findViewById(R.id.motu);
        ImageView img2=findViewById(R.id.patlu);
        ismotu=true;


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number=8;
                EditText edt=findViewById(R.id.editTextText);
                String val=edt.getText().toString();
                int value=Integer.parseInt(val);
                if(number==value){
                    Toast.makeText(MainActivity.this, "You get it right", Toast.LENGTH_SHORT).show();
                } else if (number>value) {
                    Toast.makeText(MainActivity.this, "greater", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "lesser", Toast.LENGTH_SHORT).show();
                }



            }
        });
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ismotu){
                    img.animate().alpha(0).setDuration(1000);
                    img2.animate().alpha(1).setDuration(1000);
                    ismotu=false;
                }

                else {
                    img.animate().alpha(1).setDuration(2000);
                    img2.animate().alpha(0).setDuration(2000);
                    ismotu=true;

                }

            }
        });

    }
}