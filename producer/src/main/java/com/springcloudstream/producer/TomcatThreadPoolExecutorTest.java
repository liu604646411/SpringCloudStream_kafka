package com.springcloudstream.producer;

import org.apache.tomcat.util.threads.TaskQueue;
import org.apache.tomcat.util.threads.TaskThreadFactory;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;

import java.util.concurrent.TimeUnit;

public class TomcatThreadPoolExecutorTest {

    public static void main(String[] args) throws InterruptedException {
        String namePrefix = "歪歪歪-exec-";
        boolean daemon = true;
        TaskQueue taskqueue = new TaskQueue(300);
        TaskThreadFactory tf = new TaskThreadFactory(namePrefix, daemon, Thread.NORM_PRIORITY);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5,
                150, 60000, TimeUnit.MILLISECONDS, taskqueue, tf);
        // 当你把 taskqueue.setParent(executor) 这行代码注释掉的时候，它的运行机制就是 JDK 的线程池。
        // 当存在这行代码的时候，它的运行机制就变成了 Tomcat 的线程池。
        taskqueue.setParent(executor);
        for (int i = 0; i < 300; i++) {
            try {
                executor.execute(() -> {
                    logStatus(executor, "创建任务");
                    try {
                        TimeUnit.SECONDS.sleep(2);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                });
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Thread.currentThread().join();
    }

    private static void logStatus(ThreadPoolExecutor executor, String name) {
        TaskQueue queue = (TaskQueue) executor.getQueue();
        System.out.println(Thread.currentThread().getName() + "-" + name + "-:" +
                "核心线程数:" + executor.getCorePoolSize() +
                "\t活动线程数:" + executor.getActiveCount() +
                "\t最大线程数:" + executor.getMaximumPoolSize() +
                "\t总任务数:" + executor.getTaskCount() +
                "\t当前排队线程数:" + queue.size() +
                "\t队列剩余大小:" + queue.remainingCapacity());
    }

}
