package com.macross.factories;

import com.macross.models.Starship;
import com.macross.models.Varitech;

public class MacrossCreator extends StarshipCreator {

	@Override
	public Starship createStarship() {
		return new Varitech();
	}

}
