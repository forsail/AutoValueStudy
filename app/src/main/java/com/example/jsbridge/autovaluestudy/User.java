package com.example.jsbridge.autovaluestudy;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

/**
 * Created by lihong on 2017/5/11.
 */
@AutoValue
public abstract class User {
    public abstract int id();

    public abstract String name();

    public static User newInstance(int id, String name) {
        return new AutoValue_User(id, name);
    }

    public static TypeAdapter<User> typeAdapter(Gson gson) {
        return new AutoValue_User.GsonTypeAdapter(gson);
    }
}
