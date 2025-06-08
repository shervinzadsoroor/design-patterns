package com.shervin.bahavioral.state;

public class MediaPlayer {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void pressButton() {
        state.handle();
    }
}
