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
        case 1:                    //ע��
                    System.out.println("�����������Ϣ��");
                    zhuCe();
        break;
        case 2:                    //��½
        	System.out.println("����д������Ϣ��");
        	inputEngInf();
        break;
        case 3:                    //�齱
        	System.out.println("�齱�����");
        	chouJiang();
        break;
        case 0:                    //�˳�
        	System.out.println("���˳���ллʹ�ã�");
        break;
    default:
    System.out.println("������Ч������ѡ��");
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
System.out.print("�������˺ţ�");

 
 
 
 	    	account[i] = input.nextLine();
 
 	    	System.out.print("���������룺");
 
 	    	password[i] = input.nextLine();
 
 	        x=1+(int)(Math.random()*10);
 
 	        System.out.println("ע��ɹ���");
 
 	        System.out.println("�˺�"+"   ����"+"   ����");
 
 	        System.out.println(account[i]+ password[i]  + " "+x);
 
 	        break;
 
 	 }
    	 return key;
}
    public static int showMenu(){
    	System.out.println("-----------------");
    System.out.println("    ��ӭ�������˳齱          ");
    System.out.println("-----------------");
    System.out.println("      1.ע��                      ");
    System.out.println("      2.��½                      ");
    System.out.println("      3.�齱                      ");
    System.out.println("      0.�˳�                      ");
    key = input.nextInt();
    return key;
    }
    public static void inputEngInf() {
if(status == true){
System.out.println("��½�ɹ���");
}else{
while(!status){
String acc = new String("0");
System.out.println("�������˺ţ�");
acc = input.nextLine();
if(acc.equals(account)){
status = true;
}else{
status = false;
System.out.println("û�д��˺ţ�");
continue;
}
String pa = new String("0");
System.out.println("���������룺");
pa = input.nextLine();
if(pa.equals(password)){
status = true;
}else{
status = false;
System.out.println("�������");
continue;
}
}
}
}
    public static void chouJiang() {
if(status == false){
System.out.println("δע���δ��¼��");
}else{
int[] luckyNumber = new int[5];
System.out.println("�������˺���Ϊ"+x);
System.out.println("���������Ϊ��");
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
System.out.println("��ϲ���н��ˣ�����");
return ;
}else{
System.out.println("���ź�����û���н���");
return ;
}
}
 }
}
}