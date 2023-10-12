import java.util.Random;
public class Dining_hall{
    public static void main(String[] arg){
        Random r = new Random();
        int num = r.nextInt(9);     // 生成[0,10]区间的整数
        switch (num){
            case 0, 1:
                System.out.println("选择一饭堂");
                break;
            case 2, 3:
                System.out.println("选择二饭堂");
                break;
            case 4, 5:
                System.out.println("选择三饭堂");
                break;
            case 6, 7:
                System.out.println("选择四饭堂");
                break;
            case 8:
                System.out.println("外出就餐");
                break;
            default:
                System.out.println("叫外卖");
        }
    }
}
