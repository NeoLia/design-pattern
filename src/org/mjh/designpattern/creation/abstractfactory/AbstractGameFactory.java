package org.mjh.designpattern.creation.abstractfactory;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 15:46
 */
public interface AbstractGameFactory {
    Game makeGame(String type, String gameName, String price);
    GameMachine makeGameMachine(String gameMachineName, String price);
}
