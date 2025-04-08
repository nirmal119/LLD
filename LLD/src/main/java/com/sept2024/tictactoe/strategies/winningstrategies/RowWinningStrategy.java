package com.sept2024.tictactoe.strategies.winningstrategies;

import com.sept2024.tictactoe.models.Board;
import com.sept2024.tictactoe.models.Move;

public class RowWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }

    @Override
    public void undo(Board board, Move move) {

    }
}
