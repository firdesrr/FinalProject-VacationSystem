import java.util.Scanner;

//Курсов проект "Система за отпуски"
public class Main {
    public static void printMenu() {
        String menu = "--------------------------------------------------------------------\n" +
                "Заяви отпуска\n" +
                "Виж всички отпуски\n" +
                "Виж отпуска за служител\n" +
                "Промени статус на отпуска\n" +
                "Изход\n" +
                "-------------------------------------------------------------------\n" +
                "Въведи избор:\n";
        System.out.println(menu);
    }

    //При избиране на 1, потребителят въвежда последователно
//     Име, имейл, ЕГН, две дати - за начало и край на отпуската, тип на отпуската - платена или неплатена.
//     При грешен формат на данните да излизат подходящи съобщения.
    public static void entersLeaveData( String[] employeeData) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Name: ");
        employeeData[0] = scan.nextLine();
        System.out.print("email: ");
        employeeData[1] = scan.nextLine();
        System.out.print("personalIDNum: ");
        employeeData[2] = scan.nextLine();
        System.out.print("startDate (dd-mm-yyyy): ");
        employeeData[3] = scan.nextLine();
        System.out.print("endDate (dd-mm-yyyy): ");
        employeeData[4] = scan.nextLine();
        System.out.print("typeOfLeave (paid, unpaid): ");
        employeeData[5] = scan.nextLine();
    }

    public static void fillMatrix(int n, String[] args) {
        String[][] matrixLeaveDate = new String[n][6];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                entersLeaveData();
                matrixLeaveDate[i][j] = args[j];
            }
        }
    }

    //При избиране на 2, на екрана се показват във формата на таблица, всички         направени до сега заявки.
//     Всички заявки се помнят при изключване на програмата.
    public static void printMatrixLeaveData(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; i < arr[0].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       printMenu();
        entersLeaveData();

    }
}