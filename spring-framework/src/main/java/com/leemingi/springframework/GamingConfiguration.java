package com.leemingi.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.leemingi.springframework.game.GameRunner;
import com.leemingi.springframework.game.GamingConsole;
import com.leemingi.springframework.game.MarioGame;
import com.leemingi.springframework.game.PacMan;
import com.leemingi.springframework.game.SuperContraGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole marioGame() {
		return new MarioGame();
	}
	
	@Bean(name = "a")
	public GamingConsole superContraGame() {
		return new SuperContraGame();
	}
	
	@Bean
	public GamingConsole pacMan() {
		return new PacMan();
	}
	
	@Bean
	public GameRunner gameRunner1() {
		return new GameRunner(marioGame());
	}
	
	@Bean
	public GameRunner gameRunner2() {
		return new GameRunner(superContraGame());
	}
	
	
	@Bean
	public GameRunner gameRunner3() {
		return new GameRunner(pacMan());
	}
	

}
