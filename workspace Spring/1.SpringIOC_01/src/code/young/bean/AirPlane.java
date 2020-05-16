package code.young.bean;

public class AirPlane {
	@Override
	public String toString() {
		return "AirPlane [fdj=" + fdj + ", yc=" + yc + ", personName="
				+ personName + ", jzName=" + jzName + "]";
	}
	private String fdj;
	private String yc;
	private Integer personName;
	private String jzName;
	public String getFdj() {
		return fdj;
	}
	public void setFdj(String fdj) {
		this.fdj = fdj;
	}
	public String getYc() {
		return yc;
	}
	public void setYc(String yc) {
		this.yc = yc;
	}
	public Integer getPersonName() {
		return personName;
	}
	public void setPersonName(Integer personName) {
		this.personName = personName;
	}
	public String getJzName() {
		return jzName;
	}
	public void setJzName(String jzName) {
		this.jzName = jzName;
	}
}
