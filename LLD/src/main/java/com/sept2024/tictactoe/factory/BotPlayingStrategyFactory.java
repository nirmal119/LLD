package com.sept2024.tictactoe.factory;

import com.sept2024.tictactoe.models.BotDifficultyLevel;
import com.sept2024.tictactoe.strategies.botplayingstrategies.BotPlayingStrategy;
import com.sept2024.tictactoe.strategies.botplayingstrategies.EasyBotPlayingStrategy;
import com.sept2024.tictactoe.strategies.botplayingstrategies.HardBotPlayingStrategy;
import com.sept2024.tictactoe.strategies.botplayingstrategies.MediumBotPlayingStrategy;

public class BotPlayingStrategyFactory {
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel) {
        if(botDifficultyLevel.equals(BotDifficultyLevel.EASY)) {
            return new EasyBotPlayingStrategy();
        } else if(botDifficultyLevel.equals(BotDifficultyLevel.MEDIUM)) {
            return new MediumBotPlayingStrategy();
        } else if(botDifficultyLevel.equals(BotDifficultyLevel.HARD)) {
            return new HardBotPlayingStrategy();
        }
        return null;
    }
}
