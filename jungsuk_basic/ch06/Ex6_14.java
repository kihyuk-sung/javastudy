package ch06;

class Ex6_14 {
	static {
		System.out.println("static { }");
	}
	{
		System.out.println("{ }");
	}
	public Ex6_14() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ex6_14 bt = new Ex6_14(); ");
		Ex6_14 bt = new Ex6_14();
		
		System.out.println("Ex6_14 bt2 = new Ex6_14(); ");
		Ex6_14 bt2 = new Ex6_14();
	}

}
