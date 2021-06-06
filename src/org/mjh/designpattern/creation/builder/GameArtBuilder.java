package org.mjh.designpattern.creation.builder;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 16:09
 */
public class GameArtBuilder {
    public Game build(Game game) {
        game.setGameArt("GAME ART");
        return game;
    }
}
