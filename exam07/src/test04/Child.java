package test04;

public class Child extends Parent{
    private String name;
    
    public Child(){
	//super(); //호출 Parent()
        this("홍길동"); //Child(“홍길동”)호출
        System.out.println("Child() call"); //4번째 print
    }

    public Child(String name){
	//4번째 실행
        this.name = name; //필드세팅
        System.out.println("Child(String name) call"); //3번째 print
    }
}