package jaf.theorie.inheritance.interfaces;

interface Father {
    void babysit();
}

interface Teacher {
    void teach();
    default void sleep() {
        System.out.println("Teacher is Sleep");
    }
}

interface FatherAndTeacher extends Father, Teacher {

}

class Bob implements FatherAndTeacher {
    public void babysit() {
        System.out.println("Babysit");
    }

    public void teach() {
        System.out.println("Teach");
    }
}

class John implements FatherAndTeacher {
    public void babysit() {
        System.out.println("Babysit");
    }
    public void teach() {
    }
    @Override
    public void sleep() {
        System.out.println("John is Sleep");
    }

}

class Werner implements Teacher {
    public void teach() {
        System.out.println("Teach");
    }
}

class Main {
    public static void main(String[] args) {
        Bob bob = new Bob();
        bob.babysit();
        bob.teach();
        bob.sleep();
        Werner werner = new Werner();
        werner.teach();
        isSuperDaddy(bob);
        John john;
        john = new John();
        john.sleep();
        isSuperDaddy(new John());
    }

    private static void isSuperDaddy(FatherAndTeacher superDaddy) {
        superDaddy.babysit();
        superDaddy.teach();
    }
}