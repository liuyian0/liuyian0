import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class MethodTest {
public static void main(String[] args) {
  System.out.println(sum(1,2));
  System.out.println(max(1,2));
}

private static int max(int i, int j) {
	if(i>=j){
        return i;
    }else{
        return j;
    }
}

private static int sum(int i, int j) {
    return i+j;
    }
}
