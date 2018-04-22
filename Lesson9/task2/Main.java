public class Main {
    public static void main(String[] args) {
        ClassPackageFirstClassFirst classPackageFirstClassFirst = new ClassPackageFirstClassFirst();
        System.out.println(classPackageFirstClassFirst.variablePublic);
        System.out.println(classPackageFirstClassFirst.variableDefault);

        classPackageFirstClassFirst.methodPublic();
        classPackageFirstClassFirst.methodDefault();

    }
}
