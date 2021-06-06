package org.mjh.designpattern.creation.factorymethod;

/**
 * 工厂方法模式：定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method使一个类的实例化延迟到其子类。
 * @author: Neo Lia Marx
 * @date: 2021/6/6 15:38
 */
public class FactoryMethodClient {
    public static void main(String[] args) {
        GameFactory gameFactory = new RpgGameFactory();
        Game game = gameFactory.make("RPG", "巫师3", "98");
        System.out.println(game);
    }
}
