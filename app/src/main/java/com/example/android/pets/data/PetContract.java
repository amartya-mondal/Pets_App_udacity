package com.example.android.pets.data;

import android.provider.BaseColumns;

public final class PetContract {
    //Empty constructor
    private PetContract() {
    }

    //API COntract
    public final class PetEntry implements BaseColumns {

        public final static String TABLE_NAME="pets";
        public final static String _ID = BaseColumns._ID;
        public final static String COLUMN_PET_NAME = "name";
        public final static String COLUMN_PET_BREED = "breed";
        public final static String COLUMN_PET_GENDER = "gender";
        public final static String COLUMN_PET_WEIGHT = "weight";

        //Defining hte values of the constsnats for the gender
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}

