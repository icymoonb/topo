package topo.utils;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class TopoUtils {
    public <T> void printList(List<T> object) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	if (object.size()==0) {
    		System.out.println("no records");
			return;
		}
    	Method[] methods = object.get(0).getClass().getMethods();
    	List<Method> methodList = new ArrayList<Method>();
    	for(Method method : methods){
    		if(method.getName().contains("get") && !method.getName().equals("getClass")
    				 && !method.getName().equals("getCallback")
    				 && !method.getName().equals("getCallbacks")){
    			methodList.add(method);
    		}
    	}
    	System.out.print("[");
    	for(int i = 0;i<methodList.size();i++){
    		System.out.print(methodList.get(i).getName().toString().replace("get", "")+", ");
    	}
    	System.out.println("]");
    	for(int i = 0;i<object.size();i++){
    		System.out.print("[");
    		for(int j = 0 ;j<methodList.size();j++){
    			System.out.print(methodList.get(j).invoke(object.get(i))+", ");
    		}
    		System.out.println("]");
    	}
    	
	}
    
    public SqlSession initSession(){  
        InputStream is;  
        try {  
            is = Resources.getResourceAsStream("sqlMapConfig.xml");  
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);    
            return sqlSessionFactory.openSession();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        return null;  
    }
}
