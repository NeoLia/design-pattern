package org.mjh.designpattern.creation.builder;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 16:14
 */
public class Game {
    private String gameName;
    private String gameArt;
    private String gamePlot;
    private String gameProgram;

    public Game(String gameName) {
        this.gameName = gameName;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", gameArt='" + gameArt + '\'' +
                ", gamePlot='" + gamePlot + '\'' +
                ", gameProgram='" + gameProgram + '\'' +
                '}';
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGameArt() {
        return gameArt;
    }

    public void setGameArt(String gameArt) {
        this.gameArt = gameArt;
    }

    public String getGamePlot() {
        return gamePlot;
    }

    public void setGamePlot(String gamePlot) {
        this.gamePlot = gamePlot;
    }

    public String getGameProgram() {
        return gameProgram;
    }

    public void setGameProgram(String gameProgram) {
        this.gameProgram = gameProgram;
    }
}
