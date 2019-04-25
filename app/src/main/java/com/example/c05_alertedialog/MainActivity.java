package com.example.c05_alertedialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnQuitterOnClick(){
//        pour creer une alert il faut d'abord une fabrique d'alert (builder)
        AlertDialog.Builder fabrique = new AlertDialog.Builder(this);
//        configurer la fabrique
        fabrique.setMessage("Voulez-vous quitter");
        fabrique.setTitle("Quitter");
       // fabrique.setIcon(R.drawable.factory);
        fabrique.setCancelable(false);
        fabrique.setPositiveButton("Oui", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
                MainActivity.this.finish();
            }
        });
        fabrique.setNegativeButton("Non", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });
        AlertDialog dialogue = fabrique.create();
        dialogue.show();




    }
}