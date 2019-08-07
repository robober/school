package org.school.eltex.tags;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages("org.school.eltex.tags")
@IncludeTags("UnitTest")
public class EmployeeDAOTestSuite {
}
