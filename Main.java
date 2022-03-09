import java.util.Scanner;

class Main {
  public static void main(String[] args) 
  {
    Scanner nazwa = new Scanner(System.in);
    int wybor;
    double a, b;
    System.out.println("Wybierz opcje kalkulatora: \n1. Suma \n2. Różnica \n3. Iloczyn \n4. Iloraz");
    wybor = nazwa.nextInt();

    switch(wybor)
      {
          case 1:
          {
            System.out.println("Wybrałeś sumę: \nPodaj a oraz b");
            a = nazwa.nextDouble();
            b = nazwa.nextDouble();
            double suma = a + b;
            System.out.println("a + b = "+suma);
            break;
          }
          case 2:
          {
          System.out.println("Wybrałeś odejmowanie: \nPodaj a oraz b");
          a = nazwa.nextDouble();
          b = nazwa.nextDouble();
          double roznica = a - b;
          System.out.println("a - b = " +roznica);
          break;
          } 
          case 3:
          {
          System.out.println("Wybrałeś mnożebnie: \nPodaj a oraz b");
          a = nazwa.nextDouble();
          b = nazwa.nextDouble();
          double iloczyn = a * b;
          System.out.println("a * b = " +iloczyn);
          break;
          }
          case 4:
          {
          System.out.println("Wybrałeś dzielenie: \nPodaj a oraz b");
          a = nazwa.nextDouble();
          b = nazwa.nextDouble();
          if (b == 0)
          {
          System.out.println("Nie dziel przez 0 debilu");
          }
          else
          {
          double iloraz = a/b;
          System.out.println("a / b = " +iloraz); 
          }
          break;
          }
      }
      
}
}