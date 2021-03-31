package JavaCollectionFramework.ArrayList.GenericType.GenericPair;

public class Pair<X,Y> {
 X x; Y y;
 public Pair(X x, Y y) {
	 this.x = x;
	 this.y = y;
 }
 
 public void getDetails() {
	 System.out.println("Pair is < "+ x + " , "+ y + " >." );
 }
}
