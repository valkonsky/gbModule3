public class Main {
    private static final Object obj = new Object();
    private static volatile char currentLetter = 'A';
    private Object object = new Object();

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        Thread first = new Thread(() -> {
            main.printA();
        });
        Thread second = new Thread(() -> {
            main.printB();
        });
        Thread third = new Thread(() -> {
            main.printC();
        });
        first.start();
        second.start();
        third.start();
    }

    private void printA() {
        synchronized (obj){
            try{
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'A') {
                        obj.wait();
                    }
                    System.out.print("A");
                    currentLetter='B';
                    obj.notifyAll();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }    private void printB() {
        synchronized (obj){
            try{
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'B') {
                        obj.wait();
                    }
                    System.out.print("B");
                    currentLetter='C';
                    obj.notifyAll();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }   private void printC() {
        synchronized (obj){
            try{
                for (int i = 0; i < 5; i++) {
                    while (currentLetter != 'C') {
                        obj.wait();
                    }
                    System.out.print("C");
                    currentLetter='A';
                    obj.notifyAll();
                }
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
