package com.example.tarea3;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class personas extends SQLiteOpenHelper {
    private static final String NOMBRE_BD="personas.bd";
    private static final int VERSION_BD=1;
    private static final String TABLA_PERSONA="CREATE TABLE PERSONAS(NOMBRES TEXT, APELLIDOS TEXT, EDAD TEXT, CORREO TEXT, DIRECCION TEXT)";

    public personas( Context context) {
        super(context, NOMBRE_BD, null, VERSION_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(TABLA_PERSONA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLA_PERSONA);
        sqLiteDatabase.execSQL(TABLA_PERSONA);
    }
    public void agregarpersona(String nombres, String apellidos, String edad, String correo, String direccion){
        SQLiteDatabase bd=getWritableDatabase();
        if(bd!=null){
            bd.execSQL("INSERT INTO PERSONAS VALUES('"+nombres+"','"+apellidos+"','"+edad+"','"+correo+"','"+direccion+"')");
            bd.close();
        }
    }
}
