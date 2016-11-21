package com.dao;

import java.util.List;

import com.data.ManualPointData;
import com.data.PointData;
import com.data.RoutePointData;
import com.data.SingleAFTPointData;

public interface TopoCommonMapper {
	
	/**
	 * 读取AFT信息
	 * @return List<RoutePointData>
	 */
	List<RoutePointData> GetRoutePoint();
	
	/**
	 * 获取完全匹配的CDP记录。
	匹配条件：
	 *  1.cdp_cache与interface b进行匹配本身端口
	 *  2.cdp_cache与interface c进行匹配目标节点，要求c节点不与当前cdp_cache相同，且端口工作，IP地址匹配cdp_cache.remote_ipaddr
	 *  3.cdp_cache与interface d进行匹配目标端口，要求d节点为c的节点，且d的端口名称或端口说明与cdp_cache.remote_ifname相等
	 * @return List<PointData>
	 */
	List<PointData> GetFullCDPPoint();
	
	/**
	 * 获取单方面匹配的CDP记录。
	 *  1.cdp_cache与interface b进行匹配本身端口
	 *  2.cdp_cache与interface c进行匹配目标节点，要求c节点不与当前cdp_cache相同，且端口工作，IP地址匹配cdp_cache.remote_ipaddr
	 *  3.cdp_cache与interface d进行过滤匹配，要求过滤可以匹配到端口名称或端口说明相符的记录。避免与GetFullCDPPoint获取出同样的记录
	 * @return List<PointData>
	 */
	List<PointData> GetSigleCDPPoint();
	
	/**
	 * 获取完全匹配的STP记录
	 *  1.bridge_stp_port a与interface b进行MAC地址匹配，以得到有效的stp记录
	 *	2.bridge_stp_port a与bridge_port_table c进行节点与端口比较，得到来源节点的Interface d信息
	 *	3.bridge_stp_port a与bridge_port_table d进行目标端口比较，得到目标节点的Interface e信息
	 * @return List<RoutePointData>
	 */
	List<RoutePointData> GetFullSTPPoint();
	
	/**
	 * 	获取单向STP记录
	 *  1.bridge_stp_port a与interface b进行MAC地址匹配，以得到有效的stp记录
	 *  2.bridge_stp_port a与bridge_port_table c进行节点与端口比较，得到来源节点的Interface d信息
	 *  3.无法通过bridge_port_table，定位到目标节点的stp线路信息
	 * @return List<RoutePointData>
	 */
	List<RoutePointData> GetSingleSTPPoint();
	
	/**
	 * 	获取完整的转发表记录
	 * 	1.bridge_fdb a与interface b进行匹配，得到源节点与源Interface
	 * 	2.bridge_fdb a与interface c进行目标MAC地址比较，得到目标节点，但目标端口不可信
	*/
//	void GetVirtualAFTPoint(); 缺少virtual_interface
	
	/**
	 * 	获取single的转发表记录
	 * 	1.bridge_fdb a与interface b进行匹配，得到源节点与源Interface
	 * 	2.bridge_fdb a与interface c进行目标MAC地址匹配过滤，避免得到完整的转发表记录与GetFullAFTPoint重复
	 * @return List<SingleAFTPointData>
	 */
	List<SingleAFTPointData> GetSingleAFTPoint();
	
	/**
	 * 隐藏线路将被视同手工线路 
	 * line where type = 3 or is_hide = 1
	 * @return List<ManualPointData>
	 */
	List<ManualPointData> GetManualPoint();
}