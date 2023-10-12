import java.util.Scanner;
public class BMI {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("请输入你的性别(M/F)");
        String sex = input.next();
        System.out.println("请输入你的身高(m)");
        double height = input.nextDouble();
        System.out.println("请输入你的体重(kg)");
        double weight = input.nextDouble();
        double BMI = weight / height;
        // 男性BMI判断
        if (sex.equals("M")) {
            if (BMI < 20) {
                System.out.println("体重过轻");
            }
            else {
                if (BMI < 25) {
                    System.out.println("体重适中");
                }
                else {
                    if (BMI < 30) {
                        System.out.println("体重过重");
                    }
                    else {
                        if (BMI < 35) {
                            System.out.println("肥胖");
                        }
                        else {
                            System.out.println("过于肥胖");
                        }
                    }
                }
            }
        }
        // 女性BMI判断
        if (sex.equals("F")) {
            if (BMI < 19) {
                System.out.println("体重过轻");
            }
            else {
                if (BMI < 24) {
                    System.out.println("体重适中");
                }
                else {
                    if (BMI < 29) {
                        System.out.println("体重过重");
                    }
                    else {
                        if (BMI < 34) {
                            System.out.println("肥胖");
                        }
                        else {
                            System.out.println("过于肥胖");
                        }
                    }
                }
            }
        }
        System.out.printf("您的BMI为:%f", BMI);
    }
}
