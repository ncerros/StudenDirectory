package org.genspark;

import java.util.List;


public class Student implements org.genspark.Information {

    public org.genspark.Phone ph;

    public org.genspark.Phone getPh() {
        return ph;
    }

    public void setPh(org.genspark.Phone ph) {
        this.ph = ph;
    }

    public org.genspark.Address add;

    public org.genspark.Address getAdd() {
        return add;
    }

    public void setAdd(org.genspark.Address add) {
        this.add = add;
    }
    public void find() {
        System.out.println("Hi, My information is .."+ph+add);
    }
}
