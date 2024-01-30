package ch22_test2;

import java.util.*;

public class UserTable  {

    List<User> userList; // 필드 선언
    int no; // 자동 증가 번호


    //----------------------------------------------------------------생성자 필드 초기화
    UserTable(){
        userList = new ArrayList<>();
        no =1;
    }



    //--------------------------------------------------------------- 번호, 아이디, 이름 입력받아 User객체에 담아 리턴

    /*
    아이디, 비밀번호, 이름을 받아
    현재 리스트에 아이디가 존재하는지 여부 확인
    getUser 메소드를 호출 객체 리턴 받아 변수 저장
    존재하면 false 리턴
    존재하지 않으면 리스트에 추가하고 true 리턴

    수정 - findUser 메소트 활용
    수정 - no를 1씩 증가되어 저장
     */
    public User getUser(int no, String id, String pwd, String name){
        User user = new User();
        user.setNo(no);
        user.setName(name);
        user.setId(id);
        user.setPwd(pwd);
        return user;
    }


    // 아이디를 입력받아 리스트애 해당 아이디의 객체 리턴 존재하지 않으면 null 리턴
    public boolean insert(String id, String pwd, String name){
        if(findUser(id) != null) return false;
        return userList.add(getUser(no++, id, pwd, name));

    }
    //----------------------------------------------------------------------------------------------------
    public User findUser(String id){
        for(int i=0; i < userList.size(); i ++){
            if(id.equals(userList.get(i).getId())){
                return userList.get(i);
            }
        }
        return null;
    }
//----------------------------------------------------------------------------------------------------
    //id로 이름 비밀번호 변경
    public boolean update(String id, String name, String pwd){
        User user = findUser(id);
        if(user == null){
            return false;
        }else {
            user.setName(name);
            user.setPwd(pwd);
            return true;
        }

    }
}
