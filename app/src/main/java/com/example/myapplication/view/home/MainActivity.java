package com.example.myapplication.view.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.view.search_ingredients.Main3Activity;
import com.example.myapplication.view.search_recipe.search_recipeActivity;


public class MainActivity extends AppCompatActivity {
    private Button button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button = findViewById(R.id.button1);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) { openSearch_recipeActivity(); }
       });


        button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMain3Activity();
            }
        });
    }



        public void openSearch_recipeActivity(){

            Intent intent = new Intent(this, search_recipeActivity.class);
            startActivity(intent);

        }


        public void openMain3Activity(){

        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);

    }
}
