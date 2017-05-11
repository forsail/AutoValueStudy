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

    public static User create(int id, String name) {
        return builder()
                .id(id)
                .name(name)
                .build();
    }

    private static Builder builder() {
        return new AutoValue_User.Builder();
    }

    @AutoValue.Builder
    abstract static class Builder {
        public abstract Builder id(int id);

        public abstract Builder name(String name);

        public abstract User build();
    }

    public static TypeAdapter<User> typeAdapter(Gson gson) {
        return new AutoValue_User.GsonTypeAdapter(gson);
    }
}
