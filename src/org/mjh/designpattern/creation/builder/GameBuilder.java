package org.mjh.designpattern.creation.builder;

/**
 * @author: Neo Lia Marx
 * @date: 2021/6/6 16:07
 */
public class GameBuilder {
    private Game game;

    public GameBuilder() {
    }

    public GameBuilder create(String gameName) {
        game = new Game(gameName);
        return this;
    }

    public GameBuilder setGameArt(GameArtBuilder gameArtBuilder) {
        gameArtBuilder.build(game);
        return this;
    }

    public GameBuilder setGamePlot(GamePlotBuilder gamePlotBuilder) {
        gamePlotBuilder.build(game);
        return this;
    }

    public GameBuilder setGameProgram(GameProgramBuilder gameProgramBuilder) {
        gameProgramBuilder.build(game);
        return this;
    }

    public Game build() {
        return game;
    }
}
