package test04;

public class Parent{
    public String nation;
    
    public Parent(){
	//2번째 실행
        this("대한민국");  //Parent(“대한민국”) 호출
        System.out.println("Parent() call"); //print되는건 2번
    }

    public Parent(String nation){
        this.nation = nation; //3번째 실행
        System.out.println("Parent(String nation) call"); //print되는건 1번
    }
}
