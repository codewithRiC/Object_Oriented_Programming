public class thread2 {
    public static void main(String[] args) {
        final Thread thread1 = new Thread(new Task("Task 1"));
        final Thread thread2 = new Thread(new Task("Task 2"));

        thread1.start();
        thread2.start();
    }

    private static class Task implements Runnable {
        private final String taskName;
        private static int counter = 0;

        public Task(String name) {
            this.taskName = name;
        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(taskName + " count: " + counter++);
            }
        }
    }
}

