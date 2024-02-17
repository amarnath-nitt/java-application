package collections.map.hashcodeequals;

import java.util.*;


public class HashCodeEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Pen p1 = new Pen(10, "blue");
        Pen p2 = new Pen(10, "Red");
        
        System.out.println(p1.equals(p2));
        
        Set<Pen> st = new HashSet<>();
        st.add(p1);
        st.add(p2);
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
	}

}
class Pen{
	String color;
	int price;
	
	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		Pen that = (Pen) obj;
//		boolean isEqual = this.price ==that.price && 
//				          this.color == that.color;
//		return isEqual;
//	}
//	
//  @Override	
//	public int hashCode() {
//		return price + color.hashCode();
//	}
	
	
	
}
