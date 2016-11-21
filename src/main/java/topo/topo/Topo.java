package topo.topo;

import java.lang.reflect.InvocationTargetException;

import org.apache.ibatis.session.SqlSession;

import com.dao.TopoCommonMapper;

import topo.utils.TopoUtils;

public class Topo {
	private static SqlSession session = null;
	private static TopoCommonMapper topoCommonMapper = null;
    public static void main( String[] args ) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    	TopoUtils topoUtils = new TopoUtils();
    	session = topoUtils.initSession();
    	topoCommonMapper = session.getMapper(TopoCommonMapper.class);
    	topoUtils.printList(topoCommonMapper.GetRoutePoint());
    }
}