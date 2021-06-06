package org.mjh.designpattern.creation.factorymethod;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 15:31
 */
public class RpgGame implements Game {
    private String type;
    private String gameName;
    private String price;

    public RpgGame(String type, String gameName, String price) {
        this.type = type;
        this.gameName = gameName;
        this.price = price;
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

    @Override
    public String toString() {
        return "RpgGame{" +
                "type='" + type + '\'' +
                ", gameName='" + gameName + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
