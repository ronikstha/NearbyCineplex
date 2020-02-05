package com.example.nearbycineplex.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.content.ContentValues;
import android.database.Cursor;
import android.util.Log;


public class hallDatabase extends SQLiteOpenHelper {


    public static String DATABASE = "halldatabase.db";
    public static String TABLE ="halltable1";
    public static String TABLE_1 ="halltable2";
    public static String TABLE_2 ="halltable3";
    public static String TABLE_3 ="halltable4";
    public static String TABLE_PAY ="paytable";
    public static String TABLE_PAY1 ="paytable2";
    public static String TABLE_PAY2 ="paytable3";
    public static String TABLE_PAY3 ="paytable4";
    public static String ID="seat_id";
    public static String ID_1="seat_id";
    public static String ID_2="seat_id";
    public static String ID_3="seat_id";
    public static String ID_PAY="seat_id";
    public static String ID_PAY1="seat_id";
    public static String ID_PAY2="seat_id";
    public static String ID_PAY3="seat_id";
    public static String STATUS="seat_status";
    public static String STATUS_1="seat_status";
    public static String STATUS_2="seat_status";
    public static String STATUS_3="seat_status";
    public static String STATUS_PAY="seat_status";
    public static String STATUS_PAY1="seat_status";
    public static String STATUS_PAY2="seat_status";
    public static String STATUS_PAY3="seat_status";
    String br,br2,br3,br4,pr,pr2,pr3,pr4;

    public hallDatabase(Context context) {
        super(context, DATABASE, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //  br= "CREATE TABLE mytable(name TEXT,company TEXT,city TEXT,country TEXT);";
        br = "CREATE TABLE "+TABLE+"("+ID+ " INTEGER, "+STATUS+ " Text);";
        br2= "CREATE TABLE "+TABLE_1+"("+ID_1+ " INTEGER, "+STATUS_1+ " Text);";
        br3= "CREATE TABLE "+TABLE_2+"("+ID_2+ " INTEGER, "+STATUS_2+ " Text);";
        br4= "CREATE TABLE "+TABLE_3+"("+ID_3+ " INTEGER, "+STATUS_3+ " Text);";
        pr= "CREATE TABLE "+TABLE_PAY+"("+ID_PAY+ " INTEGER, "+STATUS_PAY+ " Text);";
        pr2= "CREATE TABLE "+TABLE_PAY1+"("+ID_PAY1+ " INTEGER, "+STATUS_PAY1+ " Text);";
        pr3= "CREATE TABLE "+TABLE_PAY2+"("+ID_PAY2+ " INTEGER, "+STATUS_PAY2+ " Text);";
        pr4= "CREATE TABLE "+TABLE_PAY3+"("+ID_PAY3+ " INTEGER, "+STATUS_PAY3+ " Text);";
        db.execSQL(br);
        db.execSQL(br2);
        db.execSQL(br3);
        db.execSQL(br4);
        db.execSQL(pr);
        db.execSQL(pr2);
        db.execSQL(pr3);
        db.execSQL(pr4);
        Log.d("dit","table creation successful");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE+" ;");
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_1+" ;");
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_2+" ;");
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_3+" ;");
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_PAY+" ;");
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_PAY1+" ;");
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_PAY2+" ;");
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_PAY3+" ;");
    }


    public void insertdata(Integer id, String seat_status){   //SchemeBasic
        System.out.print("Hello "+br);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID, id);
        contentValues.put(STATUS, seat_status);
        db.insert(TABLE,null,contentValues);
    }

    public void insertdata1(Integer id, String seat_status){  //SchemeBasic2
        System.out.print("Hello "+br2);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID_1, id);
        contentValues.put(STATUS_1, seat_status);
        db.insert(TABLE_1,null,contentValues);
    }
    public void insertdata2(Integer id, String seat_status){   //SchemewithScene
        System.out.print("Hello "+br3);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID_2, id);
        contentValues.put(STATUS_2, seat_status);
        db.insert(TABLE_2,null,contentValues);
    }
    public void insertdata3(Integer id, String seat_status){  // //SchemewithScene2
        System.out.print("Hello "+br4);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID_3, id);
        contentValues.put(STATUS_3, seat_status);
        db.insert(TABLE_3,null,contentValues);
    }
    public void insertdatapay(Integer id, String seat_status){  // //SchemeBaisc
        // System.out.print("Hello "+pr);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID_PAY, id);
        contentValues.put(STATUS_PAY, seat_status);
        db.insert(TABLE_PAY,null,contentValues);
    }
    public void insertdatapay1(Integer id, String seat_status){  // //SchemeBasic2
        //System.out.print("Hello "+pr);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID_PAY1, id);
        contentValues.put(STATUS_PAY1, seat_status);
        db.insert(TABLE_PAY1,null,contentValues);
    }
    public void insertdatapay2(Integer id, String seat_status){  // //SchemewithScene
        //System.out.print("Hello "+pr);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID_PAY2, id);
        contentValues.put(STATUS_PAY2, seat_status);
        db.insert(TABLE_PAY2,null,contentValues);
    }
    public void insertdatapay3(Integer id, String seat_status){  // //SchemewithScene3
        //System.out.print("Hello "+pr);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID_PAY3, id);
        contentValues.put(STATUS_PAY3, seat_status);
        db.insert(TABLE_PAY3,null,contentValues);
    }
    public void updateData(Integer id, String seat_status){
        //System.out.print("Hello "+pr);
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues= new ContentValues();
        contentValues.put(ID_1, id);
        contentValues.put(STATUS_1, seat_status);
        db.update(TABLE_1,contentValues,"seat_id = ?",new String[]{seat_status});
    }
    public Cursor getalldata() //schemeBasic
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE,null);
        return  res;
    }
    public Cursor getalldata1() //schemeBasic
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE_1,null);
        return  res;
    }
    public Cursor getalldata2()  //schemewithScene
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE_2,null);
        return  res;
    }
    public Cursor getalldata3() //schemeWithScene2
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE_3,null);
        return  res;
    }
    public Cursor getalldatapay()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE_PAY,null);
        return  res;
    }
    public Cursor getalldatapay1()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE_PAY1,null);
        return  res;
    }
    public Cursor getalldatapay2()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE_PAY2,null);
        return  res;
    }
    public Cursor getalldatapay3()
    {
        SQLiteDatabase db=this.getReadableDatabase();
        Cursor res=db.rawQuery("SELECT * FROM "+TABLE_PAY3,null);
        return  res;
    }


}
