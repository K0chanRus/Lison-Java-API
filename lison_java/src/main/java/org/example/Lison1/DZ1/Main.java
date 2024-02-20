package org.example.Lison1.DZ1;

public class Main {

    public static void main(String[] args) {
        int n = 0;
        if (args.length == 0){
            n = 0;
        } else {
            n = Integer.parseInt(args[0]);
        }
        Answer ans = new Answer();
        int itresume_res = ans.countNTriangle(n);
        System.out.println(itresume_res);
    }
}
