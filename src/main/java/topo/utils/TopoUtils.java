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

import com.pojo.Node;

public class TopoUtils {
	public <T> void printList(List<T> object)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		if (object.size() == 0) {
			System.out.println("no records");
			return;
		}
		Method[] methods = object.get(0).getClass().getMethods();
		List<Method> methodList = new ArrayList<Method>();
		for (Method method : methods) {
			if (method.getName().contains("get") && !method.getName().equals("getClass")
					&& !method.getName().equals("getCallback") && !method.getName().equals("getCallbacks")) {
				methodList.add(method);
			}
		}
		System.out.print("[");
		for (int i = 0; i < methodList.size(); i++) {
			System.out.print(methodList.get(i).getName().toString().replace("get", "") + ", ");
		}
		System.out.println("]");
		for (int i = 0; i < object.size(); i++) {
			System.out.print("[");
			for (int j = 0; j < methodList.size(); j++) {
				System.out.print(methodList.get(j).invoke(object.get(i)) + ", ");
			}
			System.out.println("]");
		}
	}
    
	/**
	 * 用于打印object对象，把object类型转化为String类型
	 * @param object
	 * @return
	 */
	public String logPrintObject(Object object) {
		StringBuilder result = new StringBuilder();
		Method[] methods = object.getClass().getMethods();
		List<Method> methodList = new ArrayList<Method>();
		for (Method method : methods) {
			if (method.getName().contains("get") && !method.getName().equals("getClass")
					&& !method.getName().equals("getCallback") && !method.getName().equals("getCallbacks")) {
				methodList.add(method);
			}
		}
		result.append(" [");
		result.append(methodList.get(0).getName().toString().replace("get", ""));
		for (int i = 1; i < methodList.size(); i++) {
			result.append(", " + methodList.get(i).getName().toString().replace("get", ""));
		}
		result.append("] \n [");
		try {
			result.append(methodList.get(0).invoke(object));
			for (int j = 1; j < methodList.size(); j++) {
				result.append(", " + methodList.get(j).invoke(object));
			}
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		result.append("] ");
		return result.toString();
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
    /**
     * 对比两个Node集合大小的工具类
     * @param value1
     * @param value2
     * @return
     */
    boolean NodeCollectionCompare(List<Node> value1, List<Node> value2)
    {
    	return value1.size() > value2.size();
    }
}
