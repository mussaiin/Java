class Hello {
	public static void main(String [] args){
//		System.out.print("Hello! ");
		int a = 19;
		String b = "sometext";
		a = 20;
/*
		System.out.println(a+" - "+b);
		System.out.printf("%d - %s",a,b);

		if(a<18){System.out.println("Bye![1]");}
		else if(a<45 || b=="sometext"){System.out.println("Bye![2]");}
		else{System.out.print("Bye![3]");}

		for (int i=0; i<101; i+=7){
			System.out.println(i);
		}
		int c=100;
		while(c>=0){
			System.out.println(c);
			c-=5;
		}
*/
		System.out.println(1);
		System.out.println(2);
		for(int i=2; i<=1000; i++){
			for(int j=2; j<=i; j++){
				if(i%j==0){
					break;
				}
			}
		System.out.println(i);
		}
	}
}
