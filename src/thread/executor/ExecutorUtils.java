package thread.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

import static util.MyLogger.log;

public abstract class ExecutorUtils {

    public static void printState(ExecutorService executorService) {
        if (executorService instanceof ThreadPoolExecutor poolExecutor) {
            int pool = poolExecutor.getLargestPoolSize();
            int active = poolExecutor.getActiveCount();
            int queuedTask = poolExecutor.getQueue().size();
            long completedTask = poolExecutor.getCompletedTaskCount();

            log("[pool=" + pool + ", active=" + active +  ", queuedTask=" + queuedTask +
                    ", completedTask=" + completedTask + "]");
        } else {
            log(executorService);
        }
    }
}