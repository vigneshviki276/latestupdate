package Employee;


public class Details {

  public static void main(String[] args) {
	
String s="they are more bad";
String s1="karumam da samy";



   //1
    String sub = s.substring(3,5);
	
	System.out.println(sub);
	//2
	int l = s.length();
	
	System.out.println(l);
	
	//3
	String[] sp = s.split(" ");
	for (int i = 0; i < sp.length; i++) {
		System.out.println(sp[i]);

	}
	
	//4
	String lo = s.toLowerCase();
     System.out.println(lo);
	
     //5
     String hi=s.toUpperCase();
     System.out.println(hi);
	
     //6
     
     boolean em = s.isEmpty();
     System.out.println(em);
     
     //7
     boolean co = s.contains("more");
     System.out.println(co);
     
     //8
     boolean sw = s.startsWith("they");
     System.out.println(sw);
     
     //9
     boolean ew = s.endsWith("bad");
     System.out.println(ew);
     
     //10
     int inof = s.indexOf('h');
     System.out.println(inof);
     
     //11
     int lasinof = s.lastIndexOf('h');
     System.out.println(lasinof);
     
     //12
     char ch = s.charAt(6);
     System.out.println(ch);
     
     //13
     String re = s.replace('d', 'w');
     System.out.println(re);
     
     //14
     int cmpa = s.compareTo("they are very very bad");
     System.out.println(cmpa);
     
     //15
     String con = s.concat(s1);
     
     System.out.println(con);
     
     //16
     String replace = s.replace("bad", "dad");
     System.out.println(replace);
     
     String replaceAll = s.replaceAll("they are more bad","saniyam buduchavana");
     System.out.println(replaceAll);
     
     
   String m=new String("parathesi nate ni la nalla ve iruka matta");  
     StringBuffer m1= new StringBuffer("onnu panna mudila");
     
    int cap = m1.capacity();
    System.out.println(cap); 
     
    System.out.println("all success"); 

     
     
     
     
}
}