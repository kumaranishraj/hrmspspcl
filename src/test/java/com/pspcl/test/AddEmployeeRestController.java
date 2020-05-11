package com.pspcl.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.UnsupportedEncodingException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.pspcl.HrmspspclApplication;

@SpringBootTest(webEnvironment = WebEnvironment.MOCK)
@AutoConfigureMockMvc
@TestPropertySource("classpath:application-test.properties")
public class AddEmployeeRestController {
	private static final Logger LOGGER = LogManager.getLogger(HrmspspclApplication.class);
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void testSave() {
		MvcResult result = null;
		MockHttpServletRequestBuilder request = MockMvcRequestBuilders
				.post("/employees/addemployee")
				.contentType(MediaType.APPLICATION_JSON)
				.content("{\"name\":\"Anish\",\"email\":\"anish@gmail.com\",\"mobile\":9999999999,\"dob\":\"29/04/2020\",\"address\":\"Izzath Nagar\",\"city\":\"Hyderabad\",\"state\":\"Telangana\",\"postalCode\":\"500084\"}");
				try {
					 result = mockMvc.perform(request).andReturn();
				} catch (Exception e) {
					LOGGER.error(e);
					//e.printStackTrace();
				}
				MockHttpServletResponse resp=result.getResponse();
				assertEquals(200, resp.getStatus());
				try {
					if(!resp.getContentAsString().contains("saved")) {
						LOGGER.error("Data is Not Saved");
						fail("Data is Not Saved");
					}
				} catch (UnsupportedEncodingException e) {
					LOGGER.error(e);
					//e.printStackTrace();
				}
	}
}
