package org.mjh.designpattern.creation.abstractfactory;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 15:53
 */
public class Ps5GameMachine implements GameMachine {
    private String gameMachineName;
    private String price;

    public Ps5GameMachine(String gameMachineName, String price) {
        this.gameMachineName = gameMachineName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ps5GameMachine{" +
                "gameMachineName='" + gameMachineName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public String getGameMachineName() {
        return gameMachineName;
    }

    @Override
    public String getPrice() {
        return price;
    }
}
