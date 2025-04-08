package com.sept2024.tictactoe.strategies.winningstrategies;

import com.sept2024.tictactoe.models.Board;
import com.sept2024.tictactoe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);
    void undo(Board board, Move move);
}
