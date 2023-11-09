package Lec_54;

public class Trie_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trie t = new Trie();
		t.insert("raj");
		t.insert("rahul");
		t.insert("apple");
		t.insert("komal");
		t.insert("puneet");
		t.insert("ankit");
		t.insert("amisha");
		System.out.println(t.search("ankit"));
		System.out.println(t.search("app"));
		System.out.println(t.startsWith("app"));
	}

}
