package ch22_test2;

import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        UserTable ut = new UserTable(); //출력용 객체

        while (true) {
            System.out.println("----------------------------------------------------------");
            System.out.println("1. 회원등록 | 2. 회원목록 | 3. 회원상세 | 4. 회원수정 | 5. 종료");
            System.out.println("----------------------------------------------------------");
            System.out.println("입력 ] ");
            String val = scanner.nextLine();

            if("1".equals(val)){
                System.out.println("----------");
                System.out.println("[회원 정보]");
                System.out.println("----------");
                System.out.println("아이디: ");
                String id = scanner.nextLine();
                System.out.println("비밀번호: ");
                String pwd = scanner.nextLine();
                System.out.println("이름: ");
                String name = scanner.nextLine();

                if(ut.insert(id, pwd, name)) {
                    System.out.println("회원등록 성공");
                }else {
                    System.out.println("중복된 아이디");
                }


            }
            else if("2".equals(val)){
                System.out.println("----------");
                System.out.println("[회원 목록]");
                System.out.println("----------");
                for(int i=0; i<ut.userList.size(); i++) {
                    User u = ut.userList.get(i);
                    System.out.println(u.getNo()+"\t"+u.getId()+"\t"+u.getPwd()+"\t"+u.getName());
                }

            }
            else if("3".equals(val)){
                System.out.println("----------");
                System.out.println("[회원 상세]");
                System.out.println("----------");
                System.out.println("이이디를 입력해주세요");
                String id = scanner.nextLine();
                User u = ut.findUser(id);
                if(u == null){
                    System.out.println("해당 아이디가 존재하지 않습니다");
                }else {
                    System.out.println("번호 :"+ u.getNo());
                    System.out.println("아이디 :"+ u.getId());
                    System.out.println("비밀번호 :"+ u.getPwd());
                    System.out.println("이름 :"+ u.getName());
                }
            }
            else if("4".equals(val)){
                System.out.println("----------");
                System.out.println("[회원 수정]");
                System.out.println("----------");
                System.out.println("아이디 :");
                String id = scanner.nextLine();
                System.out.println("비밀번호 :");
                String pwd = scanner.nextLine();
                System.out.println("이름 :");
                String name = scanner.nextLine();

                if(ut.update(id, name, pwd)){
                    System.out.println("아이디가 수정되었습니다");
                }else {
                    System.out.println("아이디가 존재하지 않습니다");
                }
            }
            else if("5".equals(val)){ // else로 하게되면 넘어가 버린다
                System.out.println("종료");
                break;
            }
        }
    }
}