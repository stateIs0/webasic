package webbasic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;
public class fdfdf {
	
	public static void main(String[] args) {
		//���弴�����ʵ�����
		String url="http://baidu.com";
		//����һ���ַ��������洢��ҳ����
		String  result="";
		//����һ�������ַ������
		BufferedReader in=null;
		try {
			//��Stringת��url����
			URL realUrl=new URL(url);
			//��ʼ��һ�����ӵ��Ǹ�url������
			URLConnection conn=realUrl.openConnection();
			//��ʼʵ�ʵ�����
			conn.connect();
			//��ʼ��bufferedReader���������ȡURL����Ӧ
			in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//�����洢ץȡ����ÿһ�е�����
			String line;
			while((line=in.readLine())!=null){
				//����ץȡ����ÿһ�в�����洢��result����
				result+=line+"\n";
				
			}
			
		} catch (Exception e) {
			System.out.println("����Get�����쳣");
			e.printStackTrace();
		}finally{
			if(in!=null){
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(result);
		Logger.getGlobal().info("jfd");
		
		if(false)
			System.out.println("jjj");
		else
		System.out.println("fff");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}