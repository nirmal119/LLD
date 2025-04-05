package com.sept2024.tictactoe;

import com.sept2024.tictactoe.controller.GameController;
import com.sept2024.tictactoe.exceptions.InvalidBotCountException;
import com.sept2024.tictactoe.models.*;
import com.sept2024.tictactoe.strategies.winningstrategies.ColWinningStrategy;
import com.sept2024.tictactoe.strategies.winningstrategies.DiagonalWinningStrategy;
import com.sept2024.tictactoe.strategies.winningstrategies.RowWinningStrategy;
import com.sept2024.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

/*
    Client class
 */
public class Main {

    public static void main(String[] args) throws InvalidBotCountException {
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player("Tyson", 1, new Symbol('X'), PlayerType.HUMAN));
        players.add(new Player("Kai", 2, new Symbol('O'), PlayerType.HUMAN));

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        int nextPlayerMoveIndex = 1;

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, players, nextPlayerMoveIndex, winningStrategies);

        while(game.getGameState().equals(GameState.INPROGRESS)) {
            // print the board
            // Make a move
            // next player change
        }

    }
}
