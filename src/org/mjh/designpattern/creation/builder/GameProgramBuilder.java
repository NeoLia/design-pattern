package org.mjh.designpattern.creation.builder;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 16:10
 */
public class GameProgramBuilder {
    public Game build(Game game) {
        game.setGameProgram("GAME PROGRAM");
        return game;
    }
}
