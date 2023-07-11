package fitnessCenter;

class Member {
	public String ID;
	public String name;
	public String area;
	
	public String getID() {
		return ID;
	}
	public String getName() {
		return name;
	}
	public String getArea() {
		return area;
	}
	
	public void setID(String iD) {
		ID = iD;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}


	public void setArea(String area) {
		this.area = area;
	}

	public Member(String iD, String name, String area) {
		ID = iD;
		this.name = name;
		this.area = area;
	}

}
class VIP {
	public String vipID;
	public String vipname;
	public String viparea;
	public int vipPT;
	
	public String getVipID() {
		return vipID;
	}
	public String getVipName() {
		return vipname;
	}
	public String getVipArea() {
		return viparea;
	}
	public int getVipPT() {
		return vipPT;
	}
	public void setVipID(String vipID) {
		this.vipID = vipID;
	}
	public void setVipName(String vipname) {
		this.vipname = vipname;
	}
	public void setVipArea(String viparea) {
		this.viparea = viparea;
	}
	public void setVipArea(int vipPT) {
		this.vipPT = vipPT;
	}
	public VIP(String vipiD, String vipname, String viparea, int vipPT) {
		vipID = vipiD;
		this.vipname = vipname;
		this.viparea = viparea;
		this.vipPT = vipPT;
	}
}
