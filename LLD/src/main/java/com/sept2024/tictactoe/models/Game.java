package com.sept2024.tictactoe.models;

import com.sept2024.tictactoe.exceptions.InvalidBotCountException;
import com.sept2024.tictactoe.strategies.winningstrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private Board board;
    private List<Player> players;
    private List<Move> moves;

    private Player winner;
    private GameState gameState;
    private int nextPlayerMoveIndex;
    List<WinningStrategy> winningStrategies;

    private Game(Builder builder) {
        this.board = new Board(builder.dimension);
        this.players = builder.players;
        this.moves = new ArrayList<>();
        this.winner = null;
        this.gameState = GameState.INPROGRESS;
        this.nextPlayerMoveIndex = builder.nextPlayerMoveIndex;
        this.winningStrategies = builder.winningStrategies;
    }
//dimensions, players, nextPlayerMoveIndex, winningStrategies
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerMoveIndex() {
        return nextPlayerMoveIndex;
    }

    public void setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
        this.nextPlayerMoveIndex = nextPlayerMoveIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void makeMove() {
        Player currentPlayer = players.get(nextPlayerMoveIndex);

        System.out.println("Current player name is " + currentPlayer.getName());

        Move move = currentPlayer.makeMove(board);

        System.out.println("Player want to make a move at " + move.getCell().getRow() + ", " + move.getCell().getColumn());

        // Add a player/symbol on thr board

        int row = move.getCell().getRow();
        int column = move.getCell().getColumn();

        Cell cellToChange = board.getBoard().get(row).get(column);
        cellToChange.setPlayer(currentPlayer);
        cellToChange.setCellState(CellState.FILLED);

        Move finalMoveObject = new Move(currentPlayer, cellToChange);

        moves.add(finalMoveObject);

        // update next player
        nextPlayerMoveIndex += 1;
        nextPlayerMoveIndex %= players.size();
        
        if(checkWinner(finalMoveObject)) {
            winner = currentPlayer;
            gameState = GameState.ENDED;
        } else if (moves.size() == (board.getDimension()) * board.getDimension()) {
            gameState = GameState.DRAW;
        }
    }

    public boolean checkWinner(Move move) {
        for(WinningStrategy winningStrategy: winningStrategies) {
            if(winningStrategy.checkWinner(board, move)) {
                return true;
            }
        }
        return false;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public static class Builder {
        private int dimension;
        private List<Player> players;
        private int nextPlayerMoveIndex;
        List<WinningStrategy> winningStrategies;

        public Builder setDimensions(int dimensions) {
            this.dimension = dimensions;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setNextPlayerMoveIndex(int nextPlayerMoveIndex) {
            this.nextPlayerMoveIndex = nextPlayerMoveIndex;
            return this;
        }

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private void checkBotCount() throws InvalidBotCountException{
            int botCount = 0;
            for(Player player: players) {
                if (player.getPlayerType().equals(PlayerType.BOT)) {
                    botCount++;
                }
            }

            if(botCount > 1) {
                // throw exception
                throw new InvalidBotCountException("Bot count should not be more than 1");
            }
        }

        private void validate() throws InvalidBotCountException{
            checkBotCount();
        }

        public Game build() throws InvalidBotCountException {
            // validations
            // player count
            // unique player symbol
            validate();

            return new Game(this);
        }
    }
}
