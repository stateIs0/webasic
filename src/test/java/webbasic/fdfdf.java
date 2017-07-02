package webbasic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Logger;
public class fdfdf {
	
	public static void main(String[] args) {
		//定义即将访问的连接
		String url="http://baidu.com";
		//定义一个字符串用来存储网页内容
		String  result="";
		//定义一个缓冲字符输出流
		BufferedReader in=null;
		try {
			//将String转成url对象
			URL realUrl=new URL(url);
			//初始化一个链接到那个url的连接
			URLConnection conn=realUrl.openConnection();
			//开始实际的连接
			conn.connect();
			//初始化bufferedReader输出流来读取URL的响应
			in=new BufferedReader(new InputStreamReader(conn.getInputStream()));
			//用来存储抓取到的每一行的数据
			String line;
			while((line=in.readLine())!=null){
				//遍历抓取到的每一行并将其存储到result里面
				result+=line+"\n";
				
			}
			
		} catch (Exception e) {
			System.out.println("发送Get请求异常");
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