package pl.com.urbanlab;

import gnu.io.CommPortIdentifier;

import java.util.Enumeration;

/**
 * Created by andrzej on 01.02.17.
 */
public class SerialPortManager {

    public String getPortInfo() {
        Enumeration ports = CommPortIdentifier.getPortIdentifiers();
        System.out.println("Ports: " + ports);
        String portsInfo = "";
        while (ports.hasMoreElements()) {
            String portId = ((CommPortIdentifier) ports.nextElement()).getName();
            portsInfo += portId + ",";
        }
        return portsInfo;
    }
}
