package com.shervin.bahavioral.state;

public class StateTest {

    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();
        player.setState(new PlayingState());
        player.pressButton();

        player.setState(new PausedState());
        player.pressButton();

        player.setState(new StoppedState());
        player.pressButton();
    }
}
