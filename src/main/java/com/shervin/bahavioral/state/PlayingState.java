package com.shervin.bahavioral.state;

public class PlayingState implements State {
    @Override
    public void handle() {
        System.out.println("Music is playing...");
    }
}
