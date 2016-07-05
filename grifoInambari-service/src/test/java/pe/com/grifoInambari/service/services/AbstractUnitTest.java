package pe.com.grifoInambari.service.services;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public class AbstractUnitTest extends
		AbstractTransactionalDataSourceSpringContextTests {

	@Override
	protected String[] getConfigLocations() {
		setPopulateProtectedVariables(true);
		setAutowireMode(AUTOWIRE_BY_TYPE);
		return new String[] {
				"pe/com/grifoInambari/core/config/application-config.xml",
				"pe/com/grifoInambari/core/config/applicationContext-dao.xml",
				"pe/com/grifoInambari/service/config/applicationContext-service.xml"
			};
	}

	public void testApp() {
		assertTrue(true);
		
	}

}
