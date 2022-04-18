package jp.co.toshiba.iflink.myocr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        Intent myIntent = getIntent();
        String result = myIntent.getStringExtra("result");
        TextView textView = findViewById(R.id.textView);
        textView.setText(result);
    }
}