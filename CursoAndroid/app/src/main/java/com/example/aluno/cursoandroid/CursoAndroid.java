
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

public class CursoAndroid extends AppCompatActivity {

    Button mButton;

    EditText mEdit1;
    EditText mEdit2;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_curso_android);

        mButton = (Button)findViewById(R.id.button);

        mEdit1 = (EditText)findViewById(R.id.editText1);
        String edit1 = mEdit1.getText().toString();

        mEdit2 = (EditText)findViewById(R.id.editText2);
        String edit2 = mEdit2.getText().toString();

        int edit1_int = 0;
        edit1_int = Integer.parseInt(edit1);

        int edit2_int = 0;
        edit2_int = Integer.parseInt(edit2);
        // Aqui agora temos os números colocados!

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
