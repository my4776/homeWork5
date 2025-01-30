package com.example.homework5;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    TextView tv;
    int growUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn.findViewById(R.id.btn);
        tv.findViewById(R.id.tv);

        growUp = 0;

    }

    public void Albert(View view) {
        growUp++;
        tv.setText("This is a click number: "+growUp);
        if(growUp==6)
        {
            tv.setText("Enough to click. Go to new start!");
            growUp = 0;
        }
    }
}