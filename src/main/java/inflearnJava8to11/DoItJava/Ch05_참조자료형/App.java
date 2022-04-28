package DoItJava.Ch05_참조자료형;

public class App {
    public static void main(String[] args) {
        //참조 자료형의 선언 및 할당
        int[] intArr1;

        int[] intArr2 = new int[3];

        int[] intArr3 = {1, 2, 3};

        /*
        intArr1의 경우 변수가 선언은 되었지만 컴파일러에 의해 값이 초기화되지는 않음. 스택 메모리 공간도 비어있음.

        intArr2의 경우 변수가 선언되었고 컴파일러에 의해 값이 강제로 초기화까지 됨.
        스택 메모리 공간에 참조 좌표가 저장되며, 힙 영역에 초기화된 값 담김.
        (int : 0 , boolean : false, 실수 : 0.0, etc : null)

        intArr3의 경우 컴파일러에 의한 강제 초기화가 생략.

        */


        /*
        2차원 배열
        (1) 2차원 정방 행렬 배열
        (2) 2차원 비정방 행렬 배열
        */

        //(1) 2차원 정방 행렬 배열
            //(가) 배열 객체 생성 후 값 대입
            int[][] intArr1_1 = new int[2][3];
            intArr1_1[0][0] = 1;
            intArr1_1[0][1] = 2;
            intArr1_1[0][2] = 3;
            intArr1_1[1][0] = 4;
            intArr1_1[1][1] = 5;
            intArr1_1[1][2] = 6;


            //(나)배열 객체의 행 성분부터 생성하고 열 성분 생성하기
            int[][] intArr1_2 = new int[2][];
            //배열은 길이를 정해야하는 것 아닌가? (X) int[2]는 뒤에 올 [] 참조좌표 가리킴.
            //즉, 기본 자료형이 아닌 참조 자료형(int[])이고, 힙 메모리는 강제 초기화되는 영역이므로 null이 들어감.

            intArr1_2[0] = new int[3];
            intArr1_2[0][0] = 1; intArr1_2[0][1] = 2; intArr1_2[0][2] = 3;
            intArr1_2[1] = new int[3];
            intArr1_2[1][0] = 4; intArr1_2[1][1] = 5; intArr1_2[1][2] = 6;

            //(다)배열의 자료형과 함께 대입할 값 입력하기
            int[][] intArr1_3 = new int[][] {{1, 2, 3}, {4, 5, 6}};

            //(라) 대입할 값만 입력하기
            int[][] intArr1_4 = {{1, 2, 3}, {4, 5, 6}};


        //(2) 2차원 비정방 행렬 배열
            //(가) 배열 객체의 행 성분부터 생성하고 열 성분 생성하기
            int[][] intArr2_1 = new int[2][];
            intArr2_1[0] = new int[2];
            intArr2_1[0][0] = 1; intArr2_1[0][1] = 2;
            intArr2_1[1] = new int[3];
            intArr2_1[1][0] = 3; intArr2_1[1][1] = 4; intArr2_1[1][2] = 5;


            //(나) 자료형과 대입할 값만 입력하기
            int[][] intArr2_2 = new int[][]{{1, 2}, {3, 4, 5}};

            //(다) 대입할 값만 입력하기
            int[][] intArr2_3 = {{1, 2}, {3, 4, 5}};

    }
}
