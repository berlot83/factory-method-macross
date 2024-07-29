package com.macross.factories;

import com.macross.models.Flagship;
import com.macross.models.Starship;

public class ZentraediCreator extends StarshipCreator {

	@Override
	public Starship createStarship() {
		return new Flagship();
	}

}
