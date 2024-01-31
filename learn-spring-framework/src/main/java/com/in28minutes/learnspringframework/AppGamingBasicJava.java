package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PocManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();		
		//var game = new SuperContraGame();
		var game = new PocManGame();
		
		
		var gameRunner = new GameRunner(game);
		gameRunner.run();
	}

}
