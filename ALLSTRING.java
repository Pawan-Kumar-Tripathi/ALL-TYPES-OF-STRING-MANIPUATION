import java. io.*;
import java .util.*;
class ALLSTRING
{
    public void main()
    {
        String st = "My name is pawan";
        String st2 ="  MY name is pawan";
        String st3 = "";
        //char ch = st.charAt(5);// the answe is m (index always start from 0 )(used to return the character at the particular index
        //System.out.println("THE CHARACTER AT THE INDEX 5 IS =" + ch); //(1)
        
        //boolean bo = st.equals(st2);// the answer is true (this is used to compare two strings )(it take care of case sentivity)
        //System.out.println(bo);//(2)
        
        //boolean bo1 = st.equalsIgnoreCase(st2);// the answer is true (this is used to compare two strings )((it does not take care of case sesitivity)
        //System.out.println(bo1);//(3)
        
        //int in = st.compareTo(st2);//This method compares the two strings based on the Unicode value of each character in the strings. 
        //System.out.println(in);//(4)
        
        //int in2 = st.compareToIgnoreCase(st2);//This method compares the two strings based on the Unicode value of each character in the strings. ignores cases
        //System.out.println(in2);//(5)
        
        //int hs = st.hashCode();// jo string me likha hai vhi print ho jayega
        //System.out.println(st);//(6)
        
        //int ind = st.indexOf( "s");// it will return the index of the first character in the string written in the parathisis
        //System.out.println(ind);//(7)
        
        //int ind1 = st.lastIndexOf("s");// it wil return the last index of the word that is mensioned in the parantesis
        //System.out.println(ind1);//(8)
        
        //String str = st.substring(3);//jo number likhoge uske baad wale string ko print krega 
        //System.out.println(str);//(9)
        
        //String str1 = st.substring(0,3);// in dono ke bich wala print krega 
        //System.out.println(str1);//(10)
        
        //String str2 = st.concat(  st2);// add two strings 
        //System.out.println(str2);//(11)
        
        //String re = st.replace('n','p');//it replaces the old character to the new character in the string
        //System.out.println(re);//(12)
        
        //boolean wh = st.contains("names");// it checks wheather the character or the string is there in the string or not
        //System.out.println(wh);//(13)
        
        //String s = st.toUpperCase();//converts the whole string into uppercase
        //System.out.println(s);//(14)
        
        //boolean em = st3.isEmpty();//check wheather the string is empty or not 
        //System.out.println(em);//(15)
        
        String sh = st.join("ccc","joint","pawan");//it will just put the sign or anything in betweeen the written strings 
        System.out.println(sh);//(16)
        
        //String stt = st.replaceFirst("my","your");/it will replace first occurance
        //System.out.println(stt);//(17)
        
        //String stt1 = st.replaceAll("my","your");// it will replace all 
        //System.out.println(stt1);//(18)
        
        //String s = st.toLowerCase();//it will covert the whole string into lower case
        //System.out.println(s);//(19)
         
        //int len = st.length();//it finds the length of the given string 
        //System.out.println(len);//(20)
        
        //String tri= st.trim();// it trim the white spaces .
        //System.out.println(tri);//(21)
        
    }
}
