package test;

import ipCutter.IpCutter;

public class Test {
	
	public static void main(String[] args) {
		String ip = "192.168.42.11";
		IpCutter ipCut = new IpCutter(ip);
		int[] res = ipCut.cutIp();
		for(int val: res) {
			System.out.println(val);
		}
	}
	
}
