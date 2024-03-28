package Example.Stack;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Stack<String> stackStr = new Stack<>();

        //stackStr.push("giá trị"); => đưa giá trị vào stack
        //stackStr.pop(; => lấy giá trị ra khỏi stack
        //stackStr.peek(); => lấy giá trị ra nhưng không xóa khỏi stack
        //stackStr.clear(); => xóa tất cả các phần tử khỏi stack
        //stackStr.contains("giá trị"); => xác định giá trị có tồn tại trong stack hay không
        //stackStr.size(); => độ lớn của stack

        //ví dụ đảo ngược chuỗi
        System.out.println("nhập chuỗi mà bạn muốn đảo ngược: ");
        String str = scanner.nextLine();
        //truyền dữ liệu vào stack
        for (int i = 0; i < str.length(); i++) {
            stackStr.push(str.charAt(i) + ""); //cộng thêm "" vì sẽ chuyển nó thành kiểu dữ liệu String
        }
        //in ra màn hình chuỗi sau khi đảo
        System.out.println("chuỗi sau khi đảo là: ");
        while (!stackStr.empty()){
            System.out.print(stackStr.pop());
        }

        //ví dụ chuyển từ hệ thập phân sang hệ nhị phân
        Stack<Integer> stackInt = new Stack<>();
        System.out.println("\nnhập một số dương từ bàn phím: ");
        int soDuong = scanner.nextInt();
        while (soDuong > 0){
            stackStr.push((soDuong % 2) + "");
            soDuong /= 2;
        }
        System.out.println("mã nhị phân của số bạn vừa nhập là: ");
        while (!stackStr.empty())
            System.out.print(stackStr.pop());
        scanner.close();
    }
}
