public class ThreadInheritanceRannable implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadInheritanceRannable rannabele1 = new ThreadInheritanceRannable();
        ThreadInheritanceRannable rannabele2 = new ThreadInheritanceRannable();
        ThreadInheritanceRannable rannabele3 = new ThreadInheritanceRannable();

        Thread threadRunnable1 = new Thread(rannabele1);
        Thread threadRunnable2 = new Thread(rannabele2);
        Thread threadRunnable3 = new Thread(rannabele3);

        threadRunnable1.start();
        threadRunnable2.start();
        threadRunnable3.start();
    }
}
