package Java_Assignments;

abstract class AnonymousInnerClass {

	public abstract void display();

public static void main(String[] args) {
AnonymousInnerClass i = new AnonymousInnerClass() {

         public void display() {
            System.out.println("Anonymous Inner Class");
         }
      };
      i.display();
   }
}
