package man.common;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import java.net.URL;

import java.util.Properties;

import javax.servlet.ServletContext;

public class ReadPropertyValue {

    InputStream inputStream;

    public String getPropertyValue(String path, String request) throws IOException {
        
        String reply = "";

        try {
            
            Properties prop = new Properties();
            inputStream =
                    this.getClass().getClassLoader().getResourceAsStream(path);

            if (inputStream != null) {
                prop.load(inputStream);
            } 
            else {
                throw new RuntimeException("property file '" + path +
                                           "' not found in the classpath");
            }

            reply = prop.getProperty(request);
            
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } 
        return reply;
    }
    
    public String getPropertyValueFromFile(String path, String request) throws IOException {
        
        String reply = "";

        try {
            
            Properties prop = new Properties();
            inputStream =
                    new FileInputStream(new File(path));;

            if (inputStream != null) {
                prop.load(inputStream);
            } 
            else {
                throw new RuntimeException("property file '" + path +
                                           "' not found in the classpath");
            }

            reply = prop.getProperty(request);
            
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } 
        return reply;
    }
    
}