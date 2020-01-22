package sample.jakartaee.service;

import java.util.logging.Logger;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Startup
@Singleton
public class SimpleTimer {

    private static Logger logger = Logger.getLogger(SimpleTimer.class.getCanonicalName());

    @Schedule(hour = "*", minute = "*", second = "*/5", info = "Every 5 second timer", timezone = "UTC")
    public void ping() {
        logger.info("pong!");
    }
}