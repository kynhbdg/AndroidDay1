package com.demo.day1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    TextView tvTitle;
    ImageView ivCover;
    EditText edUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pokemon_go);

//        btnLogin = findViewById(R.id.btnLogin);
//        tvTitle = findViewById(R.id.tvTitle);
//        ivCover = findViewById(R.id.ivCover);
//        edUser = findViewById(R.id.edUser);

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                tvTitle.setText("Xin chào");
//                ivCover.setImageResource(R.drawable.funny);
//                String username = edUser.getText().toString();
//                tvTitle.setText(tvTitle.getText() + " " + username);
//            }
//        });
    }
}