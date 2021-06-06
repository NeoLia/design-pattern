package org.mjh.designpattern.creation.builder;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 16:11
 */
public class GamePlotBuilder {
    public Game build(Game game) {
        game.setGamePlot("GAME PLOT");
        return game;
    }
}
