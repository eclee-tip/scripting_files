/**
 * Hello <alt+shift+a for multiple comment>
 * 
 * short-hand if else : variable = (condition) ? expressionTrue :  expressionFalse;
 * 
 * for (type variableName : arrayName) {
 * // code block to be executed to print all/any contents in array
 * }
 * 
 * int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; multidimensional array: [0][0] outputs 1
 */
import java.util.*; // imports Scanner, List, ArrayList, Collections
import javax.swing.*; // extension of awt, used for mvc model view controller - model for data, view for presentation, and controller for interface/interaction between model and view
import java.awt.Frame; // platform dependent, less components and functionalities than swing
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;

public class Hello {
 /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static float pi(){
        return 3.1415f;
    }
    public static void main(String[] args) throws InterruptedException {
       /*  Scanner inpt = new Scanner(System.in);
        Scanner sa = new Scanner(System.in);
        Scanner jan = new Scanner (System.in);
        List<String> lst = new ArrayList<String>();
        List<Integer> lst1 = new ArrayList<Integer>();
        List<String> lsst = new ArrayList<String>();
        
        int x = 1;
        int y = 4;
        
        lst1.add(1);
        lst1.add(10);
        lst1.add(3);
        lst1.add(5);
        lsst.add("abc");
        lsst.add("bca");
        lsst.add("cba");
        lsst.add("acb");
        Collections.sort(lst);
        
        Collections.sort(lsst,Collections.reverseOrder());
        
        System.out.println("Input a word:");
        String word = inpt.nextLine();
        System.out.println("Input a number:");
        int num = inpt.nextInt();
        
        System.out.println("The word is " + word);
        System.out.println("The number is " + num);
        Thread.sleep(3000);
        
        System.out.println("different topics in java\n");
        System.out.println("Input 1st number:");
        int frt = inpt.nextInt(); //String frt = inpt.nextLine(); if string
        inpt.nextLine();
        
        System.out.println("Input 2nd number:");
        int scd = inpt.nextInt(); //String scd = inpt.nextLine(); if string
        inpt.nextLine();
        
        if (x < y){
            System.out.println("y is greater than x (4>1)");
        }
        if (frt < scd){
            System.out.println("2nd is greater than 1st");
        }
        else {
            System.out.println("1st is greater than 2nd");
        }
        Thread.sleep(3000);
        
        System.out.println("Input 5 strings to create a list:");
        for (int i = 0; i < 5; i++){
            String lsst0 = inpt.nextLine();
            lst.add(lsst0);
        }
        System.out.println("list"+lst);
        
        System.out.println("Hello, World! "+lst1);
        System.out.println("World, Hello! "+lsst);
        Thread.sleep(3000);
        
        System.out.print("Input a number, the output will be in formal way: ");
        int inst = sa.nextInt();
        sa.nextLine();
        System.out.println("You input "+inst);
        Thread.sleep(3000);
        
        System.out.println("Hello, World! I am Calculator\n+ for Addition\n- for Subtraction\n* for Multiplication\n/ for Division");
        System.out.println("What operation? ");
        Character op = jan.next().charAt(0);
        if(op=='+'){
            System.out.println("Input a number:");
            int comp1 = jan.nextInt();
            System.out.println("Input a number");
            int comp2 = jan.nextInt();
            System.out.println("Sum:"+(comp1+comp2));
        }
        else if(op=='-'){
            System.out.println("Input a number:");
            int comp1 = jan.nextInt();
            System.out.println("Input a number");
            int comp2 = jan.nextInt();
            System.out.println("Difference:"+(comp1-comp2));
        }
        else if(op=='*'){
            System.out.println("Input a number:");
            int comp1 = jan.nextInt();
            System.out.println("Input a number");
            int comp2 = jan.nextInt();
            System.out.println("Product:"+(comp1*comp2));
        }
        else{
            System.out.println("Input a number:");
            int comp1 = jan.nextInt();
            System.out.println("Input a number:");
            int comp2 = jan.nextInt();
            System.out.println("Division:"+(comp1/comp2));
        }
        Thread.sleep(3000);
        switch (op) {
            case ('+'):                 {
                    System.out.println("Input a number:");
                    int comp1 = jan.nextInt();
                    System.out.println("Input a number");
                    int comp2 = jan.nextInt();
                    System.out.println("Sum:"+(comp1+comp2));
                }
            case ('-'):                 {
                    System.out.println("Input a number:");
                    int comp1 = jan.nextInt();
                    System.out.println("Input a number");
                    int comp2 = jan.nextInt();
                    System.out.println("Difference:"+(comp1-comp2));
                }
            case ('*'):                {
                    System.out.println("Input a number:");
                    int comp1 = jan.nextInt();
                    System.out.println("Input a number");
                    int comp2 = jan.nextInt();
                    System.out.println("Product:"+(comp1*comp2));
                }
            default:                {
                    System.out.println("Input a number:");
                    int comp1 = jan.nextInt();
                    System.out.println("Input a number:");
                    int comp2 = jan.nextInt();
                    System.out.println("Division:"+(comp1/comp2));
                }
        }
        inpt.close();
        sa.close();
        jan.close(); */
///////////////////////////////////////////////////////////////////////////
        /* System.out.println("Hello, World!\nPattern A");
        for(int a=0;a<5;a++){
            for(int b=0;b<=a;b++){
                System.out.print("*");
            }
            System.out.println();
        }
        Thread.sleep(3000);
        System.out.println("Pattern B");
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print("*"); 
            }
            System.out.println();
        }
        Thread.sleep(3000);
        System.out.println("Pattern C");
        for(int c=0;c<5;c++){
            System.out.println("*");
        }
        Thread.sleep(3000);
        System.out.println("Pattern D");
        for(int d=0;d<5;d++){
            for(int e=0;e<=d;e++){
                System.out.println("*");
            }
            System.out.println();
        }
        Thread.sleep(3000);
        System.out.println("Pattern E");
        for(int f=5;f>0;f--){
            for(int g=0;g<f;g++){
                System.out.println("*");
            }
            System.out.println();
        }
        Thread.sleep(3000);
          System.out.println("Pattern F");
          for(int h=0;h<5;h++){
              for(int k=0;k<5;k++){
                  System.out.print("*");
              }
              System.out.println();
          }
          Thread.sleep(3000);
          System.out.println("Pattern G");
          for(int l=0;l<5;l++){
              for(int m=l;m<5;m++){
                  System.out.print(" ");
              }
              for(int n=0;n<=l;n++){
                  System.out.print("*");
              }
              System.out.println();
          }
          Thread.sleep(3000);
          System.out.println("Pattern H");
          for(int o=0;o<5;o++){
              for(int p=o;p<5;p++){
                  System.out.print(" ");
              }
              for(int q=0;q<=o;q++){
                  System.out.print("*");
              }
              for(int r=0;r<o;r++){
                  System.out.print("*");
              }
              System.out.println(); 
          }
          Thread.sleep(3000);
          System.out.println("Pattern I");
          for(int s=0;s<5;s++){
              for(int t=s;t<5;t++){
                  System.out.print(" ");
              }
              for(int u=0;u<=s;u++){
                  System.out.print("*");
              }
              for(int v=0;v<s;v++){
                  System.out.print("*");
              }
              System.out.println(); 
          }
          for(int w=0;w<5;w++){
              for(int ab=0;ab<=w;ab++){
                  System.out.print(" ");
              }
              for(int ac=5;ac>w;ac--){
                  System.out.print("*");
              }
              for(int ad=4;ad>w;ad--){
                  System.out.print("*");
              }
              System.out.println(); 
          }
          Thread.sleep(3000);
          System.out.println("Pattern J");
          for(int ae=0;ae<5;ae++){
              for(int af=0;af<ae;af++){
                  System.out.print(" ");
              }
              for(int ag=5;ag>ae;ag--){
                  System.out.print("*");
              }
              for(int ah=4;ah>ae;ah--){
                  System.out.print("*");
              }
              System.out.println(); 
          }
          Thread.sleep(3000);
          System.out.println("Pattern K");
          for(int ai=0;ai<5;ai++){
              for(int aj=0;aj<=ai;aj++){
                  System.out.print(" ");
              }
              for(int ak=5;ak>ai;ak--){
                  System.out.print("*");
              }
              for(int al=4;al>ai;al--){
                  System.out.print("*");
              }
              System.out.println(); 
          }
          for(int am=0;am<5;am++){
              for(int an=am;an<5;an++){
                  System.out.print(" ");
              }
              for(int ao=0;ao<=am;ao++){
                  System.out.print("*");
              }
              for(int ap=0;ap<am;ap++){
                  System.out.print("*");
              }
              System.out.println(); 
          }
          Thread.sleep(3000);
          System.out.println("Pattern L");
          for(int aq=0;aq<3;aq++){
              for(int ar=0;ar<aq;ar++){
                  System.out.print("*"); 
              }
              for(int as=3;as>aq;as--){
                  System.out.print(" ");
              }
              for(int at=3;at>aq;at--){
                  System.out.print(" ");
              }
              for(int au=0;au<aq;au++){
                  System.out.print("*");
              }
              System.out.println(); 
          }
          for(int av=0;av<3;av++){
              for(int aw=3;aw>av;aw--){
                  System.out.print("*");
              }
              for(int ax=0;ax<av;ax++){
                  System.out.print(" ");
              }
              for(int ay=0;ay<av;ay++){
                  System.out.print(" ");
              }
              for(int az=3;az>av;az--){
                  System.out.print("*");
              }
              System.out.println();
          }
          Thread.sleep(3000);
          int cnt = 0;
          System.out.println("Pattern M");
          for(int av=0;av<5;av++){
              cnt += 1;
              for(int aw=0;aw<=av;aw++){
                  System.out.print(cnt);
              }
              System.out.println(); 
          }
          Thread.sleep(3000);
          int cnt1 = 1;
          System.out.println("Pattern N");
          for(int ax=0;ax<5;ax++){
              System.out.print(cnt1);
              cnt1 += 1;
              for(int ay=0;ay<ax;ay++){
                  System.out.print(cnt1); 
              }
              System.out.println(); 
          }
          Thread.sleep(3000);
          System.out.println("The value of pi is: "+pi());
          Thread.sleep(3000); */
///////////////////////////////////////////////////////////////////////////
          /* System.out.println("Pattern O");
          for(int az=0;az<5;az++){
              for(int ba=0;ba<5;ba++){
                  if (az==ba){
                    System.out.print("1");
                  }
                  else{
                    System.out.print("0");
                  }
              }
              System.out.println(); 
          }
          Thread.sleep(3000); */
///////////////////////////////////////////////////////////////////////////
          /* System.out.println("Pattern P");
          for(int bb=0;bb<5;bb++){
              for(int bc=4;bc>=0;bc--){
                  if (bc==bb){
                    System.out.print("1");
                  }
                  else{
                    System.out.print("0");
                  }
              }
              System.out.println(); 
          }
          Thread.sleep(3000); */
///////////////////////////////////////////////////////////////////////////
          /* Scanner inn = new Scanner(System.in);
          while (true) {
            System.out.println("Input a number that can be less than 10, greater than 10 but less than 50, or greater than 50 but less than 100: ");
            int nuum = inn.nextInt();
            if (nuum < 10){
                System.out.println("You input less than 10");
                break;
            }
            else if (nuum == 10) {
                System.out.println("You input 10");
                break;
            }
            else if ((nuum > 10) && (nuum < 50)){
                System.out.println("You input between 11 and 49");
                break;
            }
            else if (nuum == 50) {
                System.out.println("You input 50");
                break;
            }
            else if ((nuum > 50) && (nuum < 100)){
                System.out.println("You input between 51 and 99");
                break; 
            }
            else if (nuum == 100){
                System.out.println("You input 100");
                break;
            }
            else {
                System.out.println("Your number is greater than 100!\nInput again");
                continue;
            }
          } */
///////////////////////////////////////////////////////////////////////////
          /* Scanner innn = new Scanner(System.in);
          Random rand = new Random();
          int gnum = rand.nextInt(1000); // alternative: int randomNum = (int)(Math.random() * 101);  outputs 0 to 100
          while (true) {
            try {
                System.out.print("Guess my number from 0 to 1000: ");
                int rnum = innn.nextInt();
                if (rnum == gnum){
                    System.out.println("You guessed right! the number is " + gnum);
                    break;
                }
                else if (rnum < gnum){
                    System.out.println("Input a higher number");
                    continue;
                }
                else if (rnum > gnum && rnum < 1001){
                    System.out.println("Input a lower number");
                    continue;
                }
                else if (rnum > 1000){
                    System.out.println("Input a number below 1000");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error, please put a number");
                innn.nextLine();
            }
          } */
///////////////////////////////////////////////////////////////////////////
          /* System.out.println(6%5); //outputs 1
          
          byte x = 1;
          double cx = x;
          System.out.println(cx); // widening casting, outputs 1.0

          double cy = 123.4123d;
          byte y = (byte) cy;
          System.out.println(y); // narrowing casting, outputs 123

          String txt1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
          System.out.println("The length of the txt string is: " + txt1.length()); // counts the length of the string

          String txt2 = "Hello World";
          System.out.println(txt2.toUpperCase());   // Outputs "HELLO WORLD"
          System.out.println(txt2.toLowerCase());   // Outputs "hello world"

          String txt3 = "Please locate where 'locate' occurs!";
          System.out.println(txt3.indexOf("locate")); // Outputs 7 => "Please 'locate'" => counts 0 to 7

          String firstName = "John ";
          String lastName = "Doe";
          System.out.println(firstName.concat(lastName)); // concatenation */
///////////////////////////////////////////////////////////////////////////
        /* JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton button = new JButton("Press");
        frame.getContentPane().add(button); // Adds Button to content pane of frame
        frame.setVisible(true); */
        //Creating the Frame
///////////////////////////////////////////////////////////////////////////
        /* JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("FILE");
        JMenu m2 = new JMenu("Help");
        mb.add(m1);
        mb.add(m2);
        JMenuItem m11 = new JMenuItem("Open");
        JMenuItem m22 = new JMenuItem("Save as");
        m1.add(m11);
        m1.add(m22);

        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        JLabel label = new JLabel("Enter Text");
        JTextField tf = new JTextField(10); // accepts upto 10 characters
        JButton send = new JButton("Send");
        JButton reset = new JButton("Reset");
        panel.add(label); // Components Added using Flow Layout
        panel.add(tf);
        panel.add(send);
        panel.add(reset);

        // Text Area at the Center
        JTextArea ta = new JTextArea();

        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
        frame.getContentPane().add(BorderLayout.CENTER, ta);
        frame.setVisible(true); */
///////////////////////////////////////////////////////////////////////////
        /* Scanner cou = new Scanner(System.in);
        List<Integer> lcou = new ArrayList<Integer>();

        System.out.println("Counting numbers");
        System.out.print("How many numbers will you print to count? ");
        int ccc = cou.nextInt();
        for (int cn = 1; cn <= ccc; cn++) {
            lcou.add(cn);   
        }
        System.out.println(lcou);
        Thread.sleep(3000);
        System.out.println("Determine if odd or even numbers");
        System.out.print("What number? ");
        int nnn = cou.nextInt();
        if (nnn % 2 == 0){
            System.out.println(nnn + " is Even");
        }
        else {
            System.out.println(nnn + " is Odd");
        }
        Thread.sleep(3000);
        System.out.println("I will swap the two numbers that you've entered");
        System.out.print("Enter first number: ");
        int s1= cou.nextInt();
        System.out.print("Enter second number: ");
        int s2 = cou.nextInt();
        System.out.println("The numbers are: " + s2 + " " + s1);
        Thread.sleep(3000);
        long fa = 1;
        System.out.println("I will find the factorial of your number");
        System.out.print("What number? ");
        int f1 = cou.nextInt();
        for (int f11 = 1; f11 <= f1; f11++){
            fa = fa * f11; // f11 will count up and multiply to fa which will be the result of the product
        }
        System.out.println("The factorial of " + f1 + " is " + fa);
        Thread.sleep(3000); */
///////////////////////////////////////////////////////////////////////////
        /* Date date = new Date();
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss aa");
        String dtf = dt.format(date);
        System.out.println("The date and time format in java is " + date);
        System.out.println("The formatted date and time is " + dtf); */
}
        
}