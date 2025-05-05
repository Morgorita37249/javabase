package leetcode.dop;

public class PushDominoes838 {

    public static void main(String[] args) {
        String a = ".L.R...LR..L..";
        System.out.println(pushDominoes(a));
    }

    public static String pushDominoes(String dominoes) {
        StringBuilder fromR= new StringBuilder(dominoes);


        StringBuilder fromL= new StringBuilder(dominoes);
        for (int i=0;i<fromR.length()-1;i++){
            if (fromR.charAt(i)=='R' && fromR.charAt(i+1)=='.'){
                fromR.setCharAt(i+1,'R');
            }
        }
        for (int i=fromL.length()-2;i>=0;i--){
            if (fromL.charAt(i)=='L' && fromL.charAt(i-1)=='.'){
                fromL.setCharAt(i-1,'L');
            }
        }
        for (int i=0;i<fromR.length()-1;i++){
            if (fromL.charAt(i)=='L' && fromR.charAt(i-1)=='.'){

            }
        }

        return dominoes;
    }
}
