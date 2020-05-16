package code.young.factory;

import code.young.bean.AirPlane;
/**
 * 静态工厂
 * @author young
 *
 */
public class AirPlaneStaticFactory {
	public static AirPlane  getAirPlane(String jzName){
		System.out.println("静态工厂被调用");
		AirPlane airPlane = new AirPlane();
		airPlane.setFdj("波音");
		airPlane.setJzName(jzName);
		airPlane.setPersonName(300);
		airPlane.setYc("4627");
		return airPlane;
	}
}
