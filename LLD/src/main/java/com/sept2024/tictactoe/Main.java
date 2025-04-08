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
import java.util.Scanner;

/*
    Client class
 */
public class Main {

    public static void main(String[] args) throws InvalidBotCountException {

        Scanner scanner = new Scanner(System.in);
        int dimension = 3;
        List<Player> players = new ArrayList<>();
        players.add(new Player("Tyson", 1, new Symbol('X'), PlayerType.HUMAN));
        players.add(new Bot("Kai", 2, new Symbol('O'), PlayerType.BOT, BotDifficultyLevel.EASY));

        List<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColWinningStrategy());
        winningStrategies.add(new DiagonalWinningStrategy());

        int nextPlayerMoveIndex = 0;

        GameController gameController = new GameController();
        Game game = gameController.startGame(dimension, players, nextPlayerMoveIndex, winningStrategies);

        while(game.getGameState().equals(GameState.INPROGRESS)) {
            // print the board
            // Make a move
            // next player change
            gameController.printGame(game);
            gameController.makeMove(game);

            System.out.println("undo move?  Enter y/n");
            String undo = scanner.next();
            if(undo.equals("y")) {
                gameController.undo(game);
            } else if (!undo.equals("n")) {
                System.out.println("Invalid command!");
            }
        }

        gameController.printGame(game);
        System.out.println(game.getWinner().getName() + " won the game!");

    }
}
