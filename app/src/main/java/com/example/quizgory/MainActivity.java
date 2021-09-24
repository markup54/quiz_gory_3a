package com.example.quizgory;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView pytanieTextView;
    private CheckBox[] czekboksy = new CheckBox[3];
    private int ktorePytanie=0;
    private WszystkiePytania wszystkie = new WszystkiePytania();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pytanieTextView =(TextView) findViewById(R.id.pytanie);
        czekboksy = new CheckBox[]{
                (CheckBox) findViewById(R.id.checkBox),
                (CheckBox) findViewById(R.id.checkBox2),
                (CheckBox) findViewById(R.id.checkBox3),

        };
        pokazPytanie(ktorePytanie);
    }
    private void pokazPytanie(int i){
        pytanieTextView.setText
                (wszystkie.wszystkiePytania[i].getTekstPytania());
        int k=0;
        for(CheckBox check:czekboksy){
            check.setText(wszystkie.wszystkiePytania[i].getOdpowiedzi(k));
            k++;
            check.setChecked(false);
        }
    }
    public void nastepny(View view) {
        ktorePytanie++;
        if(ktorePytanie==wszystkie.wszystkiePytania.length)
        {
            Toast
                    .makeText(this,"to jest już koniec",Toast.LENGTH_SHORT)
                    .show();
            return;
        }
        pokazPytanie(ktorePytanie);
    }
}