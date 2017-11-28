package com.lorenz.konrad.healtapp.entities;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by cesar on 28/11/17.
 */

@IgnoreExtraProperties
public class Forms {
    private String question1;
    private String question2;
    private String question3;

    public Forms() {
    }

    public Forms(String question1, String question2, String question3) {
        this.question1 = question1;
        this.question2 = question2;
        this.question3 = question3;
    }

    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }
}
