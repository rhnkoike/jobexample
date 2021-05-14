// package org.acme.getting.started;

// import javax.inject.Inject;
// import javax.ws.rs.GET;
// import javax.ws.rs.Path;
// import javax.ws.rs.Produces;
// import javax.ws.rs.core.MediaType;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// @Path("/hello")
// public class HelloResource {

// 	static final Logger LOGGER = LoggerFactory.getLogger(HelloResource.class);

// 	@Inject
// 	HelloLogic logic;

// 	@GET
// 	@Produces(MediaType.TEXT_PLAIN)
// 	public String hello() {
// 		LOGGER.info("HELLO!!!");
// 		logic.test();
// 		return "hello";
// 	}
// }