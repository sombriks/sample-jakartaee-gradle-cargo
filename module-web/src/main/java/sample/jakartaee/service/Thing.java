package sample.jakartaee.service;

import sample.jakartaee.Bar;

import javax.ejb.EJB;
import javax.ejb.Stateful;

@Stateful
public class Thing {

    @EJB
    private Bar bar;

    private int state = 0;

    public int now() {
        return state++;
    }
}