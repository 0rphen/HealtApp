package com.lorenz.konrad.healtapp.entities;

import java.util.Hashtable;

/**
 * Created by ingenieria on 26/09/17.
 */

public class Test {
    Hashtable<String, Object> fieldTest;

    public Test(Hashtable<String, Object> fieldTest) {
        this.fieldTest = fieldTest;
    }

    public Hashtable<String, Object> getFieldTest() {
        return fieldTest;
    }

    public void setFieldTest(Hashtable<String, Object> fieldTest) {
        this.fieldTest = fieldTest;
    }

    public void addFieldTest(String key, Object value) {
        this.fieldTest.put(key, value);
    }
}
