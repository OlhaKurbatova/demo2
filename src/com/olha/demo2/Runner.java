package com.olha.demo2;

public class Runner {
    public static void main(String[] args) {
       /* boolean isRepeat = true;

        while (isRepeat) {
            System.out.println("Please, enter number of menu:");
            System.out.println("1 - Summ");
            System.out.println("2 - Factorial");
            System.out.println("0 - Exit");
            Scanner scanner = new Scanner(System.in);
            int action = scanner.nextInt();
            int toValueSumm;
            switch (action) {
                case 0:
                    isRepeat = false;
                    System.out.println("Completed");
                    break;
                case 1:
                    System.out.println("Please, enter N: ");
                    toValueSumm = scanner.nextInt();
                    Calculator calc1 = new Calculator(toValueSumm);
                    System.out.println("Sum = " + calc1.sum());
                    break;
                case 2:
                    System.out.println("Please, enter N: ");
                    toValueSumm = scanner.nextInt();
                    Calculator calc2 = new Calculator(toValueSumm);
                    System.out.println("Factorial = " + calc2.fac());
                    break;
                default:
                    System.out.println("Incorrect value! Please, try again.");
                    break;
            }
        }*/

              MassEditor mass = new MassEditor(); //создаю экземпляр класса(инстанс)
              //в этой переменной вызвать метод
        mass.rplcMinMax();



    }
}
