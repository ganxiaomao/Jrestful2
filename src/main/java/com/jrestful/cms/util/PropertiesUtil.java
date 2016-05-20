package com.jrestful.cms.util;

import java.io.IOException;
import java.util.Properties; 

/**
  * @ClassName: PropertiesUtil
  * @Description: TODO
  * @author cydyhty
  * @date 2015年9月16日 下午3:35:13
  *
 */
public class PropertiesUtil { 
   
	private static Properties p = new Properties();  
	  
    /** 
     * 读取properties配置文件信息 
     */  
    static{  
        try {  
            p.load(PropertiesUtil.class.getClassLoader().getResourceAsStream("config.properties"));  
        } catch (IOException e) {  
            e.printStackTrace();   
        }  
    }  
    /** 
     * 根据key得到value的值 
     */  
    public static String getValue(String key)  
    {  
        return p.getProperty(key);  
    }     
    
}
