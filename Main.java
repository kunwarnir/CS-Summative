import javax.swing.*;
import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.*;
import java.io.File;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;


class Main {
  public static void main(String[] args) {
    
    InitialWindow myFrame = new InitialWindow(); // create LabelFrame
    myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    myFrame.setSize(600, 500); // set frame size
    myFrame.setVisible(true); // display frame

/*
    File audioFile = new File("Music/mii_music.wav").getAbsoluteFile();
    AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audioFile);
    Clip clip = AudioSystem.getClip();
    clip.open(audioInputStream);
    //Plays audio once
    clip.start();
    //Plays the audio in a loop
    //clip.loop(Clip.LOOP_CONTINUOUSLY);

    // i thought this would work apparently it doesnt maybe i have to importsomething
*/

    String path = "Music/mii_music.wav";
    Media hit = new Media(new File(path).toURI().toString());
    MediaPlayer mediaPlayer = new MediaPlayer(hit);
     mediaPlayer.play();

  }
}