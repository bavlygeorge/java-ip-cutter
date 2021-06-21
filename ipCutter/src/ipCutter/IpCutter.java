package ipCutter;

public class IpCutter {
	public String IP;

	public IpCutter() {
		super();
	}
	
	public IpCutter(String iP) {
		super();
		IP = iP;
	}

	public String getIP() {
		return IP;
	}

	public void setIP(String iP) {
		IP = iP;
	}
	
	public int[] cutIp() {
		int[] result = new int[4];
		String[] cuttedIp = this.IP.split("\\.");
		if(cuttedIp.length == 4) {
			for(int i=0; i<cuttedIp.length; i++) {
				result[i] = Integer.parseInt(cuttedIp[i]);
			}
		}
		return result;
	}
}
