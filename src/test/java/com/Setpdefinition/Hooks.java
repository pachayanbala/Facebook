package com.Setpdefinition;

import com.ReusableMethod.Commonactions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Commonactions {
	Commonactions c = new Commonactions();
	@Before
	public void launch() {
		c.browserlaunch();
	}
@After
public void exit() {
	c.close();
}
}
