package Test;

public class StringBufferandBuilder {
	public static void main(String[] args) {
		
		String s=new String("Velocity");//mutable
		
		StringBuffer sb =new StringBuffer("Katraj");//mutable
		
		StringBuilder sbb =new StringBuilder("Pune");//imutable
		
		s.concat("Pune");
		
		sb.append(" Pune");
		
		sbb.append("Maherashtra");
		
		System.out.println(s);//Velocity
		
		System.out.println(sb);
		
		System.out.println(sbb);
		
		sb.reverse();
		
		System.out.println(sb);
		sbb.reverse();
		System.out.println(sb);
		sb.append("mahendra");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sbb.reverse();
		System.out.println(sbb);
		sbb.append(" Mahi");
		System.out.println(sbb);
		sbb.reverse();
		
	}

}
