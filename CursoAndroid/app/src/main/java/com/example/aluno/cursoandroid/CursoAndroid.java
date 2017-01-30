
package com.example.aluno.cursoandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CursoAndroid extends AppCompatActivity {

    int edit1_int;
    int edit2_int;

    Button mButton;

    EditText mEdit1;
    EditText mEdit2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_curso_android);

        mButton = (Button)findViewById(R.id.button);

        mButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                mEdit1 = (EditText) findViewById(R.id.editText1);

                if (mEdit1 == null) {
                    mEdit1.setText("0");
                }

                mEdit2 = (EditText) findViewById(R.id.editText2);

                if (mEdit2 == null) {
                    mEdit2.setText("0");
                }

                if (mEdit1.getText().toString().length() > 0) {
                    edit1_int = Integer.valueOf(mEdit1.getText().toString().trim());
                } else {
                    edit1_int = 0;
                }

                if (mEdit2.getText().toString().length() > 0) {
                    edit2_int = Integer.valueOf(mEdit2.getText().toString().trim());
                } else {
                    edit2_int = 0;
                }

                float soma = 0;

                soma = edit1_int + edit2_int;

                TextView textViewScreen = (TextView) findViewById(R.id.textView2);

                String result = String.valueOf(soma);

                textViewScreen.setText(result);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_curso_android, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
