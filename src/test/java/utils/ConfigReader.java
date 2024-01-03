//package utils;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class ConfigReader {
//
//	public static Properties prop;
//
//	static {
//        try {
//			intializeProperties();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//    }
//	
//	public static void intializeProperties() throws IOException {
//
//		prop=new Properties();
//		String filePath = new File("src/test/resources/config/config.properties").getAbsolutePath();
//		FileInputStream fis= new FileInputStream(filePath);
//		prop.load(fis);
//
//	}
//
//	public static String getProperty(String key) {
//		return prop.getProperty(key);
//	}
//
//}
