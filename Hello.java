////two thread,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
// class MyThread extends Thread{
//     public void run(){
//         System.out.println(Thread.currentThread().getName());
//         for(int i=0; i<5; i++){
//             System.out.println(i+" t1");
//         }
//     }
// }
//  class Hello {
//       public static void main(String[] args) {
//         MyThread t1=new MyThread();
//           MyThread t2=new MyThread();
//         t1.start();
//         t2.start();
//         for(int i=0; i<5; i++){
//             System.out.println(i+"main");
//         }
//       }
// }


//to get output in  secqunce order in threads,,,,,,,,,,,,,,,,,
// class MyThread extends Thread{
//     public void run(){
//         System.out.println(Thread.currentThread().getName());
//         for(int i=0; i<5; i++){
//             System.out.println(i+" t1");
//         }
//     }
// }
//  class Hello {
//       public static void main(String[] args) {
//         MyThread t1=new MyThread();
        
        
//         t1.start();
//         try{
//             t1.join();
//         }catch(Exception e){

//         }
     
//         for(int i=0; i<5; i++){
//             System.out.println(i+"main");
//         }
//       }
// }



///timer function,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
// class MyThread extends Thread {
//     public void run() {
//         System.out.println(Thread.currentThread().getName());
//         for (int i = 0; i < 10; i++) {
//             System.out.println(i + " t1");
//             try {
//                 Thread.sleep(2000); 
//             } catch (Exception e) {
              
//             }
//         }
//     }
// }

// class Hello {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();

//         t1.start();
//         try {
//             t1.join(); 
//         } catch (Exception e) {
            
//         }

//         for (int i = 0; i < 5; i++) {
//             System.out.println(i + " main");
//         }
//     }
// }


//download file,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
// class MyThread extends Thread {
//     public void run() {
//         System.out.println(Thread.currentThread().getName());
//         for (int i = 1; i < 6; i++) {
//             System.out.println("downloading file..."+(i*20)+"%");
            
//             try {
//                 Thread.sleep(2000); 
//             } catch (Exception e) {
              
//             }
//         }
//     }
// }

// class Hello {
//     public static void main(String[] args) {
//         MyThread t1 = new MyThread();

//         t1.start();
//         for(int i=1; i<=5; i++){
//             System.out.println("timer "+i);
//         }
//         try {
//             t1.join(); 
//         } catch (Exception e) {
            
//         }

//         for (int i = 0; i < 5; i++) {
//             System.out.println(i + " main");
//         }
//     }
// }

//banking withdrawal problem,,,,,,,,,,,,,,,,,,,,,,,,,,,
class Bank{
    int balance=100;
    synchronized void withdrawal(int amt){
        System.out.println(Thread.currentThread().getName()+"chechking balance");
        if(balance>=amt){
            System.out.println(Thread.currentThread().getName());
        balance=balance-amt;
        System.out.println("balance left:"+balance);
        }else{
            System.out.println("not enough balance");
        }
    }
}
class MyThread extends Thread{
    Bank b;
    MyThread(Bank b){ this.b=b;}
    public void run(){
        b.withdrawal(100);
    }
}
   public class Hello {
   
     public static void main(String[] args) {
        Bank b=new Bank();
        MyThread m=new MyThread(b);
         MyThread m1=new MyThread(b);
         m.setName("om");
         m1.setName("aman");
         m.start();
         m1.start();
        
     }
   }