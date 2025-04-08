package com.sept2024.tictactoe.strategies.winningstrategies;

import com.sept2024.tictactoe.models.Board;
import com.sept2024.tictactoe.models.Move;
import com.sept2024.tictactoe.models.Player;
import com.sept2024.tictactoe.models.Symbol;

import java.util.HashMap;

public class ColWinningStrategy implements WinningStrategy{

    HashMap<Integer, HashMap<Player, Integer>> colMap = new HashMap<>();

    @Override
    public boolean checkWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getColumn();

        if(!colMap.containsKey(col) || !colMap.get(col).containsKey(move.getPlayer())) {
            HashMap<Player, Integer> tempMap = new HashMap<>();
            tempMap.put(move.getPlayer(), 0);
            colMap.put(col, tempMap);
        }

        colMap.get(col).put(move.getPlayer(),
                colMap.get(col).get(move.getPlayer()) + 1);

        return colMap.get(col).get(move.getPlayer()) == board.getDimension();
    }

    @Override
    public void undo(Board board, Move move) {

    }
}
