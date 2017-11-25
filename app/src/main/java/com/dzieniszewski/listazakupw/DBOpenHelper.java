package com.dzieniszewski.listazakupw;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_NAME = "table_name";
    private static final String TABLE_CREATE =
            "CREATE_TABLE " + TABLE_NAME + " (" + "nazwa" + " TEXT, " + "cena" + " TEXT);";

    DBOpenHelper(Context context) {
        super(context, "produkty", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(TABLE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}

