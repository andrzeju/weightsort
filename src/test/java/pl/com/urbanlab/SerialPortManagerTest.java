package pl.com.urbanlab;

import org.junit.Test;
import org.springframework.test.annotation.SystemProfileValueSource;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 01.02.17.
 */
public class SerialPortManagerTest {

    @Test
    public void testPortInfo() {
        //cannot test windows rxtx implementation on linux - installing linux distribution
        System.out.println("Path: " + System.getProperty("java.library.path"));
        System.out.println(new SerialPortManager().getPortInfo());
    }
}