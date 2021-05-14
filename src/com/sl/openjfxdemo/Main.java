package com.sl.openjfxdemo;

import javafx.application.*;
import javafx.stage.*;

public class Main extends Application {

	public void start(Stage s) {
		s.setMaxWidth(800);
		s.setMaxHeight(600);
		s.setTitle("Hello Open JFX");
		s.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
}
