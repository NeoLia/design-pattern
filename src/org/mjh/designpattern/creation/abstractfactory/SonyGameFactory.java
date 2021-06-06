package org.mjh.designpattern.creation.abstractfactory;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 15:51
 */
public class SonyGameFactory implements AbstractGameFactory {
    @Override
    public Game makeGame(String type, String gameName, String price) {
        return new SonyExclusiveGame(type, gameName, price);
    }

    @Override
    public GameMachine makeGameMachine(String gameMachineName, String price) {
        return new Ps5GameMachine("PS5", "4888");
    }
}
