package com.example.firsttestapplication

import android.provider.BaseColumns

object DataBase : BaseColumns {
    const val TABLE_NAME = "Table"
    const val COLUMN_NAME_TITLE = "List name"
    const val COLUMN_NAME_SUBTITLE = "Item"

    const val DATABASE_VERSION = 1
    const val DATABASE_NAME = "MyDB"

    const val CREATE = "CREATE TABLE IF NOT EXIST $TABLE_NAME " +
            "(${BaseColumns._ID} INTEGER PRIMARY KEY, " +
            "$COLUMN_NAME_TITLE TEXT, " +
            "$COLUMN_NAME_SUBTITLE TEXT)"
}