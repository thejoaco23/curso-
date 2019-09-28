package ar.com.eduit.curso.java.advanced.clase01;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;
public class ReproductorR {
    public static void main(String[] args) {
        try {
            new Player(new FileInputStream(new File("mp3/condor.mp3"))).play();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}