package Lec_25_Recursion;

public class Maze_Path {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =3;
		int m=4;
		//matrix 3*4
		PrintPath(0, 0, n-1, m-1,"");
	}
	public static void PrintPath(int cr, int cc, int er, int ec, String ans)// cr- current row, cc- current column, er- end row, ec- end column
	{
		if(cr ==er && cc==ec)
		{
			System.out.print(ans+" ");
		}
		if(cc>ec || cr>er)
		{
			return;
		}
		PrintPath(cr, cc+1, er, ec, ans+"H");
		PrintPath(cr+1, cc, er, ec, ans+"V");
	}

}
