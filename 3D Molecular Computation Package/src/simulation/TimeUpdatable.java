package simulation;

import java.math.BigDecimal;

public interface TimeUpdatable extends Updatable{
	public void update(BigDecimal milliseconds);
}
