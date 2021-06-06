package org.mjh.designpattern.creation.factorymethod;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 15:31
 */
public class RpgGameFactory implements GameFactory {
    private static final String GAME_TYPE = "RPG";

    @Override
    public Game make(String type, String gameName, String price) {
        return new RpgGame(type, gameName, price);
    }
}
