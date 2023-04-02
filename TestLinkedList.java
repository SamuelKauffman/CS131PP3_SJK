
public class TestLinkedList {

	public static void main(String[] args) {
		
		GenericLinkedList<Double> myList=new GenericLinkedList<>();
		
		GenericNode<Double> aNode=new GenericNode<>();
		aNode.setData(1.5);
		myList.addNode(aNode);
		aNode = new GenericNode<>();
		aNode.setData(2.3);
		myList.addNode(aNode);
		
		GenericNode<Double> tempnode=myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode=tempnode.getNextNode();
		} while (tempnode!=null);

	}//end main

}//end class

