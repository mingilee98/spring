package com.leemingi.springframework;

import com.leemingi.springframework.game.MarioGame;
import com.leemingi.springframework.game.PacMan;
import com.leemingi.springframework.game.SuperContraGame;
import com.leemingi.springframework.game.GameRunner;
import com.leemingi.springframework.game.GamingConsole;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		GamingConsole game1 = new MarioGame();
		GamingConsole game2 = new SuperContraGame();
		GamingConsole game3 = new PacMan();
		var gameRunner = new GameRunner(game1);
		gameRunner.run();

	}

}
