package org.mjh.designpattern.creation.abstractfactory;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 15:52
 */
public class SonyExclusiveGame implements Game {
    private String type;
    private String gameName;
    private String price;

    public SonyExclusiveGame(String type, String gameName, String price) {
        this.type = type;
        this.gameName = gameName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "SonyExclusiveGame{" +
                "type='" + type + '\'' +
                ", gameName='" + gameName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getGameName() {
        return gameName;
    }

    @Override
    public String getPrice() {
        return price;
    }
}
