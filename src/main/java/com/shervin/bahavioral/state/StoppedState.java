package com.shervin.bahavioral.state;

public class StoppedState implements State {
    @Override
    public void handle() {
        System.out.println("Music is stopped... ");
    }
}
