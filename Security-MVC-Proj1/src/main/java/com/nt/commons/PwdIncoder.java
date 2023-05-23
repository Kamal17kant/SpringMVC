package com.nt.commons;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PwdIncoder {
	public static void main(String[] args ) {
		BCryptPasswordEncoder encode=new BCryptPasswordEncoder();
		String pas1=encode.encode("rani");
		String pas2=encode.encode("hyd");
		String pas3=encode.encode("patna");
		String pas4=encode.encode("delhi");
		System.out.println(pas1);
		System.out.println(pas2);
		System.out.println(pas3);
		System.out.println(pas4);
	}

}
