package com.macross.models;
import static com.macross.utils.Logger.log;

public class Flagship implements Starship {

	@Override
	public void fly() {
		log("Fly longerwith Zentraedis");
	}

}
