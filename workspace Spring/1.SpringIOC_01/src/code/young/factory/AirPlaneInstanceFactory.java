package code.young.factory;

import code.young.bean.AirPlane;
/**
 * 实例工厂
 * @author young
 *
 */
public class AirPlaneInstanceFactory {
	public  AirPlane  getAirPlane(String jzName){
		System.out.println("实例工厂被调用");
		AirPlane airPlane = new AirPlane();
		airPlane.setFdj("波音");
		airPlane.setJzName(jzName);
		airPlane.setPersonName(300);
		airPlane.setYc("4627");
		return airPlane;
	}
}
