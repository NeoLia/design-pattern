package org.mjh.designpattern.creation.builder;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 16:21
 */
public class BuilderClient {
    public static void main(String[] args) {
        GameBuilder gameBuilder = new GameBuilder();
        Game game = gameBuilder
                .create("战神")
                .setGameArt(new GameArtBuilder())
                .setGamePlot(new GamePlotBuilder())
                .setGameProgram(new GameProgramBuilder())
                .build();
        System.out.println(game);
    }
}
