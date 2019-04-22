package com.shenhu.consume.utils;

import java.io.IOException;
import java.lang.reflect.Type;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    /**
     *
     * @param object
     * @return
     */
    public static String toJson(@NotNull Object object) {
        try {
            return object == null ? "null" : OBJECT_MAPPER.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param json
     * @param type
     * @return
     */
    public static <T> T fromJson(@NotNull String json, @NotNull Type type) {
        JavaType javaType = OBJECT_MAPPER.constructType(type);
        try {
            return OBJECT_MAPPER.readValue(json, javaType);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     *
     * @param obj
     * @param toValueType
     * @return
     */
    public static <T> T convertObject(@NotNull Object obj, @NotNull Class<T> toValueType) {
        try {
            return obj == null ? null : OBJECT_MAPPER.convertValue(obj, toValueType);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        }
    }
}
