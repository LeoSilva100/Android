package com.example.aluno.cursoandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Aluno on 20/01/2016.
 */
public class Tela_2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_2);

    }

public void TelaAnterior(View v){
    Intent i = new Intent(Tela_2.this, MainActivity.class);
    startActivity(i);
    finish();
}
}