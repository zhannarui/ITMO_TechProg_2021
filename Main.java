public class Main {
    public static void main(String[] args) {
        //First Task
        System.out.println("First task");
        System.out.println("Starting project");
        System.out.println(" ");

        //Second task
        System.out.println("Second task");
        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a';
        int v_int = 65999;
        long v_long = 4294967296L;
        float v_float = 0.33333334F;
        double v_double = 0.3333333333333333;
        boolean v_boolean = true;
        System.out.println("This is a byte" + " " + v_byte);
        System.out.println("This is a short" + " " + v_short);
        System.out.println("This is a char" + " " + v_char);
        System.out.println("This is a int" + " " + v_int);
        System.out.println("This is a long" + " " + v_long);
        System.out.println("This is a float" + " " + v_float);
        System.out.println("This is a double" + " " + v_double);
        System.out.println("This is a boolean" + " " + v_boolean);
        System.out.println(" ");

        //Third task, part 1
        System.out.println("Third task, part one");
        while (v_char<='z'){
            System.out.println(v_char);
            v_char++;
        }
        System.out.println(" ");

        //Third task, part 2, int i
        System.out.println("Third task, part two when type of i = int");
        long begin = new java.util.Date().getTime();
        int i = 0;
        while(i < 100000000){
            i++;
        }
        long end = new java.util.Date().getTime();
        System.out.println(end-begin);
        System.out.println(" ");

        //Third task, part 2, long i
        System.out.println("Third task, part two when type of i = long");
        long begin2 = new java.util.Date().getTime();
        long i2 = 0;
        while(i2 < 100000000 ){
            i2++;
        }
        long end2 = new java.util.Date().getTime();
        System.out.println(end2-begin2);
        System.out.println(" ");

        //Fourth task, part 1
        System.out.println("Fourth task, part one");
        int[] mas = {12, 43, 12, -65, 778, 123, 32, 76};
        int maxValue = Integer.MIN_VALUE;
        for (int num = 0; num < mas.length; num++){
            if (mas[num] > maxValue){
                maxValue = mas[num];
            }
        }
        System.out.println("Max value in mas" + " " + maxValue);
        System.out.println(" ");

        //Fourth task, part 2
        System.out.println("Fourth task, part two");
        int[][] matrix = new int[3][3];
        //Сначала создается цикл для перебора по строкам,
        //а затем внутри первого цикла создается внутренний цикл для перебора по столбцам конкретной строки
        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix[x].length; y++){
                matrix[x][y] = (int)Math.round(Math.random() * 10);
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("Transposed matrix");
        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix[x].length; y++){
                int temp = matrix[x][y];
                matrix[x][y] = matrix[y][x];
                matrix[y][x] = temp;
                if (x == y){
                    break;
                }
            }
        }

        for(int x = 0; x < matrix.length; x++){
            for(int y = 0; y < matrix[x].length; y++){
                System.out.print(matrix[x][y] + " ");
            }
            System.out.println(" ");
        }
    }
}
