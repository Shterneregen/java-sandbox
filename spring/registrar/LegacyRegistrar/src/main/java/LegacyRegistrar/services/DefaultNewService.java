package LegacyRegistrar.services;

import LegacyRegistrar.Legacy;
import LegacyRegistrar.legacy.LegacyService;
import org.springframework.beans.factory.annotation.Autowired;

public class DefaultNewService implements NewService {

	@Legacy
	@Autowired
	private LegacyService legacyService;

	@Override
	public void doWork() {
		legacyService.doWork();
	}
}
