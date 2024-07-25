/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dinhh
 */
import DuAn.dao.NhanVienDAOTest;
import DuAn.dao.NonDAOTest;
import org.junit.runner.Result;
import org.junit.runner.JUnitCore;
import org.junit.runner.notification.Failure;

public class TestRunner {

    public static void main(String[] args) {
        Result rs = JUnitCore.runClasses(SuiteAll.class);
        System.out.println("***");

        for (Failure failure : rs.getFailures()) {
            System.out.println("Failure: " + failure.toString());
        }
        System.out.println("Run tests count: " + rs.getRunCount());
        System.out.println("Failure count: " + rs.getFailureCount());
        System.out.println("Ignore count: " + rs.getIgnoreCount());
        System.out.println("Results of SuiteAll class == " + rs.wasSuccessful());
    }
}
