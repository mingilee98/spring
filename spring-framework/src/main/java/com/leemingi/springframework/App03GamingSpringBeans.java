package com.leemingi.springframework;

import com.leemingi.springframework.game.MarioGame;
import com.leemingi.springframework.game.PacMan;
import com.leemingi.springframework.game.SuperContraGame;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.leemingi.springframework.game.GameRunner;
import com.leemingi.springframework.game.GamingConsole;

public class App03GamingSpringBeans {

	public static void main(String[] args) {
		// launch a context
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(MarioGame.class).up();
			
			context.getBean("a", GamingConsole.class).up();
		}
	}

}

