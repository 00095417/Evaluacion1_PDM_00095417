package com.mario.evaluacion1_pdm_00095417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    TextView m_shared_text,
            s_text_p1, s_text_p2, s_text_p3,
            s_text_p4, s_text_p5, s_text_p6,
            s_text_p7, s_text_p8, s_text_p9;
    private String text_shared,
            s_text_p1_aux = "", s_text_p2_aux = "", s_text_p3_aux = "",
            s_text_p4_aux = "", s_text_p5_aux = "", s_text_p6_aux = "",
            s_text_p7_aux = "", s_text_p8_aux = "", s_text_p9_aux = "";;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        m_shared_text = findViewById(R.id.text_show_share);
        s_text_p1 = findViewById(R.id.s_text_p1);
        s_text_p2 = findViewById(R.id.s_text_p2);
        s_text_p3 = findViewById(R.id.s_text_p3);
        s_text_p4 = findViewById(R.id.s_text_p4);
        s_text_p5 = findViewById(R.id.s_text_p5);
        s_text_p6 = findViewById(R.id.s_text_p6);
        s_text_p7 = findViewById(R.id.s_text_p7);
        s_text_p8 = findViewById(R.id.s_text_p8);
        s_text_p9 = findViewById(R.id.s_text_p9);
        text_shared = "no hay texto compartido";

        Intent new_intent_share = getIntent();

        if (new_intent_share != null){
            text_shared = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS);
            s_text_p1_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P1);
            s_text_p2_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P2);
            s_text_p3_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P3);
            s_text_p4_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P4);
            s_text_p5_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P5);
            s_text_p6_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P6);
            s_text_p7_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P7);
            s_text_p8_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P8);
            s_text_p9_aux = new_intent_share.getStringExtra(AppConstant.TEXT_KEYS_P9);
        }

        m_shared_text.setText(text_shared);
        s_text_p1.setText(s_text_p1_aux);
        s_text_p2.setText(s_text_p2_aux);
        s_text_p3.setText(s_text_p3_aux);
        s_text_p4.setText(s_text_p4_aux);
        s_text_p5.setText(s_text_p5_aux);
        s_text_p6.setText(s_text_p6_aux);
        s_text_p7.setText(s_text_p7_aux);
        s_text_p8.setText(s_text_p8_aux);
        s_text_p9.setText(s_text_p9_aux);
    }
}
