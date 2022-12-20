class A extends Thread {
    public static void main(String[] args) {
        A thread = new A();
        thread.start();
    }

    public void run() {
        System.out.println("Running inside thread via Thread class extension/inheritance.");
    }
}

/* 

class B implements Runnable {
    public static void main(String[] args) {
        B t = new B();
        Thread obj = new Thread(t);
        obj.start();
    }

    public void run() {
        System.out.println("Running inside thread via Runnable Interface.");
    }
}

*/