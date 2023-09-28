package InterfaceAndFactoryObject;

import java.beans.PropertyEditor;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    // Read properties from an input stream
    private static Properties _getProperties(InputStream is) throws Exception
    {
        Properties prop = new Properties();
        prop.load(is);
        return prop;
    }

    public static Properties getProperties(String filename)
    {
        // get a FileInputStream and read props
        try(FileInputStream fis = new FileInputStream(filename))
        {
            return _getProperties(fis);
        }
        catch(Exception e)
        {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

}
