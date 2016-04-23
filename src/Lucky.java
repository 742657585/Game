import java.util.Scanner;

import javax.swing.text.PlainDocument;

public class Lucky {
static String[] account = new String[10];
static String[] password = new String[10];
static boolean status = false;
static int key = -1;
static int x;
static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    	while(true){
    	 key = showMenu();
    switch(key){
        case 1:                    //注册
                    System.out.println("请输入个人信息：");
                    zhuCe();
        break;
        case 2:                    //登陆
        	System.out.println("请填写个人信息：");
        	inputEngInf();
        break;
        case 3:                    //抽奖
        	System.out.println("抽奖结果：");
        	chouJiang();
        break;
        case 0:                    //退出
        	System.out.println("已退出！谢谢使用！");
        break;
    default:
    System.out.println("输入无效，重新选择！");
    break;
        }
    if(key == 0){
    	break;
    }
    	}
    }
public static int zhuCe() {
int i = 0;
for(i=0;i<=9;i++){
System.out.print("请输入账号：");

 
 
 
 	    	account[i] = input.nextLine();
 
 	    	System.out.print("请输入密码：");
 
 	    	password[i] = input.nextLine();
 
 	        x=1+(int)(Math.random()*10);
 
 	        System.out.println("注册成功！");
 
 	        System.out.println("账号"+"   密码"+"   卡号");
 
 	        System.out.println(account[i]+ password[i]  + " "+x);
 
 	        break;
 
 	 }
    	 return key;
}
    public static int showMenu(){
    	System.out.println("-----------------");
    System.out.println("    欢迎来到幸运抽奖          ");
    System.out.println("-----------------");
    System.out.println("      1.注册                      ");
    System.out.println("      2.登陆                      ");
    System.out.println("      3.抽奖                      ");
    System.out.println("      0.退出                      ");
    key = input.nextInt();
    return key;
    }
    public static void inputEngInf() {
if(status == true){
System.out.println("登陆成功！");
}else{
while(!status){
String acc = new String("0");
System.out.println("请输入账号：");
acc = input.nextLine();
if(acc.equals(account)){
status = true;
}else{
status = false;
System.out.println("没有此账号！");
continue;
}
String pa = new String("0");
System.out.println("请输入密码：");
pa = input.nextLine();
if(pa.equals(password)){
status = true;
}else{
status = false;
System.out.println("密码错误！");
continue;
}
}
}
}
    public static void chouJiang() {
if(status == false){
System.out.println("未注册或未登录！");
}else{
int[] luckyNumber = new int[5];
System.out.println("您的幸运号码为"+x);
System.out.println("幸运随机数为：");
for (int i = 0; i < 10; i++) {
 luckyNumber[i]= (int) ((int) 10*Math.random());
 for (int j = 0; j < i; j++) {
while(luckyNumber[j]==luckyNumber[i])
luckyNumber[i]= (int) ((int) 10*Math.random());
 }
System.out.print(luckyNumber[i]+"  ");   
}
for (int k = 0; k < 5; k++) {  
if(x == luckyNumber[k]){         
System.out.println("恭喜您中奖了！！！");
return ;
}else{
System.out.println("很遗憾，您没有中奖。");
return ;
}
}
 }
}
}