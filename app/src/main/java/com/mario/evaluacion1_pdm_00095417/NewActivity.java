package com.mario.evaluacion1_pdm_00095417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NewActivity extends AppCompatActivity {

    TextView text_show;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        text_show = findViewById(R.id.text_show);
        String text_aux = "No hay producto";
        Intent new_Intent = getIntent();

        if (new_Intent != null){
            text_aux = new_Intent.getStringExtra(AppConstant.TEXT_KEYS);
        }
        text_show.setText(text_aux);

    }
}
