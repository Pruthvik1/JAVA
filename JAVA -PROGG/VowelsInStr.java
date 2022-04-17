public class VowelsInStr {
    public static void main(String args[]) {
        String s1= new String(args[0]);
        String s2= new String(args[1]);
        int count= 0;
        for(int i=0; i<s1.length(); i++)
         {char w= s1.charAt(i);
            if(w=='a'||w=='e'|| w=='i'||w=='o' ||w=='u'|| w=='A'||w=='E'||w=='I'|| w=='O'||w=='U')
              { count++;}

        }
         System.out.println("the vowels in s1 is "+count);
        int cont= 0;
        for(int i=0;i<s2.length();i++)
         {char w= s2.charAt(i);
            if(w=='a'||w=='e'|| w=='i'||w=='o' ||w=='u'|| w=='A'||w=='E'||w=='I'|| w=='O'||w=='U')
             {cont++;}

        }
          System.out.println("the vowels in s2 is "+cont);
    }
    
}
