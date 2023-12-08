package lesson_3.seminar;

public class Main_6 implements AutoCloseable {
//    public class Counter implements AutoCloseable {
        private int count;
        public Main_6() {
            this.count = 0;
        }
        public void add() {
            count++;
        }
        public int getCount() {
            return count;
        }

        @Override
        public void close() {
            if (count > 0) {
                throw new IllegalStateException("Ресурс не был закрыт. Всего операций: " + count);
            }
        }

        public static void main(String[] args) {
            try (Main_6 counter = new Main_6()) {
                counter.add();
                System.out.println("Count: " + counter.getCount());
            } catch (IllegalStateException e) {
                System.out.println("Обработка исключения: " + e.getMessage());
            }
        }
//    }


}
