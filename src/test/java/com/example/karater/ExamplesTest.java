package com.example.karater;

import com.intuit.karate.junit5.Karate;

public class ExamplesTest {

    @Karate.Test
    Karate testAll() {
        return Karate.run().relativeTo(getClass());
    }

}
