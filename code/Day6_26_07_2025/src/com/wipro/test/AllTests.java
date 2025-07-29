package com.wipro.test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
//@SelectPackages({"com.wipro.solid", "com.wipro.test"})
@SelectClasses(CalcTest.class)
public class AllTests {

}
