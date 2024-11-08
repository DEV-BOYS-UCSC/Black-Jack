import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


public class BlackJack {
    private class Card {
    String value;
    String type;

    Card(String value,String type){
        this.value=value;
        this.type= type;
    }
        
    }

    ArrayList<Card> deck;

    BlackJack(){
        startGame();
    }

    public void startGame(){

    }

}