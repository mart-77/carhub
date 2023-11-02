package com.example.myapplication.activities;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import com.example.myapplication.R;
import com.example.myapplication.data.DBHelper;

public class InicioActivity extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    public void cargarDatos(View view) {
        DBHelper dbHelper = new DBHelper(getApplicationContext());
        SQLiteDatabase db = dbHelper.openDatabase();

// Realiza la inserción de datos en la tabla
        String nombre = "Ejemplo";
        String mail = "Ejemplo";
        String telefono = "Ejemplo";
        String password = "Ejemplo";

        String insertQuery = "INSERT INTO usuario (nombre,  mail, telefono, password) VALUES (?, ?, ?, ?)";
        db.execSQL(insertQuery, new Object[]{nombre, mail, telefono, password});

// Cierra la base de datos cuando hayas terminado de usarla
        db.close();
    }

}