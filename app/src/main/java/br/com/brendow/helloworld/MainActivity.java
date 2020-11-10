package br.com.brendow.helloworld;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView visorTv;
    private String visor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        visorTv = findViewById(R.id.visor_tv);
    }

    public void onClick(View v) {
        Button b = (Button)v;
        String buttonText = b.getText().toString();
        if (buttonText.equals("limpar (C)")) {
            visor = "";
        } else {
            System.out.println(buttonText);
            visor = visor.concat(buttonText);
        }

        visorTv.setText(visor);
    }
}