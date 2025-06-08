package com.shervin.bahavioral.state;

public class PausedState implements State {
    @Override
    public void handle() {
        System.out.println("Music is paused...");
    }
}
