package com.superxu.autowiring;

public class AutowiringService {

	private AutowiringDao autowiringDao;

	
	
	public AutowiringService(AutowiringDao autowiringDao) {
		this.autowiringDao = autowiringDao;
	}

	public void setAutowiringDao(AutowiringDao autowiringDao) {
		this.autowiringDao = autowiringDao;
	}
	
	public void say(String arg) {
		autowiringDao.say(arg);
	}
}
