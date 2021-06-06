package org.mjh.designpattern.creation.abstractfactory;

/**
 * 抽象工厂模式：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * @author: Neo Lia Marx
 * @date: 2021/6/6 16:00
 */
public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractGameFactory abstractGameFactory = new SonyGameFactory();
        Game game =  abstractGameFactory.makeGame("RPG", "战神", "298");
        GameMachine gameMachine = abstractGameFactory.makeGameMachine("PS5", "6999");
        System.out.println(game);
        System.out.println(gameMachine);
    }
}
