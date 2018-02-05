package edu.misao.toast_radiobutton;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "SecondAction";

    TextView name,mob,email,age,pass,bir,gen;
    Button back,exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_second );

        name = findViewById( R.id.tvName );
        mob = findViewById( R.id.tvMob );
        email = findViewById( R.id.tvEmail );
        age = findViewById( R.id.tvAge );
        pass = findViewById( R.id.tvPass );
        bir = findViewById( R.id.tvBir );
        back = findViewById( R.id.btnBack );
        gen = findViewById( R.id.gender );
        exit = findViewById( R.id.btnExit );

        back.setOnClickListener( this );
        exit.setOnClickListener( this );



        String a =getIntent().getStringExtra( "A" );
        name.setText( a );

        String b =getIntent().getStringExtra( "B" );
        mob.setText( b );

        String c =getIntent().getStringExtra( "C" );
        email.setText( c );

        String d =getIntent().getStringExtra( "D" );
        age.setText( d );

        String e =getIntent().getStringExtra( "E" );
        pass.setText( e );

        String f =getIntent().getStringExtra( "F" );
        bir.setText( f );

        String g =getIntent().getStringExtra( "G" );
        gen.setText( g );
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.btnBack:Intent intent = new Intent( SecondActivity.this,MainActivity.class );
                startActivity( intent );

                Toast.makeText( getApplicationContext(),"Called message",Toast.LENGTH_LONG ).show();

                break;

            case R.id.btnExit:
                Intent i = new Intent(Intent.ACTION_MAIN);
                i.addCategory(Intent.CATEGORY_HOME);
                i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);//***Change Here***
                startActivity(i);
                finish();
                System.exit(0);

                break;
        }

    }
}
