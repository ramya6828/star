import java.util.*;
public class Pat {
// FuncƟon to demonstrate paƩern
public staƟc void printPat(int n) {
int i, j;
// outer loop to handle rows
for (i = 0; i < n; i++) {
// inner loop to print spaces.
for (j = n - i; j > 1; j--) {
System.out.print(" ");
}
// inner loop to print stars.
for (j = 0; j <= i; j++) {
System.out.print("* ");
}
// prinƟng new line for each row
System.out.println();
}
}
// Driver FuncƟon
public staƟc void main(String args[]) {
int n = 6;
printPaƩern(n);
}
}
