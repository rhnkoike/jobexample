// package org.acme.getting.started;

// import java.sql.Connection;
// import java.sql.SQLException;

// import javax.enterprise.context.ApplicationScoped;
// import javax.inject.Inject;
// import javax.sql.DataSource;
// import javax.transaction.Transactional;
// import javax.transaction.Transactional.TxType;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

// @ApplicationScoped
// public class HelloLogic {

// 	static final Logger LOGGER = LoggerFactory.getLogger(HelloLogic.class);

// 	@Inject
// 	DataSource ds;

// 	@Transactional(TxType.REQUIRES_NEW)
// 	public void test() {
// 		try {
// 			Connection con = ds.getConnection();
// 		// try(Connection con = ds.getConnection()){
// 			LOGGER.info("ProductName: {}", con.getMetaData().getDatabaseProductName());
// 		} catch (SQLException e) {
// 			e.printStackTrace();
// 		}
// //		try (Connection con = ds.getConnection()) {
// //			LOGGER.info("ProductName: {}", con.getMetaData().getDatabaseProductName());
// //		} catch (SQLException e) {
// //			e.printStackTrace();
// //		}
// 	}

// }
