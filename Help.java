import java.util.Scanner;

public class Help 
{
	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		String A = null;
		while(sc.hasnext())
		{
			A = sc.hasnext();
			

			if(A.equals("help"))
				{
					System.out.println("�й�ĳ���������ϸ��Ϣ������� HELP-������\n"
										+"ASSOC          ��ʾ���޸��ļ���չ��������\n"
										+"ATTRIB         ��ʾ������ļ����ԡ�\n"
										+"BREAK          ���û������չʽ CTRL+C ��顣\n"
										+"BCDEDIT        �����������ݿ��е������Կ���������\n"
										+"�ء�\n"
										+"CACLS          ��ʾ���޸��ļ��ķ��ʿ����б�(ACL)��\n"
										+"\n"
										+"CALL           ����һ����������������һ����\n"
										+"CD             ��ʾ��ǰĿ¼�����ƻ�����ġ�\n"
										+"CHCP           ��ʾ�����û����ҳ����\n"
										+"CHDIR          ��ʾ��ǰĿ¼�����ƻ�����ġ�\n"
										+"\n"
										+"�йع��ߵ���ϸ��Ϣ����������������е������вο���\n");
				}
			else if(A.equals("quit"))
				{
					break;
				}
			else if(A.equals("HELP-ASSOC"))
				{
					System.out.println("��ʾ���޸��ļ���չ������\n"
										+"\n"
										+"ASSOC [.ext[=[fileType]]]\n"
										+"\n"
										+".ext      ָ�����ļ����͹������ļ���չ��\n"
										+"fileType  ָ�����ļ���չ���������ļ�����\n"
										+"\n"
										+"���� ASSOC ��������������ʾ��ǰ�ļ����������ֻ���ļ���չ\n"
										+"������ ASSOC������ʾ�Ǹ��ļ���չ���ĵ�ǰ�ļ������������Ϊ\n"
										+"�ļ�����ָ���κβ����������ɾ���ļ���չ���Ĺ�����\n");
				}
			else if(A.equals("HELP-ATTRIB"))
				{
					System.out.println("��ʾ������ļ����ԡ�\n"
									+"\n"
									+"ATTRIB [+R | -R] [+A | -A ] [+S | -S] [+H | -H] [+I | -I]\n"
									+ "      [drive:][path][filename] [/S [/D] [/L]]\n"
									+ "+ �������ԡ�\n"
									+ "- ������ԡ�\n"
									+ "R ֻ���ļ����ԡ�\n"
									+"A �浵�ļ����ԡ�\n"
									+"S ϵͳ�ļ����ԡ�\n"
									+"H �����ļ����ԡ�\n"
									+"I �����������ļ����ԡ�\n"
									+"[drive:][path][filename]\n"
									+ "   ָ�� attrib Ҫ������ļ���\n"
									+"/S ����ǰ�ļ��м����������ļ����е�ƥ���ļ���\n"
									+"/D Ҳ�����ļ��С�\n"
									+"/L ����������Ӻͷ�������Ŀ������ԡ�\n");
				}
			else if(A == null)
				{
					System.out.print("C:\\Users\\Administrator>");
				}
			else
				{
					System.out.println("\'" + A + "\'" + "�����ڲ����ⲿ���Ҳ���ǿ����еĳ���\n"
					+ "���������ļ���");
				}
				System.out.print("C:\\Users\\Administrator>");
		}
	}
}
