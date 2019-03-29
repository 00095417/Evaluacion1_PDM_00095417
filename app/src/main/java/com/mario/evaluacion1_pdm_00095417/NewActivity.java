package com.mario.evaluacion1_pdm_00095417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView text_show, text_p1, text_p2, text_p3, text_p4, text_p5, text_p6, text_p7, text_p8, text_p9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        text_show = findViewById(R.id.text_show);
        text_p1 = findViewById(R.id.text_p1);
        text_p2 = findViewById(R.id.text_p2);
        text_p3 = findViewById(R.id.text_p3);
        text_p4 = findViewById(R.id.text_p4);
        text_p5 = findViewById(R.id.text_p5);
        text_p6 = findViewById(R.id.text_p6);
        text_p7 = findViewById(R.id.text_p7);
        text_p8 = findViewById(R.id.text_p8);
        text_p9 = findViewById(R.id.text_p9);


        String text_aux = "No hay producto";
        String text_p1_aux = "", text_p2_aux = "", text_p3_aux = "", text_p4_aux = "", text_p5_aux = "", text_p6_aux = "", text_p7_aux = "", text_p8_aux = "", text_p9_aux = "";
        Intent new_Intent = getIntent();

        if (new_Intent != null){
            text_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS);
            text_p1_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P1);
            text_p2_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P2);
            text_p3_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P3);
            text_p4_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P4);
            text_p5_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P5);
            text_p6_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P6);
            text_p7_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P7);
            text_p8_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P8);
            text_p9_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS_P9);
        }
        text_show.setText(text_aux);
        text_p1.setText(text_p1_aux);
        text_p2.setText(text_p2_aux);
        text_p3.setText(text_p3_aux);
        text_p4.setText(text_p4_aux);
        text_p5.setText(text_p5_aux);
        text_p6.setText(text_p6_aux);
        text_p7.setText(text_p7_aux);
        text_p8.setText(text_p8_aux);
        text_p9.setText(text_p9_aux);


    }
}
