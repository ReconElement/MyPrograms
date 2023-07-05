public class multi {
    int x = 10;

    public class max {
        int j = 10;

        public static void main(String[] args) {
            multi obj = new multi();
            multi.max obj1 = obj.new max();
            System.out.println(obj1.j + obj.x);

        }
    }
}
