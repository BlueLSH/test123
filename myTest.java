public class myTest{
	public static void main(String[] args){
        String[] wordListOne = {"a1","a2","a3","a4","a5","a6","a7","a8"};
        String[] wordListTwo = {"b1","b2","b3","b4","b5","b6","b7","b8"};
        String[] wordListThree = {"c1","c2","c3","c4","c5","c6","c7","c8"};
		//System.out.print("这是个好的开端，哈哈！！！");
		//int count=99;
        //while( count >= 0){
        //    System.out.println(count+"个瓶子铛铛响");
        //    count--;
        //}
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);
        
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.print(phrase);
        System.out.print("aaa");
	}
}
