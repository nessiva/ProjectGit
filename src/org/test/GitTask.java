package org.test;

public class GitTask {
	
	private void gitPush() {
	int a=10;
	int a1=20;
	int  c=a+a1;
	
		System.out.println("GITPUSH"+c);
	}
	
	private void gitPull() {
		int b = 20;
		int b1 =20;
		int c1=b-b1;
		
		System.out.println("GITPULLL"+c1);
	}
	
	private void sivaPush() {
		System.out.println("Success");
	}
	
	public static void main(String[] args) {
		
		GitTask git = new GitTask();
		git.gitPush();
		git.gitPull();
		
	}
	

}
