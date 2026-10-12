import java.util.*;

class MinMax {
    static int[] findMinMax(int a[], int l, int h) {
        if (l == h)
            return new int[]{a[l], a[l]};

        int m = (l + h) / 2;

        int[] x = findMinMax(a, l, m);
        int[] y = findMinMax(a, m + 1, h);

        return new int[]{
            Math.min(x[0], y[0]),
            Math.max(x[1], y[1])
        };
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int[] r = findMinMax(a, 0, n - 1);

        System.out.println("Minimum = " + r[0]);
        System.out.println("Maximum = " + r[1]);
    }
}

