package de.itteerde.foh.engine.persistence;

import de.itteerde.foh.engine.model.World;

public interface Persistence {

	public World load();

	public void save(World world);
}
