package Louvain;

//clone �����ϴ� �޼ҵ�
//���������� ��� �ִ� ��ü�� clone�޼ҵ带 ����Ͽ� ���� ������ ��� �ִ� �� �ٸ� �ϳ��� ��ü ���� ����
//clone�� cloneable �������̽��� �߻� �޼ҵ� -> ������ �� �ִ� Ŭ������ cloneable �������̽��� ������ Ŭ�������� ��
public class Edge implements Cloneable{  
    int v;    
    double weight;  
    int next;   
    Edge(){}  
    public Object clone(){  
        Edge temp=null;  
        try{    
            temp = (Edge)super.clone();       
        }catch(CloneNotSupportedException e) {    
            e.printStackTrace();    
        }     
        return temp;  
    }  
}  