public class Main
{
public static void main(String[] args) {
int n=5;
for(int row=0;row<n-1;row++){
for(int col=row;col<=n-1;col++){
System.out.print(" ");
}
for(int col=0;col<=row;col++){
System.out.print("* ");
}
System.out.println();
}
for(int row=0;row<n;row++){
for(int col=0;col<=row;col++){
System.out.print(" ");
}
for(int col=row;col<=n-1;col++){
System.out.print("* ");
}
System.out.println();
}
}
}
