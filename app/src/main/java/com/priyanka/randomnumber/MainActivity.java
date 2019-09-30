package com.priyanka.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
int randomnumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random random=new Random();
        randomnumber=random.nextInt(10)+1;

    }
    public void Guess(View view) {
        EditText editText=(EditText)findViewById(R.id.editText);
      //  Toast.makeText(MainActivity.this,editText.getText().toString(),Toast.LENGTH_LONG).show();
        int guessednumber=Integer.parseInt(editText.getText().toString());
        if (guessednumber>randomnumber){
            makeToast("Guess Lower!!");
        }else if (guessednumber<randomnumber){
            makeToast("Guess Higher!!");
        }else {
            makeToast("Congratulations,You guessed it Right!!" +
                    "Play Again");           }
        Random random=new Random();
        randomnumber=random.nextInt(10)+1;
    }
    public void makeToast(String str){
        Toast.makeText(MainActivity.this,str,Toast.LENGTH_LONG).show();
    }

}
