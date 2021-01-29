package org.khadija;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GestionDesPatientsApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(GestionDesPatientsApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("test case executing...");
		logger.info("test case executing with continue integration...");

		assertEquals(true, true);
	}

}
