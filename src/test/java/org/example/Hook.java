//package org.example;
//import io.cucumber.java.After;
//import io.cucumber.java.AfterAll;
//import io.cucumber.java.BeforeAll;
//public class Hook {
//
//    @BeforeAll
//    public static void initConnection() {
//        ScenarioContext.setConnection(DbConfig.getConnection());
//    }
//
//    @After(value = "@JDBC or @UI", order = 20)
//    public void restoreDB() {
//
//        ScenarioContext.clearContext();
//        try (PreparedStatement pr = ScenarioContext.getConnection().prepareStatement(
//                "DELETE FROM FOOD " +
//                        "WHERE FOOD_ID = ( " +
//                        "    SELECT MAX(FOOD_ID) " +
//                        "    FROM FOOD " +
//                        "    WHERE FOOD_NAME = ? " +
//                        ")"
//        )) {
//            pr.setString(1, scenarioContext.getName());
//            pr.execute();
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    @AfterAll
//    public static void afterAll() {
//        DbConfig.closeConnection(ScenarioContext.getConnection());
//    }
//}
