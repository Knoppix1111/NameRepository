
public class Multi {
	public int mass1[][] = new int[3][4];//������� 1
	public int mass2[][] = new int[4][2];//������� 2
	public int mass3[][] = new int[3][2];//���������� �������
	
Multi(){
	//������ ��� ������� 1
	System.out.println("������� 1 : ");
	for(int i=0;i<3;i++){
	for(int j=0;j<4;j++){
	mass1[i][j] = (int) (Math.random()*5);
	System.out.print(mass1[i][j]+" ");
	}
	System.out.println();
	}	
	//������ ��� ������� 2
	System.out.println("������� 2: ");
	for(int i=0;i<4;i++){
		for(int j=0;j<2;j++){
			mass2[i][j] = (int) (Math.random()*5);
			
			System.out.print(mass2[i][j]+" ");
		}
		System.out.println();
		}	
	}
}
