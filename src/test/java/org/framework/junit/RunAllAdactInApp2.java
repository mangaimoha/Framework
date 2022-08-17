package org.framework.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//test suite
@RunWith(Suite.class)
@SuiteClasses({SearchHotelTC.class, BookHotelTC.class})
public class RunAllAdactInApp2 {

}
