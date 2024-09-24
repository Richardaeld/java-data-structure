public class Main {
    public static void main(String[] args) {

        int sum;
        int n = 100;
//----------------------------------------------
//        1.1
        sum = 0;
        for (int i = 0; i < n; i++){
            sum++;
        }
//  Time complexity:
//        T(n) = (a constant c) * n = cn = O(n)

//----------------------------------------------
//        1.2
        sum = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++){
                sum++;
            }
        }
//  Time complexity:
//        T(n) = (a constant c) * n * n = cn^2 = O(n^2)

//----------------------------------------------
//        1.3
        sum = 0;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n * n; j++) {
                sum++;
            }

        }
//  Time complexity:
//        T(n) = (a constant c) * n * n^2 = cn^3 = O(n^3)

//----------------------------------------------
//        1.4
        sum = 0;
        for (int i = 0; i < n; i++)  {
            for (int j = 0; j < i; j++) {
                sum++;
            }
        }
//  Time complexity:
//        T(n)                    =
//        cn(n + 1) / 2           =
//        ((cn^2) / 2) + (cn / 2) =
//        (c / 2)n^2 + (c / 2)n   =
//        n^2 + n                 =
//        O(n^2)

//----------------------------------------------
//        1.5
        sum = 0;
        for (int i = 0; i < n; i++)	{
            for (int j = 0; j < i * i; j++) {
                for (int k = 0; k < j; k++) {
                    sum++;
                }
            }
        }
//  Time complexity:
//        T(n)                                 =
//        (a constant c) * n * (n^2) * n^2 + 1 =
//        cn^5 + 1                             =
//        O(n^5)

//----------------------------------------------
    }
}