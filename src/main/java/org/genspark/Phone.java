package org.genspark;

import org.springframework.beans.factory.annotation.Autowired;

public class Phone implements org.genspark.Information {
    private String mob;

    public void find() {
        System.out.println("My phone number is ..");
    }
}