/*
 * <copyright>
 *
 * Copyright (c) 2010-2017 Gresham Technologies plc. All rights reserved.
 *
 * </copyright>
 */
package hello;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

/**
 * @author dkimber
 */
public class GreeterTest {

    private Greeter greeter = new Greeter();

    @Test
    public void greeterSayHello() {
        assertThat(greeter.sayHello(), containsString("Hello"));
    }
}
