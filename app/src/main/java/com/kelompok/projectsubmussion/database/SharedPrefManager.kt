package com.bayreact.marvindcomunity

import android.content.Context
import android.content.SharedPreferences

class SharedPrefManager(context: Context) {

    private var sp: SharedPreferences
    private var spEditor:SharedPreferences.Editor

    fun saveSPString(keySP: String?, value:String?){
        spEditor.putString(keySP,value)
        spEditor.commit()
    }
    fun saveBoolean(keySP: String?, value:Boolean){
        spEditor.putBoolean(keySP,value)
        spEditor.commit()
    }
    val sPSudahLogin: Boolean
        get() = sp.getBoolean(SP_SUDAH_LOGIN,false)

    companion object{
        const val TABLE_NAME = "user"
        const val COL_2 = "Email"
        const val COL_3 = "Password"
        const val COL_4 = "Gender"
        const val SP_SUDAH_LOGIN = "spSudahLogin"
    }
    init {
        sp = context.getSharedPreferences(TABLE_NAME,Context.MODE_PRIVATE)
        spEditor = sp.edit()
    }
}