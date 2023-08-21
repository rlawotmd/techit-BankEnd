public class sin_graph {
    static int XMAX = 40;
    static int YMAX = 40;
    static void drawSin() {
        int i, j;
        double x = 0.0;
        double y = 0.0;
        double step = 2 * Math.PI/XMAX;
        char[] lineBuffer = new char[YMAX + 2];

        for(i = 0; i < 12; i++) System.out.print(" ");

        for(i = 0; i < XMAX / 2; i++) System.out.print("-");

        System.out.print("*");

        for(i = 0; i < XMAX / 2; i++) System.out.print("-");

        System.out.println();

        for(i = 0; i < XMAX; i++) {
            int yPrime = 0;

            for(j = 0; j < YMAX + 1; j++) lineBuffer[j] = ' ';
            lineBuffer[YMAX / 2] = '|';

            x = x + step;
            y = Math.sin(x);
            yPrime = (int)((YMAX / 2) * y + (YMAX / 2 + 1));
            lineBuffer[yPrime] = '*';

            String xFormatted = String.format("%.2f", x);
            String yFormatted = String.format("%.2f", y);

            if (x >= 0) {
                xFormatted = " " + xFormatted;
            }
            if (y >= 0) {
                yFormatted = " " + yFormatted;
            }

            System.out.print(xFormatted + " " + yFormatted + " ");
            for(j = 0; j < YMAX + 1; j++) {
                System.out.print(lineBuffer[j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawSin();
    }
}
