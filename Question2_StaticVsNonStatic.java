public class Question2_StaticVsNonStatic {

    static void staticMethod() {
        System.out.println("This is a static method");
    }

    void nonStaticMethod() {
        System.out.println("This is a non-static method");
    }

    public static void main(String[] args) {
        staticMethod();

        Question2_StaticVsNonStatic obj = new Question2_StaticVsNonStatic();
        obj.nonStaticMethod();
    }
}
