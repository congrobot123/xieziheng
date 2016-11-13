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
					System.out.println("有关某个命令的详细信息，请键入 HELP-命令名\n"
										+"ASSOC          显示或修改文件扩展名关联。\n"
										+"ATTRIB         显示或更改文件属性。\n"
										+"BREAK          设置或清除扩展式 CTRL+C 检查。\n"
										+"BCDEDIT        设置启动数据库中的属性以控制启动加\n"
										+"载。\n"
										+"CACLS          显示或修改文件的访问控制列表(ACL)。\n"
										+"\n"
										+"CALL           从另一个批处理程序调用这一个。\n"
										+"CD             显示当前目录的名称或将其更改。\n"
										+"CHCP           显示或设置活动代码页数。\n"
										+"CHDIR          显示当前目录的名称或将其更改。\n"
										+"\n"
										+"有关工具的详细信息，请参阅联机帮助中的命令行参考。\n");
				}
			else if(A.equals("quit"))
				{
					break;
				}
			else if(A.equals("HELP-ASSOC"))
				{
					System.out.println("显示或修改文件扩展名关联\n"
										+"\n"
										+"ASSOC [.ext[=[fileType]]]\n"
										+"\n"
										+".ext      指定跟文件类型关联的文件扩展名\n"
										+"fileType  指定跟文件扩展名关联的文件类型\n"
										+"\n"
										+"键入 ASSOC 而不带参数，显示当前文件关联。如果只用文件扩展\n"
										+"名调用 ASSOC，则显示那个文件扩展名的当前文件关联。如果不为\n"
										+"文件类型指定任何参数，命令会删除文件扩展名的关联。\n");
				}
			else if(A.equals("HELP-ATTRIB"))
				{
					System.out.println("显示或更改文件属性。\n"
									+"\n"
									+"ATTRIB [+R | -R] [+A | -A ] [+S | -S] [+H | -H] [+I | -I]\n"
									+ "      [drive:][path][filename] [/S [/D] [/L]]\n"
									+ "+ 设置属性。\n"
									+ "- 清除属性。\n"
									+ "R 只读文件属性。\n"
									+"A 存档文件属性。\n"
									+"S 系统文件属性。\n"
									+"H 隐藏文件属性。\n"
									+"I 无内容索引文件属性。\n"
									+"[drive:][path][filename]\n"
									+ "   指定 attrib 要处理的文件。\n"
									+"/S 处理当前文件夹及其所有子文件夹中的匹配文件。\n"
									+"/D 也处理文件夹。\n"
									+"/L 处理符号链接和符号链接目标的属性。\n");
				}
			else if(A == null)
				{
					System.out.print("C:\\Users\\Administrator>");
				}
			else
				{
					System.out.println("\'" + A + "\'" + "不是内部或外部命令，也不是可运行的程序\n"
					+ "或批处理文件。");
				}
				System.out.print("C:\\Users\\Administrator>");
		}
	}
}
