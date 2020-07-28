public class ThreadInheritanceRannable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadInheritanceRannable runnable1 = new ThreadInheritanceRannable();
        ThreadInheritanceRannable runnable2 = new ThreadInheritanceRannable();
        ThreadInheritanceRannable runnable3 = new ThreadInheritanceRannable();

        Thread threadRunnable1 = new Thread(runnable1);
        Thread threadRunnable2 = new Thread(runnable2);
        Thread threadRunnable3 = new Thread(runnable3);

        threadRunnable1.start();
        threadRunnable2.start();
        threadRunnable3.start();
    }
}
