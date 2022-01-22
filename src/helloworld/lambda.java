package helloworld;

@FunctionalInterface
interface mycode{
	public void exe();
}

@FunctionalInterface
interface dee{
	public int sum2(int a,int b);
}

@FunctionalInterface
interface eo{
	public String evod(int a);
}

@FunctionalInterface
interface PN{
	public String pone(int a);
}

@FunctionalInterface
interface up{
	public String uppercs(String a);
}

public class lambda {
	public static void main(String args[]) {
		
		
		mycode code = () -> System.out.println("hi");
		code.exe();
		
//----------------------------------------------------------------------------------------------------
		dee code1 = ( a,b) ->  (a+b) ;
		System.out.println(code1.sum2(5, 7));
		
//----------------------------------------------------------------------------------------------------		
		eo code2 = (a) -> {
			if(a%2==0){
			return "Even";
		}
			else {
				return "odd";
			}
		};
		
		System.out.println(code2.evod(4));
		
		
//---------------------------------------------------------------------------------------------------		
		PN code3 = (a) -> {
			if(a>=0){
			return "Positive";
		}
			else {
				return "Negative";
			}
		};
		
		System.out.println(code3.pone(-9));
		
		
		
//---------------------------------------------------------------------------------------------------
		
		up code4 = (a) -> a.toUpperCase();
		System.out.println(code4.uppercs("jami"));
		
		
		
		
	}

}
