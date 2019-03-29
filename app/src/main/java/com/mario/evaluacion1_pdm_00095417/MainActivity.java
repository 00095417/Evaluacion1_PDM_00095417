package com.mario.evaluacion1_pdm_00095417;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_enviar;
    int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, cont9 = 0, total = 0;
    EditText name, correo;
    String text_aux;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.produc1);
        btn2 = findViewById(R.id.produc2);
        btn3 = findViewById(R.id.produc3);
        btn4 = findViewById(R.id.produc4);
        btn5 = findViewById(R.id.produc5);
        btn6 = findViewById(R.id.produc6);
        btn7 = findViewById(R.id.produc7);
        btn8 = findViewById(R.id.produc8);
        btn9 = findViewById(R.id.produc9);
        btn_enviar = findViewById(R.id.btn_info);

        name = findViewById(R.id.edit_usuario);
        correo = findViewById(R.id.edit_correo);

        btn1.setOnClickListener(v->{
            cont1 += 1;
            btn1.setText("Produto1 \n " + cont1);
        });

        btn2.setOnClickListener(v->{
            cont2 += 1;
            btn2.setText("Produto2 \n " + cont2);
        });

        btn3.setOnClickListener(v->{
            cont3 += 1;
            btn3.setText("Produto3 \n " + cont3);
        });

        btn4.setOnClickListener(v->{
            cont4 += 1;
            btn4.setText("Produto4 \n " + cont4);
        });

        btn5.setOnClickListener(v->{
            cont5 += 1;
            btn5.setText("Produto5 \n " + cont5);
        });

        btn6.setOnClickListener(v->{
            cont6 += 1;
            btn6.setText("Produto6 \n " + cont6);
        });

        btn7.setOnClickListener(v->{
            cont7 += 1;
            btn7.setText("Produto7 \n " + cont7);
        });

        btn8.setOnClickListener(v->{
            cont8 += 1;
            btn8.setText("Produto8 \n " + cont8);
        });

        btn9.setOnClickListener(v->{
            cont9 += 1;
            btn9.setText("Produto9 \n " + cont9);
        });

        btn_enviar.setOnClickListener(v->{

            total = cont1 + cont2 + cont3 + cont4 + cont5 + cont6 + cont7 + cont8 + cont9;
            text_aux = "Usuario: " + name.getText() + "\n" +
                       "Correo: " + correo.getText() + "\n" +
                       "Total de Productos: " + total;

            String text_p1 = "Produto1 \n " + cont1;
            String text_p2 = "Produto2 \n " + cont2;
            String text_p3 = "Produto1 \n " + cont3;
            String text_p4 = "Produto1 \n " + cont4;
            String text_p5 = "Produto1 \n " + cont5;
            String text_p6 = "Produto1 \n " + cont6;
            String text_p7 = "Produto1 \n " + cont7;
            String text_p8 = "Produto1 \n " + cont8;
            String text_p9 = "Produto1 \n " + cont9;

            Intent m_Intent = new Intent(MainActivity.this,NewActivity.class);
            m_Intent.putExtra(AppConstant.TEXT_KEYS,text_aux);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P1,text_p1);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P2,text_p2);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P3,text_p3);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P4,text_p4);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P5,text_p5);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P6,text_p6);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P7,text_p7);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P7,text_p7);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P8,text_p8);
            m_Intent.putExtra(AppConstant.TEXT_KEYS_P9,text_p9);

            startActivity(m_Intent);
        });

    }
}
