class CC5 implements Runnable{
    public void run()
    {
       lock();
    }
    public void lock()
    {
        System.out.println(Thread.currentThread().getName());
        synchronized (CC5.class)
        {
            System.out.println(" In block " + Thread.currentThread().getName());
            System.out.println(" In block " + Thread.currentThread().getName() + " End ");
        }
    }
    public static void main(String[] args) {
        CC5 l =new CC5();
        Thread t1 = new Thread(l);
        Thread t2 = new Thread(l);
        CC5 ll = new CC5();
        Thread t3 = new Thread(ll);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}