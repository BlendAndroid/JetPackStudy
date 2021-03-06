package com.blend.jetpackstudy.room;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Student.class}, version = 1)
public abstract class MyDatabase extends RoomDatabase {

    private static final String DATABASE_NAME = "blend_db";

    private static MyDatabase databaseInstance;

    public static synchronized MyDatabase getInstance(Context context) {
        if (databaseInstance == null) {
            databaseInstance = Room.databaseBuilder(context.getApplicationContext(), MyDatabase.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .addMigrations(MIGRATION2_3)
                    .build();
        }
        return databaseInstance;
    }

    private static Migration MIGRATION2_3 = new Migration(1, 2) {
        @Override
        public void migrate(@NonNull SupportSQLiteDatabase database) {
            // //升级相关的操作
            // database.execSQL("alter table student add column flag2 integer not null default 1");
            //
            // database.execSQL("create table student_temp (uid integer primary key not null,name text,pwd text,addressId)");
            // database.execSQL("insert into student (uid,name,pwd,addressid)" + " select uid,name,pwd,addressid from student");
            // database.execSQL("drop table student");
            // database.execSQL("alter table student_temp rename to student");
        }
    };

    public abstract StudentDao studentDao();

}
