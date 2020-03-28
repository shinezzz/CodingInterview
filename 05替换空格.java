// java string 一些知识
// https://www.cnblogs.com/zhangyinhua/p/7689974.html
public class TestString {
    public static void main(String[] args) {
        String str1 = "Lance";
        String str2 = new String("Lance");
        String str3 = str2; //引用传递，str3直接指向st2的堆内存地址
        String str4 = "Lance";
        /**
         *  ==:
         * 基本数据类型：比较的是基本数据类型的值是否相同
         * 引用数据类型：比较的是引用数据类型的地址值是否相同
         * 所以在这里的话：String类对象==比较，比较的是地址，而不是内容
         */
         System.out.println(str1==str2);//false
         System.out.println(str1==str3);//false
         System.out.println(str3==str2);//true
         System.out.println(str1==str4);//true
    }

}
// 常用方法
    int length():获取字符串的长度，其实也就是字符个数
    char charAt(int index):获取指定索引处的字符
    int indexOf(String str):获取str在字符串对象中第一次出现的索引    
    String substring(int start):从start开始截取字符串
    String substring(int start,int end):从start开始，到end结束截取字符串。包括start，不包括end
    char[] toCharArray()：把字符串转换为字符数组
    String toLowerCase()：把字符串转换为小写字符串
    String toUpperCase()：把字符串转换为大写字符串
    
//做题
public class Solution {
    public String replaceSpace(StringBuffer str) {
        //if(str==null||str.length()==0)
            //return ;
        int length = str.length();
        char[] array = new char[length*3];
        int size = 0;
        for(int i = 0; i < length; i++){
            char temp = str.charAt(i);
            if(temp == ' '){
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            }
            else array[size++] = temp;
        }
        String finalStr = new String(array,0,size);
        return finalStr;
    }
}
