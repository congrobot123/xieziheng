import java.util.Scanner; 

public class EX5 
{  
	//���ַ������滻����
	private static String change(String str) 
	{  
        String s = str.replaceAll("��[Ǫ��ʰ]", "��");  
        s = s.replaceAll("��+", "��").replaceAll("����", "��").replaceAll("����", "��").
			replaceAll("��Բ", "Բ").replace("����", "��");
        return s;  
    } 

    public static void main(String[] args) 
	{  
        long num = 0;
		Scanner sc = new Scanner(System.in);
        String[] str1 =    {"��","Ҽ","�E","��","��","��","½","��","��","��"};  
        String[] str2 =     {"��","Բ","ʰ","��","Ǫ","��","ʰ","��","Ǫ","��", "ʰ","��","Ǫ","��"};  
            
		System.out.println("������Ҫת���Ľ�");														 
        while(true)
		{  
            num = sc.nextLong();  
            char[] chArray = Long.toString(num).toCharArray();//�����������ת��Ϊ�ַ�����
			
            StringBuilder sb = new StringBuilder();  
            for(int i = 0; i < chArray.length; i++)
		    {  
                 String s = str1[ Integer.parseInt(String.valueOf(chArray[i])) ];//��������  
                 String s2 = str2[chArray.length-i];  //����λ��
                 sb.append(s).append(s2);//��������    
            }
			
				sb.append(str2[0]);  
				String str = sb.toString();//ת��ΪString�ַ���  
				str = change(str);//����  
				System.out.println("ת����Ľ���ǣ�\n"+str);
		}  
    }      
}  