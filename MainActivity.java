package com.example.ex2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        View button = findViewById(R.id.button);
        registerForContextMenu(button);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.example_menu,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item){
        switch (item.getItemId()){
            case R.id.option_1:
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setMessage("One Selected");
                builder.setCancelable(true);
                AlertDialog d = builder.create();
                d.show();
                break;
            case R.id.option_2:
                AlertDialog.Builder builder1 = new AlertDialog.Builder(MainActivity.this);
                builder1.setMessage("Two Selected");
                builder1.setCancelable(true);
                AlertDialog d1 = builder1.create();
                d1.show();
                break;
            case R.id.option_3:
                AlertDialog.Builder builder2 = new AlertDialog.Builder(MainActivity.this);
                builder2.setMessage("Three Selected");
                builder2.setCancelable(true);
                AlertDialog d2 = builder2.create();
                d2.show();
                break;

        }
        return super.onContextItemSelected(item);
    }
}