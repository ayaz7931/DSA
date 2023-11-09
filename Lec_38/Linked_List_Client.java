package Lec_38;

public class Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_List ll = new Linked_List();
		ll.Addfirst(10);
		ll.Addfirst(-10);
		ll.Addfirst(4);
		ll.Display();
		ll.Addlast(80);
		ll.Display();
		ll.AddAtIndex(3,2); // (content, index)
		ll.Display();
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getatindex(2));
	}

}
