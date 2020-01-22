package sample.jakartaee.service;

import javax.ejb.Stateful;

@Stateful
public class Thing {

    private int state = 0;

    public int now() {
        return state++;
    }
}