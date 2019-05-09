import java.io.BufferedReader;  
import java.io.File;  
import java.io.FileInputStream;  
import java.io.InputStreamReader;  
import java.util.*;

public class degreeCentrality {
    private Map<Integer,Integer> node_weight = new HashMap<>();
	
	private void init(String filePath) {
		try {  
            String encoding = "UTF-8";  
            File file = new File(filePath);  
            if (file.isFile() && file.exists()) { 
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);
                BufferedReader bufferedReader = new BufferedReader(read);  
                String lineTxt = null;  
                lineTxt = bufferedReader.readLine();
                
                
                do { 
	                String cur[] = lineTxt.split(" ");
	                //��� n1, n2, weight(���� ���� ��)
	                int n1 = Integer.parseInt(cur[0]); 
	                int n2 = Integer.parseInt(cur[1]);
	                int w = Integer.parseInt(cur[2]);

	                if (!node_weight.containsKey(n1)) {
	                	node_weight.put(n1, w);
	                } else {
	                	node_weight.put(n1, node_weight.get(n1)+w);
	                }
	                
	                if (!node_weight.containsKey(n2)) {
	                	node_weight.put(n2, w);
	                } else {
	                	node_weight.put(n2, node_weight.get(n2)+w);
	                }
	                
                } while((lineTxt = bufferedReader.readLine()) != null);

            }else {  
                System.out.println("�����Ͻ� ������ ã�� �� �����ϴ�.");  
            }  
        } catch (Exception e) {  
            System.out.println("���� ���� �б� ����");  
            e.printStackTrace();  
        }  
		
	}
	public void print() {
        Set<Integer> keys = node_weight.keySet();
        Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			Integer key = it.next(); 
			int value = node_weight.get(key);
			System.out.println(key + " : " + value);
		}
	}
	
	public static void main(String args[]) {
		degreeCentrality dc = new degreeCentrality();
		dc.init("C:/Users/MY/eclipse-workspace/DegreeCentrality/src/tttt.txt");
		dc.print();
	}

}
