package com.sept2024.tictactoe.strategies.botplayingstrategies;

import com.sept2024.tictactoe.models.Board;
import com.sept2024.tictactoe.models.Move;

public interface BotPlayingStrategy {

    Move makeMove(Board board);
}
