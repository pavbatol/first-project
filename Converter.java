public class Converter{
    
    double rateUSD = 78.5;
    double rateEUR = 88.7;
    double rateJPY = 0.75;

    public Converter(double rateUSD, double rateEUR, double rateJPY){
        this.rateUSD = rateUSD;
        this.rateEUR = rateEUR;
        this.rateJPY = rateJPY;
    }

    void convert(double rubles, int currency){
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