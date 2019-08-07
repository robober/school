package org.school.eltex.example;

import org.junit.Ignore;
import org.school.eltex.junit.tags.example.Employee;
import org.school.eltex.junit.tags.example.EmployeeDAO;
import org.school.eltex.junit.tags.example.SpringJdbcConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringJdbcConfig.class }, loader = AnnotationConfigContextLoader.class)
public class EmployeeDAOIntegrationTest {

    @Autowired
    private EmployeeDAO employeeDao;

    @Test
//    @Ignore
    public void testQueryMethod() {
        Assert.assertEquals(employeeDao.getAllEmployees().size(), 4);
    }

    @Test
//    @Ignore
    public void testUpdateMethod() {
        Assert.assertEquals(employeeDao.addEmplyee(6), 1);
    }

    @Test
//    @Ignore
    public void testAddEmployeeUsingSimpelJdbcInsert() {
        final Employee emp = new Employee();
        emp.setId(11);
        emp.setFirstName("testFirstName");
        emp.setLastName("testLastName");
        emp.setAddress("testAddress");

        Assert.assertEquals(employeeDao.addEmplyeeUsingSimpelJdbcInsert(emp), 1);
    }
}
