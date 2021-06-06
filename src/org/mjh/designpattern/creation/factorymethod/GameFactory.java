package org.mjh.designpattern.creation.factorymethod;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 15:30
 */
public interface GameFactory {
    Game make(String type, String gameName, String price);
}
