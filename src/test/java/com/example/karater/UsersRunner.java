package com.example.karater;

import com.intuit.karate.junit5.Karate;

public class UsersRunner {
    @Karate.Test
    Karate testUsers() {
        return Karate.run("users").relativeTo(getClass());
    }
}
