public class Converter{
    private static double rateUSD = 78.5;
    private static double rateEUR = 88.7;
    private static double rateJPY = 0.75;

    public static void main(String[] args){
        convert(2000, 1);
    }
    
    public static void convert(double rubles, int currency){
        if (currency == 1) {
            System.out.println("���� ���������� � ��������: " + rubles / rateUSD);
        } else if (currency == 2) {
            System.out.println("���� ���������� � ����: " + rubles / rateEUR);
        } else if (currency == 3) {
            System.out.println("���� ���������� � �����: " + rubles / rateJPY);
        } else {
            System.out.println("����������� ������");
        } 
    }	
}