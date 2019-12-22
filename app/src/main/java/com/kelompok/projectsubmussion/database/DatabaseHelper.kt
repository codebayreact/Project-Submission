package com.bayreact.marvindcomunity

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context?): SQLiteOpenHelper(context, DATABASE_NAME,
    null,1) {
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE $TABLE_NAME(ID INTEGER PRIMARY KEY AUTOINCREMENT,"+
                    "Email TEXT, Password TEXT, Gender TEXT)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db)
    }
    companion object{
        const val DATABASE_NAME = "ProjectSubmission"
        const val TABLE_NAME = "admin"
        const val COL_2 = "Email"
        const val COL_3 = "Password"
        const val COL_4 = "Gender"
    }
}