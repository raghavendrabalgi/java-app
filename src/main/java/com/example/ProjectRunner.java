package com.example;

import com.google.common.base.Strings;

public class ProjectRunner {
    public static void main(String[] args) {
        String notNullOrEmpty = Strings.nullToEmpty(null);
        System.out.println("Hello, Bazel! The string is not null or empty: " + notNullOrEmpty);
    }
}

