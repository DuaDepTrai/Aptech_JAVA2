/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise.Ex_241202;

/**
 *
 * @author Admin
 */
class DeadlockExample {
    static class Resource {
        synchronized void methodA(Resource other) {
            System.out.println(Thread.currentThread().getName() + " locked methodA");
            other.methodB();
        }
        
        synchronized void methodB() {
            System.out.println(Thread.currentThread().getName() + " locked methodB");
        }
    }
    
    public static void main(String[] args) {
        Resource res1 = new Resource();
        Resource res2 = new Resource();
        
        Thread t1 = new Thread(() -> res1.methodA(res2), "Thread-1");
        Thread t2 = new Thread(() -> res2.methodA(res1), "Thread-2");
        
        t1.start();
        t2.start();
    }
}
