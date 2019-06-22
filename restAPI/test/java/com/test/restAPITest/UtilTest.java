/**
 * 
 */
package com.test.restAPITest;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.prakash.rest.util.URLBuilder;

/**
 * @author prakashsrirangaswamy
 *
 */
class UtilTest {

	@Test
	void test() {
		
		URLBuilder url = new URLBuilder();
		
		assertEquals("https://maps.googleapis.com/maps/api/geocode/json?address=78230",url.buildURLForZip(78230));
		
		
	}

}
