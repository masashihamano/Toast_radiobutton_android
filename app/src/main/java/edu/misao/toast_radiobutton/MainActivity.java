package edu.misao.toast_radiobutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name,mob,email,age,pass,bir;
    Button next;
    RadioGroup radioGroup;
    RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        name = findViewById( R.id.etName );
        mob = findViewById( R.id.etMob );
        email = findViewById( R.id.etEmail );
        age = findViewById( R.id.etAge );
        pass = findViewById( R.id.etPass );
        bir = findViewById( R.id.etBir );
        next =findViewById( R.id.btnNext );
        radioGroup = findViewById( R.id.gender );

        next.setOnClickListener( this );
    }

    @Override
    public void onClick(View view) {

        //      int i= Integer.parseInt(  mob.getText().toString());


        //   get selected radio button from radioGroup
        int selectId = radioGroup.getCheckedRadioButtonId();
        radioButton =findViewById( selectId );

//        Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG).show();

        //       Toast.makeText( getApplicationContext(), name.getText(), Toast.LENGTH_SHORT ).show();//直接


        Intent intent =new Intent( MainActivity.this,SecondActivity.class );

        intent.putExtra( "A", name.getText().toString());
        intent.putExtra( "B",mob.getText().toString() );
        intent.putExtra( "C",email.getText().toString());
        intent.putExtra( "D",age.getText().toString());
        intent.putExtra( "E",pass.getText().toString() );
        intent.putExtra( "F",bir.getText().toString() );
        intent.putExtra( "G",radioButton.getText().toString() );


        startActivity( intent );

    }

}