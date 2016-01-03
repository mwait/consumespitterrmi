package com.wait.consume;

import spittr.Spitter;

public interface SpitterRepository {

	Spitter save (Spitter spitter);
	Spitter findByUsername(String username);
}
