public class Outer_Demo {
    int num;

    //Creating an inner class
    private class Inner_Demo{
        public void print(){
            System.out.println("This is an inner class");
        }

    }

    //Accessing the inner class from a method within
    void display_Inner(){
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}
     class MyClass{
        public static void main(String[] args) {
            //Instantiating the Outer Class
            Outer_Demo outer = new Outer_Demo();

            //Accessing the display_Inner method
            outer.display_Inner();
        }

    }