class matrices
{
	public static void main(String[] args) {
	

			//declaration and initialisation of array

		int arr1[][] = {{2,7,11},{8,9,6},{0,4,5}};
		int arr2[][]={{3,9,5},{1,3,0},{12,2,7}};

		int add[][]= new int[3][3];
		int sub[][] = new int[3][3];


		//addition
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				add[i][j]=arr1[i][j]+arr2[i][j];
			}
		}


		//subtraction

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sub[i][j]=arr1[i][j]-arr2[i][j];
			}
		}



		System.out.println("The sum of two matrices is \n");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(add[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("The difference between two matrices is\n");

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(sub[i][j]+" ");
			}
			System.out.println();
		}




	}
}