package com.example.projeto;

import java.util.Scanner;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class DigitarMesa extends AppCompatActivity {

        private EditText DigiteNumeroMesa;
        private Button btnConfMesa;
        private Button btnVoltarMesa;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                DigiteNumeroMesa = (EditText)findViewById(R.id.DigiteNumeroMesa);
                btnConfMesa = (Button)findViewById(R.id.btnConfMesa);
                btnVoltarMesa = (Button)findViewById(R.id.btnVoltarMesa);


                btnVoltarMesa.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            Intent itt = new
                                    Intent(DigitarMesa.this, MainActivity.class);
                            startActivity(itt);


                        }
                });
                btnConfMesa.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
                });


            }

            public EditText getMesa(){
            DigiteNumeroMesa = getMesa();
        return DigiteNumeroMesa;

        }


        }
