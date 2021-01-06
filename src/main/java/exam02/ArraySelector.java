package exam02;

public class ArraySelector {

    public String selectEvens(int[] szamok) {
        StringBuilder sb = new StringBuilder();

        for (int t=0; t<szamok.length; t++) {

            if (t%2==0) {
                if (t>0) {sb.append(", " + szamok[t]);} else {sb.append(szamok[t]);}
            }

        }

        if (sb.toString().length()>1) {
           sb.delete(sb.toString().length()-2, 2);
        }

        if (!sb.toString().equals("")) {
            sb.insert(0,"[");
            sb.append("]");
        }

        return sb.toString();
    }

}
