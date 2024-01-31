import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L0127 {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int 변수명 = Integer.parseInt(버퍼명.readLine());
        // 정수 하나를 입력받고 입력받은 그대로 출력하시오.
//        System.out.print("당신의 나이 ");
//        int a = Integer.parseInt(br.readLine()); // 입력
//        System.out.println(a); // 출력 
        
        /*
         * 당신의 나이는 몇 살입니까? 
         * 10
         * 당신은 10살입니다.
         * 
         * */
        
        

        /*
         * 사과 : 10
         * 복숭아 : 20
         *[쇼핑 리스트]
         * 사과 : 10
         * 복숭아 : 20
         * 
         * */
        
        
        /*
         * [1반 학생들의 나이]
         * 1번 학생 : 20
         * 2번 학생 : 17
         * 3번 학생 : 15
         * 
         * 학생들은 총 3명
         * 1번 학생의 나이는 20
         * 2번 학생의 나이는 17
         * 3번 학생의 나이는 15
         * 
         * */
        
        
        // 실수 1개 입력받기 
        // double 변수명 = Double.parseDouble(br.readLine());
        // float 변수명 = Float.parseFloat(br.readLine());
        
        double a = Double.parseDouble(br.readLine());
        System.out.println(a);
        
        /*
         * Tom height : 170.0
         * Tom weight : 65.9
         * 
         * Tom List
         * height : 170.0
         * weight : 65.9
         * */
	}

}
