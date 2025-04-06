package com.sept2024.tictactoe.strategies.botplayingstrategies;

import com.sept2024.tictactoe.models.Board;
import com.sept2024.tictactoe.models.Cell;
import com.sept2024.tictactoe.models.CellState;
import com.sept2024.tictactoe.models.Move;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> row: board.getBoard()) {
            for(Cell cell: row) {
                if(cell.getCellState().equals(CellState.EMPTY)) {
                    return new Move(null, cell);
                }
            }
        }

        return null;
    }
}
