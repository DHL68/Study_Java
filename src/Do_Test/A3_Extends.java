package Do_Test;

class Animal3 {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Dog3 extends Animal3 {
    void sleep() {
        System.out.println(this.name+" zzz");
    }
}

public class A3_Extends {

	public static void main(String[] args) {

        Dog3 dog = new Dog3();
        dog.setName("poppy");
        System.out.println(dog.name);  // poppy 출력
        dog.sleep();  // poppy zzz 출력
	}

}
