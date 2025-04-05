package com.sept2024.tictactoe.controller;

import com.sept2024.tictactoe.exceptions.InvalidBotCountException;
import com.sept2024.tictactoe.models.Game;
import com.sept2024.tictactoe.models.Player;
import com.sept2024.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.List;

public class GameController {
    /*
        Responsible for maintaining and playing game
     */

    public Game startGame(int dimension, List<Player> players, int nextPlayerMoveIndex,
                          List<WinningStrategy> winningStrategies) throws InvalidBotCountException {

        Game game = Game.getBuilder()
                .setDimensions(dimension)
                .setPlayers(players)
                .setNextPlayerMoveIndex(nextPlayerMoveIndex)
                .setWinningStrategies(winningStrategies)
                .build();

        return game;
    }

    public Player getWinner() {
        return null;
    }

    public void printGame() {

    }

    public void makeMove() {

    }

    public void undo() {

    }
}
