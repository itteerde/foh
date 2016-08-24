package de.itteerde.foh.api;

import java.util.Collection;

public interface Decission {

	public Collection<Alternative> getAlternatives();

	public Alternative getDefaultAlternative();

	public Date getDeadline();
}
